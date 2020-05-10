package typingsSlinky.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A domain that a user has been authorized to administer. To authorize use of
  * a domain, verify ownership via Webmaster Central
  * (https://www.google.com/webmasters/verification/home).
  */
@js.native
trait SchemaAuthorizedDomain extends js.Object {
  /**
    * Fully qualified domain name of the domain authorized for use. Example:
    * example.com.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Full path to the AuthorizedDomain resource in the API. Example:
    * apps/myapp/authorizedDomains/example.com.@OutputOnly
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaAuthorizedDomain {
  @scala.inline
  def apply(): SchemaAuthorizedDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthorizedDomain]
  }
  @scala.inline
  implicit class SchemaAuthorizedDomainOps[Self <: SchemaAuthorizedDomain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

