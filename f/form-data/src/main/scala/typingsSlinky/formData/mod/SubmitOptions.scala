package typingsSlinky.formData.mod

import typingsSlinky.formData.formDataStrings.httpColon
import typingsSlinky.formData.formDataStrings.httpsColon
import typingsSlinky.node.httpMod.ClientRequestArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubmitOptions extends ClientRequestArgs {
  @JSName("protocol")
  var protocol_SubmitOptions: js.UndefOr[httpsColon | httpColon] = js.native
}

object SubmitOptions {
  @scala.inline
  def apply(): SubmitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitOptions]
  }
  @scala.inline
  implicit class SubmitOptionsOps[Self <: SubmitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProtocol(value: httpsColon | httpColon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
  }
  
}

