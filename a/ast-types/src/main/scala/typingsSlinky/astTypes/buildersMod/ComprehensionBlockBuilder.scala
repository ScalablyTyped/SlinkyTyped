package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonEach
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ComprehensionBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComprehensionBlockBuilder extends js.Object {
  def apply(left: PatternKind, right: ExpressionKind, each: Boolean): ComprehensionBlock = js.native
  def from(params: AnonEach): ComprehensionBlock = js.native
}

