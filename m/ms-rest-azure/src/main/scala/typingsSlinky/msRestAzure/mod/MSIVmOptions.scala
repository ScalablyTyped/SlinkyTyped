package typingsSlinky.msRestAzure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSIVmOptions extends MSIOptions {
  /**
    * @prop {number} [port] - port on which the MSI service is running on the host VM. Default port is 50342
    */
  var port: js.UndefOr[Double] = js.native
}

object MSIVmOptions {
  @scala.inline
  def apply(): MSIVmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSIVmOptions]
  }
  @scala.inline
  implicit class MSIVmOptionsOps[Self <: MSIVmOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
  }
  
}

