package typingsSlinky.highcharts.accessibilityMod.highchartsAugmentingMod

import typingsSlinky.highcharts.mod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chart extends js.Object {
  /**
    * Apply context to a format string from lang options of the chart.
    *
    * @param langKey
    *        Key (using dot notation) into lang option structure.
    *
    * @param context
    *        Context to apply to the format string.
    *
    * @return The formatted string.
    */
  def langFormat(langKey: String, context: Dictionary[_]): String = js.native
}

object Chart {
  @scala.inline
  def apply(langFormat: (String, Dictionary[_]) => String): Chart = {
    val __obj = js.Dynamic.literal(langFormat = js.Any.fromFunction2(langFormat))
    __obj.asInstanceOf[Chart]
  }
  @scala.inline
  implicit class ChartOps[Self <: Chart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLangFormat(value: (String, Dictionary[_]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("langFormat")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

