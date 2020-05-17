package typingsSlinky.nano.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rev extends js.Object {
  var rev: String = js.native
}

object Rev {
  @scala.inline
  def apply(rev: String): Rev = {
    val __obj = js.Dynamic.literal(rev = rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rev]
  }
  @scala.inline
  implicit class RevOps[Self <: Rev] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRev(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rev")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

