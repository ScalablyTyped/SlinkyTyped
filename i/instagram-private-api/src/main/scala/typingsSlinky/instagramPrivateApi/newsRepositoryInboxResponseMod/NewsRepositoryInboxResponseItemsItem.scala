package typingsSlinky.instagramPrivateApi.newsRepositoryInboxResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewsRepositoryInboxResponseItemsItem extends StObject {
  
  var algorithm: String = js.native
  
  var caption: String = js.native
  
  var followed_by: Boolean = js.native
  
  var icon: String = js.native
  
  var is_new_suggestion: Boolean = js.native
  
  var large_urls: js.Array[_] = js.native
  
  var media_ids: js.Array[_] = js.native
  
  var media_infos: js.Array[_] = js.native
  
  var social_context: String = js.native
  
  var thumbnail_urls: js.Array[_] = js.native
  
  var user: NewsRepositoryInboxResponseUser = js.native
  
  var uuid: String = js.native
  
  var value: Double = js.native
}
object NewsRepositoryInboxResponseItemsItem {
  
  @scala.inline
  def apply(
    algorithm: String,
    caption: String,
    followed_by: Boolean,
    icon: String,
    is_new_suggestion: Boolean,
    large_urls: js.Array[_],
    media_ids: js.Array[_],
    media_infos: js.Array[_],
    social_context: String,
    thumbnail_urls: js.Array[_],
    user: NewsRepositoryInboxResponseUser,
    uuid: String,
    value: Double
  ): NewsRepositoryInboxResponseItemsItem = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], followed_by = followed_by.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], is_new_suggestion = is_new_suggestion.asInstanceOf[js.Any], large_urls = large_urls.asInstanceOf[js.Any], media_ids = media_ids.asInstanceOf[js.Any], media_infos = media_infos.asInstanceOf[js.Any], social_context = social_context.asInstanceOf[js.Any], thumbnail_urls = thumbnail_urls.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseItemsItem]
  }
  
  @scala.inline
  implicit class NewsRepositoryInboxResponseItemsItemMutableBuilder[Self <: NewsRepositoryInboxResponseItemsItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowed_by(value: Boolean): Self = StObject.set(x, "followed_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_new_suggestion(value: Boolean): Self = StObject.set(x, "is_new_suggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLarge_urls(value: js.Array[_]): Self = StObject.set(x, "large_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLarge_urlsVarargs(value: js.Any*): Self = StObject.set(x, "large_urls", js.Array(value :_*))
    
    @scala.inline
    def setMedia_ids(value: js.Array[_]): Self = StObject.set(x, "media_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_idsVarargs(value: js.Any*): Self = StObject.set(x, "media_ids", js.Array(value :_*))
    
    @scala.inline
    def setMedia_infos(value: js.Array[_]): Self = StObject.set(x, "media_infos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_infosVarargs(value: js.Any*): Self = StObject.set(x, "media_infos", js.Array(value :_*))
    
    @scala.inline
    def setSocial_context(value: String): Self = StObject.set(x, "social_context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail_urls(value: js.Array[_]): Self = StObject.set(x, "thumbnail_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail_urlsVarargs(value: js.Any*): Self = StObject.set(x, "thumbnail_urls", js.Array(value :_*))
    
    @scala.inline
    def setUser(value: NewsRepositoryInboxResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
