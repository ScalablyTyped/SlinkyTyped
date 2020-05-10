package typingsSlinky.durandal

import typingsSlinky.knockout.KnockoutComputed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DurandalRouteConfiguration extends js.Object {
  var hasChildRoutes: js.UndefOr[Boolean] = js.native
  var hash: js.UndefOr[String] = js.native
  var isActive: js.UndefOr[KnockoutComputed[Boolean]] = js.native
  var moduleId: js.UndefOr[String] = js.native
  var nav: js.UndefOr[js.Any] = js.native
  var route: js.UndefOr[String | js.Array[String]] = js.native
  var routePattern: js.UndefOr[js.RegExp] = js.native
  var title: js.UndefOr[js.Any] = js.native
  var viewUrl: js.UndefOr[String] = js.native
}

object DurandalRouteConfiguration {
  @scala.inline
  def apply(): DurandalRouteConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurandalRouteConfiguration]
  }
  @scala.inline
  implicit class DurandalRouteConfigurationOps[Self <: DurandalRouteConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasChildRoutes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChildRoutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasChildRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChildRoutes")(js.undefined)
        ret
    }
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.undefined)
        ret
    }
    @scala.inline
    def withIsActive(value: KnockoutComputed[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleId")(js.undefined)
        ret
    }
    @scala.inline
    def withNav(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNav: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nav")(js.undefined)
        ret
    }
    @scala.inline
    def withRoute(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutePattern(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routePattern")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withViewUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewUrl")(js.undefined)
        ret
    }
  }
  
}

