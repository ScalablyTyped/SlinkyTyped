package typingsSlinky.jsqubits

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDecimalPlaces extends js.Object {
  var decimalPlaces: js.UndefOr[Double] = js.native
}

object AnonDecimalPlaces {
  @scala.inline
  def apply(): AnonDecimalPlaces = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDecimalPlaces]
  }
  @scala.inline
  implicit class AnonDecimalPlacesOps[Self <: AnonDecimalPlaces] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecimalPlaces(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalPlaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimalPlaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalPlaces")(js.undefined)
        ret
    }
  }
  
}

