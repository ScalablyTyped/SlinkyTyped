package typingsSlinky.minappEnv.anon

import typingsSlinky.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined minapp-env.RQ<minapp-env.DB.ICountDocumentOptions> */
@js.native
trait RQICountDocumentOptions extends js.Object {
  var config: js.UndefOr[ICloudConfig] = js.native
}

object RQICountDocumentOptions {
  @scala.inline
  def apply(): RQICountDocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RQICountDocumentOptions]
  }
  @scala.inline
  implicit class RQICountDocumentOptionsOps[Self <: RQICountDocumentOptions] (val x: Self) extends AnyVal {
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

