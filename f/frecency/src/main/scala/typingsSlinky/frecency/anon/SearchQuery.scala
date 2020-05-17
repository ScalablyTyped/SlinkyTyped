package typingsSlinky.frecency.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchQuery[T] extends js.Object {
  var searchQuery: T = js.native
  var selectedId: String = js.native
}

object SearchQuery {
  @scala.inline
  def apply[T](searchQuery: T, selectedId: String): SearchQuery[T] = {
    val __obj = js.Dynamic.literal(searchQuery = searchQuery.asInstanceOf[js.Any], selectedId = selectedId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchQuery[T]]
  }
  @scala.inline
  implicit class SearchQueryOps[Self[t] <: SearchQuery[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withSearchQuery(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

