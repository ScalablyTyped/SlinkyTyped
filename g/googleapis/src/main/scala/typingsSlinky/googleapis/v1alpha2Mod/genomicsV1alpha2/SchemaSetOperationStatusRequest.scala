package typingsSlinky.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to set operation status. Should only be used by VMs created by the
  * Pipelines Service and not by end users.
  */
@js.native
trait SchemaSetOperationStatusRequest extends js.Object {
  var errorCode: js.UndefOr[String] = js.native
  var errorMessage: js.UndefOr[String] = js.native
  var operationId: js.UndefOr[String] = js.native
  var timestampEvents: js.UndefOr[js.Array[SchemaTimestampEvent]] = js.native
  var validationToken: js.UndefOr[String] = js.native
}

object SchemaSetOperationStatusRequest {
  @scala.inline
  def apply(): SchemaSetOperationStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetOperationStatusRequest]
  }
  @scala.inline
  implicit class SchemaSetOperationStatusRequestOps[Self <: SchemaSetOperationStatusRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationId")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestampEvents(value: js.Array[SchemaTimestampEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestampEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationToken")(js.undefined)
        ret
    }
  }
  
}

