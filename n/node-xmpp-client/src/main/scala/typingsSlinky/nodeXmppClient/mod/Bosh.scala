package typingsSlinky.nodeXmppClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bosh extends js.Object {
  var prebind: js.UndefOr[js.Function2[/* error */ js.Any, /* data */ js.Any, Unit]] = js.native
  var url: js.UndefOr[String] = js.native
}

object Bosh {
  @scala.inline
  def apply(): Bosh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bosh]
  }
  @scala.inline
  implicit class BoshOps[Self <: Bosh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrebind(value: (/* error */ js.Any, /* data */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prebind")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPrebind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prebind")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

