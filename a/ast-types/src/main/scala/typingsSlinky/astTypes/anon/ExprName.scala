package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSImportTypeKind
import typingsSlinky.astTypes.kindsMod.TSQualifiedNameKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExprName extends StObject {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var exprName: IdentifierKind | TSQualifiedNameKind | TSImportTypeKind = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
}
object ExprName {
  
  @scala.inline
  def apply(exprName: IdentifierKind | TSQualifiedNameKind | TSImportTypeKind): ExprName = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExprName]
  }
  
  @scala.inline
  implicit class ExprNameMutableBuilder[Self <: ExprName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setExprName(value: IdentifierKind | TSQualifiedNameKind | TSImportTypeKind): Self = StObject.set(x, "exprName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
  }
}
