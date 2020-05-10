package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAppsResult extends js.Object {
  /**
    * An array of App objects that describe the specified apps. 
    */
  var Apps: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.Apps] = js.native
}

object DescribeAppsResult {
  @scala.inline
  def apply(): DescribeAppsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppsResult]
  }
  @scala.inline
  implicit class DescribeAppsResultOps[Self <: DescribeAppsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApps(value: Apps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Apps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Apps")(js.undefined)
        ret
    }
  }
  
}

