package typingsSlinky.jpm.anon

import typingsSlinky.jpm.contextMenuMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessKey extends js.Object {
  var accessKey: js.UndefOr[String] = js.native
  var contentScript: js.UndefOr[String] = js.native
  var contentScriptFile: js.UndefOr[String] = js.native
  var context: js.UndefOr[Context | js.Array[Context]] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var image: js.UndefOr[String] = js.native
  var label: String = js.native
  var onMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[js.Any], _]] = js.native
}

object AccessKey {
  @scala.inline
  def apply(label: String): AccessKey = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessKey]
  }
  @scala.inline
  implicit class AccessKeyOps[Self <: AccessKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKey")(js.undefined)
        ret
    }
    @scala.inline
    def withContentScript(value: String): Self = {
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
    def withContentScriptFile(value: String): Self = {
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
    def withContext(value: Context | js.Array[Context]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMessage(value: /* message */ js.UndefOr[js.Any] => _): Self = {
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

