package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for PresentationsService.BatchUpdatePresentation.
  */
@js.native
trait SchemaBatchUpdatePresentationRequest extends js.Object {
  /**
    * A list of updates to apply to the presentation.
    */
  var requests: js.UndefOr[js.Array[SchemaRequest]] = js.native
  /**
    * Provides control over how write requests are executed.
    */
  var writeControl: js.UndefOr[SchemaWriteControl] = js.native
}

object SchemaBatchUpdatePresentationRequest {
  @scala.inline
  def apply(): SchemaBatchUpdatePresentationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdatePresentationRequest]
  }
  @scala.inline
  implicit class SchemaBatchUpdatePresentationRequestOps[Self <: SchemaBatchUpdatePresentationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequests(value: js.Array[SchemaRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(js.undefined)
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

