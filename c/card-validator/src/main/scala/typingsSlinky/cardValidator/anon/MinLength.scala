package typingsSlinky.cardValidator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinLength extends js.Object {
  var minLength: js.UndefOr[Double] = js.native
}

object MinLength {
  @scala.inline
  def apply(): MinLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinLength]
  }
  @scala.inline
  implicit class MinLengthOps[Self <: MinLength] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(js.undefined)
        ret
    }
  }
  
}

