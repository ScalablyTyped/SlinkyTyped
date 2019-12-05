package typingsSlinky.dateDashFns

import typingsSlinky.dateDashFns.dateDashFnsStrings.basic
import typingsSlinky.dateDashFns.dateDashFnsStrings.complete
import typingsSlinky.dateDashFns.dateDashFnsStrings.date
import typingsSlinky.dateDashFns.dateDashFnsStrings.extended
import typingsSlinky.dateDashFns.dateDashFnsStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Basic extends js.Object {
  var format: js.UndefOr[extended | basic] = js.undefined
  var representation: js.UndefOr[complete | date | time] = js.undefined
}

object Anon_Basic {
  @scala.inline
  def apply(format: extended | basic = null, representation: complete | date | time = null): Anon_Basic = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (representation != null) __obj.updateDynamic("representation")(representation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Basic]
  }
}

