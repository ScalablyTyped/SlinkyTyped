package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.astTypesStrings.Ampersand
import typingsSlinky.astTypes.astTypesStrings.Asterisk
import typingsSlinky.astTypes.astTypesStrings.AsteriskAsterisk
import typingsSlinky.astTypes.astTypesStrings.EqualssignEqualssign
import typingsSlinky.astTypes.astTypesStrings.EqualssignEqualssignEqualssign
import typingsSlinky.astTypes.astTypesStrings.ExclamationmarkEqualssign
import typingsSlinky.astTypes.astTypesStrings.ExclamationmarkEqualssignEqualssign
import typingsSlinky.astTypes.astTypesStrings.Greaterthansign
import typingsSlinky.astTypes.astTypesStrings.GreaterthansignEqualssign
import typingsSlinky.astTypes.astTypesStrings.GreaterthansignGreaterthansign
import typingsSlinky.astTypes.astTypesStrings.GreaterthansignGreaterthansignGreaterthansign
import typingsSlinky.astTypes.astTypesStrings.Lessthansign
import typingsSlinky.astTypes.astTypesStrings.LessthansignEqualssign
import typingsSlinky.astTypes.astTypesStrings.LessthansignLessthansign
import typingsSlinky.astTypes.astTypesStrings.Percentsign
import typingsSlinky.astTypes.astTypesStrings.Plussign
import typingsSlinky.astTypes.astTypesStrings.Slash
import typingsSlinky.astTypes.astTypesStrings.Verticalline
import typingsSlinky.astTypes.astTypesStrings.`-_`
import typingsSlinky.astTypes.astTypesStrings.in
import typingsSlinky.astTypes.astTypesStrings.instanceof
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> */
@js.native
trait BinaryExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var left: ExpressionKind = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | Ampersand | Verticalline | typingsSlinky.astTypes.astTypesStrings.^ | in | instanceof | AsteriskAsterisk = js.native
  
  var right: ExpressionKind = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.BinaryExpression = js.native
}
object BinaryExpression {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.BinaryExpression")
  @js.native
  val ^ : Type[BinaryExpression] = js.native
  
  @scala.inline
  implicit class BinaryExpressionMutableBuilder[Self <: BinaryExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setLeft(value: ExpressionKind): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setOperator(
      value: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | Ampersand | Verticalline | typingsSlinky.astTypes.astTypesStrings.^ | in | instanceof | AsteriskAsterisk
    ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: ExpressionKind): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.astTypes.astTypesStrings.BinaryExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
