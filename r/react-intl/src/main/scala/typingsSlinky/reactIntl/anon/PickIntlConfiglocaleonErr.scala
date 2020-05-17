package typingsSlinky.reactIntl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-intl.react-intl/lib/types.IntlConfig, 'locale' | 'onError'> */
@js.native
trait PickIntlConfiglocaleonErr extends js.Object {
  var locale: String = js.native
  var onError: js.Function1[/* err */ String, Unit] = js.native
}

object PickIntlConfiglocaleonErr {
  @scala.inline
  def apply(locale: String, onError: /* err */ String => Unit): PickIntlConfiglocaleonErr = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError))
    __obj.asInstanceOf[PickIntlConfiglocaleonErr]
  }
  @scala.inline
  implicit class PickIntlConfiglocaleonErrOps[Self <: PickIntlConfiglocaleonErr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

