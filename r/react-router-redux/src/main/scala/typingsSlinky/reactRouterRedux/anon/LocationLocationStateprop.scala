package typingsSlinky.reactRouterRedux.anon

import typingsSlinky.history.mod.Hash
import typingsSlinky.history.mod.LocationKey
import typingsSlinky.history.mod.LocationState
import typingsSlinky.history.mod.Pathname
import typingsSlinky.history.mod.Search
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined history.history.Location<history.history.LocationState> & {  props ? :{  match  :{  path  :string,   url  :string,   params  :any,   isExact  :boolean},   location  :history.history.Location<history.history.LocationState>,   history  :history.history.History<history.history.LocationState>}} */
@js.native
trait LocationLocationStateprop extends js.Object {
  var hash: Hash = js.native
  var key: js.UndefOr[LocationKey] = js.native
  var pathname: Pathname = js.native
  var props: js.UndefOr[History] = js.native
  var search: Search = js.native
  var state: LocationState = js.native
}

object LocationLocationStateprop {
  @scala.inline
  def apply(hash: Hash, pathname: Pathname, search: Search): LocationLocationStateprop = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationLocationStateprop]
  }
  @scala.inline
  implicit class LocationLocationStatepropOps[Self <: LocationLocationStateprop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHash(value: Hash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathname(value: Pathname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: Search): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: LocationKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withProps(value: History): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: LocationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withStateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(null)
        ret
    }
  }
  
}

