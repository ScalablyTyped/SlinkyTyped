package typingsSlinky.mendixmodelsdk.imodeleventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mendixmodelsdk.imodeleventMod.IFileEvent
  - typingsSlinky.mendixmodelsdk.imodeleventMod.IDeltaEvent
*/
trait IModelEvent extends js.Object

object IModelEvent {
  @scala.inline
  implicit def apply(value: IDeltaEvent): IModelEvent = value.asInstanceOf[IModelEvent]
  @scala.inline
  implicit def apply(value: IFileEvent): IModelEvent = value.asInstanceOf[IModelEvent]
}

