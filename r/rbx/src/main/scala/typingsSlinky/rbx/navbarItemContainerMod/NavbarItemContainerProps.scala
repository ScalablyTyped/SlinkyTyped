package typingsSlinky.rbx.navbarItemContainerMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rbx.anon.BinVariablesbreakpointsLi
import typingsSlinky.rbx.anon.KinVariablesbreakpointsto
import typingsSlinky.rbx.rbxNumbers.`1`
import typingsSlinky.rbx.rbxNumbers.`2`
import typingsSlinky.rbx.rbxNumbers.`3`
import typingsSlinky.rbx.rbxNumbers.`4`
import typingsSlinky.rbx.rbxNumbers.`5`
import typingsSlinky.rbx.rbxNumbers.`6`
import typingsSlinky.rbx.rbxNumbers.`7`
import typingsSlinky.rbx.rbxStrings.`black-bis`
import typingsSlinky.rbx.rbxStrings.`black-ter`
import typingsSlinky.rbx.rbxStrings.`grey-dark`
import typingsSlinky.rbx.rbxStrings.`grey-darker`
import typingsSlinky.rbx.rbxStrings.`grey-light`
import typingsSlinky.rbx.rbxStrings.`grey-lighter`
import typingsSlinky.rbx.rbxStrings.`white-bis`
import typingsSlinky.rbx.rbxStrings.`white-ter`
import typingsSlinky.rbx.rbxStrings.black
import typingsSlinky.rbx.rbxStrings.bold
import typingsSlinky.rbx.rbxStrings.bottom
import typingsSlinky.rbx.rbxStrings.capitalized
import typingsSlinky.rbx.rbxStrings.centered
import typingsSlinky.rbx.rbxStrings.danger
import typingsSlinky.rbx.rbxStrings.dark
import typingsSlinky.rbx.rbxStrings.grey
import typingsSlinky.rbx.rbxStrings.info
import typingsSlinky.rbx.rbxStrings.justified
import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.left
import typingsSlinky.rbx.rbxStrings.light
import typingsSlinky.rbx.rbxStrings.link
import typingsSlinky.rbx.rbxStrings.lowercase
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.normal
import typingsSlinky.rbx.rbxStrings.primary
import typingsSlinky.rbx.rbxStrings.right
import typingsSlinky.rbx.rbxStrings.semibold
import typingsSlinky.rbx.rbxStrings.small
import typingsSlinky.rbx.rbxStrings.success
import typingsSlinky.rbx.rbxStrings.top
import typingsSlinky.rbx.rbxStrings.uppercase
import typingsSlinky.rbx.rbxStrings.warning
import typingsSlinky.rbx.rbxStrings.white
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.ReactType
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined rbx.rbx/base/helpers.HelpersProps & rbx.rbx/components/navbar/navbar-item-container.NavbarItemContainerModifierProps */
@js.native
trait NavbarItemContainerProps extends js.Object {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var as: js.UndefOr[ReactType[_]] = js.native
  
  var backgroundColor: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
  ] = js.native
  
  var badge: js.UndefOr[Double | String] = js.native
  
  var badgeColor: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.native
  
  var badgeOutlined: js.UndefOr[Boolean] = js.native
  
  var badgeRounded: js.UndefOr[Boolean] = js.native
  
  var badgeSize: js.UndefOr[small | medium | large] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var clearfix: js.UndefOr[Boolean] = js.native
  
  var clipped: js.UndefOr[Boolean] = js.native
  
  var dropdown: js.UndefOr[Boolean] = js.native
  
  var expanded: js.UndefOr[Boolean] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var hoverable: js.UndefOr[Boolean] = js.native
  
  var innerRef: js.UndefOr[Ref[HTMLElement | SVGElement | ReactComponentClass[js.Object]]] = js.native
  
  var invisible: js.UndefOr[Boolean] = js.native
  
  var italic: js.UndefOr[Boolean] = js.native
  
  var managed: js.UndefOr[Boolean] = js.native
  
  var marginless: js.UndefOr[Boolean] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.native
  
  var overlay: js.UndefOr[Boolean] = js.native
  
  var paddingless: js.UndefOr[Boolean] = js.native
  
  var pull: js.UndefOr[left | right] = js.native
  
  var radiusless: js.UndefOr[Boolean] = js.native
  
  var relative: js.UndefOr[Boolean] = js.native
  
  var responsive: js.UndefOr[BinVariablesbreakpointsLi] = js.native
  
  var shadowless: js.UndefOr[Boolean] = js.native
  
  var srOnly: js.UndefOr[Boolean] = js.native
  
  var tab: js.UndefOr[Boolean] = js.native
  
  var textAlign: js.UndefOr[centered | justified | left | right] = js.native
  
  var textColor: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
  ] = js.native
  
  var textSize: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.native
  
  var textTransform: js.UndefOr[capitalized | lowercase | uppercase] = js.native
  
  var textWeight: js.UndefOr[light | medium | normal | semibold | bold] = js.native
  
  var tooltip: js.UndefOr[Double | String] = js.native
  
  var tooltipActive: js.UndefOr[Boolean] = js.native
  
  var tooltipColor: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.native
  
  var tooltipMultiline: js.UndefOr[Boolean] = js.native
  
  var tooltipPosition: js.UndefOr[top | right | bottom | left] = js.native
  
  var tooltipResponsive: js.UndefOr[KinVariablesbreakpointsto] = js.native
  
  var unselectable: js.UndefOr[Boolean] = js.native
  
  var up: js.UndefOr[Boolean] = js.native
}
object NavbarItemContainerProps {
  
