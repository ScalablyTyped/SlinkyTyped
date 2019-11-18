package typingsSlinky.chartDotJs.chartDotJsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.chartDotJs.Anon_Global
import typingsSlinky.chartDotJs.TypeofClassChart
import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chart.js", JSImport.Namespace)
@js.native
class ^ protected () extends Chart {
  def this(context: String, options: ChartConfiguration) = this()
  def this(context: ArrayLike[CanvasRenderingContext2D | HTMLCanvasElement], options: ChartConfiguration) = this()
  def this(context: CanvasRenderingContext2D, options: ChartConfiguration) = this()
  def this(context: HTMLCanvasElement, options: ChartConfiguration) = this()
}

@JSImport("chart.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Chart: TypeofClassChart = js.native
  // Tooltip Static Options
  var Tooltip: ChartTooltipsStaticConfiguration = js.native
  var controllers: StringDictionary[js.Any] = js.native
  var defaults: Anon_Global = js.native
  var helpers: StringDictionary[js.Any] = js.native
  var pluginService: PluginServiceStatic = js.native
  var plugins: PluginServiceStatic = js.native
}

