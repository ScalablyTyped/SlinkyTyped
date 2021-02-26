package typingsSlinky.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comment extends StObject {
  
  var album_cover: String = js.native
  
  var author: String = js.native
  
  var author_id: Double = js.native
  
  var children: js.Array[Comment] = js.native
  
  var comment: String = js.native
  
  var datetime: Double = js.native
  
  var deleted: Boolean = js.native
  
  var downs: Double = js.native
  
  var id: Double = js.native
  
  var image_id: String = js.native
  
  var on_album: Boolean = js.native
  
  var parent_id: Double = js.native
  
  var points: Double = js.native
  
  var ups: Double = js.native
  
  var vote: js.UndefOr[String] = js.native
}
object Comment {
  
  @scala.inline
  def apply(
    album_cover: String,
    author: String,
    author_id: Double,
    children: js.Array[Comment],
    comment: String,
    datetime: Double,
    deleted: Boolean,
    downs: Double,
    id: Double,
    image_id: String,
    on_album: Boolean,
    parent_id: Double,
    points: Double,
    ups: Double
  ): Comment = {
    val __obj = js.Dynamic.literal(album_cover = album_cover.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], author_id = author_id.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], downs = downs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_id = image_id.asInstanceOf[js.Any], on_album = on_album.asInstanceOf[js.Any], parent_id = parent_id.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], ups = ups.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  
  @scala.inline
  implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlbum_cover(value: String): Self = StObject.set(x, "album_cover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor_id(value: Double): Self = StObject.set(x, "author_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: js.Array[Comment]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: Comment*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatetime(value: Double): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDowns(value: Double): Self = StObject.set(x, "downs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_id(value: String): Self = StObject.set(x, "image_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn_album(value: Boolean): Self = StObject.set(x, "on_album", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent_id(value: Double): Self = StObject.set(x, "parent_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: Double): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUps(value: Double): Self = StObject.set(x, "ups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVote(value: String): Self = StObject.set(x, "vote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoteUndefined: Self = StObject.set(x, "vote", js.undefined)
  }
}
