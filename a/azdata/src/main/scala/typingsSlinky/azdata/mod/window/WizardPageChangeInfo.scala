package typingsSlinky.azdata.mod.window

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WizardPageChangeInfo extends js.Object {
  /**
  			 * The page number that the wizard changed from
  			 */
  var lastPage: Double = js.native
  /**
  			 * The new page number or undefined if the user is closing the wizard
  			 */
  var newPage: Double = js.native
}

object WizardPageChangeInfo {
  @scala.inline
  def apply(lastPage: Double, newPage: Double): WizardPageChangeInfo = {
    val __obj = js.Dynamic.literal(lastPage = lastPage.asInstanceOf[js.Any], newPage = newPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[WizardPageChangeInfo]
  }
  @scala.inline
  implicit class WizardPageChangeInfoOps[Self <: WizardPageChangeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

