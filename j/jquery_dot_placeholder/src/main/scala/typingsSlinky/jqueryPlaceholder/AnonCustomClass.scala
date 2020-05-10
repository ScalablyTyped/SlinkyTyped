package typingsSlinky.jqueryPlaceholder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCustomClass extends js.Object {
  var customClass: String = js.native
}

object AnonCustomClass {
  @scala.inline
  def apply(customClass: String): AnonCustomClass = {
    val __obj = js.Dynamic.literal(customClass = customClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomClass]
  }
  @scala.inline
  implicit class AnonCustomClassOps[Self <: AnonCustomClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customClass")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

