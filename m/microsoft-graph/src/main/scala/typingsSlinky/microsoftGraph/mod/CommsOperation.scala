package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommsOperation extends Entity {
  var clientContext: js.UndefOr[String] = js.native
  var resultInfo: js.UndefOr[ResultInfo] = js.native
  var status: js.UndefOr[OperationStatus] = js.native
}

object CommsOperation {
  @scala.inline
  def apply(): CommsOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommsOperation]
  }
  @scala.inline
  implicit class CommsOperationOps[Self <: CommsOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientContext")(js.undefined)
        ret
    }
    @scala.inline
    def withResultInfo(value: ResultInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: OperationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

