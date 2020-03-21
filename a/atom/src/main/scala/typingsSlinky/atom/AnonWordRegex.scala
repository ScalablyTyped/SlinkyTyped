package typingsSlinky.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWordRegex extends js.Object {
  var wordRegex: js.UndefOr[js.RegExp] = js.undefined
}

object AnonWordRegex {
  @scala.inline
  def apply(wordRegex: js.RegExp = null): AnonWordRegex = {
    val __obj = js.Dynamic.literal()
    if (wordRegex != null) __obj.updateDynamic("wordRegex")(wordRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWordRegex]
  }
}

