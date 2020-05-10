package typingsSlinky.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICloudConfig extends js.Object {
  var env: js.UndefOr[java.lang.String] = js.native
  var traceUser: js.UndefOr[scala.Boolean] = js.native
}

object ICloudConfig {
  @scala.inline
  def apply(): ICloudConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICloudConfig]
  }
  @scala.inline
  implicit class ICloudConfigOps[Self <: ICloudConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnv(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withTraceUser(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraceUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceUser")(js.undefined)
        ret
    }
  }
  
}

