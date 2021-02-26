package typingsSlinky.instagramPrivateApi.mediaConfigureStoryOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryMention extends StorySticker {
  
  var user_id: String | Double = js.native
}
object StoryMention {
  
  @scala.inline
  def apply(height: Double, rotation: Double, user_id: String | Double, width: Double, x: Double, y: Double): StoryMention = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryMention]
  }
  
  @scala.inline
  implicit class StoryMentionMutableBuilder[Self <: StoryMention] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUser_id(value: String | Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
