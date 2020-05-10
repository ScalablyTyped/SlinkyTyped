package typingsSlinky.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// hereNow
@js.native
trait HereNowParameters extends js.Object {
  var channelGroups: js.UndefOr[js.Array[String]] = js.native
  var channels: js.UndefOr[js.Array[String]] = js.native
  var includeState: js.UndefOr[Boolean] = js.native
  var includeUUIDs: js.UndefOr[Boolean] = js.native
}

object HereNowParameters {
  @scala.inline
  def apply(): HereNowParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HereNowParameters]
  }
  @scala.inline
  implicit class HereNowParametersOps[Self <: HereNowParameters] (val x: Self) extends AnyVal {
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
    def withIncludeState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeState")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeUUIDs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUUIDs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeUUIDs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUUIDs")(js.undefined)
        ret
    }
  }
  
}

