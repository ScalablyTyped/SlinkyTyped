package typingsSlinky.jupyterlabCoreutils.interfacesMod

import typingsSlinky.phosphorDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRateLimiter[T, U] extends IDisposable {
  /**
    * The rate limit in milliseconds.
    */
  val limit: Double = js.native
  /**
    * Invoke the rate limited function.
    */
  def invoke(): js.Promise[T] = js.native
  /**
    * Stop the function if it is mid-flight.
    */
  def stop(): js.Promise[Unit] = js.native
}

object IRateLimiter {
  @scala.inline
  def apply[T, U](
    dispose: () => Unit,
    invoke: () => js.Promise[T],
    isDisposed: Boolean,
    limit: Double,
    stop: () => js.Promise[Unit]
  ): IRateLimiter[T, U] = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), invoke = js.Any.fromFunction0(invoke), isDisposed = isDisposed.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[IRateLimiter[T, U]]
  }
  @scala.inline
  implicit class IRateLimiterOps[Self[t, u] <: IRateLimiter[t, u], T, U] (val x: Self[T, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U]) with Other]
    @scala.inline
    def withInvoke(value: () => js.Promise[T]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoke")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStop(value: () => js.Promise[Unit]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

