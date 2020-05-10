package typingsSlinky.jpm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContentScriptOptions extends js.Object {
  var contentScript: js.UndefOr[String | js.Array[String]] = js.native
  var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.native
  var contentScriptOptions: js.UndefOr[js.Object] = js.native
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, _]] = js.native
  var onMessage: js.UndefOr[js.Function1[/* message */ String, _]] = js.native
}

object AnonContentScriptOptions {
  @scala.inline
  def apply(): AnonContentScriptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonContentScriptOptions]
  }
  @scala.inline
  implicit class AnonContentScriptOptionsOps[Self <: AnonContentScriptOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withContentScriptOptions(value: js.Object): Self = {
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
    def withOnError(value: /* error */ js.Error => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
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

