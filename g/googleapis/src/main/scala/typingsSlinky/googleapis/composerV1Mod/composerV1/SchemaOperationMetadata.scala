package typingsSlinky.googleapis.composerV1Mod.composerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata describing an operation.
  */
@js.native
trait SchemaOperationMetadata extends js.Object {
  /**
    * Output only. The time the operation was submitted to the server.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. The time when the operation terminated, regardless of its
    * success. This field is unset if the operation is still ongoing.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Output only. The type of operation being performed.
    */
  var operationType: js.UndefOr[String] = js.native
  /**
    * Output only. The resource being operated on, as a [relative resource
    * name]( /apis/design/resource_names#relative_resource_name).
    */
  var resource: js.UndefOr[String] = js.native
  /**
    * Output only. The UUID of the resource being operated on.
    */
  var resourceUuid: js.UndefOr[String] = js.native
  /**
    * Output only. The current operation state.
    */
  var state: js.UndefOr[String] = js.native
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
    @scala.inline
    def withOperationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationType")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceUuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceUuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceUuid")(js.undefined)
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
  }
  
}

