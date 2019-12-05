package typingsSlinky.javascriptDashTimeDashAgo.localePsMod

import typingsSlinky.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.few
import typingsSlinky.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.one
import typingsSlinky.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.other
import typingsSlinky.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.ps
import typingsSlinky.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.two
import typingsSlinky.javascriptDashTimeDashAgo.localeMod.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var locale: ps
  var long: Duration
  var narrow: Duration
  var short: Duration
  def quantify(n: Double): one | two | few | other
}

object Locale {
  @scala.inline
  def apply(
    locale: ps,
    long: Duration,
    narrow: Duration,
    quantify: Double => one | two | few | other,
    short: Duration
  ): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], quantify = js.Any.fromFunction1(quantify), short = short.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Locale]
  }
}

