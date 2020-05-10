package typingsSlinky.angularWebsocket.mod.angularAugmentingMod.websocket

import typingsSlinky.angular.mod.IScope
import typingsSlinky.angularWebsocket.angularWebsocketStrings.arraybuffer
import typingsSlinky.angularWebsocket.angularWebsocketStrings.blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options available to be specified for IWebSocketProvider.
  */
@js.native
trait IWebSocketConfigOptions extends js.Object {
  var binaryType: js.UndefOr[blob | arraybuffer] = js.native
  var initialTimeout: js.UndefOr[Double] = js.native
  var maxTimeout: js.UndefOr[Double] = js.native
  var reconnectIfNotNormalClose: js.UndefOr[Boolean] = js.native
  var rootScopeFailOver: js.UndefOr[Boolean] = js.native
  var scope: js.UndefOr[IScope] = js.native
  var useApplyAsync: js.UndefOr[Boolean] = js.native
}

object IWebSocketConfigOptions {
  @scala.inline
  def apply(): IWebSocketConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebSocketConfigOptions]
  }
  @scala.inline
  implicit class IWebSocketConfigOptionsOps[Self <: IWebSocketConfigOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinaryType(value: blob | arraybuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinaryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryType")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnectIfNotNormalClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectIfNotNormalClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnectIfNotNormalClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectIfNotNormalClose")(js.undefined)
        ret
    }
    @scala.inline
    def withRootScopeFailOver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootScopeFailOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootScopeFailOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootScopeFailOver")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: IScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withUseApplyAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useApplyAsync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseApplyAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useApplyAsync")(js.undefined)
        ret
    }
  }
  
}

