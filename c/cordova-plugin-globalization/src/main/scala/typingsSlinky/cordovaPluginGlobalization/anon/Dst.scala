package typingsSlinky.cordovaPluginGlobalization.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dst extends js.Object {
  var dst: Boolean = js.native
}

object Dst {
  @scala.inline
  def apply(dst: Boolean): Dst = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dst]
  }
  @scala.inline
  implicit class DstOps[Self <: Dst] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dst")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

