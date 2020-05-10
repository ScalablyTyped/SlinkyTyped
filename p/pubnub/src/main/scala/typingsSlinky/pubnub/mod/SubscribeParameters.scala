package typingsSlinky.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// subscribe
@js.native
trait SubscribeParameters extends js.Object {
  var channelGroups: js.UndefOr[js.Array[String]] = js.native
  var channels: js.UndefOr[js.Array[String]] = js.native
  var timetoken: js.UndefOr[Double] = js.native
  var withPresence: js.UndefOr[Boolean] = js.native
}

object SubscribeParameters {
  @scala.inline
  def apply(): SubscribeParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeParameters]
  }
  @scala.inline
  implicit class SubscribeParametersOps[Self <: SubscribeParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withChannels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(js.undefined)
        ret
    }
    @scala.inline
    def withTimetoken(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timetoken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimetoken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timetoken")(js.undefined)
        ret
    }
    @scala.inline
    def withWithPresence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withPresence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithPresence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withPresence")(js.undefined)
        ret
    }
  }
  
}

