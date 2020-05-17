package typingsSlinky.mendixmodelsdk.iworkingcopyeventMod

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
  implicit def apply(value: IBuildResultEvent): IWorkingCopyEvent = value.asInstanceOf[IWorkingCopyEvent]
  @scala.inline
  implicit def apply(value: IWorkingCopyDataEvent): IWorkingCopyEvent = value.asInstanceOf[IWorkingCopyEvent]
}

