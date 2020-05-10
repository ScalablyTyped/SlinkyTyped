package typingsSlinky.flux.dispatcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dispatcher[TPayload] extends js.Object {
  /**
    * Dispatches a payload to all registered callbacks
    */
  def dispatch(payload: TPayload): Unit = js.native
  /**
    * Gets whether the dispatcher is currently dispatching
    */
  def isDispatching(): Boolean = js.native
  /**
    * Registers a callback that will be invoked with every payload sent to the dispatcher.
    * Returns a string token to identify the callback to be used with waitFor() or unregister.
    */
  def register(callback: js.Function1[/* payload */ TPayload, Unit]): String = js.native
  /**
    * Unregisters a callback with the given ID token
    */
  def unregister(id: String): Unit = js.native
  /**
    * Waits for the callbacks with the specified IDs to be invoked before continuing execution
    * of the current callback. This method should only be used by a callback in response
    * to a dispatched payload.
    */
  def waitFor(IDs: js.Array[String]): Unit = js.native
}

object Dispatcher {
  @scala.inline
  def apply[TPayload](
    dispatch: TPayload => Unit,
    isDispatching: () => Boolean,
    register: js.Function1[/* payload */ TPayload, Unit] => String,
    unregister: String => Unit,
    waitFor: js.Array[String] => Unit
  ): Dispatcher[TPayload] = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), isDispatching = js.Any.fromFunction0(isDispatching), register = js.Any.fromFunction1(register), unregister = js.Any.fromFunction1(unregister), waitFor = js.Any.fromFunction1(waitFor))
    __obj.asInstanceOf[Dispatcher[TPayload]]
  }
  @scala.inline
  implicit class DispatcherOps[Self[tpayload] <: Dispatcher[tpayload], TPayload] (val x: Self[TPayload]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TPayload] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TPayload]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TPayload] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TPayload] with Other]
    @scala.inline
    def withDispatch(value: TPayload => Unit): Self[TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsDispatching(value: () => Boolean): Self[TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDispatching")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegister(value: js.Function1[/* payload */ TPayload, Unit] => String): Self[TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnregister(value: String => Unit): Self[TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregister")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWaitFor(value: js.Array[String] => Unit): Self[TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitFor")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

