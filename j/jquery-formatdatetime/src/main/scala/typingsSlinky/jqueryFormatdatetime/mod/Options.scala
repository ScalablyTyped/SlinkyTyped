package typingsSlinky.jqueryFormatdatetime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  monthNames  :std.Array<string>,   monthNamesShort  :std.Array<string>,   dayNames  :std.Array<string>,   dayNamesShort  :std.Array<string>,   ampmNames  :std.Array<string>, getSuffix (num : number): string,   attribute  :string,   formatAttribute  :string,   utc  :boolean}> */
@js.native
trait Options extends js.Object {
  var ampmNames: js.UndefOr[js.Array[String]] = js.native
  var attribute: js.UndefOr[String] = js.native
  var dayNames: js.UndefOr[js.Array[String]] = js.native
  var dayNamesShort: js.UndefOr[js.Array[String]] = js.native
  var formatAttribute: js.UndefOr[String] = js.native
  var getSuffix: js.UndefOr[js.Function1[/* num */ Double, String]] = js.native
  var monthNames: js.UndefOr[js.Array[String]] = js.native
  var monthNamesShort: js.UndefOr[js.Array[String]] = js.native
  var utc: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmpmNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampmNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmpmNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampmNames")(js.undefined)
        ret
    }
    @scala.inline
    def withAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute")(js.undefined)
        ret
    }
    @scala.inline
    def withDayNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayNames")(js.undefined)
        ret
    }
    @scala.inline
    def withDayNamesShort(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayNamesShort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayNamesShort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayNamesShort")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSuffix(value: /* num */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSuffix")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNames")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthNamesShort(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNamesShort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthNamesShort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNamesShort")(js.undefined)
        ret
    }
    @scala.inline
    def withUtc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utc")(js.undefined)
        ret
    }
  }
  
}

