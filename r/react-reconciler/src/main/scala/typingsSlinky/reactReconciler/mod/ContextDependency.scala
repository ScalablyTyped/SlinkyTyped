package typingsSlinky.reactReconciler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// react-reconciler/ReactFiberNewContext
@js.native
trait ContextDependency[T] extends js.Object {
  var context: ReactContext[T] = js.native
  var next: ContextDependency[_] | Null = js.native
  var observedBits: Double = js.native
}

object ContextDependency {
  @scala.inline
  def apply[T](context: ReactContext[T], observedBits: Double): ContextDependency[T] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], observedBits = observedBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextDependency[T]]
  }
  @scala.inline
  implicit class ContextDependencyOps[Self[t] <: ContextDependency[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withContext(value: ReactContext[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObservedBits(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observedBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: ContextDependency[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(null)
        ret
    }
  }
  
}

