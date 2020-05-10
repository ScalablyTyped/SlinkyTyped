package typingsSlinky.lusca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait csrfOptionsWhitelist extends csrfOptionsBlacklistOrWhitelist {
  var whitelist: js.UndefOr[js.Array[String]] = js.native
}

object csrfOptionsWhitelist {
  @scala.inline
  def apply(): csrfOptionsWhitelist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[csrfOptionsWhitelist]
  }
  @scala.inline
  implicit class csrfOptionsWhitelistOps[Self <: csrfOptionsWhitelist] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWhitelist(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhitelist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(js.undefined)
        ret
    }
  }
  
}

