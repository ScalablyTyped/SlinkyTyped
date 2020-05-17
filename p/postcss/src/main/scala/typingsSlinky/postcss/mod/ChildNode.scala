package typingsSlinky.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.postcss.mod.AtRule_
  - typingsSlinky.postcss.mod.Rule_
  - typingsSlinky.postcss.mod.Declaration
  - typingsSlinky.postcss.mod.Comment_
*/
trait ChildNode extends Node

object ChildNode {
  @scala.inline
  implicit def apply(value: AtRule_): ChildNode = value.asInstanceOf[ChildNode]
  @scala.inline
  implicit def apply(value: Comment_): ChildNode = value.asInstanceOf[ChildNode]
  @scala.inline
  implicit def apply(value: Declaration): ChildNode = value.asInstanceOf[ChildNode]
  @scala.inline
  implicit def apply(value: Rule_): ChildNode = value.asInstanceOf[ChildNode]
}

