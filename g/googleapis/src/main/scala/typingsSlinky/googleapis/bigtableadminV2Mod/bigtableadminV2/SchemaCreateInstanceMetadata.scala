package typingsSlinky.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The metadata for the Operation returned by CreateInstance.
  */
@js.native
trait SchemaCreateInstanceMetadata extends js.Object {
  /**
    * The time at which the operation failed or was completed successfully.
    */
  var finishTime: js.UndefOr[String] = js.native
  /**
    * The request that prompted the initiation of this CreateInstance
    * operation.
    */
  var originalRequest: js.UndefOr[SchemaCreateInstanceRequest] = js.native
  /**
    * The time at which the original request was received.
    */
  var requestTime: js.UndefOr[String] = js.native
}

object SchemaCreateInstanceMetadata {
  @scala.inline
  def apply(): SchemaCreateInstanceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateInstanceMetadata]
  }
  @scala.inline
  implicit class SchemaCreateInstanceMetadataOps[Self <: SchemaCreateInstanceMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinishTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinishTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalRequest(value: SchemaCreateInstanceRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTime")(js.undefined)
        ret
    }
  }
  
}

