package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message from a batch update.
  */
@js.native
trait SchemaBatchUpdatePresentationResponse extends js.Object {
  /**
    * The presentation the updates were applied to.
    */
  var presentationId: js.UndefOr[String] = js.native
  /**
    * The reply of the updates.  This maps 1:1 with the updates, although
    * replies to some requests may be empty.
    */
  var replies: js.UndefOr[js.Array[SchemaResponse]] = js.native
  /**
    * The updated write control after applying the request.
    */
  var writeControl: js.UndefOr[SchemaWriteControl] = js.native
}

object SchemaBatchUpdatePresentationResponse {
  @scala.inline
  def apply(): SchemaBatchUpdatePresentationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdatePresentationResponse]
  }
  @scala.inline
  implicit class SchemaBatchUpdatePresentationResponseOps[Self <: SchemaBatchUpdatePresentationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPresentationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresentationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentationId")(js.undefined)
        ret
    }
    @scala.inline
    def withReplies(value: js.Array[SchemaResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replies")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteControl(value: SchemaWriteControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeControl")(js.undefined)
        ret
    }
  }
  
}

