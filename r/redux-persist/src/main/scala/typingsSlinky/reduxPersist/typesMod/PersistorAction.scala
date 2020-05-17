package typingsSlinky.reduxPersist.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxPersist.typesMod.RehydrateAction
  - typingsSlinky.reduxPersist.typesMod.RegisterAction
*/
trait PersistorAction extends js.Object

object PersistorAction {
  @scala.inline
  implicit def apply(value: RegisterAction): PersistorAction = value.asInstanceOf[PersistorAction]
  @scala.inline
  implicit def apply(value: RehydrateAction): PersistorAction = value.asInstanceOf[PersistorAction]
}

