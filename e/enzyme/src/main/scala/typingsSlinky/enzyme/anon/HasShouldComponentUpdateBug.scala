package typingsSlinky.enzyme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasShouldComponentUpdateBug extends js.Object {
  var hasShouldComponentUpdateBug: Boolean = js.native
}

object HasShouldComponentUpdateBug {
  @scala.inline
  def apply(hasShouldComponentUpdateBug: Boolean): HasShouldComponentUpdateBug = {
    val __obj = js.Dynamic.literal(hasShouldComponentUpdateBug = hasShouldComponentUpdateBug.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasShouldComponentUpdateBug]
  }
  @scala.inline
  implicit class HasShouldComponentUpdateBugOps[Self <: HasShouldComponentUpdateBug] (val x: Self) extends AnyVal {
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

