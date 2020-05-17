package typingsSlinky.reactIntl.anon

import typingsSlinky.intlMessageformatParser.mod.MessageFormatElement
import typingsSlinky.reactIntl.typesMod.CustomFormats
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-intl.react-intl/lib/types.IntlConfig, 'formats' | 'messages' | 'timeZone' | 'textComponent' | 'defaultLocale' | 'defaultFormats' | 'onError'> */
@js.native
trait PickIntlConfigformatsmess extends js.Object {
  var defaultFormats: CustomFormats = js.native
  var defaultLocale: String = js.native
  var formats: CustomFormats = js.native
  var messages: Record[String, js.Array[MessageFormatElement] | String] = js.native
  var onError: js.Function1[/* err */ String, Unit] = js.native
  var textComponent: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any
  ] = js.native
  var timeZone: js.UndefOr[String] = js.native
}

object PickIntlConfigformatsmess {
  @scala.inline
  def apply(
    defaultFormats: CustomFormats,
    defaultLocale: String,
    formats: CustomFormats,
    messages: Record[String, js.Array[MessageFormatElement] | String],
    onError: /* err */ String => Unit
  ): PickIntlConfigformatsmess = {
    val __obj = js.Dynamic.literal(defaultFormats = defaultFormats.asInstanceOf[js.Any], defaultLocale = defaultLocale.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError))
    __obj.asInstanceOf[PickIntlConfigformatsmess]
  }
  @scala.inline
  implicit class PickIntlConfigformatsmessOps[Self <: PickIntlConfigformatsmess] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withTextComponent(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textComponent")(js.undefined)
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

