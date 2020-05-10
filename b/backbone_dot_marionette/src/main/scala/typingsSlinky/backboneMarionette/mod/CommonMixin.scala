package typingsSlinky.backboneMarionette.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonMixin extends js.Object {
  var bindEvents: js.Any = js.native
  var getOption: js.Any = js.native
  var mergeOptions: js.Any = js.native
  var normalizeMethods: js.Any = js.native
  var unbindEvents: js.Any = js.native
}

object CommonMixin {
  @scala.inline
  def apply(
    bindEvents: js.Any,
    getOption: js.Any,
    mergeOptions: js.Any,
    normalizeMethods: js.Any,
    unbindEvents: js.Any
  ): CommonMixin = {
    val __obj = js.Dynamic.literal(bindEvents = bindEvents.asInstanceOf[js.Any], getOption = getOption.asInstanceOf[js.Any], mergeOptions = mergeOptions.asInstanceOf[js.Any], normalizeMethods = normalizeMethods.asInstanceOf[js.Any], unbindEvents = unbindEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonMixin]
  }
  @scala.inline
  implicit class CommonMixinOps[Self <: CommonMixin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindEvents(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetOption(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalizeMethods(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnbindEvents(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unbindEvents")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

