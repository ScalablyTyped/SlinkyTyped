package typingsSlinky.mendixmodelsdk.iworkingcopyeventMod

import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.workingCopyData
import typingsSlinky.mendixmodelsdk.transportInterfacesMod.IWorkingCopy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWorkingCopyDataEvent extends IWorkingCopyEvent {
  var data: IWorkingCopy = js.native
  var `type`: workingCopyData = js.native
}

object IWorkingCopyDataEvent {
  @scala.inline
  def apply(data: IWorkingCopy, `type`: workingCopyData): IWorkingCopyDataEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkingCopyDataEvent]
  }
  @scala.inline
  implicit class IWorkingCopyDataEventOps[Self <: IWorkingCopyDataEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: IWorkingCopy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: workingCopyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

