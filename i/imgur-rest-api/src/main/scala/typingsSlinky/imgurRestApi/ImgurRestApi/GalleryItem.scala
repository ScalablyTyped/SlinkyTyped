package typingsSlinky.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GalleryItem extends StObject {
  
  var account_id: js.UndefOr[Double] = js.native
  
  var account_url: js.UndefOr[String] = js.native
  
  var comment_count: Double = js.native
  
  var datetime: Double = js.native
  
  var description: String = js.native
  
  var downs: Double = js.native
  
  var favorite: Boolean = js.native
  
  var id: String = js.native
  
  var is_album: Boolean = js.native
  
  var link: String = js.native
  
  var nsfw: js.UndefOr[Boolean] = js.native
  
  var score: Double = js.native
  
  var title: String = js.native
  
  var topic: String = js.native
  
  var topic_id: Double = js.native
  
  var ups: Double = js.native
  
  var views: Double = js.native
  
  var vote: js.UndefOr[String] = js.native
}
object GalleryItem {
  
  @scala.inline
  def apply(
    comment_count: Double,
    datetime: Double,
    description: String,
    downs: Double,
    favorite: Boolean,
    id: String,
    is_album: Boolean,
    link: String,
    score: Double,
    title: String,
    topic: String,
    topic_id: Double,
    ups: Double,
    views: Double
  ): GalleryItem = {
    val __obj = js.Dynamic.literal(comment_count = comment_count.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], downs = downs.asInstanceOf[js.Any], favorite = favorite.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_album = is_album.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], topic_id = topic_id.asInstanceOf[js.Any], ups = ups.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[GalleryItem]
  }
  
  @scala.inline
  implicit class GalleryItemMutableBuilder[Self <: GalleryItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount_id(value: Double): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccount_idUndefined: Self = StObject.set(x, "account_id", js.undefined)
    
    @scala.inline
    def setAccount_url(value: String): Self = StObject.set(x, "account_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccount_urlUndefined: Self = StObject.set(x, "account_url", js.undefined)
    
    @scala.inline
    def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatetime(value: Double): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDowns(value: Double): Self = StObject.set(x, "downs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFavorite(value: Boolean): Self = StObject.set(x, "favorite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_album(value: Boolean): Self = StObject.set(x, "is_album", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNsfw(value: Boolean): Self = StObject.set(x, "nsfw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNsfwUndefined: Self = StObject.set(x, "nsfw", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopic_id(value: Double): Self = StObject.set(x, "topic_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUps(value: Double): Self = StObject.set(x, "ups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViews(value: Double): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVote(value: String): Self = StObject.set(x, "vote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoteUndefined: Self = StObject.set(x, "vote", js.undefined)
  }
}
