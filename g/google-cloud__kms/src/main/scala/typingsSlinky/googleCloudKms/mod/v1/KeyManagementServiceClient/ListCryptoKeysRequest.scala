package typingsSlinky.googleCloudKms.mod.v1.KeyManagementServiceClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCryptoKeysRequest extends js.Object {
  var page_size: js.UndefOr[Double] = js.native
  var page_token: js.UndefOr[String] = js.native
  var parent: String = js.native
}

object ListCryptoKeysRequest {
  @scala.inline
  def apply(parent: String): ListCryptoKeysRequest = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCryptoKeysRequest]
  }
  @scala.inline
  implicit class ListCryptoKeysRequestOps[Self <: ListCryptoKeysRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_size")(js.undefined)
        ret
    }
    @scala.inline
    def withPage_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_token")(js.undefined)
        ret
    }
  }
  
}

