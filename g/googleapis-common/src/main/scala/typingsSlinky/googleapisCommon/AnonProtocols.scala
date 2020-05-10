package typingsSlinky.googleapisCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonProtocols extends js.Object {
  var protocols: AnonSimple = js.native
}

object AnonProtocols {
  @scala.inline
  def apply(protocols: AnonSimple): AnonProtocols = {
    val __obj = js.Dynamic.literal(protocols = protocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProtocols]
  }
  @scala.inline
  implicit class AnonProtocolsOps[Self <: AnonProtocols] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProtocols(value: AnonSimple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocols")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

