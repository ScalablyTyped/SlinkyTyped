package typingsSlinky.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsPrimary extends js.Object {
  /**
  				 * 该服务是否为主服务
  				 */
  var isPrimary: Boolean = js.native
  /**
  				 * 蓝牙设备服务的 uuid
  				 */
  var serviceId: String = js.native
}

object IsPrimary {
  @scala.inline
  def apply(isPrimary: Boolean, serviceId: String): IsPrimary = {
    val __obj = js.Dynamic.literal(isPrimary = isPrimary.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsPrimary]
  }
  @scala.inline
  implicit class IsPrimaryOps[Self <: IsPrimary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsPrimary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

