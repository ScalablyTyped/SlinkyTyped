package typingsSlinky.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectInfo extends js.Object {
  /**
    * Open a port to a specific frame identified by frameId instead of all frames in the tab.
    * @since Chrome 41.
    */
  var frameId: js.UndefOr[Double] = js.native
  /** Optional. Will be passed into onConnect for content scripts that are listening for the connection event. */
  var name: js.UndefOr[String] = js.native
}

object ConnectInfo {
  @scala.inline
  def apply(): ConnectInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectInfo]
  }
  @scala.inline
  implicit class ConnectInfoOps[Self <: ConnectInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrameId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

