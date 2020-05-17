package typingsSlinky.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HouseNumber extends js.Object {
  var City: Double = js.native
  var HouseNumber: Double = js.native
  var Street: js.Array[Double] = js.native
}

object HouseNumber {
  @scala.inline
  def apply(City: Double, HouseNumber: Double, Street: js.Array[Double]): HouseNumber = {
    val __obj = js.Dynamic.literal(City = City.asInstanceOf[js.Any], HouseNumber = HouseNumber.asInstanceOf[js.Any], Street = Street.asInstanceOf[js.Any])
    __obj.asInstanceOf[HouseNumber]
  }
  @scala.inline
  implicit class HouseNumberOps[Self <: HouseNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("City")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHouseNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HouseNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreet(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Street")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

