package typingsSlinky.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofutils extends js.Object {
  def xcap_auth_status(watcher_uri: String, presentity_uri: String): Double = js.native
}

object Typeofutils {
  @scala.inline
  def apply(xcap_auth_status: (String, String) => Double): Typeofutils = {
    val __obj = js.Dynamic.literal(xcap_auth_status = js.Any.fromFunction2(xcap_auth_status))
    __obj.asInstanceOf[Typeofutils]
  }
  @scala.inline
  implicit class TypeofutilsOps[Self <: Typeofutils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXcap_auth_status(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xcap_auth_status")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

