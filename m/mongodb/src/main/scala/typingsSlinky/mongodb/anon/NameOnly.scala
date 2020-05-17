package typingsSlinky.mongodb.anon

import typingsSlinky.mongodb.mod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NameOnly extends js.Object {
  var nameOnly: js.UndefOr[Boolean] = js.native
  var session: js.UndefOr[ClientSession] = js.native
}

object NameOnly {
  @scala.inline
  def apply(): NameOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NameOnly]
  }
  @scala.inline
  implicit class NameOnlyOps[Self <: NameOnly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNameOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSession(value: ClientSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(js.undefined)
        ret
    }
  }
  
}

