package typingsSlinky.cathoQuantum.inputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typingsSlinky.std.RegExp
  - java.lang.String
  - typingsSlinky.cathoQuantum.inputMod.MaskFunction
*/
trait Mask extends js.Object

object Mask {
  @scala.inline
  implicit def apply(value: Boolean): Mask = value.asInstanceOf[Mask]
  @scala.inline
  implicit def apply(value: MaskFunction): Mask = value.asInstanceOf[Mask]
  @scala.inline
  implicit def apply(value: js.RegExp): Mask = value.asInstanceOf[Mask]
  @scala.inline
  implicit def apply(value: String): Mask = value.asInstanceOf[Mask]
}

