package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLCookie extends js.Object {
  val lCookie: Double = js.native
}

object AnonLCookie {
  @scala.inline
  def apply(lCookie: Double): AnonLCookie = {
    val __obj = js.Dynamic.literal(lCookie = lCookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLCookie]
  }
  @scala.inline
  implicit class AnonLCookieOps[Self <: AnonLCookie] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLCookie(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lCookie")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

