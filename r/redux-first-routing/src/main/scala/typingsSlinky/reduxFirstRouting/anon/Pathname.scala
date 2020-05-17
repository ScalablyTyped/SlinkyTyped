package typingsSlinky.reduxFirstRouting.anon

import typingsSlinky.history.mod.Search
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pathname[P /* <: typingsSlinky.history.mod.Pathname */, S /* <: Search */, H /* <: typingsSlinky.history.mod.Hash */] extends js.Object {
  var hash: H = js.native
  var pathname: P = js.native
  var search: S = js.native
}

object Pathname {
  @scala.inline
  def apply[P, S, H](hash: H, pathname: P, search: S): Pathname[P, S, H] = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pathname[P, S, H]]
  }
  @scala.inline
  implicit class PathnameOps[Self[p, s, h] <: Pathname[p, s, h], P, S, H] (val x: Self[P, S, H]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P, S, H] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P, S, H]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[P, S, H]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[P, S, H]) with Other]
    @scala.inline
    def withHash(value: H): Self[P, S, H] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathname(value: P): Self[P, S, H] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: S): Self[P, S, H] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

