package typingsSlinky.knockoutPaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPaged extends js.Object {
  var paged: js.Any = js.native
}

object AnonPaged {
  @scala.inline
  def apply(paged: js.Any): AnonPaged = {
    val __obj = js.Dynamic.literal(paged = paged.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPaged]
  }
  @scala.inline
  implicit class AnonPagedOps[Self <: AnonPaged] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

