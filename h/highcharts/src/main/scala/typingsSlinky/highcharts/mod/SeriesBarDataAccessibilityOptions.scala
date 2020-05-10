package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesBarDataAccessibilityOptions extends js.Object {
  /**
    * (Highcharts) Provide a description of the data point, announced to screen
    * readers.
    */
  var description: js.UndefOr[String] = js.native
}

object SeriesBarDataAccessibilityOptions {
  @scala.inline
  def apply(): SeriesBarDataAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesBarDataAccessibilityOptions]
  }
  @scala.inline
  implicit class SeriesBarDataAccessibilityOptionsOps[Self <: SeriesBarDataAccessibilityOptions] (val x: Self) extends AnyVal {
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

