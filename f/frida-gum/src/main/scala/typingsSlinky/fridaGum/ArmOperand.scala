package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.ArmRegOperand
  - typingsSlinky.fridaGum.ArmImmOperand
  - typingsSlinky.fridaGum.ArmMemOperand
  - typingsSlinky.fridaGum.ArmFpOperand
  - typingsSlinky.fridaGum.ArmCimmOperand
  - typingsSlinky.fridaGum.ArmPimmOperand
  - typingsSlinky.fridaGum.ArmSetendOperand
  - typingsSlinky.fridaGum.ArmSysregOperand
*/
trait ArmOperand extends js.Object

object ArmOperand {
  @scala.inline
  implicit def apply(value: ArmCimmOperand): ArmOperand = value.asInstanceOf[ArmOperand]
  @scala.inline
  implicit def apply(value: ArmFpOperand): ArmOperand = value.asInstanceOf[ArmOperand]
  @scala.inline
  implicit def apply(value: ArmImmOperand): ArmOperand = value.asInstanceOf[ArmOperand]
  @scala.inline
  implicit def apply(value: ArmMemOperand): ArmOperand = value.asInstanceOf[ArmOperand]
  @scala.inline
  implicit def apply(value: ArmPimmOperand): ArmOperand = value.asInstanceOf[ArmOperand]
  @scala.inline
  implicit def apply(value: ArmRegOperand): ArmOperand = value.asInstanceOf[ArmOperand]
  @scala.inline
  implicit def apply(value: ArmSetendOperand): ArmOperand = value.asInstanceOf[ArmOperand]
  @scala.inline
  implicit def apply(value: ArmSysregOperand): ArmOperand = value.asInstanceOf[ArmOperand]
}

