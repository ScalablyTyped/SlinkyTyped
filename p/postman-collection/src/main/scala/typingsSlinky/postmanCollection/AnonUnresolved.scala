package typingsSlinky.postmanCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUnresolved extends js.Object {
  var unresolved: Boolean = js.native
}

object AnonUnresolved {
  @scala.inline
  def apply(unresolved: Boolean): AnonUnresolved = {
    val __obj = js.Dynamic.literal(unresolved = unresolved.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUnresolved]
  }
  @scala.inline
  implicit class AnonUnresolvedOps[Self <: AnonUnresolved] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnresolved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unresolved")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

