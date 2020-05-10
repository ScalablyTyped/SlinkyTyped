package typingsSlinky.antd

import typingsSlinky.antd.anchorAnchorMod.AntAnchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAntAnchorAntAnchor extends js.Object {
  var antAnchor: AntAnchor = js.native
}

object AnonAntAnchorAntAnchor {
  @scala.inline
  def apply(antAnchor: AntAnchor): AnonAntAnchorAntAnchor = {
    val __obj = js.Dynamic.literal(antAnchor = antAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAntAnchorAntAnchor]
  }
  @scala.inline
  implicit class AnonAntAnchorAntAnchorOps[Self <: AnonAntAnchorAntAnchor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAntAnchor(value: AntAnchor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antAnchor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

