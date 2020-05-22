package typingsSlinky.chance.anon

import typingsSlinky.chance.Chance.FirstNameNationalities
import typingsSlinky.chance.chanceStrings.female
import typingsSlinky.chance.chanceStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<chance.Chance.FirstNameOptions> */
trait PartialFirstNameOptions extends js.Object {
  var gender: js.UndefOr[male | female] = js.undefined
  var nationality: js.UndefOr[FirstNameNationalities] = js.undefined
}

object PartialFirstNameOptions {
  @scala.inline
  def apply(gender: male | female = null, nationality: FirstNameNationalities = null): PartialFirstNameOptions = {
    val __obj = js.Dynamic.literal()
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (nationality != null) __obj.updateDynamic("nationality")(nationality.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFirstNameOptions]
  }
}

