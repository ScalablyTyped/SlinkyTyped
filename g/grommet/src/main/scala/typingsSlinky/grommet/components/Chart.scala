package typingsSlinky.grommet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.grommet.AnonColor
import typingsSlinky.grommet.AnonHeight
import typingsSlinky.grommet.AnonLabel
import typingsSlinky.grommet.AnonValue
import typingsSlinky.grommet.chartMod.ChartProps
import typingsSlinky.grommet.grommetStrings.area
import typingsSlinky.grommet.grommetStrings.bar
import typingsSlinky.grommet.grommetStrings.full
import typingsSlinky.grommet.grommetStrings.hair
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.line
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.none
import typingsSlinky.grommet.grommetStrings.point
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.grommet.grommetStrings.xxsmall
import typingsSlinky.grommet.utilsMod.A11yTitleType
import typingsSlinky.grommet.utilsMod.AlignSelfType
import typingsSlinky.grommet.utilsMod.GapType
import typingsSlinky.grommet.utilsMod.GridAreaType
import typingsSlinky.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Chart {
  @JSImport("grommet", "Chart")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.grommet.mod.Chart] {
    @scala.inline
    def a11yTitle(value: A11yTitleType): this.type = set("a11yTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def alignSelf(value: AlignSelfType): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def bounds(value: js.Array[js.Array[Double]]): this.type = set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: String | AnonColor | js.Array[AnonValue]): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def gap(value: GapType): this.type = set("gap", value.asInstanceOf[js.Any])
    @scala.inline
    def gridArea(value: GridAreaType): this.type = set("gridArea", value.asInstanceOf[js.Any])
    @scala.inline
    def margin(value: MarginType): this.type = set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: /* repeated */ js.Any => _): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onHover(value: /* repeated */ js.Any => _): this.type = set("onHover", js.Any.fromFunction1(value))
    @scala.inline
    def overflow(value: Boolean): this.type = set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def round(value: Boolean): this.type = set("round", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: xxsmall | xsmall | small | medium | large | xlarge | full | AnonHeight | String): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def thickness(value: hair | xsmall | small | medium | large | xlarge | none | String): this.type = set("thickness", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: bar | line | area | point): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(values: js.Array[Double | js.Array[Double] | AnonLabel]): Builder = {
    val __props = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ChartProps]))
  }
}

