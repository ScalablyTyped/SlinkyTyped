package typingsSlinky.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStoreId extends js.Object {
  /** The first-party domain associated with the cookie that's been removed. */
  var firstPartyDomain: String = js.native
  /** The name of the cookie that's been removed. */
  var name: String = js.native
  /** The ID of the cookie store from which the cookie was removed. */
  var storeId: String = js.native
  /** The URL associated with the cookie that's been removed. */
  var url: String = js.native
}

object AnonStoreId {
  @scala.inline
  def apply(firstPartyDomain: String, name: String, storeId: String, url: String): AnonStoreId = {
    val __obj = js.Dynamic.literal(firstPartyDomain = firstPartyDomain.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], storeId = storeId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStoreId]
  }
  @scala.inline
  implicit class AnonStoreIdOps[Self <: AnonStoreId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstPartyDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPartyDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoreId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

