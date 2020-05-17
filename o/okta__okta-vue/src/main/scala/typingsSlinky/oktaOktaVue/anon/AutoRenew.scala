package typingsSlinky.oktaOktaVue.anon

import typingsSlinky.oktaOktaVue.oktaOktaVueStrings.cookie
import typingsSlinky.oktaOktaVue.oktaOktaVueStrings.localStorage
import typingsSlinky.oktaOktaVue.oktaOktaVueStrings.sessionStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoRenew extends js.Object {
  var autoRenew: js.UndefOr[Boolean] = js.native
  var secure: js.UndefOr[Boolean] = js.native
  var storage: js.UndefOr[localStorage | sessionStorage | cookie] = js.native
}

object AutoRenew {
  @scala.inline
  def apply(): AutoRenew = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoRenew]
  }
  @scala.inline
  implicit class AutoRenewOps[Self <: AutoRenew] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoRenew(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRenew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRenew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRenew")(js.undefined)
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
    def withStorage(value: localStorage | sessionStorage | cookie): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(js.undefined)
        ret
    }
  }
  
}

