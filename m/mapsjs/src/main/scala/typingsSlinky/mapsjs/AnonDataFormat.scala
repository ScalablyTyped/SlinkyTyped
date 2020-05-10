package typingsSlinky.mapsjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDataFormat extends js.Object {
  var dataFormat: js.UndefOr[String] = js.native
  var maxAvailableZoomLevel: js.UndefOr[Double] = js.native
  var timeoutMs: js.UndefOr[Double] = js.native
}

object AnonDataFormat {
  @scala.inline
  def apply(): AnonDataFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDataFormat]
  }
  @scala.inline
  implicit class AnonDataFormatOps[Self <: AnonDataFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAvailableZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAvailableZoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAvailableZoomLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAvailableZoomLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutMs")(js.undefined)
        ret
    }
  }
  
}

