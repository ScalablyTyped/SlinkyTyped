package typingsSlinky.jss.mod

import org.scalajs.dom.raw.Comment
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.HTMLElement
  - typingsSlinky.std.Comment
*/
trait InsertionPoint extends js.Object

object InsertionPoint {
  @scala.inline
  implicit def apply(value: Comment): InsertionPoint = value.asInstanceOf[InsertionPoint]
  @scala.inline
  implicit def apply(value: HTMLElement): InsertionPoint = value.asInstanceOf[InsertionPoint]
  @scala.inline
  implicit def apply(value: String): InsertionPoint = value.asInstanceOf[InsertionPoint]
}

