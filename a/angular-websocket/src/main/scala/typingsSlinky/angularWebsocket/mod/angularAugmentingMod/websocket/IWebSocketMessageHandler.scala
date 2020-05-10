package typingsSlinky.angularWebsocket.mod.angularAugmentingMod.websocket

import org.scalajs.dom.raw.MessageEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Type corresponding to onMessage callbacks stored in $Websocket#onMessageCallbacks instance. */
@js.native
trait IWebSocketMessageHandler extends js.Object {
  var autoApply: Boolean = js.native
  var pattern: js.UndefOr[String | js.RegExp] = js.native
  def fn(evt: MessageEvent): Unit = js.native
}

object IWebSocketMessageHandler {
  @scala.inline
  def apply(autoApply: Boolean, fn: MessageEvent => Unit): IWebSocketMessageHandler = {
    val __obj = js.Dynamic.literal(autoApply = autoApply.asInstanceOf[js.Any], fn = js.Any.fromFunction1(fn))
    __obj.asInstanceOf[IWebSocketMessageHandler]
  }
  @scala.inline
  implicit class IWebSocketMessageHandlerOps[Self <: IWebSocketMessageHandler] (val x: Self) extends AnyVal {
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
    def withFn(value: MessageEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatternRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPattern(value: String | js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
  }
  
}

