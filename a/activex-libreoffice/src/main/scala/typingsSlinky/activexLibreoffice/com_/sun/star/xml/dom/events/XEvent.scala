package typingsSlinky.activexLibreoffice.com_.sun.star.xml.dom.events

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XEvent extends XInterface {
  val Bubbles: Boolean = js.native
  val Cancelable: Boolean = js.native
  val CurrentTarget: XEventTarget = js.native
  val EventPhase: PhaseType = js.native
  val Target: XEventTarget = js.native
  val TimeStamp: Time = js.native
  val Type: String = js.native
  def getBubbles(): Boolean = js.native
  def getCancelable(): Boolean = js.native
  def getCurrentTarget(): XEventTarget = js.native
  def getEventPhase(): PhaseType = js.native
  def getTarget(): XEventTarget = js.native
  def getTimeStamp(): Time = js.native
  def getType(): String = js.native
  def initEvent(eventTypeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean): Unit = js.native
  def preventDefault(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

object XEvent {
  @scala.inline
  def apply(
    Bubbles: Boolean,
    Cancelable: Boolean,
    CurrentTarget: XEventTarget,
    EventPhase: PhaseType,
    Target: XEventTarget,
    TimeStamp: Time,
    Type: String,
    acquire: () => Unit,
    getBubbles: () => Boolean,
    getCancelable: () => Boolean,
    getCurrentTarget: () => XEventTarget,
    getEventPhase: () => PhaseType,
    getTarget: () => XEventTarget,
    getTimeStamp: () => Time,
    getType: () => String,
    initEvent: (String, Boolean, Boolean) => Unit,
    preventDefault: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    stopPropagation: () => Unit
  ): XEvent = {
    val __obj = js.Dynamic.literal(Bubbles = Bubbles.asInstanceOf[js.Any], Cancelable = Cancelable.asInstanceOf[js.Any], CurrentTarget = CurrentTarget.asInstanceOf[js.Any], EventPhase = EventPhase.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], TimeStamp = TimeStamp.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getBubbles = js.Any.fromFunction0(getBubbles), getCancelable = js.Any.fromFunction0(getCancelable), getCurrentTarget = js.Any.fromFunction0(getCurrentTarget), getEventPhase = js.Any.fromFunction0(getEventPhase), getTarget = js.Any.fromFunction0(getTarget), getTimeStamp = js.Any.fromFunction0(getTimeStamp), getType = js.Any.fromFunction0(getType), initEvent = js.Any.fromFunction3(initEvent), preventDefault = js.Any.fromFunction0(preventDefault), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.asInstanceOf[XEvent]
  }
  @scala.inline
  implicit class XEventOps[Self <: XEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBubbles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bubbles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancelable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTarget(value: XEventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventPhase(value: PhaseType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventPhase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: XEventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeStamp(value: Time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeStamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetBubbles(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBubbles")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCancelable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCancelable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentTarget(value: () => XEventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentTarget")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEventPhase(value: () => PhaseType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEventPhase")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTarget(value: () => XEventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTarget")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTimeStamp(value: () => Time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimeStamp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitEvent(value: (String, Boolean, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initEvent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPreventDefault(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopPropagation(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

