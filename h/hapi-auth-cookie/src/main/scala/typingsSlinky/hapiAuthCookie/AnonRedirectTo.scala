package typingsSlinky.hapiAuthCookie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRedirectTo extends js.Object {
  var redirectTo: js.UndefOr[Boolean] = js.native
}

object AnonRedirectTo {
  @scala.inline
  def apply(): AnonRedirectTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRedirectTo]
  }
  @scala.inline
  implicit class AnonRedirectToOps[Self <: AnonRedirectTo] (val x: Self) extends AnyVal {
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

