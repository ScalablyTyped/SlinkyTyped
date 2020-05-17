package typingsSlinky.projectOxford.mod.FaceResponses

import typingsSlinky.projectOxford.anon.Pitch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attributes extends js.Object {
  var age: Double = js.native
  var gender: String = js.native
  var headPose: Pitch = js.native
}

object Attributes {
  @scala.inline
  def apply(age: Double, gender: String, headPose: Pitch): Attributes = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], headPose = headPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  @scala.inline
  implicit class AttributesOps[Self <: Attributes] (val x: Self) extends AnyVal {
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
    def withGender(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeadPose(value: Pitch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headPose")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

