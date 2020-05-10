package typingsSlinky.projectOxford

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAge extends js.Object {
  var age: Double = js.native
  var faceRectangle: AnonHeight = js.native
  var gender: String = js.native
}

object AnonAge {
  @scala.inline
  def apply(age: Double, faceRectangle: AnonHeight, gender: String): AnonAge = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], faceRectangle = faceRectangle.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAge]
  }
  @scala.inline
  implicit class AnonAgeOps[Self <: AnonAge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("age")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFaceRectangle(value: AnonHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceRectangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGender(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

