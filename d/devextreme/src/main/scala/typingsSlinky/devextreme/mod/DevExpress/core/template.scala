package typingsSlinky.devextreme.mod.DevExpress.core

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Function
  - typingsSlinky.std.Element
  - typingsSlinky.devextreme.mod.global.JQuery
*/
trait template extends js.Object

object template {
  @scala.inline
  implicit def apply(value: Element): template = value.asInstanceOf[template]
  @scala.inline
  implicit def apply(value: js.Function): template = value.asInstanceOf[template]
  @scala.inline
  implicit def apply(value: JQuery): template = value.asInstanceOf[template]
  @scala.inline
  implicit def apply(value: String): template = value.asInstanceOf[template]
}

