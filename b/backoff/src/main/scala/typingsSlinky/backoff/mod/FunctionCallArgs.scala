package typingsSlinky.backoff.mod

import typingsSlinky.backoff.backoffStrings.callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionCallArgs[E, R1, R2, R3] extends js.Object {
  /**
    * Emitted each time the wrapped function invokes its callback
    * @param results: wrapped function's return values
    */
  @JSName("addListener")
  def addListener_callback(event: callback, listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]): this.type = js.native
  @JSName("emit")
  def emit_callback(event: callback, results: js.Tuple4[E, R1, R2, R3]): Boolean = js.native
  /**
    * Returns an array containing the last arguments passed to the completion callback
    * of the wrapped function. For example, to get the error code returned by the last
    * call, one would do the following.
    *
    * ``` js
    * var results = call.getLastResult();
    * // The error code is the first parameter of the callback.
    * var error = results[0];
    * ```
    *
    * Note that if the call was aborted, it will contain the abort error and not the
    * last error returned by the wrapped function.
    */
  def getLastResult(): js.Tuple4[E, R1, R2, R3] = js.native
  @JSName("listeners")
  def listeners_callback(event: callback): js.Array[js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]] = js.native
  @JSName("on")
  def on_callback(event: callback, listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]): this.type = js.native
  @JSName("once")
  def once_callback(event: callback, listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_callback(event: callback, listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_callback(event: callback, listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_callback(event: callback, listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]): this.type = js.native
}

object FunctionCallArgs {
  @scala.inline
  def apply[E, R1, R2, R3](
    addListener: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3],
    emit: (callback, js.Tuple4[E, R1, R2, R3]) => Boolean,
    getLastResult: () => js.Tuple4[E, R1, R2, R3],
    listeners: callback => js.Array[js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]],
    on: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3],
    once: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3],
    prependListener: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3],
    prependOnceListener: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3],
    removeListener: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3]
  ): FunctionCallArgs[E, R1, R2, R3] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), emit = js.Any.fromFunction2(emit), getLastResult = js.Any.fromFunction0(getLastResult), listeners = js.Any.fromFunction1(listeners), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), prependListener = js.Any.fromFunction2(prependListener), prependOnceListener = js.Any.fromFunction2(prependOnceListener), removeListener = js.Any.fromFunction2(removeListener))
    __obj.asInstanceOf[FunctionCallArgs[E, R1, R2, R3]]
  }
  @scala.inline
  implicit class FunctionCallArgsOps[Self[e, r1, r2, r3] <: FunctionCallArgs[e, r1, r2, r3], E, R1, R2, R3] (val x: Self[E, R1, R2, R3]) extends AnyVal {
    @scala.inline
    def duplicate: Self[E, R1, R2, R3] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[E, R1, R2, R3]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[E, R1, R2, R3]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[E, R1, R2, R3]) with Other]
    @scala.inline
    def withAddListener(
      value: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3]
    ): Self[E, R1, R2, R3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEmit(value: (callback, js.Tuple4[E, R1, R2, R3]) => Boolean): Self[E, R1, R2, R3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetLastResult(value: () => js.Tuple4[E, R1, R2, R3]): Self[E, R1, R2, R3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLastResult")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withListeners(value: callback => js.Array[js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]]): Self[E, R1, R2, R3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listeners")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOn(
      value: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3]
    ): Self[E, R1, R2, R3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnce(
      value: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3]
    ): Self[E, R1, R2, R3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPrependListener(
      value: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3]
    ): Self[E, R1, R2, R3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prependListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPrependOnceListener(
      value: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3]
    ): Self[E, R1, R2, R3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prependOnceListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveListener(
      value: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3]
    ): Self[E, R1, R2, R3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeListener")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

