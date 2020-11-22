package typingsSlinky.grommet.dataChartMod

import slinky.core.facade.ReactElement
import typingsSlinky.grommet.anon.Column
import typingsSlinky.grommet.anon.Height
import typingsSlinky.grommet.anon.Side
import typingsSlinky.grommet.anon.X
import typingsSlinky.grommet.anon.Y
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

@js.native
trait DataChartProps extends js.Object {
  
  var a11yTitle: js.UndefOr[A11yTitleType] = js.native
  
  // axis - when true, {
  //   x: { property: 'date' <if any>, granularity: 'coarse' },
  //   y: { property: property[0].property, granularity: 'coarse' },
  // }
  var axis: js.UndefOr[Boolean | X] = js.native
  
  var bounds: js.UndefOr[align] = js.native
  
  // chart - if undefined, { type: 'bar', property: <first series property> }
  var chart: js.UndefOr[ChartType | js.Array[ChartType]] = js.native
  
  // data - an array of objects containing data values
  var data: js.Array[js.Object] = js.native
  
  // detail - whether to show details via hover/touch interaction
  var detail: js.UndefOr[
    Boolean | (js.Function2[/* datum */ js.Object, /* index */ Double, ReactElement])
  ] = js.native
  
  var gap: js.UndefOr[GapType | Column] = js.native
  
   // between axes and guides/visuals
  var gridArea: js.UndefOr[GridAreaType] = js.native
  
   // generic
  // guide - when true, {
  //   x: { granularity: 'coarse' },
  //   y: { granularity: 'coarse' },
  // }
  var guide: js.UndefOr[Boolean | Y] = js.native
  
  // legend - when true, { side: 'bottom' }
  var legend: js.UndefOr[Boolean | Side] = js.native
  
  var margin: js.UndefOr[MarginType] = js.native
  
  // pad - padding around the guides/visuals
  // defaults to what's needed based on axis and chart types
  var pad: js.UndefOr[PadType] = js.native
  
  // series - the data item properties and any
  var series: SeriesType | js.Array[SeriesType] = js.native
  
   // generic
  var size: js.UndefOr[
    xxsmall | xsmall | small | medium | large | xlarge | fill | full | Height | String
  ] = js.native
}
object DataChartProps {
  
  @scala.inline
  def apply(data: js.Array[js.Object], series: SeriesType | js.Array[SeriesType]): DataChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataChartProps]
  }
  
  @scala.inline
  implicit class DataChartPropsOps[Self <: DataChartProps] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: js.Object*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[js.Object]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesVarargs(value: SeriesType*): Self = this.set("series", js.Array(value :_*))
    
    @scala.inline
    def setSeries(value: SeriesType | js.Array[SeriesType]): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setA11yTitle(value: A11yTitleType): Self = this.set("a11yTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteA11yTitle: Self = this.set("a11yTitle", js.undefined)
    
    @scala.inline
    def setAxis(value: Boolean | X): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setBounds(value: align): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    
    @scala.inline
    def setChartVarargs(value: ChartType*): Self = this.set("chart", js.Array(value :_*))
    
    @scala.inline
    def setChart(value: ChartType | js.Array[ChartType]): Self = this.set("chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChart: Self = this.set("chart", js.undefined)
    
    @scala.inline
    def setDetailFunction2(value: (/* datum */ js.Object, /* index */ Double) => ReactElement): Self = this.set("detail", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDetail(value: Boolean | (js.Function2[/* datum */ js.Object, /* index */ Double, ReactElement])): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    
    @scala.inline
    def setGap(value: GapType | Column): Self = this.set("gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGap: Self = this.set("gap", js.undefined)
    
    @scala.inline
    def setGridArea(value: GridAreaType): Self = this.set("gridArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridArea: Self = this.set("gridArea", js.undefined)
    
    @scala.inline
    def setGuide(value: Boolean | Y): Self = this.set("guide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuide: Self = this.set("guide", js.undefined)
    
    @scala.inline
    def setLegend(value: Boolean | Side): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    
    @scala.inline
    def setMargin(value: MarginType): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setPad(value: PadType): Self = this.set("pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePad: Self = this.set("pad", js.undefined)
    
    @scala.inline
    def setSize(value: xxsmall | xsmall | small | medium | large | xlarge | fill | full | Height | String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
