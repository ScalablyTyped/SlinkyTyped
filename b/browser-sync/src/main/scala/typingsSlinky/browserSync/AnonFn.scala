package typingsSlinky.browserSync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFn extends js.Object {
  var fn: js.UndefOr[js.Function2[/* snippet */ String, /* match */ String, _]] = js.undefined
  var `match`: js.UndefOr[js.RegExp] = js.undefined
}

object AnonFn {
  @scala.inline
  def apply(fn: (/* snippet */ String, /* match */ String) => _ = null, `match`: js.RegExp = null): AnonFn = {
    val __obj = js.Dynamic.literal()
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction2(fn))
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFn]
  }
}

