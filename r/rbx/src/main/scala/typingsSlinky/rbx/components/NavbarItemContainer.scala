package typingsSlinky.rbx.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rbx.BinVariablesbreakpointsLi
import typingsSlinky.rbx.KinVariablesbreakpointsto
import typingsSlinky.rbx.navbarItemContainerMod.NavbarItemContainerProps
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
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavbarItemContainer {
  @JSImport("rbx/components/navbar/navbar-item-container", "NavbarItemContainer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.rbx.navbarItemContainerMod.NavbarItemContainer] {
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def asFunctionComponent(value: ReactComponentClass[_]): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def asComponentClass(value: ReactComponentClass[_]): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def as(value: ReactComponentClass[_]): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def backgroundColor(
      value: primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
    ): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def badge(value: Double | String): this.type = set("badge", value.asInstanceOf[js.Any])
    @scala.inline
    def badgeColor(value: primary | success | info | warning | danger | light | dark | white | black | link): this.type = set("badgeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def badgeOutlined(value: Boolean): this.type = set("badgeOutlined", value.asInstanceOf[js.Any])
    @scala.inline
    def badgeRounded(value: Boolean): this.type = set("badgeRounded", value.asInstanceOf[js.Any])
    @scala.inline
    def badgeSize(value: small | medium | large): this.type = set("badgeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def clearfix(value: Boolean): this.type = set("clearfix", value.asInstanceOf[js.Any])
    @scala.inline
    def clipped(value: Boolean): this.type = set("clipped", value.asInstanceOf[js.Any])
    @scala.inline
    def dropdown(value: Boolean): this.type = set("dropdown", value.asInstanceOf[js.Any])
    @scala.inline
    def expanded(value: Boolean): this.type = set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def hoverable(value: Boolean): this.type = set("hoverable", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefRefObject(value: ReactRef[HTMLElement | SVGElement | ReactComponentClass[js.Object]]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefFunction1(value: /* instance */ HTMLElement | SVGElement | ReactComponentClass[js.Object] | Null => Unit): this.type = set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def innerRef(value: Ref[HTMLElement | SVGElement | ReactComponentClass[js.Object]]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefNull: this.type = set("innerRef", null)
    @scala.inline
    def invisible(value: Boolean): this.type = set("invisible", value.asInstanceOf[js.Any])
    @scala.inline
    def italic(value: Boolean): this.type = set("italic", value.asInstanceOf[js.Any])
    @scala.inline
    def managed(value: Boolean): this.type = set("managed", value.asInstanceOf[js.Any])
    @scala.inline
    def marginless(value: Boolean): this.type = set("marginless", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: SyntheticMouseEvent[Element] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def overlay(value: Boolean): this.type = set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def paddingless(value: Boolean): this.type = set("paddingless", value.asInstanceOf[js.Any])
    @scala.inline
    def pull(value: left | right): this.type = set("pull", value.asInstanceOf[js.Any])
    @scala.inline
    def radiusless(value: Boolean): this.type = set("radiusless", value.asInstanceOf[js.Any])
    @scala.inline
    def relative(value: Boolean): this.type = set("relative", value.asInstanceOf[js.Any])
    @scala.inline
    def responsive(value: BinVariablesbreakpointsLi): this.type = set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def shadowless(value: Boolean): this.type = set("shadowless", value.asInstanceOf[js.Any])
    @scala.inline
    def srOnly(value: Boolean): this.type = set("srOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def tab(value: Boolean): this.type = set("tab", value.asInstanceOf[js.Any])
    @scala.inline
    def textAlign(value: centered | justified | left | right): this.type = set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def textColor(
      value: primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
    ): this.type = set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def textSize(value: `1` | `2` | `3` | `4` | `5` | `6` | `7`): this.type = set("textSize", value.asInstanceOf[js.Any])
    @scala.inline
    def textTransform(value: capitalized | lowercase | uppercase): this.type = set("textTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def textWeight(value: light | medium | normal | semibold | bold): this.type = set("textWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltip(value: Double | String): this.type = set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltipActive(value: Boolean): this.type = set("tooltipActive", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltipColor(value: primary | success | info | warning | danger | light | dark | white | black | link): this.type = set("tooltipColor", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltipMultiline(value: Boolean): this.type = set("tooltipMultiline", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltipPosition(value: top | right | bottom | left): this.type = set("tooltipPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltipResponsive(value: KinVariablesbreakpointsto): this.type = set("tooltipResponsive", value.asInstanceOf[js.Any])
    @scala.inline
    def unselectable(value: Boolean): this.type = set("unselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def up(value: Boolean): this.type = set("up", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NavbarItemContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: NavbarItemContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

