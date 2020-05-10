package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for creating an operation
  */
@js.native
trait SchemaCreateOperationRequest extends js.Object {
  /**
    * The operation to create.
    */
  var operation: js.UndefOr[SchemaOperation] = js.native
  /**
    * The ID to use for this operation.
    */
  var operationId: js.UndefOr[String] = js.native
}

object SchemaCreateOperationRequest {
  @scala.inline
  def apply(): SchemaCreateOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateOperationRequest]
  }
  @scala.inline
  implicit class SchemaCreateOperationRequestOps[Self <: SchemaCreateOperationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperation(value: SchemaOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(js.undefined)
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
  }
  
}

