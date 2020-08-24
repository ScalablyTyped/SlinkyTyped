package typingsSlinky.grommet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.grommet.anon.Column
import typingsSlinky.grommet.anon.Guide
import typingsSlinky.grommet.anon.Height
import typingsSlinky.grommet.anon.Labels
import typingsSlinky.grommet.dataChartMod.ChartType
import typingsSlinky.grommet.dataChartMod.DataChartProps
import typingsSlinky.grommet.grommetStrings.fill
import typingsSlinky.grommet.grommetStrings.full
import typingsSlinky.grommet.grommetStrings.hair
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.none
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.grommet.grommetStrings.xxsmall
import typingsSlinky.grommet.utilsMod.A11yTitleType
import typingsSlinky.grommet.utilsMod.GapType
import typingsSlinky.grommet.utilsMod.GridAreaType
import typingsSlinky.grommet.utilsMod.MarginType
import typingsSlinky.grommet.utilsMod.PadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DataChart {
  @JSImport("grommet/es6", "DataChart")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def a11yTitle(value: A11yTitleType): this.type = set("a11yTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def gap(value: GapType | Column): this.type = set("gap", value.asInstanceOf[js.Any])
    @scala.inline
    def gridArea(value: GridAreaType): this.type = set("gridArea", value.asInstanceOf[js.Any])
    @scala.inline
    def margin(value: MarginType): this.type = set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def pad(value: PadType): this.type = set("pad", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: xxsmall | xsmall | small | medium | large | xlarge | fill | full | Height | String): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def thickness(value: hair | xsmall | small | medium | large | xlarge | none | String): this.type = set("thickness", value.asInstanceOf[js.Any])
    @scala.inline
    def xAxis(value: Boolean | Guide): this.type = set("xAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def yAxis(value: Boolean | Labels): this.type = set("yAxis", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DataChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(chart: ChartType | js.Array[ChartType], data: js.Array[js.Object]): Builder = {
    val __props = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DataChartProps]))
  }
}

