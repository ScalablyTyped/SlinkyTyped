package typingsSlinky.chartDotJs

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.chartDotJs.chartDotJsMod.Chart
import typingsSlinky.chartDotJs.chartDotJsMod.ChartConfiguration
import typingsSlinky.chartDotJs.chartDotJsMod.ChartTooltipsStaticConfiguration
import typingsSlinky.chartDotJs.chartDotJsMod.PluginServiceStatic
import typingsSlinky.std.ArrayLike
import typingsSlinky.std.CanvasRenderingContext2D
import typingsSlinky.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassChart extends Instantiable2[
      (/* context */ ArrayLike[CanvasRenderingContext2D | HTMLCanvasElement]) | (/* context */ CanvasRenderingContext2D) | (/* context */ HTMLCanvasElement) | (/* context */ String), 
      /* options */ ChartConfiguration, 
      Chart
    ] {
  // Tooltip Static Options
  var Tooltip: ChartTooltipsStaticConfiguration = js.native
  var controllers: StringDictionary[js.Any] = js.native
  var defaults: Anon_Global = js.native
  var helpers: StringDictionary[js.Any] = js.native
  var platform: Anon_DisableCSSInjection = js.native
  var pluginService: PluginServiceStatic = js.native
  var plugins: PluginServiceStatic = js.native
}

