package typingsSlinky.gestalt.mod

import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.gestalt.anon.Event
import typingsSlinky.gestalt.gestaltNumbers.`-1`
import typingsSlinky.gestalt.gestaltNumbers.`0`
import typingsSlinky.gestalt.gestaltStrings.blank
import typingsSlinky.gestalt.gestaltStrings.blue
import typingsSlinky.gestalt.gestaltStrings.button
import typingsSlinky.gestalt.gestaltStrings.gray
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.link
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.gestaltStrings.nofollow
import typingsSlinky.gestalt.gestaltStrings.none
import typingsSlinky.gestalt.gestaltStrings.red
import typingsSlinky.gestalt.gestaltStrings.self
import typingsSlinky.gestalt.gestaltStrings.sm
import typingsSlinky.gestalt.gestaltStrings.submit
import typingsSlinky.gestalt.gestaltStrings.transparent
import typingsSlinky.gestalt.gestaltStrings.transparentWhiteText
import typingsSlinky.gestalt.gestaltStrings.white
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonProps extends StObject {
  
  var accessibilityControls: js.UndefOr[String] = js.native
  
  var accessibilityExpanded: js.UndefOr[Boolean] = js.native
  
  var accessibilityHaspopup: js.UndefOr[Boolean] = js.native
  
  var accessibilityLabel: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[gray | red | blue | transparent | transparentWhiteText | white] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var href: js.UndefOr[String] = js.native
  
  var iconEnd: js.UndefOr[Icons] = js.native
  
  var `inline`: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var onClick: js.UndefOr[
    AbstractEventHandler[
      (SyntheticMouseEvent[HTMLAnchorElement | HTMLButtonElement]) | (SyntheticKeyboardEvent[HTMLAnchorElement | HTMLButtonElement]), 
      js.Object
    ]
  ] = js.native
  
  var rel: js.UndefOr[none | nofollow] = js.native
  
  var role: js.UndefOr[button | link] = js.native
  
  var selected: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[sm | md | lg] = js.native
  
  var tabIndex: js.UndefOr[`-1` | `0`] = js.native
  
  var target: js.UndefOr[Null | self | blank] = js.native
  
  var text: String = js.native
  
  var `type`: js.UndefOr[submit | button] = js.native
}
object ButtonProps {
  
  @scala.inline
  def apply(text: String): ButtonProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
  
  @scala.inline
  implicit class ButtonPropsMutableBuilder[Self <: ButtonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityControls(value: String): Self = StObject.set(x, "accessibilityControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityControlsUndefined: Self = StObject.set(x, "accessibilityControls", js.undefined)
    
    @scala.inline
    def setAccessibilityExpanded(value: Boolean): Self = StObject.set(x, "accessibilityExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityExpandedUndefined: Self = StObject.set(x, "accessibilityExpanded", js.undefined)
    
    @scala.inline
    def setAccessibilityHaspopup(value: Boolean): Self = StObject.set(x, "accessibilityHaspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityHaspopupUndefined: Self = StObject.set(x, "accessibilityHaspopup", js.undefined)
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setColor(value: gray | red | blue | transparent | transparentWhiteText | white): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setIconEnd(value: Icons): Self = StObject.set(x, "iconEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconEndUndefined: Self = StObject.set(x, "iconEnd", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnClick(
      value: /* arg */ js.Object with (Event[
          (SyntheticMouseEvent[HTMLAnchorElement | HTMLButtonElement]) | (SyntheticKeyboardEvent[HTMLAnchorElement | HTMLButtonElement])
        ]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setRel(value: none | nofollow): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    @scala.inline
    def setRole(value: button | link): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setSize(value: sm | md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTabIndex(value: `-1` | `0`): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    @scala.inline
    def setTarget(value: self | blank): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNull: Self = StObject.set(x, "target", null)
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: submit | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
