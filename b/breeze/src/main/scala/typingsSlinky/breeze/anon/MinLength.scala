package typingsSlinky.breeze.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinLength extends js.Object {
  var maxLength: Double = js.native
  var messageTemplate: js.UndefOr[String] = js.native
  var minLength: Double = js.native
}

object MinLength {
  @scala.inline
  def apply(maxLength: Double, minLength: Double): MinLength = {
    val __obj = js.Dynamic.literal(maxLength = maxLength.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinLength]
  }
  @scala.inline
  implicit class MinLengthOps[Self <: MinLength] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageTemplate")(js.undefined)
        ret
    }
  }
  
}

