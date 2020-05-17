package typingsSlinky.reactNavigationDrawer.anon

import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation.react-navigation.NavigationLeafRoute<react-navigation.react-navigation.NavigationParams> & react-navigation.react-navigation.NavigationState & {  isDrawerOpen ? :any} */
@js.native
trait NavigationLeafRouteNavigaIndex extends js.Object {
  /**
    * Index that represents the depth of the stack
    */
  /**
    * Index refers to the active child route in the routes array.
    */
  var index: Double = js.native
  var isDrawerOpen: js.UndefOr[js.Any] = js.native
  /**
    * Flag that indicates the transition state of the route
    */
  var isTransitioning: Boolean = js.native
  /**
    * React's key used by some navigators. No need to specify these manually,
    * they will be defined by the router.
    */
  var key: String = js.native
  /**
    * Params passed to this route when navigating to it,
    * e.g. `{ car_id: 123 }` in a route that displays a car.
    */
  var params: js.UndefOr[NavigationParams with js.UndefOr[NavigationParams]] = js.native
  /**
    * Path is an advanced feature used for deep linking and on the web.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * For example 'Home'.
    * This is used as a key in a route config when creating a navigator.
    */
  var routeName: String = js.native
  /**
    * Array containing the navigator's routes
    */
  var routes: js.Array[NavigationRoute[NavigationParams]] = js.native
}

object NavigationLeafRouteNavigaIndex {
  @scala.inline
  def apply(
    index: Double,
    isTransitioning: Boolean,
    key: String,
    routeName: String,
    routes: js.Array[NavigationRoute[NavigationParams]]
  ): NavigationLeafRouteNavigaIndex = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isTransitioning = isTransitioning.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationLeafRouteNavigaIndex]
  }
  @scala.inline
  implicit class NavigationLeafRouteNavigaIndexOps[Self <: NavigationLeafRouteNavigaIndex] (val x: Self) extends AnyVal {
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
    def withRouteName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoutes(value: js.Array[NavigationRoute[NavigationParams]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDrawerOpen(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDrawerOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDrawerOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDrawerOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: NavigationParams with js.UndefOr[NavigationParams]): Self = {
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
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

