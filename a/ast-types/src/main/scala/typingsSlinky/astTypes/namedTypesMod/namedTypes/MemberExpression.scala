package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.ChainElementKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.MemberExpressionKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> */
/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.ChainElement, 'type'> */
@js.native
trait MemberExpression
  extends ASTNode
     with ChainElementKind
     with ExpressionKind
     with MemberExpressionKind
     with NodeKind
     with PrintableKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var computed: js.UndefOr[Boolean] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var `object`: ExpressionKind = js.native
  
  var optional: js.UndefOr[Boolean] = js.native
  
  var property: IdentifierKind | ExpressionKind = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.MemberExpression = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.MemberExpression")
@js.native
object MemberExpression extends TopLevel[Type[MemberExpression]]
