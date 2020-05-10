package typingsSlinky.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BridgeVideoSourceChanged extends Event {
  /* Properties */
  var bridge: Bridge = js.native
  var old_video_source_id: js.UndefOr[String] = js.native
}

object BridgeVideoSourceChanged {
  @scala.inline
  def apply(application: String, bridge: Bridge, timestamp: js.Date, `type`: String): BridgeVideoSourceChanged = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], bridge = bridge.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeVideoSourceChanged]
  }
  @scala.inline
  implicit class BridgeVideoSourceChangedOps[Self <: BridgeVideoSourceChanged] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBridge(value: Bridge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bridge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOld_video_source_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("old_video_source_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOld_video_source_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("old_video_source_id")(js.undefined)
        ret
    }
  }
  
}

