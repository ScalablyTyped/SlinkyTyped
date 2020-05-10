package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InappproductsUpdateResponse extends js.Object {
  var inappproduct: js.UndefOr[InAppProduct] = js.native
}

object InappproductsUpdateResponse {
  @scala.inline
  def apply(): InappproductsUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InappproductsUpdateResponse]
  }
  @scala.inline
  implicit class InappproductsUpdateResponseOps[Self <: InappproductsUpdateResponse] (val x: Self) extends AnyVal {
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

