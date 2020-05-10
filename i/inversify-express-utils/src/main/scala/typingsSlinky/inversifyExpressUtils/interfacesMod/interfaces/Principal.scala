package typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Principal extends js.Object {
  var details: js.Any = js.native
  def isAuthenticated(): js.Promise[Boolean] = js.native
  def isInRole(role: String): js.Promise[Boolean] = js.native
  def isResourceOwner(resourceId: js.Any): js.Promise[Boolean] = js.native
}

object Principal {
  @scala.inline
  def apply(
    details: js.Any,
    isAuthenticated: () => js.Promise[Boolean],
    isInRole: String => js.Promise[Boolean],
    isResourceOwner: js.Any => js.Promise[Boolean]
  ): Principal = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], isAuthenticated = js.Any.fromFunction0(isAuthenticated), isInRole = js.Any.fromFunction1(isInRole), isResourceOwner = js.Any.fromFunction1(isResourceOwner))
    __obj.asInstanceOf[Principal]
  }
  @scala.inline
  implicit class PrincipalOps[Self <: Principal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAuthenticated(value: () => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAuthenticated")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsInRole(value: String => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInRole")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsResourceOwner(value: js.Any => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResourceOwner")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

