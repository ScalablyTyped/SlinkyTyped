package typingsSlinky.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationLeafRoute[Params] extends js.Object {
  /**
    * Index that represents the depth of the stack
    */
  var index: Double = js.native
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
  var params: js.UndefOr[Params] = js.native
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

object NavigationLeafRoute {
  @scala.inline
  def apply[Params](
    index: Double,
    isTransitioning: Boolean,
    key: String,
    routeName: String,
    routes: js.Array[NavigationRoute[NavigationParams]]
  ): NavigationLeafRoute[Params] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isTransitioning = isTransitioning.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationLeafRoute[Params]]
  }
  @scala.inline
  implicit class NavigationLeafRouteOps[Self[params] <: NavigationLeafRoute[params], Params] (val x: Self[Params]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Params] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Params]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Params] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Params] with Other]
    @scala.inline
    def withIndex(value: Double): Self[Params] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTransitioning(value: Boolean): Self[Params] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTransitioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self[Params] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouteName(value: String): Self[Params] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoutes(value: js.Array[NavigationRoute[NavigationParams]]): Self[Params] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: Params): Self[Params] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self[Params] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self[Params] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self[Params] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

