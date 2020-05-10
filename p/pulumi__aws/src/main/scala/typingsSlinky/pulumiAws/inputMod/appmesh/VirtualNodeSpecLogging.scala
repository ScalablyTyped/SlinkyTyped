package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeSpecLogging extends js.Object {
  /**
    * The access log configuration for a virtual node.
    */
  var accessLog: js.UndefOr[Input[VirtualNodeSpecLoggingAccessLog]] = js.native
}

object VirtualNodeSpecLogging {
  @scala.inline
  def apply(): VirtualNodeSpecLogging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecLogging]
  }
  @scala.inline
  implicit class VirtualNodeSpecLoggingOps[Self <: VirtualNodeSpecLogging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessLog(value: Input[VirtualNodeSpecLoggingAccessLog]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessLog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessLog")(js.undefined)
        ret
    }
  }
  
}

