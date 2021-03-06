package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentsExported extends StObject {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var exported: IdentifierKind = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
}
object CommentsExported {
  
  @scala.inline
  def apply(exported: IdentifierKind): CommentsExported = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentsExported]
  }
  
  @scala.inline
  implicit class CommentsExportedMutableBuilder[Self <: CommentsExported] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setExported(value: IdentifierKind): Self = StObject.set(x, "exported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
  }
}
