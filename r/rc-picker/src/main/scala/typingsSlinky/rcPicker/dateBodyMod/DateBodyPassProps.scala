package typingsSlinky.rcPicker.dateBodyMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateBodyPassProps[DateType] extends js.Object {
  var dateRender: js.UndefOr[DateRender[DateType]] = js.native
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
  var prefixColumn: js.UndefOr[js.Function1[/* date */ DateType, TagMod[Any]]] = js.native
  var rowClassName: js.UndefOr[js.Function1[/* date */ DateType, String]] = js.native
}

object DateBodyPassProps {
  @scala.inline
  def apply[DateType](): DateBodyPassProps[DateType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateBodyPassProps[DateType]]
  }
  @scala.inline
  implicit class DateBodyPassPropsOps[Self[datetype] <: DateBodyPassProps[datetype], DateType] (val x: Self[DateType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[DateType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[DateType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[DateType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[DateType] with Other]
    @scala.inline
    def withDateRender(value: (DateType, DateType) => TagMod[Any]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDateRender: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRender")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledDate(value: /* date */ DateType => Boolean): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDisabledDate: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDate")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixColumn(value: /* date */ DateType => TagMod[Any]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixColumn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPrefixColumn: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withRowClassName(value: /* date */ DateType => String): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClassName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowClassName: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClassName")(js.undefined)
        ret
    }
  }
  
}

