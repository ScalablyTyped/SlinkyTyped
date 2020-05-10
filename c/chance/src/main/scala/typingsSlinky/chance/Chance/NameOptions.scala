package typingsSlinky.chance.Chance

import typingsSlinky.chance.chanceStrings.all
import typingsSlinky.chance.chanceStrings.female
import typingsSlinky.chance.chanceStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined chance.Chance.FullNameOptions & chance.Chance.FirstNameOptions & chance.Chance.LastNameOptions & chance.Chance.PrefixOptions */
@js.native
trait NameOptions extends js.Object {
  var full: Boolean = js.native
  var gender: (male | female) with (male | female | all) = js.native
  var middle: Boolean = js.native
  var middle_initial: Boolean = js.native
  var nationality: FirstNameNationalities with LastNameNationalities = js.native
  var prefix: Boolean = js.native
  var suffix: Boolean = js.native
}

object NameOptions {
  @scala.inline
  def apply(
    full: Boolean,
    gender: (male | female) with (male | female | all),
    middle: Boolean,
    middle_initial: Boolean,
    nationality: FirstNameNationalities with LastNameNationalities,
    prefix: Boolean,
    suffix: Boolean
  ): NameOptions = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], middle = middle.asInstanceOf[js.Any], middle_initial = middle_initial.asInstanceOf[js.Any], nationality = nationality.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameOptions]
  }
  @scala.inline
  implicit class NameOptionsOps[Self <: NameOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGender(value: (male | female) with (male | female | all)): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiddle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiddle_initial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middle_initial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNationality(value: FirstNameNationalities with LastNameNationalities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nationality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuffix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

