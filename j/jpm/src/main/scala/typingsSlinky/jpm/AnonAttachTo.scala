package typingsSlinky.jpm

import typingsSlinky.jpm.FFAddonSDK.ContentWorker
import typingsSlinky.jpm.jpmStrings.end
import typingsSlinky.jpm.jpmStrings.ready
import typingsSlinky.jpm.jpmStrings.start
import typingsSlinky.jpm.pageModMod.attachmentMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttachTo extends js.Object {
  var attachTo: js.UndefOr[attachmentMode | js.Array[attachmentMode]] = js.native
  var contentScript: js.UndefOr[String | js.Array[String]] = js.native
  var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.native
  var contentScriptOptions: js.UndefOr[js.Any] = js.native
  var contentScriptWhen: js.UndefOr[start | ready | end] = js.native
  var contentStyle: js.UndefOr[String | js.Array[String]] = js.native
  var contentStyleFile: js.UndefOr[String | js.Array[String]] = js.native
  var exclude: js.UndefOr[String | js.Array[String]] = js.native
  var include: String | (js.Array[js.RegExp | String]) | js.RegExp = js.native
  var onAttach: js.UndefOr[js.Function1[/* worker */ ContentWorker, _]] = js.native
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, _]] = js.native
}

object AnonAttachTo {
  @scala.inline
  def apply(include: String | (js.Array[js.RegExp | String]) | js.RegExp): AnonAttachTo = {
    val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttachTo]
  }
  @scala.inline
  implicit class AnonAttachToOps[Self <: AnonAttachTo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withAttachTo(value: attachmentMode | js.Array[attachmentMode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachTo")(js.undefined)
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
    def withContentStyle(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withContentStyleFile(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentStyleFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentStyleFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentStyleFile")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAttach(value: /* worker */ ContentWorker => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAttach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAttach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAttach")(js.undefined)
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
  }
  
}

