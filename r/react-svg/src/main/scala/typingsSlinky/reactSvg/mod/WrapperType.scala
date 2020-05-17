package typingsSlinky.reactSvg.mod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.HTMLSpanElement
  - typingsSlinky.std.HTMLDivElement
*/
trait WrapperType extends js.Object

object WrapperType {
  @scala.inline
  implicit def apply(value: HTMLDivElement): WrapperType = value.asInstanceOf[WrapperType]
  @scala.inline
  implicit def apply(value: HTMLSpanElement): WrapperType = value.asInstanceOf[WrapperType]
}

