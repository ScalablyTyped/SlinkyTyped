package typingsSlinky.angularUiRouter.mod.angularAugmentingMod.ui

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angular.mod.global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IState extends js.Object {
  var `abstract`: js.UndefOr[Boolean] = js.native
  /**
    * Boolean (default true). If false will reload state on everytransitions. Useful for when you'd like to restore all data  to its initial state.
    */
  var cache: js.UndefOr[Boolean] = js.native
  /**
    * String, component name
    */
  var component: js.UndefOr[String] = js.native
  /**
    * A controller paired to the state. Function, annotated array or name as String
    */
  var controller: js.UndefOr[Function | String | (js.Array[String | Function])] = js.native
  var controllerAs: js.UndefOr[String] = js.native
  /**
    * Function (injectable), returns the actual controller function or string.
    */
  var controllerProvider: js.UndefOr[Function | (js.Array[String | Function])] = js.native
  /**
    * Arbitrary data object, useful for custom configuration.
    */
  var data: js.UndefOr[js.Any] = js.native
  var name: js.UndefOr[String] = js.native
  /**
    * Callback function for when a state is entered. Good way to trigger an action or dispatch an event, such as opening a dialog.
    * If minifying your scripts, make sure to explicitly annotate this function, because it won't be automatically annotated by your build tools.
    */
  var onEnter: js.UndefOr[Function | (js.Array[String | Function])] = js.native
  /**
    * Callback functions for when a state is entered and exited. Good way to trigger an action or dispatch an event, such as opening a dialog.
    * If minifying your scripts, make sure to explicitly annotate this function, because it won't be automatically annotated by your build tools.
    */
  var onExit: js.UndefOr[Function | (js.Array[String | Function])] = js.native
  /**
    * A map which optionally configures parameters declared in the url, or defines additional non-url parameters. Only use this within a state if you are not using url. Otherwise you can specify your parameters within the url. When a state is navigated or transitioned to, the $stateParams service will be populated with any parameters that were passed.
    */
  var params: js.UndefOr[js.Any] = js.native
  /**
    * Specifies the parent state of this state
    */
  var parent: js.UndefOr[String | IState] = js.native
  /**
    * string | function | object
    * Synchronously or asynchronously redirects Transitions to a different state/params
    */
  var redirectTo: js.UndefOr[String | Function | IState] = js.native
  /**
    * Boolean (default true). If false will not re-trigger the same state just because a search/query parameter has changed. Useful for when you'd like to modify $location.search() without triggering a reload.
    */
  var reloadOnSearch: js.UndefOr[Boolean] = js.native
  var resolve: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * String HTML content, or function that returns an HTML string
    */
  var template: js.UndefOr[String | (js.Function1[/* params */ IStateParamsService, String])] = js.native
  /**
    * Function, returns HTML content string
    */
  var templateProvider: js.UndefOr[Function | (js.Array[String | Function])] = js.native
  /**
    * String URL path to template file OR Function, returns URL path string
    */
  var templateUrl: js.UndefOr[String | (js.Function1[/* params */ IStateParamsService, String])] = js.native
  /**
    * A url with optional parameters. When a state is navigated or transitioned to, the $stateParams service will be populated with any parameters that were passed.
    */
  var url: js.UndefOr[String | IUrlMatcher] = js.native
  /**
    * Use the views property to set up multiple views. If you don't need multiple views within a single state this property is not needed. Tip: remember that often nested views are more useful and powerful than multiple sibling views.
    */
  var views: js.UndefOr[StringDictionary[IState]] = js.native
}

object IState {
  @scala.inline
  def apply(): IState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IState]
  }
  @scala.inline
  implicit class IStateOps[Self <: IState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbstract(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abstract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbstract: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abstract")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withComponent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withController(value: Function | String | (js.Array[String | Function])): Self = {
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
    def withControllerAs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllerAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControllerAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllerAs")(js.undefined)
        ret
    }
    @scala.inline
    def withControllerProvider(value: Function | (js.Array[String | Function])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllerProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControllerProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllerProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnter(value: Function | (js.Array[String | Function])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExit(value: Function | (js.Array[String | Function])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: js.Any): Self = {
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
    def withParent(value: String | IState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectTo(value: String | Function | IState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectTo")(js.undefined)
        ret
    }
    @scala.inline
    def withReloadOnSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloadOnSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReloadOnSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloadOnSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withResolve(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateFunction1(value: /* params */ IStateParamsService => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTemplate(value: String | (js.Function1[/* params */ IStateParamsService, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateProvider(value: Function | (js.Array[String | Function])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateUrlFunction1(value: /* params */ IStateParamsService => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTemplateUrl(value: String | (js.Function1[/* params */ IStateParamsService, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String | IUrlMatcher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withViews(value: StringDictionary[IState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(js.undefined)
        ret
    }
  }
  
}

