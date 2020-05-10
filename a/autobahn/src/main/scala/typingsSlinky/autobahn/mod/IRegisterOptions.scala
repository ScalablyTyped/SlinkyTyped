package typingsSlinky.autobahn.mod

import typingsSlinky.autobahn.autobahnStrings.first
import typingsSlinky.autobahn.autobahnStrings.last
import typingsSlinky.autobahn.autobahnStrings.random
import typingsSlinky.autobahn.autobahnStrings.roundrobin
import typingsSlinky.autobahn.autobahnStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRegisterOptions extends js.Object {
  var disclose_caller: js.UndefOr[Boolean] = js.native
  var invoke: js.UndefOr[single | roundrobin | random | first | last] = js.native
}

object IRegisterOptions {
  @scala.inline
  def apply(): IRegisterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRegisterOptions]
  }
  @scala.inline
  implicit class IRegisterOptionsOps[Self <: IRegisterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisclose_caller(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disclose_caller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisclose_caller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disclose_caller")(js.undefined)
        ret
    }
    @scala.inline
    def withInvoke(value: single | roundrobin | random | first | last): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvoke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoke")(js.undefined)
        ret
    }
  }
  
}

