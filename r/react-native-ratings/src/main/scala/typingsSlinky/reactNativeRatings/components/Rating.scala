package typingsSlinky.reactNativeRatings.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.propTypes.mod.Requireable
import typingsSlinky.reactNative.mod.ImageURISource
import typingsSlinky.reactNativeRatings.mod.RatingProps
import typingsSlinky.reactNativeRatings.reactNativeRatingsStrings.bell
import typingsSlinky.reactNativeRatings.reactNativeRatingsStrings.custom
import typingsSlinky.reactNativeRatings.reactNativeRatingsStrings.heart
import typingsSlinky.reactNativeRatings.reactNativeRatingsStrings.rocket
import typingsSlinky.reactNativeRatings.reactNativeRatingsStrings.star
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Rating {
  @JSImport("react-native-ratings", "Rating")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeRatings.mod.Rating] {
    @scala.inline
    def fractions(value: Double): this.type = set("fractions", value.asInstanceOf[js.Any])
    @scala.inline
    def imageSize(value: Double): this.type = set("imageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def minValue(value: Double): this.type = set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def onFinishRating(value: /* rating */ Double => Unit): this.type = set("onFinishRating", js.Any.fromFunction1(value))
    @scala.inline
    def onStartRating(value: () => Unit): this.type = set("onStartRating", js.Any.fromFunction0(value))
    @scala.inline
    def ratingBackgroundColor(value: String): this.type = set("ratingBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def ratingColor(value: String): this.type = set("ratingColor", value.asInstanceOf[js.Any])
    @scala.inline
    def ratingCount(value: Double): this.type = set("ratingCount", value.asInstanceOf[js.Any])
    @scala.inline
    def ratingImage(value: ImageURISource): this.type = set("ratingImage", value.asInstanceOf[js.Any])
    @scala.inline
    def ratingTextColor(value: String): this.type = set("ratingTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def readonly(value: Boolean): this.type = set("readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def showRating(value: Boolean): this.type = set("showRating", value.asInstanceOf[js.Any])
    @scala.inline
    def startingValue(value: Double): this.type = set("startingValue", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: Requireable[js.Object]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def tintColor(value: String): this.type = set("tintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: star | rocket | bell | heart | custom): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RatingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Rating.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

