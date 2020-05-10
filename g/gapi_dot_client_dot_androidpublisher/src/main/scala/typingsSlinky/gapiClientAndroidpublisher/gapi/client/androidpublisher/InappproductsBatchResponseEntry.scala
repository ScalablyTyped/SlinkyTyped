package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InappproductsBatchResponseEntry extends js.Object {
  var batchId: js.UndefOr[Double] = js.native
  var inappproductsinsertresponse: js.UndefOr[InappproductsInsertResponse] = js.native
  var inappproductsupdateresponse: js.UndefOr[InappproductsUpdateResponse] = js.native
}

object InappproductsBatchResponseEntry {
  @scala.inline
  def apply(): InappproductsBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InappproductsBatchResponseEntry]
  }
  @scala.inline
  implicit class InappproductsBatchResponseEntryOps[Self <: InappproductsBatchResponseEntry] (val x: Self) extends AnyVal {
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
    def withInappproductsinsertresponse(value: InappproductsInsertResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inappproductsinsertresponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInappproductsinsertresponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inappproductsinsertresponse")(js.undefined)
        ret
    }
    @scala.inline
    def withInappproductsupdateresponse(value: InappproductsUpdateResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inappproductsupdateresponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInappproductsupdateresponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inappproductsupdateresponse")(js.undefined)
        ret
    }
  }
  
}

