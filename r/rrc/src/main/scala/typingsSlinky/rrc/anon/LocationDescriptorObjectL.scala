package typingsSlinky.rrc.anon

import typingsSlinky.history.mod.Hash
import typingsSlinky.history.mod.LocationKey
import typingsSlinky.history.mod.LocationState
import typingsSlinky.history.mod.Pathname
import typingsSlinky.history.mod.Search
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined history.history.LocationDescriptorObject<history.history.LocationState> & {  pathname  :history.history.Pathname} */
@js.native
trait LocationDescriptorObjectL extends js.Object {
  var hash: js.UndefOr[Hash] = js.native
  var key: js.UndefOr[LocationKey] = js.native
  var pathname: js.UndefOr[Pathname] = js.native
  var search: js.UndefOr[Search] = js.native
  var state: js.UndefOr[LocationState] = js.native
}

object LocationDescriptorObjectL {
  @scala.inline
  def apply(): LocationDescriptorObjectL = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationDescriptorObjectL]
  }
  @scala.inline
  implicit class LocationDescriptorObjectLOps[Self <: LocationDescriptorObjectL] (val x: Self) extends AnyVal {
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
    def withoutHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.undefined)
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
    def withPathname(value: Pathname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathname")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: Search): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
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

