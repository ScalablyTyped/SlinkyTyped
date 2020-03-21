package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonLocRight
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignmentPatternBuilder extends js.Object {
  def apply(left: PatternKind, right: ExpressionKind): AssignmentPattern = js.native
  def from(params: AnonLocRight): AssignmentPattern = js.native
}

