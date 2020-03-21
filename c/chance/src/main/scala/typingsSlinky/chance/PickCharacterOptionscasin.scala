package typingsSlinky.chance

import typingsSlinky.chance.chanceStrings.lower
import typingsSlinky.chance.chanceStrings.upper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<chance.Chance.CharacterOptions, 'casing'> */
trait PickCharacterOptionscasin extends js.Object {
  var casing: upper | lower
}

object PickCharacterOptionscasin {
  @scala.inline
  def apply(casing: upper | lower): PickCharacterOptionscasin = {
    val __obj = js.Dynamic.literal(casing = casing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickCharacterOptionscasin]
  }
}

