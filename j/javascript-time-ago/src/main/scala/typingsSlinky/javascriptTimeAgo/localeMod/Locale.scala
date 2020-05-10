package typingsSlinky.javascriptTimeAgo.localeMod

import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.few
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.one
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.other
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.two
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locale extends js.Object {
  var locale: String = js.native
  var long: js.UndefOr[Duration] = js.native
  var `long-convenient`: js.UndefOr[Duration] = js.native
  var `long-time`: js.UndefOr[Duration] = js.native
  var narrow: js.UndefOr[Duration] = js.native
  var short: js.UndefOr[Duration] = js.native
  var `short-convenient`: js.UndefOr[Duration] = js.native
  var `short-time`: js.UndefOr[Duration] = js.native
  var tiny: js.UndefOr[Duration] = js.native
  def quantify(n: Double): one | two | few | other = js.native
}

object Locale {
  @scala.inline
  def apply(locale: String, quantify: Double => one | two | few | other): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], quantify = js.Any.fromFunction1(quantify))
    __obj.asInstanceOf[Locale]
  }
  @scala.inline
  implicit class LocaleOps[Self <: Locale] (val x: Self) extends AnyVal {
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
    def withQuantify(value: Double => one | two | few | other): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantify")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLong(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLong: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long")(js.undefined)
        ret
    }
    @scala.inline
    def `withLong-convenient`(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long-convenient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLong-convenient`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long-convenient")(js.undefined)
        ret
    }
    @scala.inline
    def `withLong-time`(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long-time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLong-time`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long-time")(js.undefined)
        ret
    }
    @scala.inline
    def withNarrow(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNarrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("narrow")(js.undefined)
        ret
    }
    @scala.inline
    def withShort(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short")(js.undefined)
        ret
    }
    @scala.inline
    def `withShort-convenient`(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short-convenient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutShort-convenient`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short-convenient")(js.undefined)
        ret
    }
    @scala.inline
    def `withShort-time`(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short-time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutShort-time`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short-time")(js.undefined)
        ret
    }
    @scala.inline
    def withTiny(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiny")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTiny: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiny")(js.undefined)
        ret
    }
  }
  
}

