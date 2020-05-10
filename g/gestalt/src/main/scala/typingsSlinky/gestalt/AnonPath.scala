package typingsSlinky.gestalt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPath extends js.Object {
  var __path: String = js.native
}

object AnonPath {
  @scala.inline
  def apply(__path: String): AnonPath = {
    val __obj = js.Dynamic.literal(__path = __path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPath]
  }
  @scala.inline
  implicit class AnonPathOps[Self <: AnonPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

