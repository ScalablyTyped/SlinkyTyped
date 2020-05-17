package typingsSlinky.oakdexPokedex.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Female extends js.Object {
  var female: Double = js.native
  var male: Double = js.native
}

object Female {
  @scala.inline
  def apply(female: Double, male: Double): Female = {
    val __obj = js.Dynamic.literal(female = female.asInstanceOf[js.Any], male = male.asInstanceOf[js.Any])
    __obj.asInstanceOf[Female]
  }
  @scala.inline
  implicit class FemaleOps[Self <: Female] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFemale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("female")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("male")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

