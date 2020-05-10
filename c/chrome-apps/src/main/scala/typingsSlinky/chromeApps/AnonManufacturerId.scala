package typingsSlinky.chromeApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonManufacturerId extends js.Object {
  /**
    * 3 character manufacturer code.
    */
  var manufacturerId: String = js.native
  /**
    * 2 byte manufacturer-assigned code.
    */
  var productId: String = js.native
  /**
    * Year of manufacturer.
    */
  var yearOfManufacture: js.UndefOr[String] = js.native
}

object AnonManufacturerId {
  @scala.inline
  def apply(manufacturerId: String, productId: String): AnonManufacturerId = {
    val __obj = js.Dynamic.literal(manufacturerId = manufacturerId.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonManufacturerId]
  }
  @scala.inline
  implicit class AnonManufacturerIdOps[Self <: AnonManufacturerId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManufacturerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYearOfManufacture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearOfManufacture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearOfManufacture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearOfManufacture")(js.undefined)
        ret
    }
  }
  
}

