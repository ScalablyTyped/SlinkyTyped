package typingsSlinky.atom.anon

import typingsSlinky.atom.atomStrings.Subsequence
import typingsSlinky.atom.atomStrings.Symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `10` extends js.Object {
  var newValue: Subsequence | Symbol
  var oldValue: js.UndefOr[Subsequence | Symbol] = js.undefined
}

object `10` {
  @scala.inline
  def apply(newValue: Subsequence | Symbol, oldValue: Subsequence | Symbol = null): `10` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`10`]
  }
}

