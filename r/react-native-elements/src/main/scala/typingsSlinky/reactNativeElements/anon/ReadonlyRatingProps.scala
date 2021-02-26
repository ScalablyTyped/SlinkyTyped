package typingsSlinky.reactNativeElements.anon

import typingsSlinky.propTypes.mod.Requireable
import typingsSlinky.reactNative.mod.ImageURISource
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.bell
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.custom
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.heart
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.rocket
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.star
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-native-ratings.react-native-ratings.RatingProps> */
@js.native
trait ReadonlyRatingProps extends StObject {
  
  val fractions: js.UndefOr[Double] = js.native
  
  val imageSize: js.UndefOr[Double] = js.native
  
  val minValue: js.UndefOr[Double] = js.native
  
  val onFinishRating: js.UndefOr[js.Function1[/* rating */ Double, Unit]] = js.native
  
  val onStartRating: js.UndefOr[js.Function0[Unit]] = js.native
  
  val ratingBackgroundColor: js.UndefOr[String] = js.native
  
  val ratingColor: js.UndefOr[String] = js.native
  
  val ratingCount: js.UndefOr[Double] = js.native
  
  val ratingImage: js.UndefOr[ImageURISource] = js.native
  
  val ratingTextColor: js.UndefOr[String] = js.native
  
  val readonly: js.UndefOr[Boolean] = js.native
  
  val showRating: js.UndefOr[Boolean] = js.native
  
  val startingValue: js.UndefOr[Double] = js.native
  
  val style: js.UndefOr[Requireable[js.Object]] = js.native
  
  val tintColor: js.UndefOr[String] = js.native
  
  val `type`: js.UndefOr[star | rocket | bell | heart | custom] = js.native
}
object ReadonlyRatingProps {
  
  @scala.inline
  def apply(): ReadonlyRatingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyRatingProps]
  }
  
  @scala.inline
  implicit class ReadonlyRatingPropsMutableBuilder[Self <: ReadonlyRatingProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFractions(value: Double): Self = StObject.set(x, "fractions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFractionsUndefined: Self = StObject.set(x, "fractions", js.undefined)
    
    @scala.inline
    def setImageSize(value: Double): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    @scala.inline
    def setOnFinishRating(value: /* rating */ Double => Unit): Self = StObject.set(x, "onFinishRating", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFinishRatingUndefined: Self = StObject.set(x, "onFinishRating", js.undefined)
    
    @scala.inline
    def setOnStartRating(value: () => Unit): Self = StObject.set(x, "onStartRating", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnStartRatingUndefined: Self = StObject.set(x, "onStartRating", js.undefined)
    
    @scala.inline
    def setRatingBackgroundColor(value: String): Self = StObject.set(x, "ratingBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatingBackgroundColorUndefined: Self = StObject.set(x, "ratingBackgroundColor", js.undefined)
    
    @scala.inline
    def setRatingColor(value: String): Self = StObject.set(x, "ratingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatingColorUndefined: Self = StObject.set(x, "ratingColor", js.undefined)
    
    @scala.inline
    def setRatingCount(value: Double): Self = StObject.set(x, "ratingCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatingCountUndefined: Self = StObject.set(x, "ratingCount", js.undefined)
    
    @scala.inline
    def setRatingImage(value: ImageURISource): Self = StObject.set(x, "ratingImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatingImageUndefined: Self = StObject.set(x, "ratingImage", js.undefined)
    
    @scala.inline
    def setRatingTextColor(value: String): Self = StObject.set(x, "ratingTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatingTextColorUndefined: Self = StObject.set(x, "ratingTextColor", js.undefined)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    @scala.inline
    def setShowRating(value: Boolean): Self = StObject.set(x, "showRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowRatingUndefined: Self = StObject.set(x, "showRating", js.undefined)
    
    @scala.inline
    def setStartingValue(value: Double): Self = StObject.set(x, "startingValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingValueUndefined: Self = StObject.set(x, "startingValue", js.undefined)
    
    @scala.inline
    def setStyle(value: Requireable[js.Object]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    @scala.inline
    def setType(value: star | rocket | bell | heart | custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
