package typingsSlinky.ltx.elementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
*/
trait TextNode extends Node

object TextNode {
  @scala.inline
  implicit def apply(value: Double): TextNode = value.asInstanceOf[TextNode]
  @scala.inline
  implicit def apply(value: String): TextNode = value.asInstanceOf[TextNode]
}

