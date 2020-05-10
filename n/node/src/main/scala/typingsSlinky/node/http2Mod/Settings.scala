package typingsSlinky.node.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var enableConnectProtocol: js.UndefOr[Boolean] = js.native
  var enablePush: js.UndefOr[Boolean] = js.native
  var headerTableSize: js.UndefOr[Double] = js.native
  var initialWindowSize: js.UndefOr[Double] = js.native
  var maxConcurrentStreams: js.UndefOr[Double] = js.native
  var maxFrameSize: js.UndefOr[Double] = js.native
  var maxHeaderListSize: js.UndefOr[Double] = js.native
}

object Settings {
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableConnectProtocol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableConnectProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableConnectProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableConnectProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePush(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePush")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTableSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTableSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTableSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTableSize")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialWindowSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialWindowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialWindowSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialWindowSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConcurrentStreams(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrentStreams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConcurrentStreams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrentStreams")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFrameSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFrameSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFrameSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFrameSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeaderListSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeaderListSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeaderListSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeaderListSize")(js.undefined)
        ret
    }
  }
  
}

