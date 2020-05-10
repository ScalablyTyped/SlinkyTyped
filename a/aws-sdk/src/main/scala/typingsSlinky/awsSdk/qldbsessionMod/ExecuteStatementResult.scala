package typingsSlinky.awsSdk.qldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteStatementResult extends js.Object {
  /**
    * Contains the details of the first fetched page.
    */
  var FirstPage: js.UndefOr[Page] = js.native
}

object ExecuteStatementResult {
  @scala.inline
  def apply(): ExecuteStatementResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteStatementResult]
  }
  @scala.inline
  implicit class ExecuteStatementResultOps[Self <: ExecuteStatementResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstPage(value: Page): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstPage")(js.undefined)
        ret
    }
  }
  
}

