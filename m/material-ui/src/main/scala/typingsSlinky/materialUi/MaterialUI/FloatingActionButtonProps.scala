package typingsSlinky.materialUi.MaterialUI

import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.materialUi.MaterialUI.SharedEnhancedButtonProps because var conflicts: onBlur, onClick, onFocus, onKeyDown, onKeyUp, style, tabIndex. Inlined centerRipple, disableFocusRipple, disableKeyboardFocus, disableTouchRipple, focusRippleColor, focusRippleOpacity, href, keyboardFocused, onKeyboardFocus, target, touchRippleColor, touchRippleOpacity, `type`, containerElement */ @js.native
trait FloatingActionButtonProps
  extends HTMLAttributes[js.Object] {
  
  // <EnhancedButton/> is the element that get the 'other' properties
  var backgroundColor: js.UndefOr[String] = js.native
  
  var centerRipple: js.UndefOr[Boolean] = js.native
  
  var containerElement: js.UndefOr[ReactElement | String] = js.native
  
  var disableFocusRipple: js.UndefOr[Boolean] = js.native
  
  var disableKeyboardFocus: js.UndefOr[Boolean] = js.native
  
  var disableTouchRipple: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var disabledColor: js.UndefOr[String] = js.native
  
  var focusRippleColor: js.UndefOr[String] = js.native
  
  var focusRippleOpacity: js.UndefOr[Double] = js.native
  
  var href: js.UndefOr[String] = js.native
  
  var iconClassName: js.UndefOr[String] = js.native
  
  var iconStyle: js.UndefOr[CSSProperties] = js.native
  
  var keyboardFocused: js.UndefOr[Boolean] = js.native
  
  var mini: js.UndefOr[Boolean] = js.native
  
  var onKeyboardFocus: js.UndefOr[
    js.Function2[/* e */ SyntheticFocusEvent[js.Object], /* isKeyboardFocused */ Boolean, Unit]
  ] = js.native
  
  var secondary: js.UndefOr[Boolean] = js.native
  
  var target: js.UndefOr[String] = js.native
  
  var touchRippleColor: js.UndefOr[String] = js.native
  
  var touchRippleOpacity: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var zDepth: js.UndefOr[Double] = js.native
}
object FloatingActionButtonProps {
  
  @scala.inline
  def apply(): FloatingActionButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloatingActionButtonProps]
  }
  
  @scala.inline
  implicit class FloatingActionButtonPropsMutableBuilder[Self <: FloatingActionButtonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setCenterRipple(value: Boolean): Self = StObject.set(x, "centerRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterRippleUndefined: Self = StObject.set(x, "centerRipple", js.undefined)
    
    @scala.inline
    def setContainerElement(value: ReactElement | String): Self = StObject.set(x, "containerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerElementReactElement(value: ReactElement): Self = StObject.set(x, "containerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerElementUndefined: Self = StObject.set(x, "containerElement", js.undefined)
    
    @scala.inline
    def setDisableFocusRipple(value: Boolean): Self = StObject.set(x, "disableFocusRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableFocusRippleUndefined: Self = StObject.set(x, "disableFocusRipple", js.undefined)
    
    @scala.inline
    def setDisableKeyboardFocus(value: Boolean): Self = StObject.set(x, "disableKeyboardFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableKeyboardFocusUndefined: Self = StObject.set(x, "disableKeyboardFocus", js.undefined)
    
    @scala.inline
    def setDisableTouchRipple(value: Boolean): Self = StObject.set(x, "disableTouchRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableTouchRippleUndefined: Self = StObject.set(x, "disableTouchRipple", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledColor(value: String): Self = StObject.set(x, "disabledColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledColorUndefined: Self = StObject.set(x, "disabledColor", js.undefined)
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setFocusRippleColor(value: String): Self = StObject.set(x, "focusRippleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusRippleColorUndefined: Self = StObject.set(x, "focusRippleColor", js.undefined)
    
    @scala.inline
    def setFocusRippleOpacity(value: Double): Self = StObject.set(x, "focusRippleOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusRippleOpacityUndefined: Self = StObject.set(x, "focusRippleOpacity", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setIconClassName(value: String): Self = StObject.set(x, "iconClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassNameUndefined: Self = StObject.set(x, "iconClassName", js.undefined)
    
    @scala.inline
    def setIconStyle(value: CSSProperties): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
    
    @scala.inline
    def setKeyboardFocused(value: Boolean): Self = StObject.set(x, "keyboardFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardFocusedUndefined: Self = StObject.set(x, "keyboardFocused", js.undefined)
    
    @scala.inline
    def setMini(value: Boolean): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiniUndefined: Self = StObject.set(x, "mini", js.undefined)
    
    @scala.inline
    def setOnKeyboardFocus(value: (/* e */ SyntheticFocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit): Self = StObject.set(x, "onKeyboardFocus", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnKeyboardFocusUndefined: Self = StObject.set(x, "onKeyboardFocus", js.undefined)
    
    @scala.inline
    def setSecondary(value: Boolean): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTouchRippleColor(value: String): Self = StObject.set(x, "touchRippleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchRippleColorUndefined: Self = StObject.set(x, "touchRippleColor", js.undefined)
    
    @scala.inline
    def setTouchRippleOpacity(value: Double): Self = StObject.set(x, "touchRippleOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchRippleOpacityUndefined: Self = StObject.set(x, "touchRippleOpacity", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setZDepth(value: Double): Self = StObject.set(x, "zDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZDepthUndefined: Self = StObject.set(x, "zDepth", js.undefined)
  }
}
