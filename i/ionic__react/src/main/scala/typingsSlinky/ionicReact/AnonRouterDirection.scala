package typingsSlinky.ionicReact

import typingsSlinky.ionicReact.hrefpropsMod.RouterDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRouterDirection extends js.Object {
  var routerDirection: js.UndefOr[RouterDirection] = js.native
  var routerLink: js.UndefOr[String] = js.native
}

object AnonRouterDirection {
  @scala.inline
  def apply(): AnonRouterDirection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRouterDirection]
  }
  @scala.inline
  implicit class AnonRouterDirectionOps[Self <: AnonRouterDirection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRouterDirection(value: RouterDirection): Self = {
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

