package typingsSlinky.materialUi.MaterialUI

import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import typingsSlinky.materialUi.MaterialUI.propTypes.cornersAndCenter
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.materialUi.MaterialUI.SharedEnhancedButtonProps because var conflicts: onBlur, onClick, onFocus, onKeyDown, onKeyUp, style, tabIndex. Inlined centerRipple, disableFocusRipple, disableKeyboardFocus, disableTouchRipple, focusRippleColor, focusRippleOpacity, href, keyboardFocused, onKeyboardFocus, target, touchRippleColor, touchRippleOpacity, `type`, containerElement */ @js.native
trait IconButtonProps
  extends HTMLAttributes[js.Object] {
  
  var centerRipple: js.UndefOr[Boolean] = js.native
  
  var containerElement: js.UndefOr[ReactElement | String] = js.native
  
  var disableFocusRipple: js.UndefOr[Boolean] = js.native
  
  var disableKeyboardFocus: js.UndefOr[Boolean] = js.native
  
  var disableTouchRipple: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var focusRippleColor: js.UndefOr[String] = js.native
  
  var focusRippleOpacity: js.UndefOr[Double] = js.native
  
  var hoveredStyle: js.UndefOr[CSSProperties] = js.native
  
  var href: js.UndefOr[String] = js.native
  
  var iconClassName: js.UndefOr[String] = js.native
  
  var iconStyle: js.UndefOr[CSSProperties] = js.native
  
  var keyboardFocused: js.UndefOr[Boolean] = js.native
  
  var onKeyboardFocus: js.UndefOr[
    js.Function2[/* e */ SyntheticFocusEvent[js.Object], /* isKeyboardFocused */ Boolean, Unit]
  ] = js.native
  
  var target: js.UndefOr[String] = js.native
  
  var tooltip: js.UndefOr[ReactElement | String] = js.native
  
  var tooltipPosition: js.UndefOr[cornersAndCenter] = js.native
  
  var tooltipStyles: js.UndefOr[CSSProperties] = js.native
  
  var touch: js.UndefOr[Boolean] = js.native
  
  var touchRippleColor: js.UndefOr[String] = js.native
  
  var touchRippleOpacity: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object IconButtonProps {
  
  @scala.inline
  def apply(): IconButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconButtonProps]
  }
  
  @scala.inline
  implicit class IconButtonPropsOps[Self <: IconButtonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCenterRipple(value: Boolean): Self = this.set("centerRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterRipple: Self = this.set("centerRipple", js.undefined)
    
    @scala.inline
    def setContainerElementReactElement(value: ReactElement): Self = this.set("containerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerElement(value: ReactElement | String): Self = this.set("containerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerElement: Self = this.set("containerElement", js.undefined)
    
    @scala.inline
    def setDisableFocusRipple(value: Boolean): Self = this.set("disableFocusRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableFocusRipple: Self = this.set("disableFocusRipple", js.undefined)
    
    @scala.inline
    def setDisableKeyboardFocus(value: Boolean): Self = this.set("disableKeyboardFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableKeyboardFocus: Self = this.set("disableKeyboardFocus", js.undefined)
    
    @scala.inline
    def setDisableTouchRipple(value: Boolean): Self = this.set("disableTouchRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableTouchRipple: Self = this.set("disableTouchRipple", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFocusRippleColor(value: String): Self = this.set("focusRippleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusRippleColor: Self = this.set("focusRippleColor", js.undefined)
    
    @scala.inline
    def setFocusRippleOpacity(value: Double): Self = this.set("focusRippleOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusRippleOpacity: Self = this.set("focusRippleOpacity", js.undefined)
    
    @scala.inline
    def setHoveredStyle(value: CSSProperties): Self = this.set("hoveredStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoveredStyle: Self = this.set("hoveredStyle", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    
    @scala.inline
    def setIconClassName(value: String): Self = this.set("iconClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconClassName: Self = this.set("iconClassName", js.undefined)
    
    @scala.inline
    def setIconStyle(value: CSSProperties): Self = this.set("iconStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconStyle: Self = this.set("iconStyle", js.undefined)
    
    @scala.inline
    def setKeyboardFocused(value: Boolean): Self = this.set("keyboardFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardFocused: Self = this.set("keyboardFocused", js.undefined)
    
    @scala.inline
    def setOnKeyboardFocus(value: (/* e */ SyntheticFocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit): Self = this.set("onKeyboardFocus", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnKeyboardFocus: Self = this.set("onKeyboardFocus", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTooltipReactElement(value: ReactElement): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: ReactElement | String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTooltipPosition(value: cornersAndCenter): Self = this.set("tooltipPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipPosition: Self = this.set("tooltipPosition", js.undefined)
    
    @scala.inline
    def setTooltipStyles(value: CSSProperties): Self = this.set("tooltipStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipStyles: Self = this.set("tooltipStyles", js.undefined)
    
    @scala.inline
    def setTouch(value: Boolean): Self = this.set("touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouch: Self = this.set("touch", js.undefined)
    
    @scala.inline
    def setTouchRippleColor(value: String): Self = this.set("touchRippleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchRippleColor: Self = this.set("touchRippleColor", js.undefined)
    
    @scala.inline
    def setTouchRippleOpacity(value: Double): Self = this.set("touchRippleOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchRippleOpacity: Self = this.set("touchRippleOpacity", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
