package typingsSlinky.pubnub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Next extends js.Object {
  var next: js.UndefOr[String] = js.native
  var prev: js.UndefOr[String] = js.native
}

object Next {
  @scala.inline
  def apply(): Next = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Next]
  }
  @scala.inline
  implicit class NextOps[Self <: Next] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
    @scala.inline
    def withPrev(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.undefined)
        ret
    }
  }
  
}

