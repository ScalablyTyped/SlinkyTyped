package typingsSlinky.mapsjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  var data: js.Array[js.Object] = js.native
  var dataFormat: js.UndefOr[String] = js.native
  var maxAvailableZoomLevel: js.UndefOr[Double] = js.native
  var timeoutMs: js.UndefOr[Double] = js.native
}

object Data {
  @scala.inline
  def apply(data: js.Array[js.Object]): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
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

