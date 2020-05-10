package typingsSlinky.chance.Chance

import typingsSlinky.chance.chanceStrings.all
import typingsSlinky.chance.chanceStrings.female
import typingsSlinky.chance.chanceStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  gender  :'male' | 'female' | 'all'} & chance.Chance.SuffixOptions */
@js.native
trait PrefixOptions extends js.Object {
  var full: Boolean = js.native
  var gender: male | female | all = js.native
}

object PrefixOptions {
  @scala.inline
  def apply(full: Boolean, gender: male | female | all): PrefixOptions = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefixOptions]
  }
  @scala.inline
  implicit class PrefixOptionsOps[Self <: PrefixOptions] (val x: Self) extends AnyVal {
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
    def withGender(value: male | female | all): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

