package typingsSlinky.gestalt.mod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.gestalt.anon.Event
import typingsSlinky.gestalt.anon.Path
import typingsSlinky.gestalt.gestaltNumbers.`-1`
import typingsSlinky.gestalt.gestaltNumbers.`0`
import typingsSlinky.gestalt.gestaltNumbers.`1`
import typingsSlinky.gestalt.gestaltNumbers.`2`
import typingsSlinky.gestalt.gestaltNumbers.`3`
import typingsSlinky.gestalt.gestaltNumbers.`4`
import typingsSlinky.gestalt.gestaltNumbers.`5`
import typingsSlinky.gestalt.gestaltStrings.blank
import typingsSlinky.gestalt.gestaltStrings.button
import typingsSlinky.gestalt.gestaltStrings.darkGray
import typingsSlinky.gestalt.gestaltStrings.gray
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.lightGray
import typingsSlinky.gestalt.gestaltStrings.link
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.gestaltStrings.nofollow
import typingsSlinky.gestalt.gestaltStrings.none
import typingsSlinky.gestalt.gestaltStrings.red
import typingsSlinky.gestalt.gestaltStrings.self
import typingsSlinky.gestalt.gestaltStrings.sm
import typingsSlinky.gestalt.gestaltStrings.transparent
import typingsSlinky.gestalt.gestaltStrings.transparentDarkGray
import typingsSlinky.gestalt.gestaltStrings.white
import typingsSlinky.gestalt.gestaltStrings.xl
import typingsSlinky.gestalt.gestaltStrings.xs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconButtonProps extends StObject {
  
  var accessibilityControls: js.UndefOr[String] = js.native
  
  var accessibilityExpanded: js.UndefOr[Boolean] = js.native
  
  var accessibilityHaspopup: js.UndefOr[Boolean] = js.native
  
  var accessibilityLabel: String = js.native
  
  var bgColor: js.UndefOr[transparent | darkGray | transparentDarkGray | gray | lightGray | white | red] = js.native
  
  var dangerouslySetSvgPath: js.UndefOr[Path] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var href: js.UndefOr[String] = js.native
  
  var icon: js.UndefOr[Icons] = js.native
  
  var iconColor: js.UndefOr[gray | darkGray | red | white] = js.native
  
  var onClick: js.UndefOr[AbstractEventHandler[SyntheticMouseEvent[HTMLButtonElement], js.Object]] = js.native
  
  var padding: js.UndefOr[`1` | `2` | `3` | `4` | `5`] = js.native
  
  var rel: js.UndefOr[none | nofollow] = js.native
  
  var role: js.UndefOr[button | link] = js.native
  
  var selected: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[xs | sm | md | lg | xl] = js.native
  
  var tabIndex: js.UndefOr[`-1` | `0`] = js.native
  
  var target: js.UndefOr[Null | self | blank] = js.native
}
object IconButtonProps {
  
  @scala.inline
  def apply(accessibilityLabel: String): IconButtonProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconButtonProps]
  }
  
  @scala.inline
  implicit class IconButtonPropsMutableBuilder[Self <: IconButtonProps] (val x: Self) extends AnyVal {
    
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
    def setBgColor(value: transparent | darkGray | transparentDarkGray | gray | lightGray | white | red): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
    
    @scala.inline
    def setDangerouslySetSvgPath(value: Path): Self = StObject.set(x, "dangerouslySetSvgPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDangerouslySetSvgPathUndefined: Self = StObject.set(x, "dangerouslySetSvgPath", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setIcon(value: Icons): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconColor(value: gray | darkGray | red | white): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* arg */ js.Object with Event[SyntheticMouseEvent[HTMLButtonElement]] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setPadding(value: `1` | `2` | `3` | `4` | `5`): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
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
    def setSize(value: xs | sm | md | lg | xl): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
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
  }
}
