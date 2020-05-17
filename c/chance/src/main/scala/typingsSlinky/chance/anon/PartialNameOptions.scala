package typingsSlinky.chance.anon

import typingsSlinky.chance.Chance.FirstNameNationalities
import typingsSlinky.chance.chanceStrings.female
import typingsSlinky.chance.chanceStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<chance.Chance.NameOptions> */
@js.native
trait PartialNameOptions extends js.Object {
  var full: js.UndefOr[Boolean] = js.native
  var gender: js.UndefOr[male | female] = js.native
  var middle: js.UndefOr[Boolean] = js.native
  var middle_initial: js.UndefOr[Boolean] = js.native
  var nationality: js.UndefOr[FirstNameNationalities] = js.native
  var prefix: js.UndefOr[Boolean] = js.native
  var suffix: js.UndefOr[Boolean] = js.native
}

object PartialNameOptions {
  @scala.inline
  def apply(): PartialNameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNameOptions]
  }
  @scala.inline
  implicit class PartialNameOptionsOps[Self <: PartialNameOptions] (val x: Self) extends AnyVal {
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
    def withoutFull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full")(js.undefined)
        ret
    }
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
    def withMiddle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiddle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middle")(js.undefined)
        ret
    }
    @scala.inline
    def withMiddle_initial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middle_initial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiddle_initial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middle_initial")(js.undefined)
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
    @scala.inline
    def withPrefix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(js.undefined)
        ret
    }
  }
  
}

