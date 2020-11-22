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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconButtonProps extends js.Object {
  
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
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityControls(value: String): Self = this.set("accessibilityControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityControls: Self = this.set("accessibilityControls", js.undefined)
    
    @scala.inline
    def setAccessibilityExpanded(value: Boolean): Self = this.set("accessibilityExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityExpanded: Self = this.set("accessibilityExpanded", js.undefined)
    
    @scala.inline
    def setAccessibilityHaspopup(value: Boolean): Self = this.set("accessibilityHaspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityHaspopup: Self = this.set("accessibilityHaspopup", js.undefined)
    
    @scala.inline
    def setBgColor(value: transparent | darkGray | transparentDarkGray | gray | lightGray | white | red): Self = this.set("bgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgColor: Self = this.set("bgColor", js.undefined)
    
    @scala.inline
    def setDangerouslySetSvgPath(value: Path): Self = this.set("dangerouslySetSvgPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDangerouslySetSvgPath: Self = this.set("dangerouslySetSvgPath", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    
    @scala.inline
    def setIcon(value: Icons): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconColor(value: gray | darkGray | red | white): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconColor: Self = this.set("iconColor", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* arg */ js.Object with Event[SyntheticMouseEvent[HTMLButtonElement]] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setPadding(value: `1` | `2` | `3` | `4` | `5`): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setRel(value: none | nofollow): Self = this.set("rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRel: Self = this.set("rel", js.undefined)
    
    @scala.inline
    def setRole(value: button | link): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setSize(value: xs | sm | md | lg | xl): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTabIndex(value: `-1` | `0`): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTarget(value: self | blank): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetNull: Self = this.set("target", null)
  }
}
