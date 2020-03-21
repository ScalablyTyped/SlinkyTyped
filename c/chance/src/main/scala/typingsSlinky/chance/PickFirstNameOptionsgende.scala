package typingsSlinky.chance

import typingsSlinky.chance.chanceStrings.female
import typingsSlinky.chance.chanceStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<chance.Chance.FirstNameOptions, 'gender'> */
trait PickFirstNameOptionsgende extends js.Object {
  var gender: male | female
}

object PickFirstNameOptionsgende {
  @scala.inline
  def apply(gender: male | female): PickFirstNameOptionsgende = {
    val __obj = js.Dynamic.literal(gender = gender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickFirstNameOptionsgende]
  }
}

