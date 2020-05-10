package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElevationResponse extends js.Object {
  /**
    * When the status code is other than `OK`, there may be an additional `error_message` field within the Elevation response object.
    * This field contains more detailed information about the reasons behind the given status code.
    */
  var error_message: String = js.native
  /** An Elevation results array. */
  var results: js.Array[ElevationResult] = js.native
  /** An Elevation status code. */
  var status: ElevationResponseStatus = js.native
}

object ElevationResponse {
  @scala.inline
  def apply(error_message: String, results: js.Array[ElevationResult], status: ElevationResponseStatus): ElevationResponse = {
    val __obj = js.Dynamic.literal(error_message = error_message.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElevationResponse]
  }
  @scala.inline
  implicit class ElevationResponseOps[Self <: ElevationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError_message(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults(value: js.Array[ElevationResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: ElevationResponseStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

