package typingsSlinky.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnv(value: String | InitCloudEnvOptions): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setTraceUser(value: Boolean): Self = this.set("traceUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraceUser: Self = this.set("traceUser", js.undefined)
  }
}
