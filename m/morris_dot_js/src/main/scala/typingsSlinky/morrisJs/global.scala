package typingsSlinky.morrisJs

import typingsSlinky.morrisJs.morris.IAreaOptions
import typingsSlinky.morrisJs.morris.IBarOptions
import typingsSlinky.morrisJs.morris.IDonutOptions
import typingsSlinky.morrisJs.morris.ILineOptions
import typingsSlinky.morrisJs.morris.MorrisStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @JSName("Morris")
  var Morris_ : MorrisStatic = js.native
  @js.native
  object morris extends js.Object {
    @js.native
    class DonutChart ()
      extends typingsSlinky.morrisJs.morris.DonutChart
    
    @js.native
    class GridChart ()
      extends typingsSlinky.morrisJs.morris.GridChart
    
    @js.native
    class MorrisStatic ()
      extends typingsSlinky.morrisJs.morris.MorrisStatic {
      /** Create an area chart. */
      /* CompleteClass */
      override def Area(options: IAreaOptions): typingsSlinky.morrisJs.morris.GridChart = js.native
      /** Create a bar chart. */
      /* CompleteClass */
      override def Bar(options: IBarOptions): typingsSlinky.morrisJs.morris.GridChart = js.native
      /** Create a Donut chart. */
      /* CompleteClass */
      override def Donut(options: IDonutOptions): typingsSlinky.morrisJs.morris.DonutChart = js.native
      /** Create a line chart. */
      /* CompleteClass */
      override def Line(options: ILineOptions): typingsSlinky.morrisJs.morris.GridChart = js.native
    }
    
  }
  
}

