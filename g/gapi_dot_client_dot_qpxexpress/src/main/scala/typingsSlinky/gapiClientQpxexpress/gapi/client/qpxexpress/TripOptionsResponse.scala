package typingsSlinky.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TripOptionsResponse extends js.Object {
  /** Informational data global to list of solutions. */
  var data: js.UndefOr[Data] = js.native
  /** Identifies this as a QPX Express trip response object, which consists of zero or more solutions. Value: the fixed string qpxexpress#tripOptions. */
  var kind: js.UndefOr[String] = js.native
  /** An identifier uniquely identifying this response. */
  var requestId: js.UndefOr[String] = js.native
  /** A list of priced itinerary solutions to the QPX Express query. */
  var tripOption: js.UndefOr[js.Array[TripOption]] = js.native
}

object TripOptionsResponse {
  @scala.inline
  def apply(): TripOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TripOptionsResponse]
  }
  @scala.inline
  implicit class TripOptionsResponseOps[Self <: TripOptionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(js.undefined)
        ret
    }
    @scala.inline
    def withTripOption(value: js.Array[TripOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tripOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTripOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tripOption")(js.undefined)
        ret
    }
  }
  
}

