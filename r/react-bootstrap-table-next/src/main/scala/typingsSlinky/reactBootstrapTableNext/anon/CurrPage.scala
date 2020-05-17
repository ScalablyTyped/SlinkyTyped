package typingsSlinky.reactBootstrapTableNext.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrPage extends js.Object {
  var currPage: Double = js.native
  var currSizePerPage: Double = js.native
}

object CurrPage {
  @scala.inline
  def apply(currPage: Double, currSizePerPage: Double): CurrPage = {
    val __obj = js.Dynamic.literal(currPage = currPage.asInstanceOf[js.Any], currSizePerPage = currSizePerPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrPage]
  }
  @scala.inline
  implicit class CurrPageOps[Self <: CurrPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrSizePerPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currSizePerPage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

