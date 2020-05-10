package typingsSlinky.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAvailabilityRequest extends js.Object {
  /** The availabilities being requested. */
  var availabilities: js.UndefOr[js.Array[Availability]] = js.native
}

object UpdateAvailabilityRequest {
  @scala.inline
  def apply(): UpdateAvailabilityRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAvailabilityRequest]
  }
  @scala.inline
  implicit class UpdateAvailabilityRequestOps[Self <: UpdateAvailabilityRequest] (val x: Self) extends AnyVal {
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

