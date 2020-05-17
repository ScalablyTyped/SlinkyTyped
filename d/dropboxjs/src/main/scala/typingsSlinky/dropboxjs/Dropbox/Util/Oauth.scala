package typingsSlinky.dropboxjs.Dropbox.Util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Oauth extends js.Object {
  def checkAuthStateParam(stateParam: String): Boolean = js.native
}

object Oauth {
  @scala.inline
  def apply(checkAuthStateParam: String => Boolean): Oauth = {
    val __obj = js.Dynamic.literal(checkAuthStateParam = js.Any.fromFunction1(checkAuthStateParam))
    __obj.asInstanceOf[Oauth]
  }
  @scala.inline
  implicit class OauthOps[Self <: Oauth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckAuthStateParam(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkAuthStateParam")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

