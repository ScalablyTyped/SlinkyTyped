package typingsSlinky.angularRouter.mod

import typingsSlinky.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanActivateChild extends js.Object {
  def canActivateChild(childRoute: ActivatedRouteSnapshot, state: RouterStateSnapshot): (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree = js.native
}

object CanActivateChild {
  @scala.inline
  def apply(
    canActivateChild: (ActivatedRouteSnapshot, RouterStateSnapshot) => (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
  ): CanActivateChild = {
    val __obj = js.Dynamic.literal(canActivateChild = js.Any.fromFunction2(canActivateChild))
    __obj.asInstanceOf[CanActivateChild]
  }
  @scala.inline
  implicit class CanActivateChildOps[Self <: CanActivateChild] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanActivateChild(
      value: (ActivatedRouteSnapshot, RouterStateSnapshot) => (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canActivateChild")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

