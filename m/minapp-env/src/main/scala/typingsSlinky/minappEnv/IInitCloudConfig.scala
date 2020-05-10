package typingsSlinky.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInitCloudConfig extends js.Object {
  var env: js.UndefOr[java.lang.String | AnonDatabase] = js.native
  var traceUser: js.UndefOr[scala.Boolean] = js.native
}

object IInitCloudConfig {
  @scala.inline
  def apply(): IInitCloudConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInitCloudConfig]
  }
  @scala.inline
  implicit class IInitCloudConfigOps[Self <: IInitCloudConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnv(value: java.lang.String | AnonDatabase): Self = {
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

