package typingsSlinky.dateFns.anon

import typingsSlinky.dateFns.dateFnsStrings.basic
import typingsSlinky.dateFns.dateFnsStrings.complete
import typingsSlinky.dateFns.dateFnsStrings.date
import typingsSlinky.dateFns.dateFnsStrings.extended
import typingsSlinky.dateFns.dateFnsStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var format: js.UndefOr[extended | basic] = js.undefined
  var representation: js.UndefOr[complete | date | time] = js.undefined
}

object Format {
  @scala.inline
  def apply(format: extended | basic = null, representation: complete | date | time = null): Format = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (representation != null) __obj.updateDynamic("representation")(representation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

