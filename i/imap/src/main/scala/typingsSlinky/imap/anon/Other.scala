package typingsSlinky.imap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Other extends js.Object {
  /** Mailboxes that belong to other users that the logged in user has access to. */
  var other: js.Array[_] = js.native
  /** Mailboxes that belong to the logged in user. */
  var personal: js.Array[_] = js.native
  /** Mailboxes that are accessible by any logged in user. */
  var shared: js.Array[_] = js.native
}

object Other {
  @scala.inline
  def apply(other: js.Array[_], personal: js.Array[_], shared: js.Array[_]): Other = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], personal = personal.asInstanceOf[js.Any], shared = shared.asInstanceOf[js.Any])
    __obj.asInstanceOf[Other]
  }
  @scala.inline
  implicit class OtherOps[Self <: Other] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOther(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersonal(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShared(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

