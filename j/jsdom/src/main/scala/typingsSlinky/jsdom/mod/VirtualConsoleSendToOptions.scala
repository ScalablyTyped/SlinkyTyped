package typingsSlinky.jsdom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualConsoleSendToOptions extends js.Object {
  var omitJSDOMErrors: Boolean = js.native
}

object VirtualConsoleSendToOptions {
  @scala.inline
  def apply(omitJSDOMErrors: Boolean): VirtualConsoleSendToOptions = {
    val __obj = js.Dynamic.literal(omitJSDOMErrors = omitJSDOMErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualConsoleSendToOptions]
  }
  @scala.inline
  implicit class VirtualConsoleSendToOptionsOps[Self <: VirtualConsoleSendToOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOmitJSDOMErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitJSDOMErrors")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

