package typingsSlinky.backboneMarionette.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppRouterOptions extends js.Object {
  /**
    * Define the app routes and the method names on the controller that
    * will be called when accessing the routes.
    */
  var appRoutes: js.UndefOr[AppRoutes] = js.native
  /**
    * An object that contains the methods specified in appRoutes.
    */
  var controller: js.UndefOr[js.Any] = js.native
  /**
    * Define the app routes and the method names on the router that will be
    * called when accessing the routes.
    */
  var routes: js.UndefOr[AppRoutes] = js.native
}

object AppRouterOptions {
  @scala.inline
  def apply(): AppRouterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppRouterOptions]
  }
  @scala.inline
  implicit class AppRouterOptionsOps[Self <: AppRouterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppRoutes(value: AppRoutes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appRoutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appRoutes")(js.undefined)
        ret
    }
    @scala.inline
    def withController(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutController: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutes(value: AppRoutes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(js.undefined)
        ret
    }
  }
  
}

