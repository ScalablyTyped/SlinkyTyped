package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNextPage extends js.Object {
  var nextPage: Double = js.native
  var prevPage: Double = js.native
}

object AnonNextPage {
  @scala.inline
  def apply(nextPage: Double, prevPage: Double): AnonNextPage = {
    val __obj = js.Dynamic.literal(nextPage = nextPage.asInstanceOf[js.Any], prevPage = prevPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNextPage]
  }
  @scala.inline
  implicit class AnonNextPageOps[Self <: AnonNextPage] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withPrevPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevPage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

