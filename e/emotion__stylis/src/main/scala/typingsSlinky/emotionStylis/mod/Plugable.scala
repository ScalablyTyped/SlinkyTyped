package typingsSlinky.emotionStylis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.UndefOr[scala.Nothing]
  - scala.Null
  - scala.Boolean
  - typingsSlinky.emotionStylis.mod.Plugin
  - typingsSlinky.emotionStylis.mod.ArrayPlugable
*/
trait Plugable extends js.Object

object Plugable {
  @scala.inline
  implicit def apply(value: ArrayPlugable): Plugable = value.asInstanceOf[Plugable]
  @scala.inline
  implicit def apply(value: Boolean): Plugable = value.asInstanceOf[Plugable]
  @scala.inline
  implicit def apply(value: Null): Plugable = value.asInstanceOf[Plugable]
  @scala.inline
  implicit def apply(value: Plugin): Plugable = value.asInstanceOf[Plugable]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => Plugable): Plugable = value.asInstanceOf[Plugable]
}

