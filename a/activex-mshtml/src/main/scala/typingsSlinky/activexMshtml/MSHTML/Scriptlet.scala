package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scriptlet extends js.Object {
  @JSName("MSHTML.Scriptlet_typekey")
  var MSHTMLDotScriptlet_typekey: Scriptlet = js.native
  var Scrollbar: Boolean = js.native
  var embed: Boolean = js.native
  val event: js.Any = js.native
  val readyState: Double = js.native
  var url: String = js.native
  def AboutBox(): Unit = js.native
}

object Scriptlet {
  @scala.inline
  def apply(
    AboutBox: () => Unit,
    MSHTMLDotScriptlet_typekey: Scriptlet,
    Scrollbar: Boolean,
    embed: Boolean,
    event: js.Any,
    readyState: Double,
    url: String
  ): Scriptlet = {
    val __obj = js.Dynamic.literal(AboutBox = js.Any.fromFunction0(AboutBox), Scrollbar = Scrollbar.asInstanceOf[js.Any], embed = embed.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.Scriptlet_typekey")(MSHTMLDotScriptlet_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scriptlet]
  }
  @scala.inline
  implicit class ScriptletOps[Self <: Scriptlet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAboutBox(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AboutBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMSHTMLDotScriptlet_typekey(value: Scriptlet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.Scriptlet_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmbed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadyState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readyState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

