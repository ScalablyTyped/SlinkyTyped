package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InappproductsBatchRequest extends js.Object {
  var entrys: js.UndefOr[js.Array[InappproductsBatchRequestEntry]] = js.native
}

object InappproductsBatchRequest {
  @scala.inline
  def apply(): InappproductsBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InappproductsBatchRequest]
  }
  @scala.inline
  implicit class InappproductsBatchRequestOps[Self <: InappproductsBatchRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntrys(value: js.Array[InappproductsBatchRequestEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entrys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntrys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entrys")(js.undefined)
        ret
    }
  }
  
}

