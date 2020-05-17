package typingsSlinky.reactIntl.anon

import typingsSlinky.reactIntl.typesMod.CustomFormats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-intl.react-intl/lib/types.IntlConfig, 'locale' | 'formats' | 'onError' | 'timeZone'> */
@js.native
trait PickIntlConfiglocaleforma extends js.Object {
  var formats: CustomFormats = js.native
  var locale: String = js.native
  var onError: js.Function1[/* err */ String, Unit] = js.native
  var timeZone: js.UndefOr[String] = js.native
}

object PickIntlConfiglocaleforma {
  @scala.inline
  def apply(formats: CustomFormats, locale: String, onError: /* err */ String => Unit): PickIntlConfiglocaleforma = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError))
    __obj.asInstanceOf[PickIntlConfiglocaleforma]
  }
  @scala.inline
  implicit class PickIntlConfiglocaleformaOps[Self <: PickIntlConfiglocaleforma] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormats(value: CustomFormats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnError(value: /* err */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(js.undefined)
        ret
    }
  }
  
}

