package typingsSlinky.antDesignProLayout.typingsMod

import typingsSlinky.antDesignProLayout.anon.Pathname
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouter.mod.StaticContext
import typingsSlinky.reactRouter.mod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<react-router-dom.react-router-dom.RouteComponentProps<{}, react-router.react-router.StaticContext, history.history.LocationState>, 'location'> */
@js.native
trait RouterTypes[P] extends js.Object {
  var computedMatch: js.UndefOr[`match`[P]] = js.native
  var history: History[LocationState] = js.native
  var location: Location[LocationState] | Pathname = js.native
  var `match`: typingsSlinky.reactRouter.mod.`match`[js.Object] = js.native
  var route: js.UndefOr[Route] = js.native
  var staticContext: js.UndefOr[StaticContext] = js.native
}

object RouterTypes {
  @scala.inline
  def apply[P](
    history: History[LocationState],
    location: Location[LocationState] | Pathname,
    `match`: `match`[js.Object]
  ): RouterTypes[P] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterTypes[P]]
  }
  @scala.inline
  implicit class RouterTypesOps[Self[p] <: RouterTypes[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withHistory(value: History[LocationState]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: Location[LocationState] | Pathname): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatch(value: `match`[js.Object]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComputedMatch(value: `match`[P]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computedMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputedMatch: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computedMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withRoute(value: Route): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoute: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticContext(value: StaticContext): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticContext: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticContext")(js.undefined)
        ret
    }
  }
  
}

