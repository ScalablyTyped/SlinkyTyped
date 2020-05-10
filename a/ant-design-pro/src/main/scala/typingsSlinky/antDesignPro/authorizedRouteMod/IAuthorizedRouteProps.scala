package typingsSlinky.antDesignPro.authorizedRouteMod

import typingsSlinky.reactRouter.mod.RouteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAuthorizedRouteProps extends RouteProps {
  var authority: typingsSlinky.antDesignPro.authorizedRouteMod.authority = js.native
}

object IAuthorizedRouteProps {
  @scala.inline
  def apply(authority: authority): IAuthorizedRouteProps = {
    val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthorizedRouteProps]
  }
  @scala.inline
  implicit class IAuthorizedRoutePropsOps[Self <: IAuthorizedRouteProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorityFunction1(value: /* currentAuthority */ js.UndefOr[String] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authority")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAuthority(value: authority): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authority")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

