package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.ArgumentCommentsLoc
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElementPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadElementPatternBuilder extends js.Object {
  def apply(argument: PatternKind): SpreadElementPattern = js.native
  def from(params: ArgumentCommentsLoc): SpreadElementPattern = js.native
}

