package typingsSlinky.antd.utilsMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.HTMLElement
  - typingsSlinky.std.Window
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait BindElement extends js.Object

object BindElement {
  @scala.inline
  implicit def apply(value: HTMLElement): BindElement = value.asInstanceOf[BindElement]
  @scala.inline
  implicit def apply(value: Null): BindElement = value.asInstanceOf[BindElement]
  @scala.inline
  implicit def apply(value: Window): BindElement = value.asInstanceOf[BindElement]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => BindElement): BindElement = value.asInstanceOf[BindElement]
}

