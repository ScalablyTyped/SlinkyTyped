package typingsSlinky.highcharts.highmapsMod

import typingsSlinky.highcharts.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("highcharts/highmaps", "Pointer")
@js.native
class Pointer protected ()
  extends typingsSlinky.highcharts.mod.Pointer {
  /**
    * The mouse and touch tracker object. Each Chart item has one assosiated
    * Pointer item that can be accessed from the Chart.pointer property.
    *
    * @param chart
    *        The chart instance.
    *
    * @param options
    *        The root options object. The pointer uses options from the chart
    *        and tooltip structures.
    */
  def this(chart: typingsSlinky.highcharts.mod.Chart_, options: Options) = this()
}
