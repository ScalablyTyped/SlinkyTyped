package typingsSlinky.jointjs.mod.dia.ElementView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteractivityOptions extends js.Object {
  var addLinkFromMagnet: js.UndefOr[Boolean] = js.native
  var elementMove: js.UndefOr[Boolean] = js.native
}

object InteractivityOptions {
  @scala.inline
  def apply(): InteractivityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InteractivityOptions]
  }
  @scala.inline
  implicit class InteractivityOptionsOps[Self <: InteractivityOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddLinkFromMagnet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addLinkFromMagnet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddLinkFromMagnet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addLinkFromMagnet")(js.undefined)
        ret
    }
    @scala.inline
    def withElementMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementMove")(js.undefined)
        ret
    }
  }
  
}

