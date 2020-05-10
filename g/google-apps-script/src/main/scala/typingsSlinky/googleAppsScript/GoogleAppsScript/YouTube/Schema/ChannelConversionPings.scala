package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelConversionPings extends js.Object {
  var pings: js.UndefOr[js.Array[ChannelConversionPing]] = js.native
}

object ChannelConversionPings {
  @scala.inline
  def apply(): ChannelConversionPings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelConversionPings]
  }
  @scala.inline
  implicit class ChannelConversionPingsOps[Self <: ChannelConversionPings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPings(value: js.Array[ChannelConversionPing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pings")(js.undefined)
        ret
    }
  }
  
}

