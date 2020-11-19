package typingsSlinky.highcharts.highmapsMod

import typingsSlinky.highcharts.mod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("highcharts/highmaps", "Color")
@js.native
class Color_ protected ()
  extends typingsSlinky.highcharts.mod.Color_ {
  /**
    * Handle color operations. Some object methods are chainable.
    *
    * @param input
    *        The input color in either rbga or hex format
    */
  def this(input: ColorType) = this()
}
/* static members */
@JSImport("highcharts/highmaps", "Color")
@js.native
object Color_ extends js.Object {
  
  /**
    * Creates a color instance out of a color string or object.
    *
    * @param input
    *        The input color in either rbga or hex format.
    *
    * @return Color instance.
    */
  def parse(input: ColorType): typingsSlinky.highcharts.mod.Color_ = js.native
}
