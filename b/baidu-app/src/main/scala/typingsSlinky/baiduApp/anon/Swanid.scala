package typingsSlinky.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Swanid extends js.Object {
  var swanid: String = js.native
}

object Swanid {
  @scala.inline
  def apply(swanid: String): Swanid = {
    val __obj = js.Dynamic.literal(swanid = swanid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Swanid]
  }
  @scala.inline
  implicit class SwanidOps[Self <: Swanid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSwanid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swanid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

