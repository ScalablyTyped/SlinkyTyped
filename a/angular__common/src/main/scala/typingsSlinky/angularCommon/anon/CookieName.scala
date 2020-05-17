package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieName extends js.Object {
  var cookieName: js.UndefOr[String] = js.native
  var headerName: js.UndefOr[String] = js.native
}

object CookieName {
  @scala.inline
  def apply(): CookieName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookieName]
  }
  @scala.inline
  implicit class CookieNameOps[Self <: CookieName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookieName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieName")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerName")(js.undefined)
        ret
    }
  }
  
}

