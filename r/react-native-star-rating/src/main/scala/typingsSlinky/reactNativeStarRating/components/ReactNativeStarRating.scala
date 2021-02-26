package typingsSlinky.reactNativeStarRating.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ImageURISource
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeStarRating.mod.StarRatingProps
import typingsSlinky.reactNativeStarRating.mod.default
import typingsSlinky.reactNativeStarRating.reactNativeStarRatingStrings.bounce
import typingsSlinky.reactNativeStarRating.reactNativeStarRatingStrings.flash
import typingsSlinky.reactNativeStarRating.reactNativeStarRatingStrings.jello
import typingsSlinky.reactNativeStarRating.reactNativeStarRatingStrings.pulse
import typingsSlinky.reactNativeStarRating.reactNativeStarRatingStrings.rotate
import typingsSlinky.reactNativeStarRating.reactNativeStarRatingStrings.rubberBand
import typingsSlinky.reactNativeStarRating.reactNativeStarRatingStrings.shake
import typingsSlinky.reactNativeStarRating.reactNativeStarRatingStrings.swing
import typingsSlinky.reactNativeStarRating.reactNativeStarRatingStrings.tada
import typingsSlinky.reactNativeStarRating.reactNativeStarRatingStrings.wobble
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeStarRating {
  
  @JSImport("react-native-star-rating", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def activeOpacity(value: Double): this.type = set("activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animation(value: bounce | flash | jello | pulse | rotate | rubberBand | shake | swing | tada | wobble): this.type = set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonStyle(value: StyleProp[ViewStyle]): this.type = set("buttonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonStyleNull: this.type = set("buttonStyle", null)
    
    @scala.inline
    def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerStyleNull: this.type = set("containerStyle", null)
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def emptyStar(value: String | ImageURISource): this.type = set("emptyStar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def emptyStarColor(value: String): this.type = set("emptyStarColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fullStar(value: String | ImageURISource): this.type = set("fullStar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fullStarColor(value: String): this.type = set("fullStarColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def halfStar(value: String | ImageURISource): this.type = set("halfStar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def halfStarColor(value: String): this.type = set("halfStarColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def halfStarEnabled(value: Boolean): this.type = set("halfStarEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconSet(value: String): this.type = set("iconSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxStars(value: Double): this.type = set("maxStars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rating(value: Double): this.type = set("rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def reversed(value: Boolean): this.type = set("reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedStar(value: /* rating */ Double => Unit): this.type = set("selectedStar", js.Any.fromFunction1(value))
    
    @scala.inline
    def starSize(value: Double): this.type = set("starSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def starStyle(value: StyleProp[ViewStyle]): this.type = set("starStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def starStyleNull: this.type = set("starStyle", null)
  }
  
  implicit def make(companion: ReactNativeStarRating.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StarRatingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
