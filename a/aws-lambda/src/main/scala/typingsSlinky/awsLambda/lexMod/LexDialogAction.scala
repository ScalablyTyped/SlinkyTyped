package typingsSlinky.awsLambda.lexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsLambda.lexMod.LexDialogActionClose
  - typingsSlinky.awsLambda.lexMod.LexDialogActionElicitIntent
  - typingsSlinky.awsLambda.lexMod.LexDialogActionElicitSlot
  - typingsSlinky.awsLambda.lexMod.LexDialogActionConfirmIntent
  - typingsSlinky.awsLambda.lexMod.LexDialogActionDelegate
*/
trait LexDialogAction extends js.Object

object LexDialogAction {
  @scala.inline
  implicit def apply(value: LexDialogActionClose): LexDialogAction = value.asInstanceOf[LexDialogAction]
  @scala.inline
  implicit def apply(value: LexDialogActionConfirmIntent): LexDialogAction = value.asInstanceOf[LexDialogAction]
  @scala.inline
  implicit def apply(value: LexDialogActionDelegate): LexDialogAction = value.asInstanceOf[LexDialogAction]
  @scala.inline
  implicit def apply(value: LexDialogActionElicitIntent): LexDialogAction = value.asInstanceOf[LexDialogAction]
  @scala.inline
  implicit def apply(value: LexDialogActionElicitSlot): LexDialogAction = value.asInstanceOf[LexDialogAction]
}

