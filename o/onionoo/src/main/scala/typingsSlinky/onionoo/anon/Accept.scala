package typingsSlinky.onionoo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accept extends js.Object {
  var accept: js.UndefOr[js.Array[String]] = js.native
  var reject: js.UndefOr[js.Array[String]] = js.native
}

object Accept {
  @scala.inline
  def apply(): Accept = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Accept]
  }
  @scala.inline
  implicit class AcceptOps[Self <: Accept] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(js.undefined)
        ret
    }
    @scala.inline
    def withReject(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reject")(js.undefined)
        ret
    }
  }
  
}

