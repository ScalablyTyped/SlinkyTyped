package typingsSlinky.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsSupportBLE extends js.Object {
  /**
  			 * 是否支持 BLE
  			 */
  var isSupportBLE: Boolean = js.native
}

object IsSupportBLE {
  @scala.inline
  def apply(isSupportBLE: Boolean): IsSupportBLE = {
    val __obj = js.Dynamic.literal(isSupportBLE = isSupportBLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSupportBLE]
  }
  @scala.inline
  implicit class IsSupportBLEOps[Self <: IsSupportBLE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsSupportBLE(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSupportBLE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

