package typingsSlinky.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamSelection extends js.Object {
  /**
    * The maximum video bitrate (bps) to include in output.
    */
  var MaxVideoBitsPerSecond: js.UndefOr[integer] = js.native
  /**
    * The minimum video bitrate (bps) to include in output.
    */
  var MinVideoBitsPerSecond: js.UndefOr[integer] = js.native
  /**
    * A directive that determines the order of streams in the output.
    */
  var StreamOrder: js.UndefOr[typingsSlinky.awsSdk.mediapackagevodMod.StreamOrder] = js.native
}

object StreamSelection {
  @scala.inline
  def apply(): StreamSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamSelection]
  }
  @scala.inline
  implicit class StreamSelectionOps[Self <: StreamSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxVideoBitsPerSecond(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxVideoBitsPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxVideoBitsPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxVideoBitsPerSecond")(js.undefined)
        ret
    }
    @scala.inline
    def withMinVideoBitsPerSecond(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinVideoBitsPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinVideoBitsPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinVideoBitsPerSecond")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamOrder(value: StreamOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamOrder")(js.undefined)
        ret
    }
  }
  
}

