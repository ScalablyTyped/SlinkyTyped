package typingsSlinky.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response to a update availability request.
  */
@js.native
trait SchemaUpdateAvailabilityResponse extends js.Object {
  /**
    * The availabilities being returned.
    */
  var availabilities: js.UndefOr[js.Array[SchemaAvailability]] = js.native
}

object SchemaUpdateAvailabilityResponse {
  @scala.inline
  def apply(): SchemaUpdateAvailabilityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateAvailabilityResponse]
  }
  @scala.inline
  implicit class SchemaUpdateAvailabilityResponseOps[Self <: SchemaUpdateAvailabilityResponse] (val x: Self) extends AnyVal {
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

