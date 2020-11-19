package typingsSlinky.amcharts

import typingsSlinky.amcharts.amCoordinateChartMod.AmCoordinateChart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("amcharts/AmRadarChart", JSImport.Namespace)
@js.native
object amRadarChartMod extends js.Object {
  
  @js.native
  trait AmRadarChart extends AmCoordinateChart {
    
    /**
      * Bottom margin of the chart.
      */
    var marginBottom: Double = js.native
    
    /**
      * Left margin of the chart.
      */
    var marginLeft: Double = js.native
    
    /**
      * Right margin of the chart.
      */
    var marginRight: Double = js.native
    
    /**
      * Top margin of the chart.
      */
    var marginTop: Double = js.native
    
    /**
      * Radius of a radar. 0.35
      */
    var radius: js.Any = js.native
  }
  
  @js.native
  class default () extends AmRadarChart
}
