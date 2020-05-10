package typingsSlinky.nuxtjsAuth.mod.nuxtVueAppAugmentingMod

import typingsSlinky.nuxtjsAuth.mod.Auth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  @JSName("$auth")
  var $auth: Auth[_] = js.native
}

object Context {
  @scala.inline
  def apply($auth: Auth[_]): Context = {
    val __obj = js.Dynamic.literal($auth = $auth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$auth(value: Auth[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$auth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

