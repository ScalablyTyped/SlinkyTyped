package typingsSlinky.reactNativeNavigation.optionsMod

import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.auto
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.hidden
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.leading
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.none
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.overlay
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.sidebar
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.trailing
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsSplitView extends StObject {
  
  /**
    * Master view display mode
    * @default 'auto'
    */
  var displayMode: js.UndefOr[auto | visible | hidden | overlay] = js.native
  
  /**
    * Set the maximum width of master view
    */
  var maxWidth: js.UndefOr[Double] = js.native
  
  /**
    * Set the minimum width of master view
    */
  var minWidth: js.UndefOr[Double] = js.native
  
  /**
    * Set background style of sidebar. Currently works for Mac Catalyst apps only.
    * @default 'none'
    */
  var primaryBackgroundStyle: js.UndefOr[none | sidebar] = js.native
  
  /**
    * Master view side. Leading is left. Trailing is right.
    * @default 'leading'
    */
  var primaryEdge: js.UndefOr[leading | trailing] = js.native
}
object OptionsSplitView {
  
  @scala.inline
  def apply(): OptionsSplitView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsSplitView]
  }
  
  @scala.inline
  implicit class OptionsSplitViewMutableBuilder[Self <: OptionsSplitView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayMode(value: auto | visible | hidden | overlay): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setPrimaryBackgroundStyle(value: none | sidebar): Self = StObject.set(x, "primaryBackgroundStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryBackgroundStyleUndefined: Self = StObject.set(x, "primaryBackgroundStyle", js.undefined)
    
    @scala.inline
    def setPrimaryEdge(value: leading | trailing): Self = StObject.set(x, "primaryEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryEdgeUndefined: Self = StObject.set(x, "primaryEdge", js.undefined)
  }
}
