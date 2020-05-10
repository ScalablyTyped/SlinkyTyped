package typingsSlinky.onfleetNodeOnfleet.webhooksMod

import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`0`
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`10`
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`12`
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`13`
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`14`
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`1`
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`2`
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`3`
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`4`
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`5`
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`6`
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`7`
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`8`
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnfleetWebhook extends js.Object {
  var threshold: js.UndefOr[Double] = js.native
  var trigger: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `12` | `13` | `14` = js.native
  var url: String = js.native
}

object OnfleetWebhook {
  @scala.inline
  def apply(
    trigger: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `12` | `13` | `14`,
    url: String
  ): OnfleetWebhook = {
    val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnfleetWebhook]
  }
  @scala.inline
  implicit class OnfleetWebhookOps[Self <: OnfleetWebhook] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrigger(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `12` | `13` | `14`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
  }
  
}

