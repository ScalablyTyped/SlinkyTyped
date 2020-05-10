package typingsSlinky.npmPaths

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCwd extends js.Object {
  var cwd: String = js.native
}

object AnonCwd {
  @scala.inline
  def apply(cwd: String): AnonCwd = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCwd]
  }
  @scala.inline
  implicit class AnonCwdOps[Self <: AnonCwd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

