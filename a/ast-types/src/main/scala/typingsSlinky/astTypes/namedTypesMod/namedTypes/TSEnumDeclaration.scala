package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DeclarationKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.kindsMod.TSEnumMemberKind
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> */
@js.native
trait TSEnumDeclaration
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var const: js.UndefOr[Boolean] = js.native
  
  var declare: js.UndefOr[Boolean] = js.native
  
  var id: IdentifierKind = js.native
  
  var initializer: js.UndefOr[ExpressionKind | Null] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var members: js.Array[TSEnumMemberKind] = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSEnumDeclaration = js.native
}
object TSEnumDeclaration {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.TSEnumDeclaration")
  @js.native
  val ^ : Type[TSEnumDeclaration] = js.native
  
  @scala.inline
  implicit class TSEnumDeclarationMutableBuilder[Self <: TSEnumDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setConst(value: Boolean): Self = StObject.set(x, "const", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstUndefined: Self = StObject.set(x, "const", js.undefined)
    
    @scala.inline
    def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareUndefined: Self = StObject.set(x, "declare", js.undefined)
    
    @scala.inline
    def setId(value: IdentifierKind): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializer(value: ExpressionKind): Self = StObject.set(x, "initializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializerNull: Self = StObject.set(x, "initializer", null)
    
    @scala.inline
    def setInitializerUndefined: Self = StObject.set(x, "initializer", js.undefined)
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setMembers(value: js.Array[TSEnumMemberKind]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: TSEnumMemberKind*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typingsSlinky.astTypes.astTypesStrings.TSEnumDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
