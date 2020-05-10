package typingsSlinky.googleapis.datatransferV1Mod.adminDatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The JSON template for a DataTransfer resource.
  */
@js.native
trait SchemaDataTransfer extends js.Object {
  /**
    * List of per application data transfer resources. It contains data
    * transfer details of the applications associated with this transfer
    * resource. Note that this list is also used to specify the applications
    * for which data transfer has to be done at the time of the transfer
    * resource creation.
    */
  var applicationDataTransfers: js.UndefOr[js.Array[SchemaApplicationDataTransfer]] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The transfer&#39;s ID (Read-only).
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies the resource as a DataTransfer request.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * ID of the user to whom the data is being transfered.
    */
  var newOwnerUserId: js.UndefOr[String] = js.native
  /**
    * ID of the user whose data is being transfered.
    */
  var oldOwnerUserId: js.UndefOr[String] = js.native
  /**
    * Overall transfer status (Read-only).
    */
  var overallTransferStatusCode: js.UndefOr[String] = js.native
  /**
    * The time at which the data transfer was requested (Read-only).
    */
  var requestTime: js.UndefOr[String] = js.native
}

object SchemaDataTransfer {
  @scala.inline
  def apply(): SchemaDataTransfer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataTransfer]
  }
  @scala.inline
  implicit class SchemaDataTransferOps[Self <: SchemaDataTransfer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationDataTransfers(value: js.Array[SchemaApplicationDataTransfer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationDataTransfers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationDataTransfers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationDataTransfers")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withNewOwnerUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOwnerUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewOwnerUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOwnerUserId")(js.undefined)
        ret
    }
    @scala.inline
    def withOldOwnerUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldOwnerUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldOwnerUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldOwnerUserId")(js.undefined)
        ret
    }
    @scala.inline
    def withOverallTransferStatusCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overallTransferStatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverallTransferStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overallTransferStatusCode")(js.undefined)
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

