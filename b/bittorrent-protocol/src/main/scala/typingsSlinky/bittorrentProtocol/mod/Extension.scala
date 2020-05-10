package typingsSlinky.bittorrentProtocol.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extension extends js.Object {
  var name: String = js.native
  var onExtendedHandshake: js.UndefOr[js.Function1[/* handshake */ StringDictionary[js.Any], Unit]] = js.native
  var onHandshake: js.UndefOr[
    js.Function3[
      /* infoHash */ String, 
      /* peerId */ String, 
      /* extensions */ StringDictionary[Boolean], 
      Unit
    ]
  ] = js.native
  var onMessage: js.UndefOr[js.Function1[/* buf */ Buffer, Unit]] = js.native
}

object Extension {
  @scala.inline
  def apply(name: String): Extension = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension]
  }
  @scala.inline
  implicit class ExtensionOps[Self <: Extension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnExtendedHandshake(value: /* handshake */ StringDictionary[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExtendedHandshake")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnExtendedHandshake: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExtendedHandshake")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHandshake(
      value: (/* infoHash */ String, /* peerId */ String, /* extensions */ StringDictionary[Boolean]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHandshake")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnHandshake: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHandshake")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMessage(value: /* buf */ Buffer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(js.undefined)
        ret
    }
  }
  
}

