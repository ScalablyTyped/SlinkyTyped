package typingsSlinky.googleapis.datatransferV1Mod.adminDatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Template to map fields of ApplicationDataTransfer resource.
  */
@js.native
trait SchemaApplicationDataTransfer extends js.Object {
  /**
    * The application&#39;s ID.
    */
  var applicationId: js.UndefOr[String] = js.native
  /**
    * The transfer parameters for the application. These parameters are used to
    * select the data which will get transfered in context of this application.
    */
  var applicationTransferParams: js.UndefOr[js.Array[SchemaApplicationTransferParam]] = js.native
  /**
    * Current status of transfer for this application. (Read-only)
    */
  var applicationTransferStatus: js.UndefOr[String] = js.native
}

object SchemaApplicationDataTransfer {
  @scala.inline
  def apply(): SchemaApplicationDataTransfer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationDataTransfer]
  }
  @scala.inline
  implicit class SchemaApplicationDataTransferOps[Self <: SchemaApplicationDataTransfer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationId")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationTransferParams(value: js.Array[SchemaApplicationTransferParam]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationTransferParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationTransferParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationTransferParams")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationTransferStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationTransferStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationTransferStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationTransferStatus")(js.undefined)
        ret
    }
  }
  
}

