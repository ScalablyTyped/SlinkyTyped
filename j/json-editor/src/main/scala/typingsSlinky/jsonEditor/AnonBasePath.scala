package typingsSlinky.jsonEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBasePath extends js.Object {
  var basePath: String = js.native
}

object AnonBasePath {
  @scala.inline
  def apply(basePath: String): AnonBasePath = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBasePath]
  }
  @scala.inline
  implicit class AnonBasePathOps[Self <: AnonBasePath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

