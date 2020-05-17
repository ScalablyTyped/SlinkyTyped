package typingsSlinky.koaGenericSession.anon

import typingsSlinky.koaGenericSession.koaGenericSessionStrings.lax
import typingsSlinky.koaGenericSession.koaGenericSessionStrings.none
import typingsSlinky.koaGenericSession.koaGenericSessionStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpOnly extends js.Object {
  var httpOnly: js.UndefOr[Boolean] = js.native
  var maxAge: js.UndefOr[Double] = js.native
  var path: js.UndefOr[String] = js.native
  var rewrite: js.UndefOr[Boolean] = js.native
  var sameSite: js.UndefOr[Boolean | lax | none | strict] = js.native
  var secure: js.UndefOr[Boolean] = js.native
  var signed: js.UndefOr[Boolean] = js.native
}

object HttpOnly {
  @scala.inline
  def apply(): HttpOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpOnly]
  }
  @scala.inline
  implicit class HttpOnlyOps[Self <: HttpOnly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withRewrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRewrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewrite")(js.undefined)
        ret
    }
    @scala.inline
    def withSameSite(value: Boolean | lax | none | strict): Self = {
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
    def withSecure(value: Boolean): Self = {
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

