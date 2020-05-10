package typingsSlinky.angularWebsocket.mod.angularAugmentingMod.websocket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options available to be specified for IWebSocket.onMessage */
@js.native
trait IWebSocketMessageOptions extends js.Object {
  /** If true, each message handled will safely call `$rootScope.$digest()`. */
  var autoApply: js.UndefOr[Boolean] = js.native
  /**
    * If specified, only messages that match the filter will cause the message event
    * to be fired.
    */
  var filter: js.UndefOr[String | js.RegExp] = js.native
}

object IWebSocketMessageOptions {
  @scala.inline
  def apply(): IWebSocketMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebSocketMessageOptions]
  }
  @scala.inline
  implicit class IWebSocketMessageOptionsOps[Self <: IWebSocketMessageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoApply(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoApply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoApply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoApply")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: String | js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
  }
  
}

