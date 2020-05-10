package typingsSlinky.minappEnv

import typingsSlinky.minappEnv.DB.IUpdateCondition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined minapp-env.RQ<minapp-env.DB.IUpdateSingleDocumentOptions> */
@js.native
trait RQIUpdateSingleDocumentOp extends js.Object {
  var config: js.UndefOr[ICloudConfig] = js.native
  var data: IUpdateCondition = js.native
}

object RQIUpdateSingleDocumentOp {
  @scala.inline
  def apply(data: IUpdateCondition): RQIUpdateSingleDocumentOp = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQIUpdateSingleDocumentOp]
  }
  @scala.inline
  implicit class RQIUpdateSingleDocumentOpOps[Self <: RQIUpdateSingleDocumentOp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: IUpdateCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: ICloudConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
  }
  
}

