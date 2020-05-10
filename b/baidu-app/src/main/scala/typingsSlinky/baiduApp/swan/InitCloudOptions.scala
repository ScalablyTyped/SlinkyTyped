package typingsSlinky.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * 定义了云开发的默认配置，该配置会作为之后调用其他所有云 API 的默认配置
	 */
@js.native
trait InitCloudOptions extends js.Object {
  /**
  		 * 默认环境配置，传入字符串形式的环境 ID 可以指定所有服务的默认环境，传入对象 initCloudEnvOptions 可以分别指定各个服务的默认环境
  		 * 默认值： default
  		 */
  var env: js.UndefOr[String | InitCloudEnvOptions] = js.native
  /**
  		 * 是否在将用户访问记录到用户管理中，在控制台中可见
  		 * 默认值： false
  		 */
  var traceUser: js.UndefOr[Boolean] = js.native
}

object InitCloudOptions {
  @scala.inline
  def apply(): InitCloudOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitCloudOptions]
  }
  @scala.inline
  implicit class InitCloudOptionsOps[Self <: InitCloudOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnv(value: String | InitCloudEnvOptions): Self = {
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
    def withTraceUser(value: Boolean): Self = {
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

