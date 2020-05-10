package typingsSlinky.enzyme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHasShouldComponentUpdateBug extends js.Object {
  var hasShouldComponentUpdateBug: Boolean = js.native
}

object AnonHasShouldComponentUpdateBug {
  @scala.inline
  def apply(hasShouldComponentUpdateBug: Boolean): AnonHasShouldComponentUpdateBug = {
    val __obj = js.Dynamic.literal(hasShouldComponentUpdateBug = hasShouldComponentUpdateBug.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHasShouldComponentUpdateBug]
  }
  @scala.inline
  implicit class AnonHasShouldComponentUpdateBugOps[Self <: AnonHasShouldComponentUpdateBug] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasShouldComponentUpdateBug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasShouldComponentUpdateBug")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

