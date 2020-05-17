package typingsSlinky.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.regexpp.astMod.RegExpLiteral
  - typingsSlinky.regexpp.astMod.Pattern
  - typingsSlinky.regexpp.astMod.Alternative
  - typingsSlinky.regexpp.astMod.Group
  - typingsSlinky.regexpp.astMod.CapturingGroup
  - typingsSlinky.regexpp.astMod.Quantifier
  - typingsSlinky.regexpp.astMod.CharacterClass
  - typingsSlinky.regexpp.astMod.LookaroundAssertion
  - typingsSlinky.regexpp.astMod.CharacterClassRange
*/
trait BranchNode extends Node

object BranchNode {
  @scala.inline
  implicit def apply(value: Alternative): BranchNode = value.asInstanceOf[BranchNode]
  @scala.inline
  implicit def apply(value: CapturingGroup): BranchNode = value.asInstanceOf[BranchNode]
  @scala.inline
  implicit def apply(value: CharacterClass): BranchNode = value.asInstanceOf[BranchNode]
  @scala.inline
  implicit def apply(value: CharacterClassRange): BranchNode = value.asInstanceOf[BranchNode]
  @scala.inline
  implicit def apply(value: Group): BranchNode = value.asInstanceOf[BranchNode]
  @scala.inline
  implicit def apply(value: LookaroundAssertion): BranchNode = value.asInstanceOf[BranchNode]
  @scala.inline
  implicit def apply(value: Pattern): BranchNode = value.asInstanceOf[BranchNode]
  @scala.inline
  implicit def apply(value: Quantifier): BranchNode = value.asInstanceOf[BranchNode]
  @scala.inline
  implicit def apply(value: RegExpLiteral): BranchNode = value.asInstanceOf[BranchNode]
}

