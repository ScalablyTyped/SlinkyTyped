package typingsSlinky.nwJs.mod._Global_.NWJSHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Coockies.remove() details argument object
  */
@js.native
trait CookiesRemoveDetails extends js.Object {
  /**
    * The name of the cookie to remove.
    */
  var name: String = js.native
  /**
    * The ID of the cookie store to look in for the cookie.
    */
  var storeId: String = js.native
  /**
    * The URL associated with the cookie.
    */
  var url: String = js.native
}

object CookiesRemoveDetails {
  @scala.inline
  def apply(name: String, storeId: String, url: String): CookiesRemoveDetails = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], storeId = storeId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookiesRemoveDetails]
  }
  @scala.inline
  implicit class CookiesRemoveDetailsOps[Self <: CookiesRemoveDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

