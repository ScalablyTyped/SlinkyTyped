package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonArgumentComments
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadElementBuilder extends js.Object {
  def apply(argument: ExpressionKind): SpreadElement = js.native
  def from(params: AnonArgumentComments): SpreadElement = js.native
}

