package typingsSlinky.firebaseDatabase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddExpectedEvents extends js.Object {
  var initPromise: js.Promise[_] = js.native
  var promise: js.Promise[_] = js.native
  def addExpectedEvents(moreEvents: js.Any): Unit = js.native
  def unregister(): Unit = js.native
  def waiter(): Boolean = js.native
  def watchesInitializedWaiter(): Boolean = js.native
}

object AnonAddExpectedEvents {
  @scala.inline
  def apply(
    addExpectedEvents: js.Any => Unit,
    initPromise: js.Promise[_],
    promise: js.Promise[_],
    unregister: () => Unit,
    waiter: () => Boolean,
    watchesInitializedWaiter: () => Boolean
  ): AnonAddExpectedEvents = {
    val __obj = js.Dynamic.literal(addExpectedEvents = js.Any.fromFunction1(addExpectedEvents), initPromise = initPromise.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], unregister = js.Any.fromFunction0(unregister), waiter = js.Any.fromFunction0(waiter), watchesInitializedWaiter = js.Any.fromFunction0(watchesInitializedWaiter))
    __obj.asInstanceOf[AnonAddExpectedEvents]
  }
  @scala.inline
  implicit class AnonAddExpectedEventsOps[Self <: AnonAddExpectedEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddExpectedEvents(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addExpectedEvents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInitPromise(value: js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initPromise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPromise(value: js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnregister(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregister")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWaiter(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waiter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWatchesInitializedWaiter(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchesInitializedWaiter")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

