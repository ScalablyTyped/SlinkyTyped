package typingsSlinky.instagramPrivateApi.mediaConfigureStoryOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryAttachedMedia extends StorySticker {
  
  var is_sticker: Boolean = js.native
  
  var media_id: String = js.native
}
object StoryAttachedMedia {
  
  @scala.inline
  def apply(
    height: Double,
    is_sticker: Boolean,
    media_id: String,
    rotation: Double,
    width: Double,
    x: Double,
    y: Double
  ): StoryAttachedMedia = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryAttachedMedia]
  }
  
  @scala.inline
  implicit class StoryAttachedMediaOps[Self <: StoryAttachedMedia] (val x: Self) extends AnyVal {
    
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
    def setIs_sticker(value: Boolean): Self = this.set("is_sticker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_id(value: String): Self = this.set("media_id", value.asInstanceOf[js.Any])
  }
}
