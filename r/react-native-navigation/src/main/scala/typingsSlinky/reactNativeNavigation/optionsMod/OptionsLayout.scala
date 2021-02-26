package typingsSlinky.reactNativeNavigation.optionsMod

import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.locale
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.ltr
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsLayout extends StObject {
  
  /**
    * Controls the application's preferred home indicator auto-hiding.
    * #### (iOS specific)
    */
  var autoHideHomeIndicator: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the screen background color
    */
  var backgroundColor: js.UndefOr[Color] = js.native
  
  /**
    * Set background color only for components, helps reduce overdraw if background color is set in default options.
    * #### (Android specific)
    */
  var componentBackgroundColor: js.UndefOr[Color] = js.native
  
  /**
    * Set language direction.
    * only works with DefaultOptions
    */
  var direction: js.UndefOr[rtl | ltr | locale] = js.native
  
  var fitSystemWindows: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the allowed orientations
    */
  var orientation: js.UndefOr[js.Array[LayoutOrientation]] = js.native
  
  /**
    * Layout top margin
    * #### (Android specific)
    */
  var topMargin: js.UndefOr[Double] = js.native
}
object OptionsLayout {
  
  @scala.inline
  def apply(): OptionsLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsLayout]
  }
  
  @scala.inline
  implicit class OptionsLayoutMutableBuilder[Self <: OptionsLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoHideHomeIndicator(value: Boolean): Self = StObject.set(x, "autoHideHomeIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHideHomeIndicatorUndefined: Self = StObject.set(x, "autoHideHomeIndicator", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setComponentBackgroundColor(value: Color): Self = StObject.set(x, "componentBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentBackgroundColorUndefined: Self = StObject.set(x, "componentBackgroundColor", js.undefined)
    
    @scala.inline
    def setDirection(value: rtl | ltr | locale): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setFitSystemWindows(value: Boolean): Self = StObject.set(x, "fitSystemWindows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitSystemWindowsUndefined: Self = StObject.set(x, "fitSystemWindows", js.undefined)
    
    @scala.inline
    def setOrientation(value: js.Array[LayoutOrientation]): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setOrientationVarargs(value: LayoutOrientation*): Self = StObject.set(x, "orientation", js.Array(value :_*))
    
    @scala.inline
    def setTopMargin(value: Double): Self = StObject.set(x, "topMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopMarginUndefined: Self = StObject.set(x, "topMargin", js.undefined)
  }
}
