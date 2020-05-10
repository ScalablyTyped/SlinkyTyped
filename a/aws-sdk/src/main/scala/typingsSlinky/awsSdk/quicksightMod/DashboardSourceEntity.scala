package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashboardSourceEntity extends js.Object {
  /**
    * Source template.
    */
  var SourceTemplate: js.UndefOr[DashboardSourceTemplate] = js.native
}

object DashboardSourceEntity {
  @scala.inline
  def apply(): DashboardSourceEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashboardSourceEntity]
  }
  @scala.inline
  implicit class DashboardSourceEntityOps[Self <: DashboardSourceEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceTemplate(value: DashboardSourceTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceTemplate")(js.undefined)
        ret
    }
  }
  
}

