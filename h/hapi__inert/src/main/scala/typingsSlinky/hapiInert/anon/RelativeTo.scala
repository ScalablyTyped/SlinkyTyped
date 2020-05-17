package typingsSlinky.hapiInert.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelativeTo extends js.Object {
  /**
    * Set the relative path
    */
  var relativeTo: String = js.native
}

object RelativeTo {
  @scala.inline
  def apply(relativeTo: String): RelativeTo = {
    val __obj = js.Dynamic.literal(relativeTo = relativeTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeTo]
  }
  @scala.inline
  implicit class RelativeToOps[Self <: RelativeTo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRelativeTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeTo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

