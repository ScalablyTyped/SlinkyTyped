package typingsSlinky.d3Selection.mod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Element
  - typingsSlinky.d3Selection.mod.EnterElement
  - typingsSlinky.std.Document
  - typingsSlinky.std.Window
  - scala.Null
*/
trait BaseType extends js.Object

object BaseType {
  @scala.inline
  implicit def apply(value: Document): BaseType = value.asInstanceOf[BaseType]
  @scala.inline
  implicit def apply(value: Element): BaseType = value.asInstanceOf[BaseType]
  @scala.inline
  implicit def apply(value: EnterElement): BaseType = value.asInstanceOf[BaseType]
  @scala.inline
  implicit def apply(value: Null): BaseType = value.asInstanceOf[BaseType]
  @scala.inline
  implicit def apply(value: Window): BaseType = value.asInstanceOf[BaseType]
}

