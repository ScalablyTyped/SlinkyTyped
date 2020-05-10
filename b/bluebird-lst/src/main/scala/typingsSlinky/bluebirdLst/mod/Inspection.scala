package typingsSlinky.bluebirdLst.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inspection[R] extends js.Object {
  /**
    * See if the underlying promise was cancelled at the creation time of this inspection object.
    */
  def isCancelled(): Boolean = js.native
  /**
    * See if the underlying promise was fulfilled at the creation time of this inspection object.
    */
  def isFulfilled(): Boolean = js.native
  /**
    * See if the underlying promise was defer at the creation time of this inspection object.
    */
  def isPending(): Boolean = js.native
  /**
    * See if the underlying promise was rejected at the creation time of this inspection object.
    */
  def isRejected(): Boolean = js.native
  /**
    * Get the rejection reason for the underlying promise. Throws if the promise wasn't rejected at the creation time of this inspection object.
    *
    * throws `TypeError`
    */
  def reason(): js.Any = js.native
  /**
    * Get the fulfillment value of the underlying promise. Throws if the promise wasn't fulfilled at the creation time of this inspection object.
    *
    * throws `TypeError`
    */
  def value(): R = js.native
}

object Inspection {
  @scala.inline
  def apply[R](
    isCancelled: () => Boolean,
    isFulfilled: () => Boolean,
    isPending: () => Boolean,
    isRejected: () => Boolean,
    reason: () => js.Any,
    value: () => R
  ): Inspection[R] = {
    val __obj = js.Dynamic.literal(isCancelled = js.Any.fromFunction0(isCancelled), isFulfilled = js.Any.fromFunction0(isFulfilled), isPending = js.Any.fromFunction0(isPending), isRejected = js.Any.fromFunction0(isRejected), reason = js.Any.fromFunction0(reason), value = js.Any.fromFunction0(value))
    __obj.asInstanceOf[Inspection[R]]
  }
  @scala.inline
  implicit class InspectionOps[Self[r] <: Inspection[r], R] (val x: Self[R]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[R] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[R] with Other]
    @scala.inline
    def withIsCancelled(value: () => Boolean): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCancelled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFulfilled(value: () => Boolean): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFulfilled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsPending(value: () => Boolean): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPending")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsRejected(value: () => Boolean): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRejected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReason(value: () => js.Any): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValue(value: () => R): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

