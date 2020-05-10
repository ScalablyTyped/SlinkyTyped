package typingsSlinky.docxTemplates

import typingsSlinky.docxTemplates.typesMod.BufferStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWp extends js.Object {
  @JSName("w:p")
  var wColonp: BufferStatus = js.native
  @JSName("w:tr")
  var wColontr: BufferStatus = js.native
}

object AnonWp {
  @scala.inline
  def apply(wColonp: BufferStatus, wColontr: BufferStatus): AnonWp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("w:p")(wColonp.asInstanceOf[js.Any])
    __obj.updateDynamic("w:tr")(wColontr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWp]
  }
  @scala.inline
  implicit class AnonWpOps[Self <: AnonWp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWColonp(value: BufferStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w:p")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWColontr(value: BufferStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w:tr")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

