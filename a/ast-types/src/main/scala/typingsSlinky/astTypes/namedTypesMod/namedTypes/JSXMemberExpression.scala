package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.ChainElementKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.JSXIdentifierKind
import typingsSlinky.astTypes.kindsMod.JSXMemberExpressionKind
import typingsSlinky.astTypes.kindsMod.MemberExpressionKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.MemberExpression, 'type' | 'object' | 'property' | 'computed'> */
@js.native
trait JSXMemberExpression
  extends ASTNode
     with ChainElementKind
     with ExpressionKind
     with MemberExpressionKind
     with NodeKind
     with PrintableKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var computed: js.UndefOr[Boolean] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var `object`: JSXIdentifierKind | JSXMemberExpressionKind = js.native
  
  var optional: js.UndefOr[Boolean] = js.native
  
  var property: JSXIdentifierKind = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.JSXMemberExpression = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.JSXMemberExpression")
@js.native
object JSXMemberExpression extends TopLevel[Type[JSXMemberExpression]]
