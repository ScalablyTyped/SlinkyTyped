package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexOutputDestination extends js.Object {
  /**
    * Multiplex MediaConnect output destination settings.
    */
  var MediaConnectSettings: js.UndefOr[MultiplexMediaConnectOutputDestinationSettings] = js.native
}

object MultiplexOutputDestination {
  @scala.inline
  def apply(): MultiplexOutputDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexOutputDestination]
  }
  @scala.inline
  implicit class MultiplexOutputDestinationOps[Self <: MultiplexOutputDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMediaConnectSettings(value: MultiplexMediaConnectOutputDestinationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaConnectSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaConnectSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaConnectSettings")(js.undefined)
        ret
    }
  }
  
}

