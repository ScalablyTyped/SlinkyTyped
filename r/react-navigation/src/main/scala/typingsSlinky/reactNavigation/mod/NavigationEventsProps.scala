package typingsSlinky.reactNavigation.mod

import typingsSlinky.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationEventsProps extends ViewProps {
  var onDidBlur: js.UndefOr[NavigationEventCallback] = js.native
  var onDidFocus: js.UndefOr[NavigationEventCallback] = js.native
  var onWillBlur: js.UndefOr[NavigationEventCallback] = js.native
  var onWillFocus: js.UndefOr[NavigationEventCallback] = js.native
}

object NavigationEventsProps {
  @scala.inline
  def apply(): NavigationEventsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationEventsProps]
  }
  @scala.inline
  implicit class NavigationEventsPropsOps[Self <: NavigationEventsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnDidBlur(value: /* payload */ NavigationEventPayload => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDidBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDidFocus(value: /* payload */ NavigationEventPayload => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDidFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWillBlur(value: /* payload */ NavigationEventPayload => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWillBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWillBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWillBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWillFocus(value: /* payload */ NavigationEventPayload => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWillFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWillFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWillFocus")(js.undefined)
        ret
    }
  }
  
}

