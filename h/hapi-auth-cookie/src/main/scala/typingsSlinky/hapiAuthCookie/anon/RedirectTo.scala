package typingsSlinky.hapiAuthCookie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedirectTo extends js.Object {
  var redirectTo: js.UndefOr[Boolean] = js.native
}

object RedirectTo {
  @scala.inline
  def apply(): RedirectTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedirectTo]
  }
  @scala.inline
  implicit class RedirectToOps[Self <: RedirectTo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRedirectTo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectTo")(js.undefined)
        ret
    }
  }
  
}

