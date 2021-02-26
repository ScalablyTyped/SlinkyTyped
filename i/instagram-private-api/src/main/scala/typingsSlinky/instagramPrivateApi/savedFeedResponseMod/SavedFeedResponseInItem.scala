package typingsSlinky.instagramPrivateApi.savedFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedFeedResponseInItem extends StObject {
  
  var duration_in_video_in_sec: js.UndefOr[Null] = js.native
  
  var position: js.Array[Double | String] = js.native
  
  var product: js.UndefOr[SavedFeedResponseProduct] = js.native
  
  var start_time_in_video_in_sec: js.UndefOr[Null] = js.native
  
  var user: js.UndefOr[SavedFeedResponseUser] = js.native
}
object SavedFeedResponseInItem {
  
  @scala.inline
  def apply(position: js.Array[Double | String]): SavedFeedResponseInItem = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFeedResponseInItem]
  }
  
  @scala.inline
  implicit class SavedFeedResponseInItemMutableBuilder[Self <: SavedFeedResponseInItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: js.Array[Double | String]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionVarargs(value: (Double | String)*): Self = StObject.set(x, "position", js.Array(value :_*))
    
    @scala.inline
    def setProduct(value: SavedFeedResponseProduct): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    @scala.inline
    def setUser(value: SavedFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
