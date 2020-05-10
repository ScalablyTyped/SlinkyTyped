package typingsSlinky.backboneMarionette.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioMixin extends js.Object {
  var bindEvents: js.Any = js.native
  var bindRequests: js.Any = js.native
  var getChannel: js.Any = js.native
  var unbindEvents: js.Any = js.native
  var unbindRequests: js.Any = js.native
}

object RadioMixin {
  @scala.inline
  def apply(
    bindEvents: js.Any,
    bindRequests: js.Any,
    getChannel: js.Any,
    unbindEvents: js.Any,
    unbindRequests: js.Any
  ): RadioMixin = {
    val __obj = js.Dynamic.literal(bindEvents = bindEvents.asInstanceOf[js.Any], bindRequests = bindRequests.asInstanceOf[js.Any], getChannel = getChannel.asInstanceOf[js.Any], unbindEvents = unbindEvents.asInstanceOf[js.Any], unbindRequests = unbindRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioMixin]
  }
  @scala.inline
  implicit class RadioMixinOps[Self <: RadioMixin] (val x: Self) extends AnyVal {
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
    def withBindRequests(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetChannel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChannel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnbindEvents(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unbindEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnbindRequests(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unbindRequests")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

