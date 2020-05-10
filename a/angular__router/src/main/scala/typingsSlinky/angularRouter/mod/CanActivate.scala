package typingsSlinky.angularRouter.mod

import typingsSlinky.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanActivate extends js.Object {
  def canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree = js.native
}

object CanActivate {
  @scala.inline
  def apply(
    canActivate: (ActivatedRouteSnapshot, RouterStateSnapshot) => (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
  ): CanActivate = {
    val __obj = js.Dynamic.literal(canActivate = js.Any.fromFunction2(canActivate))
    __obj.asInstanceOf[CanActivate]
  }
  @scala.inline
  implicit class CanActivateOps[Self <: CanActivate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanActivate(
      value: (ActivatedRouteSnapshot, RouterStateSnapshot) => (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canActivate")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

