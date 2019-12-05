package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_BodyCommentsLabel
import typingsSlinky.astDashTypes.genKindsMod.IdentifierKind
import typingsSlinky.astDashTypes.genKindsMod.StatementKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.LabeledStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabeledStatementBuilder extends js.Object {
  def apply(label: IdentifierKind, body: StatementKind): LabeledStatement = js.native
  def from(params: Anon_BodyCommentsLabel): LabeledStatement = js.native
}

