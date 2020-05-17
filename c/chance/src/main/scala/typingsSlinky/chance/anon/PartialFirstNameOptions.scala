package typingsSlinky.chance.anon

import typingsSlinky.chance.Chance.FirstNameNationalities
import typingsSlinky.chance.chanceStrings.female
import typingsSlinky.chance.chanceStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<chance.Chance.FirstNameOptions> */
@js.native
trait PartialFirstNameOptions extends js.Object {
  var gender: js.UndefOr[male | female] = js.native
  var nationality: js.UndefOr[FirstNameNationalities] = js.native
}

object PartialFirstNameOptions {
  @scala.inline
  def apply(): PartialFirstNameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFirstNameOptions]
  }
  @scala.inline
  implicit class PartialFirstNameOptionsOps[Self <: PartialFirstNameOptions] (val x: Self) extends AnyVal {
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
    def withoutGender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(js.undefined)
        ret
    }
    @scala.inline
    def withNationality(value: FirstNameNationalities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nationality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNationality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nationality")(js.undefined)
        ret
    }
  }
  
}

