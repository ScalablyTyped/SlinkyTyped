package typingsSlinky.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNormal extends js.Object {
  var normal: AnonMap = js.native
}

object AnonNormal {
  @scala.inline
  def apply(normal: AnonMap): AnonNormal = {
    val __obj = js.Dynamic.literal(normal = normal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNormal]
  }
  @scala.inline
  implicit class AnonNormalOps[Self <: AnonNormal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNormal(value: AnonMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

