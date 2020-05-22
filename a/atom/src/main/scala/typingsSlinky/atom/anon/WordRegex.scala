package typingsSlinky.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordRegex extends js.Object {
  var wordRegex: js.UndefOr[js.RegExp] = js.undefined
}

object WordRegex {
  @scala.inline
  def apply(wordRegex: js.RegExp = null): WordRegex = {
    val __obj = js.Dynamic.literal()
    if (wordRegex != null) __obj.updateDynamic("wordRegex")(wordRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordRegex]
  }
}

