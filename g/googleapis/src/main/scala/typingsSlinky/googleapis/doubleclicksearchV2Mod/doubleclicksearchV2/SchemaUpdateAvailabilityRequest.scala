package typingsSlinky.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request to update availability.
  */
@js.native
trait SchemaUpdateAvailabilityRequest extends js.Object {
  /**
    * The availabilities being requested.
    */
  var availabilities: js.UndefOr[js.Array[SchemaAvailability]] = js.native
}

object SchemaUpdateAvailabilityRequest {
  @scala.inline
  def apply(): SchemaUpdateAvailabilityRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateAvailabilityRequest]
  }
  @scala.inline
  implicit class SchemaUpdateAvailabilityRequestOps[Self <: SchemaUpdateAvailabilityRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilities(value: js.Array[SchemaAvailability]): Self = {
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

