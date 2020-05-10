package typingsSlinky.reactBootstrapTable2Filter.mod

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactBootstrapTable2Filter.AnonDate
import typingsSlinky.reactBootstrapTableNext.mod.TableColumnFilterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateFilter_[T /* <: js.Object */]
  extends TableColumnFilterProps[TableColumnFilterProps[js.Any, js.Any], T] {
  var comparator: js.UndefOr[js.Array[Comparator]] = js.native
  var comparatorClassName: js.UndefOr[String] = js.native
  var comparatorStyle: js.UndefOr[CSSProperties] = js.native
  var dateClassName: js.UndefOr[String] = js.native
  var dateStyle: js.UndefOr[CSSProperties] = js.native
  @JSName("defaultValue")
  var defaultValue_DateFilter_ : js.UndefOr[AnonDate] = js.native
  var withoutEmptyComparatorOption: js.UndefOr[Boolean] = js.native
}

object DateFilter_ {
  @scala.inline
  def apply[T](): DateFilter_[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateFilter_[T]]
  }
  @scala.inline
  implicit class DateFilter_Ops[Self[t] <: DateFilter_[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withComparator(value: js.Array[Comparator]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparator: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(js.undefined)
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
    def withDateClassName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateClassName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withDateStyle(value: CSSProperties): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: AnonDate): Self[T] = {
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
  }
  
}

