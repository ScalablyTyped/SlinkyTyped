package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonCommentsLocValue
import typingsSlinky.astTypes.kindsMod.DirectiveLiteralKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Directive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectiveBuilder extends js.Object {
  def apply(value: DirectiveLiteralKind): Directive = js.native
  def from(params: AnonCommentsLocValue): Directive = js.native
}

