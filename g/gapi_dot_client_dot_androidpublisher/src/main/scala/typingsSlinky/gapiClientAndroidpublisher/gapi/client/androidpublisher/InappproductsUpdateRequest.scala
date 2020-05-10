package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InappproductsUpdateRequest extends js.Object {
  var inappproduct: js.UndefOr[InAppProduct] = js.native
}

object InappproductsUpdateRequest {
  @scala.inline
  def apply(): InappproductsUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InappproductsUpdateRequest]
  }
  @scala.inline
  implicit class InappproductsUpdateRequestOps[Self <: InappproductsUpdateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInappproduct(value: InAppProduct): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inappproduct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInappproduct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inappproduct")(js.undefined)
        ret
    }
  }
  
}

