package typingsSlinky.reactDom.testUtilsMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionalEventProperties extends js.Object {
  var bubbles: js.UndefOr[Boolean] = js.native
  var cancelable: js.UndefOr[Boolean] = js.native
  var currentTarget: js.UndefOr[EventTarget] = js.native
  var defaultPrevented: js.UndefOr[Boolean] = js.native
  var eventPhase: js.UndefOr[Double] = js.native
  var isTrusted: js.UndefOr[Boolean] = js.native
  var nativeEvent: js.UndefOr[Event] = js.native
  var preventDefault: js.UndefOr[js.Function0[Unit]] = js.native
  var stopPropagation: js.UndefOr[js.Function0[Unit]] = js.native
  var target: js.UndefOr[EventTarget] = js.native
  var timeStamp: js.UndefOr[js.Date] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object OptionalEventProperties {
  @scala.inline
  def apply(): OptionalEventProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalEventProperties]
  }
  @scala.inline
  implicit class OptionalEventPropertiesOps[Self <: OptionalEventProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBubbles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbles")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelable")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentTarget(value: EventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPrevented(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPrevented")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPrevented: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPrevented")(js.undefined)
        ret
    }
    @scala.inline
    def withEventPhase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventPhase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventPhase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventPhase")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTrusted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrusted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTrusted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrusted")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeEvent(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDefault(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPreventDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withStopPropagation(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutStopPropagation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: EventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeStamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeStamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStamp")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

