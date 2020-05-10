package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEmbeddedObjectPositionRequest extends js.Object {
  var fields: js.UndefOr[String] = js.native
  var newPosition: js.UndefOr[EmbeddedObjectPosition] = js.native
  var objectId: js.UndefOr[Double] = js.native
}

object UpdateEmbeddedObjectPositionRequest {
  @scala.inline
  def apply(): UpdateEmbeddedObjectPositionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEmbeddedObjectPositionRequest]
  }
  @scala.inline
  implicit class UpdateEmbeddedObjectPositionRequestOps[Self <: UpdateEmbeddedObjectPositionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withNewPosition(value: EmbeddedObjectPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(js.undefined)
        ret
    }
  }
  
}

