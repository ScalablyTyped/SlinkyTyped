package typingsSlinky.javascriptTimeAgo.deMod

import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.de
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.few
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.one
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.other
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.two
import typingsSlinky.javascriptTimeAgo.localeMod.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var locale: de
  var long: Duration
  var `long-time`: Duration
  var narrow: Duration
  var short: Duration
  def quantify(n: Double): one | two | few | other
}

object Locale {
  @scala.inline
  def apply(
    locale: de,
    long: Duration,
    `long-time`: Duration,
    narrow: Duration,
    quantify: Double => one | two | few | other,
    short: Duration
  ): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], quantify = js.Any.fromFunction1(quantify), short = short.asInstanceOf[js.Any])
    __obj.updateDynamic("long-time")(`long-time`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
}

