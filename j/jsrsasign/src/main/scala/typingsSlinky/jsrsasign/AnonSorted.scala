package typingsSlinky.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSorted extends js.Object {
  var sorted: Boolean = js.native
}

object AnonSorted {
  @scala.inline
  def apply(sorted: Boolean): AnonSorted = {
    val __obj = js.Dynamic.literal(sorted = sorted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSorted]
  }
  @scala.inline
  implicit class AnonSortedOps[Self <: AnonSorted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSorted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

