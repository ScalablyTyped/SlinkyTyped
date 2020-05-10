package typingsSlinky.reduxBootstrap.interfacesMod.interfaces

import slinky.core.facade.ReactElement
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Middleware
import typingsSlinky.redux.mod.StoreEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoostrapOptions extends js.Object {
  var container: js.UndefOr[String] = js.native
  var createHistory: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify History.CreateHistory<History.HistoryOptions, History.History> */ js.Any
  ] = js.native
  var devToolsOptions: js.UndefOr[DevToolsOptions] = js.native
  var enhancers: js.UndefOr[js.Array[StoreEnhancer[_, js.Object]]] = js.native
  var historyOptions: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify History.HistoryOptions */ js.Any
  ] = js.native
  var initialState: js.UndefOr[js.Any] = js.native
  var middlewares: js.UndefOr[js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]]] = js.native
  var reducers: ReducersOption = js.native
  var render: js.UndefOr[js.Function] = js.native
  var routerProps: js.UndefOr[RouterProps] = js.native
  var routes: ReactElement = js.native
}

object BoostrapOptions {
  @scala.inline
  def apply(reducers: ReducersOption, routes: ReactElement): BoostrapOptions = {
    val __obj = js.Dynamic.literal(reducers = reducers.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoostrapOptions]
  }
  @scala.inline
  implicit class BoostrapOptionsOps[Self <: BoostrapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReducers(value: ReducersOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reducers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoutes(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateHistory(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify History.CreateHistory<History.HistoryOptions, History.History> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createHistory")(js.undefined)
        ret
    }
    @scala.inline
    def withDevToolsOptions(value: DevToolsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devToolsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevToolsOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devToolsOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withEnhancers(value: js.Array[StoreEnhancer[_, js.Object]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhancers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnhancers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhancers")(js.undefined)
        ret
    }
    @scala.inline
    def withHistoryOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify History.HistoryOptions */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistoryOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(js.undefined)
        ret
    }
    @scala.inline
    def withMiddlewares(value: js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middlewares")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiddlewares: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middlewares")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withRouterProps(value: RouterProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouterProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routerProps")(js.undefined)
        ret
    }
  }
  
}

