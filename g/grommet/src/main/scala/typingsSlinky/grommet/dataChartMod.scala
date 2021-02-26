package typingsSlinky.grommet

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.grommet.anon.Column
import typingsSlinky.grommet.anon.Dash
import typingsSlinky.grommet.anon.Height
import typingsSlinky.grommet.anon.Prefix
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataChartMod {
  
  @JSImport("grommet/components/DataChart", "DataChart")
  @js.native
  val DataChart: ReactComponentClass[DataChartProps] = js.native
  
  type ChartType = String | Dash
  
  @js.native
  trait DataChartProps extends StObject {
    
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
    implicit class DataChartPropsMutableBuilder[Self <: DataChartProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      @scala.inline
      def setAxis(value: Boolean | X): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setBounds(value: align): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setChart(value: ChartType | js.Array[ChartType]): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
      
      @scala.inline
      def setChartVarargs(value: ChartType*): Self = StObject.set(x, "chart", js.Array(value :_*))
      
      @scala.inline
      def setData(value: js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setDetail(value: Boolean | (js.Function2[/* datum */ js.Object, /* index */ Double, ReactElement])): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailFunction2(value: (/* datum */ js.Object, /* index */ Double) => ReactElement): Self = StObject.set(x, "detail", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      @scala.inline
      def setGap(value: GapType | Column): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      @scala.inline
      def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      @scala.inline
      def setGuide(value: Boolean | Y): Self = StObject.set(x, "guide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuideUndefined: Self = StObject.set(x, "guide", js.undefined)
      
      @scala.inline
      def setLegend(value: Boolean | Side): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      @scala.inline
      def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setPad(value: PadType): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
      
      @scala.inline
      def setSeries(value: SeriesType | js.Array[SeriesType]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeriesVarargs(value: SeriesType*): Self = StObject.set(x, "series", js.Array(value :_*))
      
      @scala.inline
      def setSize(value: xxsmall | xsmall | small | medium | large | xlarge | fill | full | Height | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.coarse
    - typingsSlinky.grommet.grommetStrings.medium
    - typingsSlinky.grommet.grommetStrings.fine
  */
  trait GranularityType extends StObject
  object GranularityType {
    
    @scala.inline
    def coarse: typingsSlinky.grommet.grommetStrings.coarse = "coarse".asInstanceOf[typingsSlinky.grommet.grommetStrings.coarse]
    
    @scala.inline
    def fine: typingsSlinky.grommet.grommetStrings.fine = "fine".asInstanceOf[typingsSlinky.grommet.grommetStrings.fine]
    
    @scala.inline
    def medium: typingsSlinky.grommet.grommetStrings.medium = "medium".asInstanceOf[typingsSlinky.grommet.grommetStrings.medium]
  }
  
  type SeriesType = String | Prefix
}
