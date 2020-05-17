package typingsSlinky.gapiClientSiteverification.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Identifier extends js.Object {
  /** The site identifier. If the type is set to SITE, the identifier is a URL. If the type is set to INET_DOMAIN, the site identifier is a domain name. */
  var identifier: js.UndefOr[String] = js.native
  /** The site type. Can be SITE or INET_DOMAIN (domain name). */
  var `type`: js.UndefOr[String] = js.native
}

object Identifier {
  @scala.inline
  def apply(): Identifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Identifier]
  }
  @scala.inline
  implicit class IdentifierOps[Self <: Identifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

