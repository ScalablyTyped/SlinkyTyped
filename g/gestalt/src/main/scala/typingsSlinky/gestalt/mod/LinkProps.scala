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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkProps extends js.Object {
  
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
  implicit class LinkPropsOps[Self <: LinkProps] (val x: Self) extends AnyVal {
    
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
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAccessibilitySelected(value: Boolean): Self = this.set("accessibilitySelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilitySelected: Self = this.set("accessibilitySelected", js.undefined)
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setHoverStyle(value: none | underline): Self = this.set("hoverStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverStyle: Self = this.set("hoverStyle", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* arg */ js.Object with Event[SyntheticFocusEvent[HTMLAnchorElement]] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnClick(
      value: /* arg */ js.Object with (Event[
          SyntheticMouseEvent[HTMLAnchorElement] | SyntheticKeyboardEvent[HTMLAnchorElement]
        ]) => Unit
    ): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* arg */ js.Object with Event[SyntheticFocusEvent[HTMLAnchorElement]] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setRel(value: none | nofollow): Self = this.set("rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRel: Self = this.set("rel", js.undefined)
    
    @scala.inline
    def setRole(value: tab): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setRounding(value: pill | circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = this.set("rounding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRounding: Self = this.set("rounding", js.undefined)
    
    @scala.inline
    def setTapStyle(value: none | compress): Self = this.set("tapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTapStyle: Self = this.set("tapStyle", js.undefined)
    
    @scala.inline
    def setTarget(value: self | blank): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetNull: Self = this.set("target", null)
  }
}
