package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.CommentsElements
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.SpreadElementKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayPatternBuilder extends js.Object {
  def apply(elements: js.Array[PatternKind | SpreadElementKind | Null]): ArrayPattern = js.native
  def from(params: CommentsElements): ArrayPattern = js.native
}

