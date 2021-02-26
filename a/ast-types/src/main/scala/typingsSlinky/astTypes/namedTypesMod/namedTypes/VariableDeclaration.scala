package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.astTypesStrings.`var`
import typingsSlinky.astTypes.astTypesStrings.const
import typingsSlinky.astTypes.astTypesStrings.let
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DeclarationKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.kindsMod.VariableDeclaratorKind
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> */
@js.native
trait VariableDeclaration
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var declarations: js.Array[VariableDeclaratorKind | IdentifierKind] = js.native
  
  var kind: `var` | let | const = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.VariableDeclaration = js.native
}
object VariableDeclaration {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.VariableDeclaration")
  @js.native
  val ^ : Type[VariableDeclaration] = js.native
  
  @scala.inline
  implicit class VariableDeclarationMutableBuilder[Self <: VariableDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setDeclarations(value: js.Array[VariableDeclaratorKind | IdentifierKind]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclarationsVarargs(value: (VariableDeclaratorKind | IdentifierKind)*): Self = StObject.set(x, "declarations", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: `var` | let | const): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.astTypes.astTypesStrings.VariableDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
