package typingsSlinky.excelStyleDataformatter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatterOptions extends js.Object {
  var UTCOffset: js.UndefOr[Double | Null] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var locale: js.UndefOr[String] = js.native
  var locales: js.UndefOr[js.Array[LocalesOptions]] = js.native
  var transformCode: js.UndefOr[js.Function1[/* code */ js.Any, _]] = js.native
}

object FormatterOptions {
  @scala.inline
  def apply(): FormatterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatterOptions]
  }
  @scala.inline
  implicit class FormatterOptionsOps[Self <: FormatterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUTCOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UTCOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUTCOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UTCOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withUTCOffsetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UTCOffset")(null)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withLocales(value: js.Array[LocalesOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locales")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocales: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locales")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformCode(value: /* code */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformCode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransformCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformCode")(js.undefined)
        ret
    }
  }
  
}

