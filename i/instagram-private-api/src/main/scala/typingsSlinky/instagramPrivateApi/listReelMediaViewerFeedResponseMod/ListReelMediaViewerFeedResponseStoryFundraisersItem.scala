package typingsSlinky.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReelMediaViewerFeedResponseStoryFundraisersItem extends js.Object {
  
  var fundraiser_sticker: ListReelMediaViewerFeedResponseFundraiserSticker = js.native
  
  var height: Double = js.native
  
  var is_hidden: Double = js.native
  
  var is_pinned: Double = js.native
  
  var is_sticker: Double = js.native
  
  var rotation: Double = js.native
  
  var width: Double = js.native
  
  var x: Double = js.native
  
  var y: String = js.native
  
  var z: Double = js.native
}
object ListReelMediaViewerFeedResponseStoryFundraisersItem {
  
  @scala.inline
  def apply(
    fundraiser_sticker: ListReelMediaViewerFeedResponseFundraiserSticker,
    height: Double,
    is_hidden: Double,
    is_pinned: Double,
    is_sticker: Double,
    rotation: Double,
    width: Double,
    x: Double,
    y: String,
    z: Double
  ): ListReelMediaViewerFeedResponseStoryFundraisersItem = {
    val __obj = js.Dynamic.literal(fundraiser_sticker = fundraiser_sticker.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseStoryFundraisersItem]
  }
  
  @scala.inline
  implicit class ListReelMediaViewerFeedResponseStoryFundraisersItemOps[Self <: ListReelMediaViewerFeedResponseStoryFundraisersItem] (val x: Self) extends AnyVal {
    
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
    def setFundraiser_sticker(value: ListReelMediaViewerFeedResponseFundraiserSticker): Self = this.set("fundraiser_sticker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_hidden(value: Double): Self = this.set("is_hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_pinned(value: Double): Self = this.set("is_pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_sticker(value: Double): Self = this.set("is_sticker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: String): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
  }
}
