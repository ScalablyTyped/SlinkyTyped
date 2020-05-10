package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains metadata for the BatchAnnotateImages operation.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1OperationMetadata extends js.Object {
  /**
    * The time when the batch request was received.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Current state of the batch operation.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The time when the operation result was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1OperationMetadata {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1OperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1OperationMetadata]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1OperationMetadataOps[Self <: SchemaGoogleCloudVisionV1p1beta1OperationMetadata] (val x: Self) extends AnyVal {
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
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
  }
  
}

