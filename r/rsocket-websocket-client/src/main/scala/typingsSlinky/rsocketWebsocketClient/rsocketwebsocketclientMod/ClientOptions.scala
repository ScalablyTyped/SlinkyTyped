package typingsSlinky.rsocketWebsocketClient.rsocketwebsocketclientMod

import org.scalajs.dom.raw.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOptions extends js.Object {
  var debug: js.UndefOr[Boolean] = js.native
  var lengthPrefixedFrames: js.UndefOr[Boolean] = js.native
  var url: String = js.native
  var wsCreator: js.UndefOr[js.Function1[/* url */ String, WebSocket]] = js.native
}

object ClientOptions {
  @scala.inline
  def apply(url: String): ClientOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withLengthPrefixedFrames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthPrefixedFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLengthPrefixedFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthPrefixedFrames")(js.undefined)
        ret
    }
    @scala.inline
    def withWsCreator(value: /* url */ String => WebSocket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsCreator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWsCreator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsCreator")(js.undefined)
        ret
    }
  }
  
}

