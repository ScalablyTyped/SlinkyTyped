package typingsSlinky.angularPromiseTracker.mod.promisetracker

import typingsSlinky.angular.mod.IDeferred
import typingsSlinky.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseTracker extends js.Object {
  def active(): Boolean = js.native
  def addPromise[T](promise: IPromise[T]): IDeferred[Unit] = js.native
  def cancel(): Unit = js.native
  def createPromise(): IDeferred[Unit] = js.native
  def tracking(): Boolean = js.native
  def trackingCount(): Double = js.native
}

object PromiseTracker {
  @scala.inline
  def apply(
    active: () => Boolean,
    addPromise: IPromise[js.Any] => IDeferred[Unit],
    cancel: () => Unit,
    createPromise: () => IDeferred[Unit],
    tracking: () => Boolean,
    trackingCount: () => Double
  ): PromiseTracker = {
    val __obj = js.Dynamic.literal(active = js.Any.fromFunction0(active), addPromise = js.Any.fromFunction1(addPromise), cancel = js.Any.fromFunction0(cancel), createPromise = js.Any.fromFunction0(createPromise), tracking = js.Any.fromFunction0(tracking), trackingCount = js.Any.fromFunction0(trackingCount))
    __obj.asInstanceOf[PromiseTracker]
  }
  @scala.inline
  implicit class PromiseTrackerOps[Self <: PromiseTracker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddPromise(value: IPromise[js.Any] => IDeferred[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPromise")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreatePromise(value: () => IDeferred[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createPromise")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTracking(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracking")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTrackingCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingCount")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

