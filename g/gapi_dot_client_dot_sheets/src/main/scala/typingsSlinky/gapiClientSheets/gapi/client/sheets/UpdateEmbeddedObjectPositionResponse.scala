package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEmbeddedObjectPositionResponse extends js.Object {
  /** The new position of the embedded object. */
  var position: js.UndefOr[EmbeddedObjectPosition] = js.native
}

object UpdateEmbeddedObjectPositionResponse {
  @scala.inline
  def apply(): UpdateEmbeddedObjectPositionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEmbeddedObjectPositionResponse]
  }
  @scala.inline
  implicit class UpdateEmbeddedObjectPositionResponseOps[Self <: UpdateEmbeddedObjectPositionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosition(value: EmbeddedObjectPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
  }
  
}

