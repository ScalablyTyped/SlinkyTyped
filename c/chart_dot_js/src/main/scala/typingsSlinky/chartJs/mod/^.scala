package typingsSlinky.chartJs.mod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chart.js", JSImport.Namespace)
@js.native
class ^ protected ()
  extends typingsSlinky.chartJs.mod.Chart {
  def this(context: String, options: ChartConfiguration) = this()
  def this(context: CanvasRenderingContext2D, options: ChartConfiguration) = this()
  def this(context: HTMLCanvasElement, options: ChartConfiguration) = this()
  def this(context: ArrayLike[CanvasRenderingContext2D | HTMLCanvasElement], options: ChartConfiguration) = this()
}
@JSImport("chart.js", JSImport.Namespace)
@js.native
object ^
  extends TopLevel[
      Instantiable2[
        /* context */ String | CanvasRenderingContext2D | HTMLCanvasElement | (ArrayLike[CanvasRenderingContext2D | HTMLCanvasElement]), 
        /* options */ ChartConfiguration, 
        typingsSlinky.chartJs.mod.Chart
      ]
    ]
