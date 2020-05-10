package typingsSlinky.reactBootstrapTable2Toolkit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableSearchProps[T /* <: js.Object */] extends js.Object {
  var customMatchFunc: js.UndefOr[js.Function1[/* props */ SearchMatchProps[T], Boolean]] = js.native
  var defaultSearch: js.UndefOr[String] = js.native
  var onColumnMatch: js.UndefOr[js.Function1[/* props */ SearchMatchProps[T], Unit]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var searchFormatted: js.UndefOr[Boolean] = js.native
}

object TableSearchProps {
  @scala.inline
  def apply[T](): TableSearchProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableSearchProps[T]]
  }
  @scala.inline
  implicit class TableSearchPropsOps[Self[t] <: TableSearchProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCustomMatchFunc(value: /* props */ SearchMatchProps[T] => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMatchFunc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomMatchFunc: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMatchFunc")(js.undefined)
        ret
    }
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
    def withOnColumnMatch(value: /* props */ SearchMatchProps[T] => Unit): Self[T] = {
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
    def withSearchFormatted(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchFormatted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchFormatted: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchFormatted")(js.undefined)
        ret
    }
  }
  
}

