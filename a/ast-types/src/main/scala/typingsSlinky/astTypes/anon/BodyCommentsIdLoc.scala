package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.EnumBooleanBodyKind
import typingsSlinky.astTypes.kindsMod.EnumNumberBodyKind
import typingsSlinky.astTypes.kindsMod.EnumStringBodyKind
import typingsSlinky.astTypes.kindsMod.EnumSymbolBodyKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyCommentsIdLoc extends StObject {
  
  var body: EnumBooleanBodyKind | EnumNumberBodyKind | EnumStringBodyKind | EnumSymbolBodyKind = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var id: IdentifierKind = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
}
object BodyCommentsIdLoc {
  
  @scala.inline
  def apply(
    body: EnumBooleanBodyKind | EnumNumberBodyKind | EnumStringBodyKind | EnumSymbolBodyKind,
    id: IdentifierKind
  ): BodyCommentsIdLoc = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyCommentsIdLoc]
  }
  
  @scala.inline
  implicit class BodyCommentsIdLocMutableBuilder[Self <: BodyCommentsIdLoc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: EnumBooleanBodyKind | EnumNumberBodyKind | EnumStringBodyKind | EnumSymbolBodyKind): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setId(value: IdentifierKind): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
  }
}
