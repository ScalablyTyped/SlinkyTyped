package typingsSlinky.reactNavigationDrawer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitialRouteName extends js.Object {
  var initialRouteName: js.UndefOr[String] = js.native
  var resetOnBlur: js.UndefOr[Boolean] = js.native
  var unmountInactiveRoutes: js.UndefOr[Boolean] = js.native
}

object InitialRouteName {
  @scala.inline
  def apply(): InitialRouteName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitialRouteName]
  }
  @scala.inline
  implicit class InitialRouteNameOps[Self <: InitialRouteName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialRouteName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRouteName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialRouteName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRouteName")(js.undefined)
        ret
    }
    @scala.inline
    def withResetOnBlur(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmountInactiveRoutes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmountInactiveRoutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnmountInactiveRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmountInactiveRoutes")(js.undefined)
        ret
    }
  }
  
}

