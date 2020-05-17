package typingsSlinky.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.regexpp.astMod.BoundaryAssertion
  - typingsSlinky.regexpp.astMod.CharacterSet
  - typingsSlinky.regexpp.astMod.Character
  - typingsSlinky.regexpp.astMod.Backreference
  - typingsSlinky.regexpp.astMod.Flags
*/
trait LeafNode extends Node

object LeafNode {
  @scala.inline
  implicit def apply(value: Backreference): LeafNode = value.asInstanceOf[LeafNode]
  @scala.inline
  implicit def apply(value: BoundaryAssertion): LeafNode = value.asInstanceOf[LeafNode]
  @scala.inline
  implicit def apply(value: Character): LeafNode = value.asInstanceOf[LeafNode]
  @scala.inline
  implicit def apply(value: CharacterSet): LeafNode = value.asInstanceOf[LeafNode]
  @scala.inline
  implicit def apply(value: Flags): LeafNode = value.asInstanceOf[LeafNode]
}

