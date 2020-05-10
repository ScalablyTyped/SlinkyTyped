package typingsSlinky.jimpCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<{  class  :any}> */
@js.native
trait Requiredclassany extends js.Object {
  var `class`: js.Any = js.native
}

object Requiredclassany {
  @scala.inline
  def apply(`class`: js.Any): Requiredclassany = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Requiredclassany]
  }
  @scala.inline
  implicit class RequiredclassanyOps[Self <: Requiredclassany] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClass(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

