package typingsSlinky.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNextNumber extends js.Object {
  var nextNumber: Double = js.native
  var nextNumberIncrement: Double = js.native
  var stringPrefix: String = js.native
}

object AnonNextNumber {
  @scala.inline
  def apply(nextNumber: Double, nextNumberIncrement: Double, stringPrefix: String): AnonNextNumber = {
    val __obj = js.Dynamic.literal(nextNumber = nextNumber.asInstanceOf[js.Any], nextNumberIncrement = nextNumberIncrement.asInstanceOf[js.Any], stringPrefix = stringPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNextNumber]
  }
  @scala.inline
  implicit class AnonNextNumberOps[Self <: AnonNextNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextNumberIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextNumberIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringPrefix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

