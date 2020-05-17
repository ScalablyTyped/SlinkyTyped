package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.CommentsKind
import typingsSlinky.astTypes.astTypesStrings.minus
import typingsSlinky.astTypes.astTypesStrings.plus
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Variance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VarianceBuilder extends js.Object {
  def apply(kind: minus): Variance = js.native
  def apply(kind: plus): Variance = js.native
  def from(params: CommentsKind): Variance = js.native
}

