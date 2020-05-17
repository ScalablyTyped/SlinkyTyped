package typingsSlinky.jpm.anon

import typingsSlinky.jpm.FFAddonSDK.FrameEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Name extends js.Object {
  var name: js.UndefOr[String] = js.native
  var onAttach: js.UndefOr[js.Function1[/* event */ FrameEvent, _]] = js.native
  var onDetach: js.UndefOr[js.Function1[/* event */ FrameEvent, _]] = js.native
  var onLoad: js.UndefOr[js.Function1[/* event */ FrameEvent, _]] = js.native
  var onMessage: js.UndefOr[js.Function1[/* message */ FrameEvent, _]] = js.native
  var onReady: js.UndefOr[js.Function1[/* event */ FrameEvent, _]] = js.native
  var url: String = js.native
}

object Name {
  @scala.inline
  def apply(url: String): Name = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  @scala.inline
  implicit class NameOps[Self <: Name] (val x: Self) extends AnyVal {
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAttach(value: /* event */ FrameEvent => _): Self = {
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
    def withOnDetach(value: /* event */ FrameEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDetach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDetach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDetach")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: /* event */ FrameEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMessage(value: /* message */ FrameEvent => _): Self = {
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
    @scala.inline
    def withOnReady(value: /* event */ FrameEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.undefined)
        ret
    }
  }
  
}

