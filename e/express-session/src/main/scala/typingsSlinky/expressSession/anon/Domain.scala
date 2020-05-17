package typingsSlinky.expressSession.anon

import typingsSlinky.expressSession.expressSessionStrings.auto
import typingsSlinky.expressSession.expressSessionStrings.lax
import typingsSlinky.expressSession.expressSessionStrings.none
import typingsSlinky.expressSession.expressSessionStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Domain extends js.Object {
  var domain: js.UndefOr[String] = js.native
  var encode: js.UndefOr[js.Function1[/* val */ String, String]] = js.native
  var expires: js.UndefOr[js.Date] = js.native
  var httpOnly: js.UndefOr[Boolean] = js.native
  var maxAge: js.UndefOr[Double] = js.native
  var path: js.UndefOr[String] = js.native
  var sameSite: js.UndefOr[Boolean | lax | strict | none] = js.native
  var secure: js.UndefOr[Boolean | auto] = js.native
  var signed: js.UndefOr[Boolean] = js.native
}

object Domain {
  @scala.inline
  def apply(): Domain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Domain]
  }
  @scala.inline
  implicit class DomainOps[Self <: Domain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withEncode(value: /* val */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEncode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.undefined)
        ret
    }
    @scala.inline
    def withExpires(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withSameSite(value: Boolean | lax | strict | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameSite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSameSite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameSite")(js.undefined)
        ret
    }
    @scala.inline
    def withSecure(value: Boolean | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(js.undefined)
        ret
    }
    @scala.inline
    def withSigned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signed")(js.undefined)
        ret
    }
  }
  
}

