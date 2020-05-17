package typingsSlinky.reactBootstrapTable2Filter.mod

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactBootstrapTableNext.mod.TableColumnFilterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-bootstrap-table-next.react-bootstrap-table-next.TableColumnFilterProps<react-bootstrap-table-next.react-bootstrap-table-next.TableColumnFilterProps<any, any>, T> & {  options ? :std.Array<number>,   comparators ? :std.Array<react-bootstrap-table2-filter.react-bootstrap-table2-filter.Comparator>,   withoutEmptyComparatorOption ? :boolean,   withoutEmptyNumberOption ? :boolean,   comparatorClassName ? :string,   numberClassName ? :string,   comparatorStyle ? :react.react.CSSProperties,   numberStyle ? :react.react.CSSProperties,   defaultValue ? :{  number  :number,   comparator  :react-bootstrap-table2-filter.react-bootstrap-table2-filter.Comparator}} */
@js.native
trait NumberFilterProps[T /* <: js.Object */] extends js.Object {
  var className: js.UndefOr[String] = js.native
  var comparatorClassName: js.UndefOr[String] = js.native
  var comparatorStyle: js.UndefOr[CSSProperties] = js.native
  var comparators: js.UndefOr[js.Array[Comparator]] = js.native
  var defaultValue: js.UndefOr[js.Any with typingsSlinky.reactBootstrapTable2Filter.anon.Comparator] = js.native
  var delay: js.UndefOr[Double] = js.native
  var getFilter: js.UndefOr[js.Function1[/* filter */ TableColumnFilterProps[_, _], Unit]] = js.native
  var id: js.UndefOr[String] = js.native
  var numberClassName: js.UndefOr[String] = js.native
  var numberStyle: js.UndefOr[CSSProperties] = js.native
  var onFilter: js.UndefOr[js.Function1[/* filterValue */ TableColumnFilterProps[_, _], Unit | js.Array[T]]] = js.native
  var options: js.UndefOr[js.Array[Double]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * When set to true comparator dropdown does not show a "no selection" option
    */
  var withoutEmptyComparatorOption: js.UndefOr[Boolean] = js.native
  var withoutEmptyNumberOption: js.UndefOr[Boolean] = js.native
}

object NumberFilterProps {
  @scala.inline
  def apply[T](): NumberFilterProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberFilterProps[T]]
  }
  @scala.inline
  implicit class NumberFilterPropsOps[Self[t] <: NumberFilterProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withClassName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withComparatorClassName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparatorClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparatorClassName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparatorClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withComparatorStyle(value: CSSProperties): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparatorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparatorStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparatorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withComparators(value: js.Array[Comparator]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparators: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparators")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: js.Any with typingsSlinky.reactBootstrapTable2Filter.anon.Comparator): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFilter(value: /* filter */ TableColumnFilterProps[_, _] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetFilter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberClassName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberClassName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberStyle(value: CSSProperties): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFilter(value: /* filterValue */ TableColumnFilterProps[_, _] => Unit | js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFilter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
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
    def withStyle(value: CSSProperties): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withWithoutEmptyComparatorOption(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutEmptyComparatorOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithoutEmptyComparatorOption: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutEmptyComparatorOption")(js.undefined)
        ret
    }
    @scala.inline
    def withWithoutEmptyNumberOption(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutEmptyNumberOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithoutEmptyNumberOption: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutEmptyNumberOption")(js.undefined)
        ret
    }
  }
  
}

