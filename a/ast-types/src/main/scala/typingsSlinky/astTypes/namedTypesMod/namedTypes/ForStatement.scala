package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.kindsMod.VariableDeclarationKind
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> */
@js.native
trait ForStatement
  extends ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  
  var body: StatementKind = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var init: VariableDeclarationKind | ExpressionKind | Null = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var test: ExpressionKind | Null = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.ForStatement = js.native
  
  var update: ExpressionKind | Null = js.native
}
object ForStatement {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.ForStatement")
  @js.native
  val ^ : Type[ForStatement] = js.native
  
  @scala.inline
  implicit class ForStatementMutableBuilder[Self <: ForStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: StatementKind): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setInit(value: VariableDeclarationKind | ExpressionKind): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitNull: Self = StObject.set(x, "init", null)
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setTest(value: ExpressionKind): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestNull: Self = StObject.set(x, "test", null)
    
    @scala.inline
    def setType(value: typingsSlinky.astTypes.astTypesStrings.ForStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: ExpressionKind): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateNull: Self = StObject.set(x, "update", null)
  }
}
