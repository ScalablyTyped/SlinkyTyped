package typingsSlinky.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAvailabilityResponse extends js.Object {
  /** The availabilities being returned. */
  var availabilities: js.UndefOr[js.Array[Availability]] = js.native
}

object UpdateAvailabilityResponse {
  @scala.inline
  def apply(): UpdateAvailabilityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAvailabilityResponse]
  }
  @scala.inline
  implicit class UpdateAvailabilityResponseOps[Self <: UpdateAvailabilityResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilities(value: js.Array[Availability]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilities")(js.undefined)
        ret
    }
  }
  
}

