package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.astTypesStrings.AmpersandEqualssign
import typingsSlinky.astTypes.astTypesStrings.AsteriskAsteriskEqualssign
import typingsSlinky.astTypes.astTypesStrings.AsteriskEqualssign
import typingsSlinky.astTypes.astTypesStrings.Equalssign
import typingsSlinky.astTypes.astTypesStrings.GreaterthansignGreaterthansignEqualssign
import typingsSlinky.astTypes.astTypesStrings.GreaterthansignGreaterthansignGreaterthansignEqualssign
import typingsSlinky.astTypes.astTypesStrings.LessthansignLessthansignEqualssign
import typingsSlinky.astTypes.astTypesStrings.PercentsignEqualssign
import typingsSlinky.astTypes.astTypesStrings.PlussignEqualssign
import typingsSlinky.astTypes.astTypesStrings.SlashEqualssign
import typingsSlinky.astTypes.astTypesStrings.VerticallineEqualssign
import typingsSlinky.astTypes.astTypesStrings.`-Equalssign`
import typingsSlinky.astTypes.astTypesStrings.`^Equalssign`
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.MemberExpressionKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> */
@js.native
trait AssignmentExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var left: PatternKind | MemberExpressionKind = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign | AsteriskAsteriskEqualssign = js.native
  
  var right: ExpressionKind = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.AssignmentExpression = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.AssignmentExpression")
@js.native
object AssignmentExpression extends TopLevel[Type[AssignmentExpression]]
