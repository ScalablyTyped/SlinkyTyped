package typingsSlinky.minappEnv.anon

import typingsSlinky.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined minapp-env.RQ<minapp-env.DB.IGetDocumentOptions> */
@js.native
trait RQIGetDocumentOptions extends js.Object {
  var config: js.UndefOr[ICloudConfig] = js.native
}

object RQIGetDocumentOptions {
  @scala.inline
  def apply(): RQIGetDocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RQIGetDocumentOptions]
  }
  @scala.inline
  implicit class RQIGetDocumentOptionsOps[Self <: RQIGetDocumentOptions] (val x: Self) extends AnyVal {
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

