package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMultiplexRequest extends js.Object {
  /**
    * ID of the multiplex to update.
    */
  var MultiplexId: string = js.native
  /**
    * The new settings for a multiplex.
    */
  var MultiplexSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.MultiplexSettings] = js.native
  /**
    * Name of the multiplex.
    */
  var Name: js.UndefOr[string] = js.native
}

object UpdateMultiplexRequest {
  @scala.inline
  def apply(MultiplexId: string): UpdateMultiplexRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMultiplexRequest]
  }
  @scala.inline
  implicit class UpdateMultiplexRequestOps[Self <: UpdateMultiplexRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultiplexId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiplexId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiplexSettings(value: MultiplexSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiplexSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiplexSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiplexSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

