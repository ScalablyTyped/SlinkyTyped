package typingsSlinky.instagramPrivateApi.locationRepositoryStoryResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationRepositoryStoryResponseStoryLocationsItem extends js.Object {
  
  var height: String = js.native
  
  var is_hidden: Double = js.native
  
  var is_pinned: Double = js.native
  
  var is_sticker: Double = js.native
  
  var location: LocationRepositoryStoryResponseLocation = js.native
  
  var rotation: Double | String = js.native
  
  var width: String | Double = js.native
  
  var x: String | Double = js.native
  
  var y: String = js.native
  
  var z: Double = js.native
}
object LocationRepositoryStoryResponseStoryLocationsItem {
  
  @scala.inline
  def apply(
    height: String,
    is_hidden: Double,
    is_pinned: Double,
    is_sticker: Double,
    location: LocationRepositoryStoryResponseLocation,
    rotation: Double | String,
    width: String | Double,
    x: String | Double,
    y: String,
    z: Double
  ): LocationRepositoryStoryResponseStoryLocationsItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRepositoryStoryResponseStoryLocationsItem]
  }
  
  @scala.inline
  implicit class LocationRepositoryStoryResponseStoryLocationsItemOps[Self <: LocationRepositoryStoryResponseStoryLocationsItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_hidden(value: Double): Self = this.set("is_hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_pinned(value: Double): Self = this.set("is_pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_sticker(value: Double): Self = this.set("is_sticker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LocationRepositoryStoryResponseLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double | String): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: String | Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: String): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
  }
}
