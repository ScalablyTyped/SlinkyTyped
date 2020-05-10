package typingsSlinky.reactPdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPageNumber extends js.Object {
  var pageNumber: String = js.native
}

object AnonPageNumber {
  @scala.inline
  def apply(pageNumber: String): AnonPageNumber = {
    val __obj = js.Dynamic.literal(pageNumber = pageNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPageNumber]
  }
  @scala.inline
  implicit class AnonPageNumberOps[Self <: AnonPageNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPageNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageNumber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

