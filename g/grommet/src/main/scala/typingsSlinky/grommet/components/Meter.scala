package typingsSlinky.grommet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.grommet.anon.Highlight
import typingsSlinky.grommet.anon.`1`
import typingsSlinky.grommet.grommetStrings.bar
import typingsSlinky.grommet.grommetStrings.circle
import typingsSlinky.grommet.grommetStrings.full
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.grommet.meterMod.MeterProps
import typingsSlinky.grommet.utilsMod.A11yTitleType
import typingsSlinky.grommet.utilsMod.AlignSelfType
import typingsSlinky.grommet.utilsMod.GridAreaType
import typingsSlinky.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Meter {
  
  @JSImport("grommet/es6", "Meter")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.grommet.mod.Meter] {
    
    @scala.inline
    def a11yTitle(value: A11yTitleType): this.type = set("a11yTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignSelf(value: AlignSelfType): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def background(value: String | `1`): this.type = set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridArea(value: GridAreaType): this.type = set("gridArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def margin(value: MarginType): this.type = set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def round(value: Boolean): this.type = set("round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: xsmall | small | medium | large | xlarge | full | String): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thickness(value: xsmall | small | medium | large | xlarge | String): this.type = set("thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: bar | circle): this.type = set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valuesVarargs(value: Highlight*): this.type = set("values", js.Array(value :_*))
    
    @scala.inline
    def values(value: js.Array[Highlight]): this.type = set("values", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MeterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Meter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
