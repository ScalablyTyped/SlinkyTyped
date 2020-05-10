package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2Surface extends js.Object {
  /**
    * A list of capabilities the surface supports at the time of the request
    * e.g. `actions.capability.AUDIO_OUTPUT`
    */
  var capabilities: js.UndefOr[js.Array[GoogleActionsV2Capability]] = js.native
}

object GoogleActionsV2Surface {
  @scala.inline
  def apply(): GoogleActionsV2Surface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2Surface]
  }
  @scala.inline
  implicit class GoogleActionsV2SurfaceOps[Self <: GoogleActionsV2Surface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapabilities(value: js.Array[GoogleActionsV2Capability]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(js.undefined)
        ret
    }
  }
  
}

