package typingsSlinky.firefoxWebextBrowser.browser.activityLog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityLogOnExtensionActivityEvent[TCallback] extends js.Object {
  def addListener(cb: TCallback, id: String): Unit = js.native
  def hasListener(cb: TCallback): Boolean = js.native
  def removeListener(cb: TCallback): Unit = js.native
}

object ActivityLogOnExtensionActivityEvent {
  @scala.inline
  def apply[TCallback](
    addListener: (TCallback, String) => Unit,
    hasListener: TCallback => Boolean,
    removeListener: TCallback => Unit
  ): ActivityLogOnExtensionActivityEvent[TCallback] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1(removeListener))
    __obj.asInstanceOf[ActivityLogOnExtensionActivityEvent[TCallback]]
  }
  @scala.inline
  implicit class ActivityLogOnExtensionActivityEventOps[Self[tcallback] <: ActivityLogOnExtensionActivityEvent[tcallback], TCallback] (val x: Self[TCallback]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TCallback] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TCallback]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TCallback] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TCallback] with Other]
    @scala.inline
    def withAddListener(value: (TCallback, String) => Unit): Self[TCallback] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHasListener(value: TCallback => Boolean): Self[TCallback] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveListener(value: TCallback => Unit): Self[TCallback] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

