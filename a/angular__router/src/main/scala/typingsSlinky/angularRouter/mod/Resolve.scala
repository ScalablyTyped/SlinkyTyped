package typingsSlinky.angularRouter.mod

import typingsSlinky.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resolve[T] extends js.Object {
  def resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable_[T] | js.Promise[T] | T = js.native
}

object Resolve {
  @scala.inline
  def apply[T](resolve: (ActivatedRouteSnapshot, RouterStateSnapshot) => Observable_[T] | js.Promise[T] | T): Resolve[T] = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction2(resolve))
    __obj.asInstanceOf[Resolve[T]]
  }
  @scala.inline
  implicit class ResolveOps[Self[t] <: Resolve[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withResolve(value: (ActivatedRouteSnapshot, RouterStateSnapshot) => Observable_[T] | js.Promise[T] | T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

