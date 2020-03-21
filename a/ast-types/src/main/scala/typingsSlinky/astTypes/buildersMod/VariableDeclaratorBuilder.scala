package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonId
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.VariableDeclarator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableDeclaratorBuilder extends js.Object {
  def apply(id: PatternKind): VariableDeclarator = js.native
  def apply(id: PatternKind, init: ExpressionKind): VariableDeclarator = js.native
  def from(params: AnonId): VariableDeclarator = js.native
}

