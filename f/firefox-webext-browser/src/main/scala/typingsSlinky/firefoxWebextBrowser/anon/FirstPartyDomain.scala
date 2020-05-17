package typingsSlinky.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirstPartyDomain extends js.Object {
  /**
    * The first-party domain associated with the cookie. This attribute is required if First-Party Isolation is
    * enabled.
    */
  var firstPartyDomain: js.UndefOr[String] = js.native
  /** The name of the cookie to remove. */
  var name: String = js.native
  /**
    * The ID of the cookie store to look in for the cookie. If unspecified, the cookie is looked for by default in
    * the current execution context's cookie store.
    */
  var storeId: js.UndefOr[String] = js.native
  /**
    * The URL associated with the cookie. If host permissions for this URL are not specified in the manifest file,
    * the API call will fail.
    */
  var url: String = js.native
}

object FirstPartyDomain {
  @scala.inline
  def apply(name: String, url: String): FirstPartyDomain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstPartyDomain]
  }
  @scala.inline
  implicit class FirstPartyDomainOps[Self <: FirstPartyDomain] (val x: Self) extends AnyVal {
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
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstPartyDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPartyDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstPartyDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPartyDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeId")(js.undefined)
        ret
    }
  }
  
}

