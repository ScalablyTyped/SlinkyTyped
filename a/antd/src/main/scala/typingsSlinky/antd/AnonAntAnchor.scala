package typingsSlinky.antd

import typingsSlinky.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAntAnchor extends js.Object {
  var antAnchor: Requireable[js.Object] = js.native
}

object AnonAntAnchor {
  @scala.inline
  def apply(antAnchor: Requireable[js.Object]): AnonAntAnchor = {
    val __obj = js.Dynamic.literal(antAnchor = antAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAntAnchor]
  }
  @scala.inline
  implicit class AnonAntAnchorOps[Self <: AnonAntAnchor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAntAnchor(value: Requireable[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antAnchor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

