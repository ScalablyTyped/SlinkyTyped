package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeSpecLoggingAccessLogFile extends js.Object {
  /**
    * The destination path for the health check request. This is only required if the specified protocol is `http`.
    */
  var path: Input[String] = js.native
}

object VirtualNodeSpecLoggingAccessLogFile {
  @scala.inline
  def apply(path: Input[String]): VirtualNodeSpecLoggingAccessLogFile = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecLoggingAccessLogFile]
  }
  @scala.inline
  implicit class VirtualNodeSpecLoggingAccessLogFileOps[Self <: VirtualNodeSpecLoggingAccessLogFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

