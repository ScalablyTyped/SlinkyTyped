package typingsSlinky.mendixmodelsdk.iworkingcopyeventMod

import typingsSlinky.mendixmodelsdk.anon.EventId
import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.buildResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBuildResultEvent extends IWorkingCopyEvent {
  var data: EventId = js.native
  var `type`: buildResult = js.native
}

object IBuildResultEvent {
  @scala.inline
  def apply(data: EventId, `type`: buildResult): IBuildResultEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBuildResultEvent]
  }
  @scala.inline
  implicit class IBuildResultEventOps[Self <: IBuildResultEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: EventId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: buildResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

