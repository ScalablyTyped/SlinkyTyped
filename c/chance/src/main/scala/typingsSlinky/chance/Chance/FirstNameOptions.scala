package typingsSlinky.chance.Chance

import typingsSlinky.chance.chanceStrings.female
import typingsSlinky.chance.chanceStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirstNameOptions extends js.Object {
  var gender: male | female = js.native
  var nationality: FirstNameNationalities = js.native
}

object FirstNameOptions {
  @scala.inline
  def apply(gender: male | female, nationality: FirstNameNationalities): FirstNameOptions = {
    val __obj = js.Dynamic.literal(gender = gender.asInstanceOf[js.Any], nationality = nationality.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstNameOptions]
  }
  @scala.inline
  implicit class FirstNameOptionsOps[Self <: FirstNameOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGender(value: male | female): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNationality(value: FirstNameNationalities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nationality")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

