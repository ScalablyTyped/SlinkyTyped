package typingsSlinky.gestalt.mod

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.gestalt.anon.Event
import typingsSlinky.gestalt.gestaltNumbers.`0`
import typingsSlinky.gestalt.gestaltNumbers.`1`
import typingsSlinky.gestalt.gestaltNumbers.`2`
import typingsSlinky.gestalt.gestaltNumbers.`3`
import typingsSlinky.gestalt.gestaltNumbers.`4`
import typingsSlinky.gestalt.gestaltNumbers.`5`
import typingsSlinky.gestalt.gestaltNumbers.`6`
import typingsSlinky.gestalt.gestaltNumbers.`7`
import typingsSlinky.gestalt.gestaltNumbers.`8`
import typingsSlinky.gestalt.gestaltStrings.blank
import typingsSlinky.gestalt.gestaltStrings.circle
import typingsSlinky.gestalt.gestaltStrings.compress
import typingsSlinky.gestalt.gestaltStrings.nofollow
import typingsSlinky.gestalt.gestaltStrings.none
import typingsSlinky.gestalt.gestaltStrings.pill
import typingsSlinky.gestalt.gestaltStrings.self
import typingsSlinky.gestalt.gestaltStrings.tab
import typingsSlinky.gestalt.gestaltStrings.underline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkProps extends StObject {
  
  var accessibilityLabel: js.UndefOr[String] = js.native
  
  var accessibilitySelected: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var hoverStyle: js.UndefOr[none | underline] = js.native
  
  var href: String = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var `inline`: js.UndefOr[Boolean] = js.native
  
  var onBlur: js.UndefOr[AbstractEventHandler[SyntheticFocusEvent[HTMLAnchorElement], js.Object]] = js.native
  
  var onClick: js.UndefOr[
    AbstractEventHandler[
      SyntheticMouseEvent[HTMLAnchorElement] | SyntheticKeyboardEvent[HTMLAnchorElement], 
      js.Object
    ]
  ] = js.native
  
  var onFocus: js.UndefOr[AbstractEventHandler[SyntheticFocusEvent[HTMLAnchorElement], js.Object]] = js.native
  
  var rel: js.UndefOr[none | nofollow] = js.native
  
  var role: js.UndefOr[tab] = js.native
  
  var rounding: js.UndefOr[pill | circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.native
  
  var tapStyle: js.UndefOr[none | compress] = js.native
  
  var target: js.UndefOr[Null | self | blank] = js.native
}
object LinkProps {
  
  @scala.inline
  def apply(href: String): LinkProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkProps]
  }
  
  @scala.inline
  implicit class LinkPropsMutableBuilder[Self <: LinkProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAccessibilitySelected(value: Boolean): Self = StObject.set(x, "accessibilitySelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilitySelectedUndefined: Self = StObject.set(x, "accessibilitySelected", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setHoverStyle(value: none | underline): Self = StObject.set(x, "hoverStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverStyleUndefined: Self = StObject.set(x, "hoverStyle", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* arg */ js.Object with Event[SyntheticFocusEvent[HTMLAnchorElement]] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnClick(
      value: /* arg */ js.Object with (Event[
          SyntheticMouseEvent[HTMLAnchorElement] | SyntheticKeyboardEvent[HTMLAnchorElement]
        ]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* arg */ js.Object with Event[SyntheticFocusEvent[HTMLAnchorElement]] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setRel(value: none | nofollow): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    @scala.inline
    def setRole(value: tab): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setRounding(value: pill | circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = StObject.set(x, "rounding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundingUndefined: Self = StObject.set(x, "rounding", js.undefined)
    
    @scala.inline
    def setTapStyle(value: none | compress): Self = StObject.set(x, "tapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapStyleUndefined: Self = StObject.set(x, "tapStyle", js.undefined)
    
    @scala.inline
    def setTarget(value: self | blank): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNull: Self = StObject.set(x, "target", null)
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
