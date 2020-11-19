package typingsSlinky.grommet.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.grommet.buttonMod.ButtonProps
import typingsSlinky.grommet.grommetStrings._blank
import typingsSlinky.grommet.grommetStrings._parent
import typingsSlinky.grommet.grommetStrings._self
import typingsSlinky.grommet.grommetStrings._top
import typingsSlinky.grommet.grommetStrings.button
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.push
import typingsSlinky.grommet.grommetStrings.replace
import typingsSlinky.grommet.grommetStrings.reset
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.submit
import typingsSlinky.grommet.routedButtonMod.RoutedButtonProps
import typingsSlinky.grommet.utilsMod.A11yTitleType
import typingsSlinky.grommet.utilsMod.AlignSelfType
import typingsSlinky.grommet.utilsMod.BackgroundType
import typingsSlinky.grommet.utilsMod.ColorType
import typingsSlinky.grommet.utilsMod.FillType
import typingsSlinky.grommet.utilsMod.GapType
import typingsSlinky.grommet.utilsMod.GridAreaType
import typingsSlinky.grommet.utilsMod.MarginType
import typingsSlinky.grommet.utilsMod.PolymorphicType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RoutedButton {
  
  @JSImport("grommet/es6", "RoutedButton")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.grommet.mod.RoutedButton] {
    
    @scala.inline
    def a11yTitle(value: A11yTitleType): this.type = set("a11yTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignSelf(value: AlignSelfType): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def asFunctionComponent(value: ReactComponentClass[js.Any]): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def asComponentClass(value: ReactComponentClass[js.Any]): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def as(value: PolymorphicType): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: ColorType): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fill(value: FillType): this.type = set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusIndicator(value: Boolean): this.type = set("focusIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gap(value: GapType): this.type = set("gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridArea(value: GridAreaType): this.type = set("gridArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hoverIndicator(value: BackgroundType | Boolean): this.type = set("hoverIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def margin(value: MarginType): this.type = set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def method(value: push | replace): this.type = set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def plain(value: Boolean): this.type = set("plain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def primary(value: Boolean): this.type = set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def secondary(value: Boolean): this.type = set("secondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: small | medium | large): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def target(value: _self | _blank | _parent | _top): this.type = set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: button | reset | submit): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RoutedButtonProps with ButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(path: String): Builder = {
    val __props = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RoutedButtonProps with ButtonProps]))
  }
}
