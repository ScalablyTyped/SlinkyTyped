package typingsSlinky.reactBootstrapTableNext.mod

import typingsSlinky.reactBootstrapTableNext.AnonColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchProps[T] extends js.Object {
  var defaultSearch: js.UndefOr[String] = js.native
  /* custom search method, return true if matched and false if not */
  var onColumnMatch: js.UndefOr[js.Function1[/* searchProps */ AnonColumn[T], Boolean]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var searchText: js.UndefOr[String] = js.native
}

object SearchProps {
  @scala.inline
  def apply[T](): SearchProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchProps[T]]
  }
  @scala.inline
  implicit class SearchPropsOps[Self[t] <: SearchProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDefaultSearch(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSearch: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnMatch(value: /* searchProps */ AnonColumn[T] => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnMatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnColumnMatch: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchText(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchText")(js.undefined)
        ret
    }
  }
  
}

