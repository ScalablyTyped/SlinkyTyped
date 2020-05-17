package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Expression
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExportAssignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSExportAssignmentBuilder extends js.Object {
  def apply(expression: ExpressionKind): TSExportAssignment = js.native
  def from(params: Expression): TSExportAssignment = js.native
}

