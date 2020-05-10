package typingsSlinky.griddleReact.mod

import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GriddlePlugin extends GriddleExtensibility {
  var initialState: js.UndefOr[GriddleInitialState] = js.native
  var reduxMiddleware: js.UndefOr[js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]]] = js.native
}

object GriddlePlugin {
  @scala.inline
  def apply(): GriddlePlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddlePlugin]
  }
  @scala.inline
  implicit class GriddlePluginOps[Self <: GriddlePlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialState(value: GriddleInitialState): Self = {
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
    def withReduxMiddleware(value: js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduxMiddleware")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReduxMiddleware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduxMiddleware")(js.undefined)
        ret
    }
  }
  
}

