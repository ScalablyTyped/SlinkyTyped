package typingsSlinky.materialUi.MaterialUI

import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import typingsSlinky.materialUi.materialUiStrings.after
import typingsSlinky.materialUi.materialUiStrings.before
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.DOMAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.materialUi.MaterialUI.SharedEnhancedButtonProps because var conflicts: onBlur, onClick, onFocus, onKeyDown, onKeyUp. Inlined centerRipple, disableFocusRipple, disableKeyboardFocus, disableTouchRipple, focusRippleColor, focusRippleOpacity, href, keyboardFocused, onKeyboardFocus, style, tabIndex, target, touchRippleColor, touchRippleOpacity, `type`, containerElement */ @js.native
trait FlatButtonProps
  extends DOMAttributes[js.Object] {
  
  // <EnhancedButton/> is the element that get the 'other' properties
  var backgroundColor: js.UndefOr[String] = js.native
  
  var centerRipple: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var containerElement: js.UndefOr[ReactElement | String] = js.native
  
  var disableFocusRipple: js.UndefOr[Boolean] = js.native
  
  var disableKeyboardFocus: js.UndefOr[Boolean] = js.native
  
  var disableTouchRipple: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var focusRippleColor: js.UndefOr[String] = js.native
  
  var focusRippleOpacity: js.UndefOr[Double] = js.native
  
  var fullWidth: js.UndefOr[Boolean] = js.native
  
  var hoverColor: js.UndefOr[String] = js.native
  
  var href: js.UndefOr[String] = js.native
  
  var icon: js.UndefOr[ReactElement] = js.native
  
  var keyboardFocused: js.UndefOr[Boolean] = js.native
  
  var label: js.UndefOr[ReactElement] = js.native
  
  var labelPosition: js.UndefOr[before | after] = js.native
  
  var labelStyle: js.UndefOr[CSSProperties] = js.native
  
  var linkButton: js.UndefOr[Boolean] = js.native
  
  var onKeyboardFocus: js.UndefOr[
    js.Function2[/* e */ SyntheticFocusEvent[js.Object], /* isKeyboardFocused */ Boolean, Unit]
  ] = js.native
  
  var primary: js.UndefOr[Boolean] = js.native
  
  var rippleColor: js.UndefOr[String] = js.native
  
  var secondary: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  var target: js.UndefOr[String] = js.native
  
  var touchRippleColor: js.UndefOr[String] = js.native
  
  var touchRippleOpacity: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object FlatButtonProps {
  
  @scala.inline
  def apply(): FlatButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlatButtonProps]
  }
  
  @scala.inline
  implicit class FlatButtonPropsMutableBuilder[Self <: FlatButtonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setCenterRipple(value: Boolean): Self = StObject.set(x, "centerRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterRippleUndefined: Self = StObject.set(x, "centerRipple", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
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
    def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    @scala.inline
    def setHoverColor(value: String): Self = StObject.set(x, "hoverColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverColorUndefined: Self = StObject.set(x, "hoverColor", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setKeyboardFocused(value: Boolean): Self = StObject.set(x, "keyboardFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardFocusedUndefined: Self = StObject.set(x, "keyboardFocused", js.undefined)
    
    @scala.inline
    def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPosition(value: before | after): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
    
    @scala.inline
    def setLabelReactElement(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLinkButton(value: Boolean): Self = StObject.set(x, "linkButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkButtonUndefined: Self = StObject.set(x, "linkButton", js.undefined)
    
    @scala.inline
    def setOnKeyboardFocus(value: (/* e */ SyntheticFocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit): Self = StObject.set(x, "onKeyboardFocus", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnKeyboardFocusUndefined: Self = StObject.set(x, "onKeyboardFocus", js.undefined)
    
    @scala.inline
    def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
    
    @scala.inline
    def setSecondary(value: Boolean): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
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
  }
}
