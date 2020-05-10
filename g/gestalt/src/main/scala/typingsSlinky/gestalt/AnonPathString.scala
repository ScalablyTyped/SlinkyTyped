package typingsSlinky.gestalt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPathString extends js.Object {
  var _path: String = js.native
}

object AnonPathString {
  @scala.inline
  def apply(_path: String): AnonPathString = {
    val __obj = js.Dynamic.literal(_path = _path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPathString]
  }
  @scala.inline
  implicit class AnonPathStringOps[Self <: AnonPathString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

