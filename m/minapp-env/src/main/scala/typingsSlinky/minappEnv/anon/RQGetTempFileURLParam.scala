package typingsSlinky.minappEnv.anon

import typingsSlinky.minappEnv.Array
import typingsSlinky.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined minapp-env.RQ<minapp-env.ICloud.GetTempFileURLParam> */
@js.native
trait RQGetTempFileURLParam extends js.Object {
  
  var config: js.UndefOr[ICloudConfig] = js.native
  
  var fileList: Array[String] = js.native
}
object RQGetTempFileURLParam {
  
  @scala.inline
  def apply(fileList: Array[String]): RQGetTempFileURLParam = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQGetTempFileURLParam]
  }
  
  @scala.inline
  implicit class RQGetTempFileURLParamOps[Self <: RQGetTempFileURLParam] (val x: Self) extends AnyVal {
    
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
    def setFileList(value: Array[String]): Self = this.set("fileList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: ICloudConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
  }
}
