package typingsSlinky.javascriptTimeAgo.ruMod

import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.few
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.one
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.other
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.ru
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.two
import typingsSlinky.javascriptTimeAgo.localeMod.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locale extends js.Object {
  var locale: ru = js.native
  var long: Duration = js.native
  var `long-convenient`: Duration = js.native
  var `long-time`: Duration = js.native
  var narrow: Duration = js.native
  var short: Duration = js.native
  var `short-convenient`: Duration = js.native
  var `short-time`: Duration = js.native
  var tiny: Duration = js.native
  def quantify(n: Double): one | two | few | other = js.native
}

object Locale {
  @scala.inline
  def apply(
    locale: ru,
    long: Duration,
    `long-convenient`: Duration,
    `long-time`: Duration,
    narrow: Duration,
    quantify: Double => one | two | few | other,
    short: Duration,
    `short-convenient`: Duration,
    `short-time`: Duration,
    tiny: Duration
  ): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], quantify = js.Any.fromFunction1(quantify), short = short.asInstanceOf[js.Any], tiny = tiny.asInstanceOf[js.Any])
    __obj.updateDynamic("long-convenient")(`long-convenient`.asInstanceOf[js.Any])
    __obj.updateDynamic("long-time")(`long-time`.asInstanceOf[js.Any])
    __obj.updateDynamic("short-convenient")(`short-convenient`.asInstanceOf[js.Any])
    __obj.updateDynamic("short-time")(`short-time`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  @scala.inline
  implicit class LocaleOps[Self <: Locale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocale(value: ru): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLong(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withLong-convenient`(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long-convenient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withLong-time`(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long-time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNarrow(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuantify(value: Double => one | two | few | other): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantify")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShort(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withShort-convenient`(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short-convenient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withShort-time`(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short-time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTiny(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiny")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

