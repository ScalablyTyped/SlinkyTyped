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
  def apply(MultiplexId: string, MultiplexSettings: MultiplexSettings = null, Name: string = null): UpdateMultiplexRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any])
    if (MultiplexSettings != null) __obj.updateDynamic("MultiplexSettings")(MultiplexSettings.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMultiplexRequest]
  }
}

