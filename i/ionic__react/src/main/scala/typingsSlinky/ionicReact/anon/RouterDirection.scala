package typingsSlinky.ionicReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterDirection extends js.Object {
  var routerDirection: js.UndefOr[typingsSlinky.ionicReact.hrefpropsMod.RouterDirection] = js.native
  var routerLink: js.UndefOr[String] = js.native
}

object RouterDirection {
  @scala.inline
  def apply(): RouterDirection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterDirection]
  }
  @scala.inline
  implicit class RouterDirectionOps[Self <: RouterDirection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRouterDirection(value: typingsSlinky.ionicReact.hrefpropsMod.RouterDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routerDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouterDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routerDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withRouterLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routerLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouterLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routerLink")(js.undefined)
        ret
    }
  }
  
}

