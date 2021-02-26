package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.fade
import typingsSlinky.reactNative.reactNativeStrings.slide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusBarPropsIOS extends StObject {
  
  /**
    * Sets the color of the status bar text.
    */
  var barStyle: js.UndefOr[StatusBarStyle] = js.native
  
  /**
    * If the network activity indicator should be visible.
    */
  var networkActivityIndicatorVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * The transition effect when showing and hiding the status bar using
    * the hidden prop. Defaults to 'fade'.
    */
  var showHideTransition: js.UndefOr[fade | slide] = js.native
}
object StatusBarPropsIOS {
  
  @scala.inline
  def apply(): StatusBarPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusBarPropsIOS]
  }
  
  @scala.inline
  implicit class StatusBarPropsIOSMutableBuilder[Self <: StatusBarPropsIOS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBarStyle(value: StatusBarStyle): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
    
    @scala.inline
    def setNetworkActivityIndicatorVisible(value: Boolean): Self = StObject.set(x, "networkActivityIndicatorVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkActivityIndicatorVisibleUndefined: Self = StObject.set(x, "networkActivityIndicatorVisible", js.undefined)
    
    @scala.inline
    def setShowHideTransition(value: fade | slide): Self = StObject.set(x, "showHideTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHideTransitionUndefined: Self = StObject.set(x, "showHideTransition", js.undefined)
  }
}
