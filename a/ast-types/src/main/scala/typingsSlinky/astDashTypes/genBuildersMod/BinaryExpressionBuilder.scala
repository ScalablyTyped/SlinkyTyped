package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_CommentsIn
import typingsSlinky.astDashTypes.astDashTypesStrings.Ampersand
import typingsSlinky.astDashTypes.astDashTypesStrings.Asterisk
import typingsSlinky.astDashTypes.astDashTypesStrings.AsteriskAsterisk
import typingsSlinky.astDashTypes.astDashTypesStrings.EqualssignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.EqualssignEqualssignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.ExclamationmarkEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.ExclamationmarkEqualssignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.Greaterthansign
import typingsSlinky.astDashTypes.astDashTypesStrings.GreaterthansignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.GreaterthansignGreaterthansign
import typingsSlinky.astDashTypes.astDashTypesStrings.GreaterthansignGreaterthansignGreaterthansign
import typingsSlinky.astDashTypes.astDashTypesStrings.Lessthansign
import typingsSlinky.astDashTypes.astDashTypesStrings.LessthansignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.LessthansignLessthansign
import typingsSlinky.astDashTypes.astDashTypesStrings.Percentsign
import typingsSlinky.astDashTypes.astDashTypesStrings.Plussign
import typingsSlinky.astDashTypes.astDashTypesStrings.Slash
import typingsSlinky.astDashTypes.astDashTypesStrings.Verticalline
import typingsSlinky.astDashTypes.astDashTypesStrings.^
import typingsSlinky.astDashTypes.astDashTypesStrings.`-_`
import typingsSlinky.astDashTypes.astDashTypesStrings.in
import typingsSlinky.astDashTypes.astDashTypesStrings.instanceof
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.BinaryExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinaryExpressionBuilder extends js.Object {
  def apply(
    operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | AsteriskAsterisk | Ampersand | Verticalline | ^  | in | instanceof,
    left: ExpressionKind,
    right: ExpressionKind
  ): BinaryExpression = js.native
  def from(params: Anon_CommentsIn): BinaryExpression = js.native
}

