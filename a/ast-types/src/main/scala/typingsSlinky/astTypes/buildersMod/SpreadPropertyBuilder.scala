package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.ArgumentComments
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadPropertyBuilder extends js.Object {
  def apply(argument: ExpressionKind): SpreadProperty = js.native
  def from(params: ArgumentComments): SpreadProperty = js.native
}