  @scala.inline
  def apply(): NavbarItemContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavbarItemContainerProps]
  }
  
  @scala.inline
  implicit class NavbarItemContainerPropsOps[Self <: NavbarItemContainerProps] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setAsFunctionComponent(value: ReactComponentClass[_]): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsComponentClass(value: ReactComponentClass[_]): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAs(value: ReactType[_]): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setBackgroundColor(
      value: primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
    ): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBadge(value: Double | String): Self = this.set("badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    
    @scala.inline
    def setBadgeColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = this.set("badgeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadgeColor: Self = this.set("badgeColor", js.undefined)
    
    @scala.inline
    def setBadgeOutlined(value: Boolean): Self = this.set("badgeOutlined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadgeOutlined: Self = this.set("badgeOutlined", js.undefined)
    
    @scala.inline
    def setBadgeRounded(value: Boolean): Self = this.set("badgeRounded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadgeRounded: Self = this.set("badgeRounded", js.undefined)
    
    @scala.inline
    def setBadgeSize(value: small | medium | large): Self = this.set("badgeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadgeSize: Self = this.set("badgeSize", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClearfix(value: Boolean): Self = this.set("clearfix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearfix: Self = this.set("clearfix", js.undefined)
    
    @scala.inline
    def setClipped(value: Boolean): Self = this.set("clipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipped: Self = this.set("clipped", js.undefined)
    
    @scala.inline
    def setDropdown(value: Boolean): Self = this.set("dropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdown: Self = this.set("dropdown", js.undefined)
    
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setHoverable(value: Boolean): Self = this.set("hoverable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverable: Self = this.set("hoverable", js.undefined)
    
    @scala.inline
    def setInnerRefRefObject(value: ReactRef[HTMLElement | SVGElement | ReactComponentClass[js.Object]]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ HTMLElement | SVGElement | ReactComponentClass[js.Object] | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInnerRef(value: Ref[HTMLElement | SVGElement | ReactComponentClass[js.Object]]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
    
    @scala.inline
    def setInvisible(value: Boolean): Self = this.set("invisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvisible: Self = this.set("invisible", js.undefined)
    
    @scala.inline
    def setItalic(value: Boolean): Self = this.set("italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItalic: Self = this.set("italic", js.undefined)
    
    @scala.inline
    def setManaged(value: Boolean): Self = this.set("managed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManaged: Self = this.set("managed", js.undefined)
    
    @scala.inline
    def setMarginless(value: Boolean): Self = this.set("marginless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginless: Self = this.set("marginless", js.undefined)
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[Element] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOverlay(value: Boolean): Self = this.set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    
    @scala.inline
    def setPaddingless(value: Boolean): Self = this.set("paddingless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingless: Self = this.set("paddingless", js.undefined)
    
    @scala.inline
    def setPull(value: left | right): Self = this.set("pull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePull: Self = this.set("pull", js.undefined)
    
    @scala.inline
    def setRadiusless(value: Boolean): Self = this.set("radiusless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusless: Self = this.set("radiusless", js.undefined)
    
    @scala.inline
    def setRelative(value: Boolean): Self = this.set("relative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelative: Self = this.set("relative", js.undefined)
    
    @scala.inline
    def setResponsive(value: BinVariablesbreakpointsLi): Self = this.set("responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    
    @scala.inline
    def setShadowless(value: Boolean): Self = this.set("shadowless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowless: Self = this.set("shadowless", js.undefined)
    
    @scala.inline
    def setSrOnly(value: Boolean): Self = this.set("srOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrOnly: Self = this.set("srOnly", js.undefined)
    
    @scala.inline
    def setTab(value: Boolean): Self = this.set("tab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTab: Self = this.set("tab", js.undefined)
    
    @scala.inline
    def setTextAlign(value: centered | justified | left | right): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    
    @scala.inline
    def setTextColor(
      value: primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
    ): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    
    @scala.inline
    def setTextSize(value: `1` | `2` | `3` | `4` | `5` | `6` | `7`): Self = this.set("textSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextSize: Self = this.set("textSize", js.undefined)
    
    @scala.inline
    def setTextTransform(value: capitalized | lowercase | uppercase): Self = this.set("textTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextTransform: Self = this.set("textTransform", js.undefined)
    
    @scala.inline
    def setTextWeight(value: light | medium | normal | semibold | bold): Self = this.set("textWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextWeight: Self = this.set("textWeight", js.undefined)
    
    @scala.inline
    def setTooltip(value: Double | String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTooltipActive(value: Boolean): Self = this.set("tooltipActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipActive: Self = this.set("tooltipActive", js.undefined)
    
    @scala.inline
    def setTooltipColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = this.set("tooltipColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipColor: Self = this.set("tooltipColor", js.undefined)
    
    @scala.inline
    def setTooltipMultiline(value: Boolean): Self = this.set("tooltipMultiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipMultiline: Self = this.set("tooltipMultiline", js.undefined)
    
    @scala.inline
    def setTooltipPosition(value: top | right | bottom | left): Self = this.set("tooltipPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipPosition: Self = this.set("tooltipPosition", js.undefined)
    
    @scala.inline
    def setTooltipResponsive(value: KinVariablesbreakpointsto): Self = this.set("tooltipResponsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipResponsive: Self = this.set("tooltipResponsive", js.undefined)
    
    @scala.inline
    def setUnselectable(value: Boolean): Self = this.set("unselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnselectable: Self = this.set("unselectable", js.undefined)
    
    @scala.inline
    def setUp(value: Boolean): Self = this.set("up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUp: Self = this.set("up", js.undefined)
  }
}
