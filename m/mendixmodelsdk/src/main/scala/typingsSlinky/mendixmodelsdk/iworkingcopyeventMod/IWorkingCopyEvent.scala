package typingsSlinky.mendixmodelsdk.iworkingcopyeventMod

import typingsSlinky.mendixmodelsdk.AnonEventId
import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.buildResult
import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.workingCopyData
import typingsSlinky.mendixmodelsdk.transportInterfacesMod.IWorkingCopy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mendixmodelsdk.iworkingcopyeventMod.IWorkingCopyDataEvent
  - typingsSlinky.mendixmodelsdk.iworkingcopyeventMod.IBuildResultEvent
*/
trait IWorkingCopyEvent extends js.Object

object IWorkingCopyEvent {
  @scala.inline
  def IWorkingCopyDataEvent(data: IWorkingCopy, `type`: workingCopyData): IWorkingCopyEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkingCopyEvent]
  }
  @scala.inline
  def IBuildResultEvent(data: AnonEventId, `type`: buildResult): IWorkingCopyEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkingCopyEvent]
  }
}

