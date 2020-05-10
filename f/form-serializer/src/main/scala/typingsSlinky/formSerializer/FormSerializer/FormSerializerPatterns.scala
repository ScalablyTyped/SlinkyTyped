package typingsSlinky.formSerializer.FormSerializer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormSerializerPatterns extends js.Object {
  var fixed: js.RegExp = js.native
  var key: js.RegExp = js.native
  var named: js.RegExp = js.native
  var push: js.RegExp = js.native
  var validate: js.RegExp = js.native
}

object FormSerializerPatterns {
  @scala.inline
  def apply(fixed: js.RegExp, key: js.RegExp, named: js.RegExp, push: js.RegExp, validate: js.RegExp): FormSerializerPatterns = {
    val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormSerializerPatterns]
  }
  @scala.inline
  implicit class FormSerializerPatternsOps[Self <: FormSerializerPatterns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFixed(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamed(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("named")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPush(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidate(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

