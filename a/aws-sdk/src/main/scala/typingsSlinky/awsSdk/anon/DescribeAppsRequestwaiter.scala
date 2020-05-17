package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.opsworksMod.String
import typingsSlinky.awsSdk.opsworksMod.Strings
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/opsworks.DescribeAppsRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeAppsRequestwaiter extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * An array of app IDs for the apps to be described. If you use this parameter, DescribeApps returns a description of the specified apps. Otherwise, it returns a description of every app.
    */
  var AppIds: js.UndefOr[Strings] = js.native
  /**
    * The app stack ID. If you use this parameter, DescribeApps returns a description of the apps in the specified stack.
    */
  var StackId: js.UndefOr[String] = js.native
}

object DescribeAppsRequestwaiter {
  @scala.inline
  def apply(): DescribeAppsRequestwaiter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppsRequestwaiter]
  }
  @scala.inline
  implicit class DescribeAppsRequestwaiterOps[Self <: DescribeAppsRequestwaiter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$waiter(value: WaiterConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$waiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(js.undefined)
        ret
    }
    @scala.inline
    def withAppIds(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppIds")(js.undefined)
        ret
    }
    @scala.inline
    def withStackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(js.undefined)
        ret
    }
  }
  
}

