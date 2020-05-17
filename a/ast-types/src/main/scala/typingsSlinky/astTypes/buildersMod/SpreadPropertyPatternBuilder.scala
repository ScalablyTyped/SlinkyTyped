package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.ArgumentCommentsLoc
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadPropertyPatternBuilder extends js.Object {
  def apply(argument: PatternKind): SpreadPropertyPattern = js.native
  def from(params: ArgumentCommentsLoc): SpreadPropertyPattern = js.native
}

