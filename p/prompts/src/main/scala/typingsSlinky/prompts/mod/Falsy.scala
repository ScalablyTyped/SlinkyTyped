package typingsSlinky.prompts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.prompts.promptsBooleans.`false`
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait Falsy extends js.Object

object Falsy {
  @scala.inline
  def `false`: typingsSlinky.prompts.promptsBooleans.`false` = false.asInstanceOf[typingsSlinky.prompts.promptsBooleans.`false`]
  @scala.inline
  implicit def apply(value: Null): Falsy = value.asInstanceOf[Falsy]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => Falsy): Falsy = value.asInstanceOf[Falsy]
}

