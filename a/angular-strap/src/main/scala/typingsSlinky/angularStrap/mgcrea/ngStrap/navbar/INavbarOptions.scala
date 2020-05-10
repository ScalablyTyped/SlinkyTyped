package typingsSlinky.angularStrap.mgcrea.ngStrap.navbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INavbarOptions extends js.Object {
  var activeClass: js.UndefOr[String] = js.native
  var routeAttr: js.UndefOr[String] = js.native
}

object INavbarOptions {
  @scala.inline
  def apply(): INavbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INavbarOptions]
  }
  @scala.inline
  implicit class INavbarOptionsOps[Self <: INavbarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClass")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteAttr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeAttr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteAttr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeAttr")(js.undefined)
        ret
    }
  }
  
}

