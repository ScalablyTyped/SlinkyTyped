package typingsSlinky.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined minapp-env.RQ<minapp-env.DB.IRemoveSingleDocumentOptions> */
@js.native
trait RQIRemoveSingleDocumentOp extends js.Object {
  var config: js.UndefOr[ICloudConfig] = js.native
}

object RQIRemoveSingleDocumentOp {
  @scala.inline
  def apply(): RQIRemoveSingleDocumentOp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RQIRemoveSingleDocumentOp]
  }
  @scala.inline
  implicit class RQIRemoveSingleDocumentOpOps[Self <: RQIRemoveSingleDocumentOp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

