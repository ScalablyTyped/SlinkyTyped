package typingsSlinky.reactNativeElements.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNativeRatings.mod.AirbnbRatingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AirbnbRating {
  
  @JSImport("react-native-elements", "AirbnbRating")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeElements.mod.AirbnbRating] {
    
    @scala.inline
    def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultRating(value: Double): this.type = set("defaultRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isDisabled(value: Boolean): this.type = set("isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onFinishRating(value: /* value */ Double => Unit): this.type = set("onFinishRating", js.Any.fromFunction1(value))
    
    @scala.inline
    def reviews(value: js.Array[String]): this.type = set("reviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def reviewsVarargs(value: String*): this.type = set("reviews", js.Array(value :_*))
    
    @scala.inline
    def selectedColor(value: String): this.type = set("selectedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showRating(value: Boolean): this.type = set("showRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def starStyle(value: ImageStyle): this.type = set("starStyle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: AirbnbRating.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AirbnbRatingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
