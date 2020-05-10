package typingsSlinky.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaceSearchPagination extends js.Object {
  var hasNextPage: Boolean = js.native
  def nextPage(): Unit = js.native
}

object PlaceSearchPagination {
  @scala.inline
  def apply(hasNextPage: Boolean, nextPage: () => Unit): PlaceSearchPagination = {
    val __obj = js.Dynamic.literal(hasNextPage = hasNextPage.asInstanceOf[js.Any], nextPage = js.Any.fromFunction0(nextPage))
    __obj.asInstanceOf[PlaceSearchPagination]
  }
  @scala.inline
  implicit class PlaceSearchPaginationOps[Self <: PlaceSearchPagination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasNextPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNextPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextPage(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPage")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

