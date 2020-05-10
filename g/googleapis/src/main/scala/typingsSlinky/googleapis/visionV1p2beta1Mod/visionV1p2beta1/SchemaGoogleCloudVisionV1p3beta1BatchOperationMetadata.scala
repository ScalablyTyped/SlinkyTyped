package typingsSlinky.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for the batch operations such as the current state.  This is
  * included in the `metadata` field of the `Operation` returned by the
  * `GetOperation` call of the `google::longrunning::Operations` service.
  */
@js.native
trait SchemaGoogleCloudVisionV1p3beta1BatchOperationMetadata extends js.Object {
  /**
    * The time when the batch request is finished and
    * google.longrunning.Operation.done is set to true.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The current state of the batch operation.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The time when the batch request was submitted to the server.
    */
  var submitTime: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p3beta1BatchOperationMetadata {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p3beta1BatchOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1BatchOperationMetadata]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p3beta1BatchOperationMetadataOps[Self <: SchemaGoogleCloudVisionV1p3beta1BatchOperationMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmitTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitTime")(js.undefined)
        ret
    }
  }
  
}

