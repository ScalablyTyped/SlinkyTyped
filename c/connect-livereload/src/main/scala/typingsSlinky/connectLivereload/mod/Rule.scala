package typingsSlinky.connectLivereload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  var `match`: js.RegExp
  def fn(w: String, s: String): String
}

object Rule {
  @scala.inline
  def apply(fn: (String, String) => String, `match`: js.RegExp): Rule = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction2(fn))
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
}

