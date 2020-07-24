package typingsSlinky.chartJs.anon

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.chartJs.mod.ChartConfiguration
import typingsSlinky.chartJs.mod.ChartTooltipsStaticConfiguration
import typingsSlinky.chartJs.mod.PluginServiceStatic
import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofChart
  extends Instantiable2[
      (/* context */ ArrayLike[CanvasRenderingContext2D | HTMLCanvasElement]) | (/* context */ CanvasRenderingContext2D) | (/* context */ HTMLCanvasElement) | (/* context */ String), 
      /* options */ ChartConfiguration, 
      typingsSlinky.chartJs.mod.Chart
    ] {
  // Tooltip Static Options
  var Tooltip: ChartTooltipsStaticConfiguration = js.native
  var controllers: StringDictionary[js.Any] = js.native
  var defaults: Dictkey = js.native
  var helpers: StringDictionary[js.Any] = js.native
  val instances: StringDictionary[typingsSlinky.chartJs.mod.Chart] = js.native
  var platform: DisableCSSInjection = js.native
  var pluginService: PluginServiceStatic = js.native
  var plugins: PluginServiceStatic = js.native
  var scaleService: UpdateScaleDefaults = js.native
}

