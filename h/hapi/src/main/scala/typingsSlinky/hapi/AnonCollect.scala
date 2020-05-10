package typingsSlinky.hapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCollect extends js.Object {
  var collect: Boolean = js.native
}

object AnonCollect {
  @scala.inline
  def apply(collect: Boolean): AnonCollect = {
    val __obj = js.Dynamic.literal(collect = collect.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCollect]
  }
  @scala.inline
  implicit class AnonCollectOps[Self <: AnonCollect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collect")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

