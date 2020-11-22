package typingsSlinky.grommet.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.grommet.anon.Column
import typingsSlinky.grommet.anon.Height
import typingsSlinky.grommet.anon.Side
import typingsSlinky.grommet.anon.X
import typingsSlinky.grommet.anon.Y
import typingsSlinky.grommet.dataChartMod.ChartType
import typingsSlinky.grommet.dataChartMod.DataChartProps
import typingsSlinky.grommet.dataChartMod.SeriesType
import typingsSlinky.grommet.grommetStrings.align
import typingsSlinky.grommet.grommetStrings.fill
import typingsSlinky.grommet.grommetStrings.full
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def axis(value: Boolean | X): this.type = set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bounds(value: align): this.type = set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def chartVarargs(value: ChartType*): this.type = set("chart", js.Array(value :_*))
    
    @scala.inline
    def chart(value: ChartType | js.Array[ChartType]): this.type = set("chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def detailFunction2(value: (/* datum */ js.Object, /* index */ Double) => ReactElement): this.type = set("detail", js.Any.fromFunction2(value))
    
    @scala.inline
    def detail(value: Boolean | (js.Function2[/* datum */ js.Object, /* index */ Double, ReactElement])): this.type = set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gap(value: GapType | Column): this.type = set("gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridArea(value: GridAreaType): this.type = set("gridArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def guide(value: Boolean | Y): this.type = set("guide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def legend(value: Boolean | Side): this.type = set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def margin(value: MarginType): this.type = set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pad(value: PadType): this.type = set("pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: xxsmall | xsmall | small | medium | large | xlarge | fill | full | Height | String): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DataChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(data: js.Array[js.Object], series: SeriesType | js.Array[SeriesType]): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DataChartProps]))
  }
}
