package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayerLatency extends js.Object {
  /**
    * Amount of time that represents the time lag experienced by the player when connected to the specified Region.
    */
  var LatencyInMilliseconds: js.UndefOr[Float] = js.native
  /**
    * A unique identifier for a player associated with the latency data.
    */
  var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * Name of the Region that is associated with the latency value.
    */
  var RegionIdentifier: js.UndefOr[NonZeroAndMaxString] = js.native
}

object PlayerLatency {
  @scala.inline
  def apply(): PlayerLatency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerLatency]
  }
  @scala.inline
  implicit class PlayerLatencyOps[Self <: PlayerLatency] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatencyInMilliseconds(value: Float): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatencyInMilliseconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatencyInMilliseconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatencyInMilliseconds")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayerId(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerId")(js.undefined)
        ret
    }
    @scala.inline
    def withRegionIdentifier(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegionIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegionIdentifier")(js.undefined)
        ret
    }
  }
  
}

