package typingsSlinky.nivoColors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nivoColors.mod.DatumColorInstruction
  - typingsSlinky.nivoColors.mod.SchemeColorInstruction
  - typingsSlinky.nivoColors.mod.CustomColorFunction[D]
  - js.Array[java.lang.String]
  - java.lang.String
*/
trait OrdinalColorsInstruction[D] extends js.Object

object OrdinalColorsInstruction {
  @scala.inline
  implicit def apply[D](value: js.Array[String]): OrdinalColorsInstruction[D] = value.asInstanceOf[OrdinalColorsInstruction[D]]
  @scala.inline
  implicit def apply[D](value: CustomColorFunction[D]): OrdinalColorsInstruction[D] = value.asInstanceOf[OrdinalColorsInstruction[D]]
  @scala.inline
  implicit def apply[D](value: DatumColorInstruction): OrdinalColorsInstruction[D] = value.asInstanceOf[OrdinalColorsInstruction[D]]
  @scala.inline
  implicit def apply[D](value: SchemeColorInstruction): OrdinalColorsInstruction[D] = value.asInstanceOf[OrdinalColorsInstruction[D]]
  @scala.inline
  implicit def apply[D](value: String): OrdinalColorsInstruction[D] = value.asInstanceOf[OrdinalColorsInstruction[D]]
}

