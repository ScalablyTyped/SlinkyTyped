package typingsSlinky.apolloServerTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiKeyHash extends js.Object {
  var apiKeyHash: js.UndefOr[String] = js.native
  var serviceID: js.UndefOr[String] = js.native
}

object ApiKeyHash {
  @scala.inline
  def apply(): ApiKeyHash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiKeyHash]
  }
  @scala.inline
  implicit class ApiKeyHashOps[Self <: ApiKeyHash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiKeyHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKeyHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiKeyHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKeyHash")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceID")(js.undefined)
        ret
    }
  }
  
}

