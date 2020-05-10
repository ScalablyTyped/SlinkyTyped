package typingsSlinky.hapiInert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRelativeTo extends js.Object {
  /**
    * Set the relative path
    */
  var relativeTo: String = js.native
}

object AnonRelativeTo {
  @scala.inline
  def apply(relativeTo: String): AnonRelativeTo = {
    val __obj = js.Dynamic.literal(relativeTo = relativeTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRelativeTo]
  }
  @scala.inline
  implicit class AnonRelativeToOps[Self <: AnonRelativeTo] (val x: Self) extends AnyVal {
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

