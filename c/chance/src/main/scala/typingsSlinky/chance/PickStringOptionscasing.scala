package typingsSlinky.chance

import typingsSlinky.chance.chanceStrings.lower
import typingsSlinky.chance.chanceStrings.upper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<chance.Chance.StringOptions, 'casing'> */
trait PickStringOptionscasing extends js.Object {
  var casing: upper | lower
}

object PickStringOptionscasing {
  @scala.inline
  def apply(casing: upper | lower): PickStringOptionscasing = {
    val __obj = js.Dynamic.literal(casing = casing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickStringOptionscasing]
  }
}

