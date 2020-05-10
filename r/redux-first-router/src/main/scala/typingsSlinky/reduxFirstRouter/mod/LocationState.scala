package typingsSlinky.reduxFirstRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationState[TKeys, TState] extends js.Object {
  var hasSSR: js.UndefOr[Boolean] = js.native
  var history: Nullable[HistoryData] = js.native
  var kind: Nullable[String] = js.native
  var pathname: String = js.native
  var payload: Payload = js.native
  var prev: Location = js.native
  var query: js.UndefOr[Query] = js.native
  var routesMap: RoutesMap[TKeys, TState] = js.native
  var search: js.UndefOr[String] = js.native
  var `type`: String = js.native
}

object LocationState {
  @scala.inline
  def apply[TKeys, TState](
    pathname: String,
    payload: Payload,
    prev: Location,
    routesMap: RoutesMap[TKeys, TState],
    `type`: String
  ): LocationState[TKeys, TState] = {
    val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], routesMap = routesMap.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationState[TKeys, TState]]
  }
  @scala.inline
  implicit class LocationStateOps[Self[tkeys, tstate] <: LocationState[tkeys, tstate], TKeys, TState] (val x: Self[TKeys, TState]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TKeys, TState] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TKeys, TState]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TKeys, TState]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TKeys, TState]) with Other]
    @scala.inline
    def withPathname(value: String): Self[TKeys, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: Payload): Self[TKeys, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrev(value: Location): Self[TKeys, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoutesMap(value: RoutesMap[TKeys, TState]): Self[TKeys, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routesMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self[TKeys, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasSSR(value: Boolean): Self[TKeys, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSSR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasSSR: Self[TKeys, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSSR")(js.undefined)
        ret
    }
    @scala.inline
    def withHistory(value: Nullable[HistoryData]): Self[TKeys, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistory: Self[TKeys, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(js.undefined)
        ret
    }
    @scala.inline
    def withHistoryNull: Self[TKeys, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(null)
        ret
    }
    @scala.inline
    def withKind(value: Nullable[String]): Self[TKeys, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self[TKeys, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withKindNull: Self[TKeys, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(null)
        ret
    }
    @scala.inline
    def withQuery(value: Query): Self[TKeys, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self[TKeys, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: String): Self[TKeys, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self[TKeys, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
  }
  
}

