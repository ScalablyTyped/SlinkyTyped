package typingsSlinky.instagramPrivateApi.mediaConfigureStoryOptionsMod

import typingsSlinky.instagramPrivateApi.instagramPrivateApiBooleans.`true`
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.text_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryQuestion extends StorySticker {
  
  var background_color: String = js.native
  
  var is_sticker: `true` = js.native
  
  var profile_pic_url: String = js.native
  
  var question: String = js.native
  
  var question_type: text_ = js.native
  
  var text_color: String = js.native
  
  var viewer_can_interact: `true` = js.native
}
object StoryQuestion {
  
  @scala.inline
  def apply(
    background_color: String,
    height: Double,
    is_sticker: `true`,
    profile_pic_url: String,
    question: String,
    question_type: text_,
    rotation: Double,
    text_color: String,
    viewer_can_interact: `true`,
    width: Double,
    x: Double,
    y: Double
  ): StoryQuestion = {
    val __obj = js.Dynamic.literal(background_color = background_color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], question_type = question_type.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], viewer_can_interact = viewer_can_interact.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryQuestion]
  }
  
  @scala.inline
  implicit class StoryQuestionMutableBuilder[Self <: StoryQuestion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground_color(value: String): Self = StObject.set(x, "background_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_sticker(value: `true`): Self = StObject.set(x, "is_sticker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestion(value: String): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestion_type(value: text_): Self = StObject.set(x, "question_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText_color(value: String): Self = StObject.set(x, "text_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer_can_interact(value: `true`): Self = StObject.set(x, "viewer_can_interact", value.asInstanceOf[js.Any])
  }
}
