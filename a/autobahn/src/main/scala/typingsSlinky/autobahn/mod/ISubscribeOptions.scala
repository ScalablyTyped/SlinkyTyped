package typingsSlinky.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubscribeOptions extends js.Object {
  var get_retained: js.UndefOr[Boolean] = js.native
  var `match`: js.UndefOr[String] = js.native
}

object ISubscribeOptions {
  @scala.inline
  def apply(): ISubscribeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISubscribeOptions]
  }
  @scala.inline
  implicit class ISubscribeOptionsOps[Self <: ISubscribeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_retained(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_retained")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGet_retained: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_retained")(js.undefined)
        ret
    }
    @scala.inline
    def withMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.undefined)
        ret
    }
  }
  
}

