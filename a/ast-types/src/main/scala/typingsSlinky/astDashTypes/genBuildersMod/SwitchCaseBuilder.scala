package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_CommentsConsequent
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.StatementKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.SwitchCase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchCaseBuilder extends js.Object {
  def apply(test: Null, consequent: js.Array[StatementKind]): SwitchCase = js.native
  def apply(test: ExpressionKind, consequent: js.Array[StatementKind]): SwitchCase = js.native
  def from(params: Anon_CommentsConsequent): SwitchCase = js.native
}

