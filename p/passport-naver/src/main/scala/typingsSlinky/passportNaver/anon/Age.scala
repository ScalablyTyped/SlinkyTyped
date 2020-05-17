package typingsSlinky.passportNaver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Age extends js.Object {
  var age: Double = js.native
  var birthday: js.Any = js.native
  var email: String = js.native
  var id: String = js.native
  var nickname: String = js.native
  var profile_image: String = js.native
}

object Age {
  @scala.inline
  def apply(age: Double, birthday: js.Any, email: String, id: String, nickname: String, profile_image: String): Age = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], birthday = birthday.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], profile_image = profile_image.asInstanceOf[js.Any])
    __obj.asInstanceOf[Age]
  }
  @scala.inline
  implicit class AgeOps[Self <: Age] (val x: Self) extends AnyVal {
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
    def withBirthday(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birthday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_image(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_image")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

