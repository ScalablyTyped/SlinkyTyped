package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackSummary extends js.Object {
  /**
    * The number of apps.
    */
  var AppsCount: js.UndefOr[Integer] = js.native
  /**
    * The stack's ARN.
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * An InstancesCount object with the number of instances in each status.
    */
  var InstancesCount: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.InstancesCount] = js.native
  /**
    * The number of layers.
    */
  var LayersCount: js.UndefOr[Integer] = js.native
  /**
    * The stack name.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.native
}

object StackSummary {
  @scala.inline
  def apply(): StackSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSummary]
  }
  @scala.inline
  implicit class StackSummaryOps[Self <: StackSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppsCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withInstancesCount(value: InstancesCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancesCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstancesCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancesCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLayersCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayersCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayersCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayersCount")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
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

