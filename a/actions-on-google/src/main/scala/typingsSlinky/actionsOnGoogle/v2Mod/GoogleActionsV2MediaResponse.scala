package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2MediaResponse extends js.Object {
  /**
    * The list of media objects.
    */
  var mediaObjects: js.UndefOr[js.Array[GoogleActionsV2MediaObject]] = js.native
  /**
    * Type of the media within this response.
    */
  var mediaType: js.UndefOr[GoogleActionsV2MediaResponseMediaType] = js.native
}

object GoogleActionsV2MediaResponse {
  @scala.inline
  def apply(): GoogleActionsV2MediaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2MediaResponse]
  }
  @scala.inline
  implicit class GoogleActionsV2MediaResponseOps[Self <: GoogleActionsV2MediaResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMediaObjects(value: js.Array[GoogleActionsV2MediaObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaType(value: GoogleActionsV2MediaResponseMediaType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(js.undefined)
        ret
    }
  }
  
}

