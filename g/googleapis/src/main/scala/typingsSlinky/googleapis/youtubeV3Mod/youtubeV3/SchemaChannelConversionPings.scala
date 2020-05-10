package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The conversionPings object encapsulates information about conversion pings
  * that need to be respected by the channel.
  */
@js.native
trait SchemaChannelConversionPings extends js.Object {
  /**
    * Pings that the app shall fire (authenticated by biscotti cookie). Each
    * ping has a context, in which the app must fire the ping, and a url
    * identifying the ping.
    */
  var pings: js.UndefOr[js.Array[SchemaChannelConversionPing]] = js.native
}

object SchemaChannelConversionPings {
  @scala.inline
  def apply(): SchemaChannelConversionPings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelConversionPings]
  }
  @scala.inline
  implicit class SchemaChannelConversionPingsOps[Self <: SchemaChannelConversionPings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPings(value: js.Array[SchemaChannelConversionPing]): Self = {
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

