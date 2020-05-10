package typingsSlinky.googleapis.v1alphaMod.appengineV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for the given google.longrunning.Operation.
  */
@js.native
trait SchemaOperationMetadataV1Alpha extends js.Object {
  var createVersionMetadata: js.UndefOr[SchemaCreateVersionMetadataV1Alpha] = js.native
  /**
    * Time that this operation completed.@OutputOnly
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Ephemeral message that may change every time the operation is polled.
    * @OutputOnly
    */
  var ephemeralMessage: js.UndefOr[String] = js.native
  /**
    * Time that this operation was created.@OutputOnly
    */
  var insertTime: js.UndefOr[String] = js.native
  /**
    * API method that initiated this operation. Example:
    * google.appengine.v1alpha.Versions.CreateVersion.@OutputOnly
    */
  var method: js.UndefOr[String] = js.native
  /**
    * Name of the resource that this operation is acting on. Example:
    * apps/myapp/services/default.@OutputOnly
    */
  var target: js.UndefOr[String] = js.native
  /**
    * User who requested this operation.@OutputOnly
    */
  var user: js.UndefOr[String] = js.native
  /**
    * Durable messages that persist on every operation poll. @OutputOnly
    */
  var warning: js.UndefOr[js.Array[String]] = js.native
}

object SchemaOperationMetadataV1Alpha {
  @scala.inline
  def apply(): SchemaOperationMetadataV1Alpha = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationMetadataV1Alpha]
  }
  @scala.inline
  implicit class SchemaOperationMetadataV1AlphaOps[Self <: SchemaOperationMetadataV1Alpha] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateVersionMetadata(value: SchemaCreateVersionMetadataV1Alpha): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createVersionMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateVersionMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createVersionMetadata")(js.undefined)
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
    def withEphemeralMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ephemeralMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEphemeralMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ephemeralMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}

