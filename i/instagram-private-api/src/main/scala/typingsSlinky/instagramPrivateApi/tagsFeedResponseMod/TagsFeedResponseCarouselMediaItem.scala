package typingsSlinky.instagramPrivateApi.tagsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagsFeedResponseCarouselMediaItem extends StObject {
  
  var carousel_parent_id: String = js.native
  
  var id: String = js.native
  
  var image_versions2: TagsFeedResponseImageVersions2 = js.native
  
  var is_dash_eligible: js.UndefOr[Double] = js.native
  
  var media_type: Double = js.native
  
  var number_of_qualities: js.UndefOr[Double] = js.native
  
  var original_height: Double = js.native
  
  var original_width: Double = js.native
  
  var pk: String = js.native
  
  var usertags: js.UndefOr[TagsFeedResponseUsertags] = js.native
  
  var video_codec: js.UndefOr[String] = js.native
  
  var video_dash_manifest: js.UndefOr[String] = js.native
  
  var video_duration: js.UndefOr[Double] = js.native
  
  var video_versions: js.UndefOr[js.Array[TagsFeedResponseVideoVersionsItem]] = js.native
}
object TagsFeedResponseCarouselMediaItem {
  
  @scala.inline
  def apply(
    carousel_parent_id: String,
    id: String,
    image_versions2: TagsFeedResponseImageVersions2,
    media_type: Double,
    original_height: Double,
    original_width: Double,
    pk: String
  ): TagsFeedResponseCarouselMediaItem = {
    val __obj = js.Dynamic.literal(carousel_parent_id = carousel_parent_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsFeedResponseCarouselMediaItem]
  }
  
  @scala.inline
  implicit class TagsFeedResponseCarouselMediaItemMutableBuilder[Self <: TagsFeedResponseCarouselMediaItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCarousel_parent_id(value: String): Self = StObject.set(x, "carousel_parent_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_versions2(value: TagsFeedResponseImageVersions2): Self = StObject.set(x, "image_versions2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_dash_eligible(value: Double): Self = StObject.set(x, "is_dash_eligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_dash_eligibleUndefined: Self = StObject.set(x, "is_dash_eligible", js.undefined)
    
    @scala.inline
    def setMedia_type(value: Double): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber_of_qualities(value: Double): Self = StObject.set(x, "number_of_qualities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber_of_qualitiesUndefined: Self = StObject.set(x, "number_of_qualities", js.undefined)
    
    @scala.inline
    def setOriginal_height(value: Double): Self = StObject.set(x, "original_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_width(value: Double): Self = StObject.set(x, "original_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsertags(value: TagsFeedResponseUsertags): Self = StObject.set(x, "usertags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsertagsUndefined: Self = StObject.set(x, "usertags", js.undefined)
    
    @scala.inline
    def setVideo_codec(value: String): Self = StObject.set(x, "video_codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_codecUndefined: Self = StObject.set(x, "video_codec", js.undefined)
    
    @scala.inline
    def setVideo_dash_manifest(value: String): Self = StObject.set(x, "video_dash_manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_dash_manifestUndefined: Self = StObject.set(x, "video_dash_manifest", js.undefined)
    
    @scala.inline
    def setVideo_duration(value: Double): Self = StObject.set(x, "video_duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_durationUndefined: Self = StObject.set(x, "video_duration", js.undefined)
    
    @scala.inline
    def setVideo_versions(value: js.Array[TagsFeedResponseVideoVersionsItem]): Self = StObject.set(x, "video_versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_versionsUndefined: Self = StObject.set(x, "video_versions", js.undefined)
    
    @scala.inline
    def setVideo_versionsVarargs(value: TagsFeedResponseVideoVersionsItem*): Self = StObject.set(x, "video_versions", js.Array(value :_*))
  }
}
