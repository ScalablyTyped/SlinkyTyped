package typingsSlinky.grommet.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.grommet.anon.RoutedAnchorPropsOmitAnch
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.push
import typingsSlinky.grommet.grommetStrings.replace
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.grommet.grommetStrings.xxlarge
import typingsSlinky.grommet.utilsMod.A11yTitleType
import typingsSlinky.grommet.utilsMod.AlignSelfType
import typingsSlinky.grommet.utilsMod.ColorType
import typingsSlinky.grommet.utilsMod.GridAreaType
import typingsSlinky.grommet.utilsMod.MarginType
import typingsSlinky.grommet.utilsMod.PolymorphicType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RoutedAnchor {
  
  @JSImport("grommet/es6", "RoutedAnchor")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.grommet.mod.RoutedAnchor] {
    
    @scala.inline
    def a11yTitle(value: A11yTitleType): this.type = set("a11yTitle", value.asInstanceOf[js.Any])
    
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
    def gridArea(value: GridAreaType): this.type = set("gridArea", value.asInstanceOf[js.Any])
    
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
    def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: xsmall | small | medium | large | xlarge | xxlarge | String): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RoutedAnchorPropsOmitAnch): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(path: String): Builder = {
    val __props = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RoutedAnchorPropsOmitAnch]))
  }
}
