package typingsSlinky.mysticateaSpy.mod.Spy_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information for calls on a spy. */
@js.native
trait CallInformation[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends js.Object {
  /** Information for each call. */
  val calls: js.Array[Call[T]] = js.native
  /** Information of the first call. */
  val firstCall: Call[T] | Null = js.native
  /** Information of the first returned call. */
  val firstReturnedCall: ReturnedCall[T] | Null = js.native
  /** Information of the first thrown call. */
  val firstThrownCall: ThrownCall[T] | Null = js.native
  /** Information of the last call. */
  val lastCall: Call[T] | Null = js.native
  /** Information of the last returned call. */
  val lastReturnedCall: ReturnedCall[T] | Null = js.native
  /** Information of the last thrown call. */
  val lastThrownCall: ThrownCall[T] | Null = js.native
  /** Information for each returned call. */
  val returnedCalls: js.Array[ReturnedCall[T]] = js.native
  /** Information for each thrown call. */
  val thrownCalls: js.Array[ThrownCall[T]] = js.native
  /** Reset calls. */
  def reset(): Unit = js.native
}

object CallInformation {
  @scala.inline
  def apply[T](
    calls: js.Array[Call[T]],
    reset: () => Unit,
    returnedCalls: js.Array[ReturnedCall[T]],
    thrownCalls: js.Array[ThrownCall[T]]
  ): CallInformation[T] = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), returnedCalls = returnedCalls.asInstanceOf[js.Any], thrownCalls = thrownCalls.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallInformation[T]]
  }
  @scala.inline
  implicit class CallInformationOps[Self[t] <: CallInformation[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCalls(value: js.Array[Call[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReturnedCalls(value: js.Array[ReturnedCall[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnedCalls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThrownCalls(value: js.Array[ThrownCall[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thrownCalls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstCall(value: Call[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstCall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstCallNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstCall")(null)
        ret
    }
    @scala.inline
    def withFirstReturnedCall(value: ReturnedCall[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstReturnedCall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstReturnedCallNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstReturnedCall")(null)
        ret
    }
    @scala.inline
    def withFirstThrownCall(value: ThrownCall[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstThrownCall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstThrownCallNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstThrownCall")(null)
        ret
    }
    @scala.inline
    def withLastCall(value: Call[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastCall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastCallNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastCall")(null)
        ret
    }
    @scala.inline
    def withLastReturnedCall(value: ReturnedCall[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastReturnedCall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastReturnedCallNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastReturnedCall")(null)
        ret
    }
    @scala.inline
    def withLastThrownCall(value: ThrownCall[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastThrownCall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastThrownCallNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastThrownCall")(null)
        ret
    }
  }
  
}

