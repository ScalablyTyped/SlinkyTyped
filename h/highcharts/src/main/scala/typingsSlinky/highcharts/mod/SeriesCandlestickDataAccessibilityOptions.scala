package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesCandlestickDataAccessibilityOptions extends js.Object {
  /**
    * (Highstock) Provide a description of the data point, announced to screen
    * readers.
    */
  var description: js.UndefOr[String] = js.native
}

object SeriesCandlestickDataAccessibilityOptions {
  @scala.inline
  def apply(): SeriesCandlestickDataAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesCandlestickDataAccessibilityOptions]
  }
  @scala.inline
  implicit class SeriesCandlestickDataAccessibilityOptionsOps[Self <: SeriesCandlestickDataAccessibilityOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
  }
  
}

