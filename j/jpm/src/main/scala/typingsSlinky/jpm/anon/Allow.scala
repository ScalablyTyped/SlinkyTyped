package typingsSlinky.jpm.anon

import typingsSlinky.jpm.jpmStrings.end
import typingsSlinky.jpm.jpmStrings.ready
import typingsSlinky.jpm.jpmStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Allow extends js.Object {
  var allow: js.UndefOr[Script] = js.native
  var contentScript: js.UndefOr[String | js.Array[String]] = js.native
  var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.native
  var contentScriptOptions: js.UndefOr[js.Any] = js.native
  var contentScriptWhen: js.UndefOr[start | ready | end] = js.native
  var contentURL: js.UndefOr[String] = js.native
  var include: js.UndefOr[String | (js.Array[js.RegExp | String]) | js.RegExp] = js.native
  var onMessage: js.UndefOr[js.Function1[/* message */ String, _]] = js.native
}

object Allow {
  @scala.inline
  def apply(): Allow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Allow]
  }
  @scala.inline
  implicit class AllowOps[Self <: Allow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow(value: Script): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow")(js.undefined)
        ret
    }
    @scala.inline
    def withContentScript(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentScript")(js.undefined)
        ret
    }
    @scala.inline
    def withContentScriptFile(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentScriptFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentScriptFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentScriptFile")(js.undefined)
        ret
    }
    @scala.inline
    def withContentScriptOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentScriptOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentScriptOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentScriptOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withContentScriptWhen(value: start | ready | end): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentScriptWhen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentScriptWhen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentScriptWhen")(js.undefined)
        ret
    }
    @scala.inline
    def withContentURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentURL")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInclude(value: String | (js.Array[js.RegExp | String]) | js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMessage(value: /* message */ String => _): Self = {
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

