package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNextPageNumber extends js.Object {
  var nextPage: Double = js.native
}

object AnonNextPageNumber {
  @scala.inline
  def apply(nextPage: Double): AnonNextPageNumber = {
    val __obj = js.Dynamic.literal(nextPage = nextPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNextPageNumber]
  }
  @scala.inline
  implicit class AnonNextPageNumberOps[Self <: AnonNextPageNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

