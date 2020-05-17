package typingsSlinky.reactIntl.anon

import typingsSlinky.intlMessageformatParser.mod.MessageFormatElement
import typingsSlinky.reactIntl.typesMod.CustomFormats
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-intl.react-intl/lib/types.IntlConfig, 'locale' | 'formats' | 'messages' | 'defaultLocale' | 'defaultFormats' | 'onError'> */
@js.native
trait PickIntlConfiglocaleformaDefaultFormats extends js.Object {
  var defaultFormats: CustomFormats = js.native
  var defaultLocale: String = js.native
  var formats: CustomFormats = js.native
  var locale: String = js.native
  var messages: Record[String, js.Array[MessageFormatElement] | String] = js.native
  var onError: js.Function1[/* err */ String, Unit] = js.native
}

object PickIntlConfiglocaleformaDefaultFormats {
  @scala.inline
  def apply(
    defaultFormats: CustomFormats,
    defaultLocale: String,
    formats: CustomFormats,
    locale: String,
    messages: Record[String, js.Array[MessageFormatElement] | String],
    onError: /* err */ String => Unit
  ): PickIntlConfiglocaleformaDefaultFormats = {
    val __obj = js.Dynamic.literal(defaultFormats = defaultFormats.asInstanceOf[js.Any], defaultLocale = defaultLocale.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError))
    __obj.asInstanceOf[PickIntlConfiglocaleformaDefaultFormats]
  }
  @scala.inline
  implicit class PickIntlConfiglocaleformaDefaultFormatsOps[Self <: PickIntlConfiglocaleformaDefaultFormats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultFormats(value: CustomFormats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withMessages(value: Record[String, js.Array[MessageFormatElement] | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
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

