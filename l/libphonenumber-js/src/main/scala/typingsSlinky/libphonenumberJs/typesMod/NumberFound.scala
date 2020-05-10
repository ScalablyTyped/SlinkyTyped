package typingsSlinky.libphonenumberJs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberFound extends js.Object {
  var endsAt: Double = js.native
  var number: PhoneNumber = js.native
  var startsAt: Double = js.native
}

object NumberFound {
  @scala.inline
  def apply(endsAt: Double, number: PhoneNumber, startsAt: Double): NumberFound = {
    val __obj = js.Dynamic.literal(endsAt = endsAt.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], startsAt = startsAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFound]
  }
  @scala.inline
  implicit class NumberFoundOps[Self <: NumberFound] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndsAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endsAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: PhoneNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartsAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startsAt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

