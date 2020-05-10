package typingsSlinky.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * OperationMetadata provides information about the operation execution.
  * Returned in the long-running operation&#39;s metadata field.
  */
@js.native
trait SchemaOperationMetadata extends js.Object {
  /**
    * The name of the API method that initiated the operation.
    */
  var apiMethodName: js.UndefOr[String] = js.native
  var counter: js.UndefOr[SchemaProgressCounter] = js.native
  /**
    * The time at which the operation was created by the API.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The time at which execution was completed.
    */
  var endTime: js.UndefOr[String] = js.native
}

object SchemaOperationMetadata {
  @scala.inline
  def apply(): SchemaOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationMetadata]
  }
  @scala.inline
  implicit class SchemaOperationMetadataOps[Self <: SchemaOperationMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiMethodName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiMethodName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiMethodName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiMethodName")(js.undefined)
        ret
    }
    @scala.inline
    def withCounter(value: SchemaProgressCounter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
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
  }
  
}

