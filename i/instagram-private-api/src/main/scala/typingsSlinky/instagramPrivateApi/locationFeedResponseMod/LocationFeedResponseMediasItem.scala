package typingsSlinky.instagramPrivateApi.locationFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationFeedResponseMediasItem extends StObject {
  
  var media: LocationFeedResponseMedia = js.native
}
object LocationFeedResponseMediasItem {
  
  @scala.inline
  def apply(media: LocationFeedResponseMedia): LocationFeedResponseMediasItem = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationFeedResponseMediasItem]
  }
  
  @scala.inline
  implicit class LocationFeedResponseMediasItemMutableBuilder[Self <: LocationFeedResponseMediasItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMedia(value: LocationFeedResponseMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
  }
}
