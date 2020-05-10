package typingsSlinky.awsIotDeviceSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingShadowOptions extends DeviceOptions {
  /** the timeout for thing operations (default 10 seconds) */
  var operationTimeout: js.UndefOr[Double] = js.native
}

object ThingShadowOptions {
  @scala.inline
  def apply(): ThingShadowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingShadowOptions]
  }
  @scala.inline
  implicit class ThingShadowOptionsOps[Self <: ThingShadowOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperationTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationTimeout")(js.undefined)
        ret
    }
  }
  
}

