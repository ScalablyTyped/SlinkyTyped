package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deferred[T] extends js.Object {
  var _reject: js.Any = js.native
  var _resolve: js.Any = js.native
  /**
    * The promise associated with this deferred object.
    */
  val promise: js.Promise[T] = js.native
  /**
    * The reject method of the promise associated with this deferred object.
    */
  def reject: js.Function1[/* reason */ js.UndefOr[js.Any], Unit] = js.native
  /**
    * The resolve method of the promise associated with this deferred object.
    */
  def resolve: js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit] = js.native
}

object Deferred {
  @scala.inline
  def apply[T](
    _reject: js.Any,
    _resolve: js.Any,
    promise: js.Promise[T],
    reject: () => js.Function1[/* reason */ js.UndefOr[js.Any], Unit],
    resolve: () => js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit]
  ): Deferred[T] = {
    val __obj = js.Dynamic.literal(_reject = _reject.asInstanceOf[js.Any], _resolve = _resolve.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], reject = js.Any.fromFunction0(reject), resolve = js.Any.fromFunction0(resolve))
    __obj.asInstanceOf[Deferred[T]]
  }
  @scala.inline
  implicit class DeferredOps[Self[t] <: Deferred[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with_reject(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_reject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_resolve(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_resolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPromise(value: js.Promise[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReject(value: () => js.Function1[/* reason */ js.UndefOr[js.Any], Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResolve(value: () => js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

