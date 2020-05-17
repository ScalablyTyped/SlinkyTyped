package typingsSlinky.reactIntl.anon

import typingsSlinky.reactIntl.typesMod.CustomFormats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-intl.react-intl/lib/types.IntlConfig, 'locale' | 'formats' | 'onError'> */
@js.native
trait PickIntlConfiglocaleformaFormats extends js.Object {
  var formats: CustomFormats = js.native
  var locale: String = js.native
  var onError: js.Function1[/* err */ String, Unit] = js.native
}

object PickIntlConfiglocaleformaFormats {
  @scala.inline
  def apply(formats: CustomFormats, locale: String, onError: /* err */ String => Unit): PickIntlConfiglocaleformaFormats = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError))
    __obj.asInstanceOf[PickIntlConfiglocaleformaFormats]
  }
  @scala.inline
  implicit class PickIntlConfiglocaleformaFormatsOps[Self <: PickIntlConfiglocaleformaFormats] (val x: Self) extends AnyVal {
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
  }
  
}

