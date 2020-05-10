package typingsSlinky.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LatLongRect extends js.Object {
  /** Max lat/long pair. */
  var maxLatLng: js.UndefOr[LatLng] = js.native
  /** Min lat/long pair. */
  var minLatLng: js.UndefOr[LatLng] = js.native
}

object LatLongRect {
  @scala.inline
  def apply(): LatLongRect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LatLongRect]
  }
  @scala.inline
  implicit class LatLongRectOps[Self <: LatLongRect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxLatLng(value: LatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLatLng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLatLng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLatLng")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLatLng(value: LatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLatLng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLatLng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLatLng")(js.undefined)
        ret
    }
  }
  
}

