package typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Series extends js.Object {
  
  /**
    * Sonify a series.
    *
    * @param options
    *        The options for sonifying this series. If not provided, uses
    *        options set on chart and series.
    */
  def sonify(): Unit = js.native
  def sonify(options: SonifySeriesOptionsObject): Unit = js.native
}
