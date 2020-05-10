package typingsSlinky.lusca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait csrfOptionsBlacklist extends csrfOptionsBlacklistOrWhitelist {
  var blacklist: js.UndefOr[js.Array[String]] = js.native
}

object csrfOptionsBlacklist {
  @scala.inline
  def apply(): csrfOptionsBlacklist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[csrfOptionsBlacklist]
  }
  @scala.inline
  implicit class csrfOptionsBlacklistOps[Self <: csrfOptionsBlacklist] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlacklist(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlacklist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklist")(js.undefined)
        ret
    }
  }
  
}

