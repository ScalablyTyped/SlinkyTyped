package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetsChartProperties extends js.Object {
  /** The properties of the embedded chart image. */
  var chartImageProperties: js.UndefOr[ImageProperties] = js.native
}

object SheetsChartProperties {
  @scala.inline
  def apply(): SheetsChartProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetsChartProperties]
  }
  @scala.inline
  implicit class SheetsChartPropertiesOps[Self <: SheetsChartProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChartImageProperties(value: ImageProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartImageProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartImageProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartImageProperties")(js.undefined)
        ret
    }
  }
  
}

