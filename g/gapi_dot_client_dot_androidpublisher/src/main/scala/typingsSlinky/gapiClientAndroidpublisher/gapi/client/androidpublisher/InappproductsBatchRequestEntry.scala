package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InappproductsBatchRequestEntry extends js.Object {
  var batchId: js.UndefOr[Double] = js.native
  var inappproductsinsertrequest: js.UndefOr[InappproductsInsertRequest] = js.native
  var inappproductsupdaterequest: js.UndefOr[InappproductsUpdateRequest] = js.native
  var methodName: js.UndefOr[String] = js.native
}

object InappproductsBatchRequestEntry {
  @scala.inline
  def apply(): InappproductsBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InappproductsBatchRequestEntry]
  }
  @scala.inline
  implicit class InappproductsBatchRequestEntryOps[Self <: InappproductsBatchRequestEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchId")(js.undefined)
        ret
    }
    @scala.inline
    def withInappproductsinsertrequest(value: InappproductsInsertRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inappproductsinsertrequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInappproductsinsertrequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inappproductsinsertrequest")(js.undefined)
        ret
    }
    @scala.inline
    def withInappproductsupdaterequest(value: InappproductsUpdateRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inappproductsupdaterequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInappproductsupdaterequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inappproductsupdaterequest")(js.undefined)
        ret
    }
    @scala.inline
    def withMethodName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethodName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodName")(js.undefined)
        ret
    }
  }
  
}

