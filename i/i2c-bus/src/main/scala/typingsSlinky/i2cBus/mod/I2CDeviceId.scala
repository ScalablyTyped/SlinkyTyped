package typingsSlinky.i2cBus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait I2CDeviceId extends js.Object {
  var manufacturer: Double = js.native
  var name: String = js.native
  var product: Double = js.native
}

object I2CDeviceId {
  @scala.inline
  def apply(manufacturer: Double, name: String, product: Double): I2CDeviceId = {
    val __obj = js.Dynamic.literal(manufacturer = manufacturer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any])
    __obj.asInstanceOf[I2CDeviceId]
  }
  @scala.inline
  implicit class I2CDeviceIdOps[Self <: I2CDeviceId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManufacturer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProduct(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

