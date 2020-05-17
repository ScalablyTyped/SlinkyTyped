package typingsSlinky.antd.anon

import typingsSlinky.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntAnchor extends js.Object {
  var antAnchor: Requireable[js.Object] = js.native
}

object AntAnchor {
  @scala.inline
  def apply(antAnchor: Requireable[js.Object]): AntAnchor = {
    val __obj = js.Dynamic.literal(antAnchor = antAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntAnchor]
  }
  @scala.inline
  implicit class AntAnchorOps[Self <: AntAnchor] (val x: Self) extends AnyVal {
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

