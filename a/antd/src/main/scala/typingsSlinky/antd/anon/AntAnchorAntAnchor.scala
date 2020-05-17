package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntAnchorAntAnchor extends js.Object {
  var antAnchor: typingsSlinky.antd.anchorAnchorMod.AntAnchor = js.native
}

object AntAnchorAntAnchor {
  @scala.inline
  def apply(antAnchor: typingsSlinky.antd.anchorAnchorMod.AntAnchor): AntAnchorAntAnchor = {
    val __obj = js.Dynamic.literal(antAnchor = antAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntAnchorAntAnchor]
  }
  @scala.inline
  implicit class AntAnchorAntAnchorOps[Self <: AntAnchorAntAnchor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAntAnchor(value: typingsSlinky.antd.anchorAnchorMod.AntAnchor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antAnchor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

