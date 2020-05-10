package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoFillRequest extends js.Object {
  /**
    * The range to autofill. This will examine the range and detect
    * the location that has data and automatically fill that data
    * in to the rest of the range.
    */
  var range: js.UndefOr[GridRange] = js.native
  /**
    * The source and destination areas to autofill.
    * This explicitly lists the source of the autofill and where to
    * extend that data.
    */
  var sourceAndDestination: js.UndefOr[SourceAndDestination] = js.native
  /**
    * True if we should generate data with the "alternate" series.
    * This differs based on the type and amount of source data.
    */
  var useAlternateSeries: js.UndefOr[Boolean] = js.native
}

object AutoFillRequest {
  @scala.inline
  def apply(): AutoFillRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoFillRequest]
  }
  @scala.inline
  implicit class AutoFillRequestOps[Self <: AutoFillRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRange(value: GridRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceAndDestination(value: SourceAndDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAndDestination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceAndDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAndDestination")(js.undefined)
        ret
    }
    @scala.inline
    def withUseAlternateSeries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAlternateSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseAlternateSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAlternateSeries")(js.undefined)
        ret
    }
  }
  
}

