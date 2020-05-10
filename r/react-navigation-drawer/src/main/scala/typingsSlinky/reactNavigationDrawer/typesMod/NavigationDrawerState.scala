package typingsSlinky.reactNavigationDrawer.typesMod

import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation.react-navigation.NavigationState & {  isDrawerOpen  :boolean} */
@js.native
trait NavigationDrawerState extends js.Object {
  /**
    * Index refers to the active child route in the routes array.
    */
  var index: Double = js.native
  var isDrawerOpen: Boolean = js.native
  var isTransitioning: Boolean = js.native
  var key: String = js.native
  var params: js.UndefOr[NavigationParams] = js.native
  var routes: js.Array[NavigationRoute[NavigationParams]] = js.native
}

object NavigationDrawerState {
  @scala.inline
  def apply(
    index: Double,
    isDrawerOpen: Boolean,
    isTransitioning: Boolean,
    key: String,
    routes: js.Array[NavigationRoute[NavigationParams]]
  ): NavigationDrawerState = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isDrawerOpen = isDrawerOpen.asInstanceOf[js.Any], isTransitioning = isTransitioning.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationDrawerState]
  }
  @scala.inline
  implicit class NavigationDrawerStateOps[Self <: NavigationDrawerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDrawerOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDrawerOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTransitioning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTransitioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoutes(value: js.Array[NavigationRoute[NavigationParams]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: NavigationParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
  }
  
}

