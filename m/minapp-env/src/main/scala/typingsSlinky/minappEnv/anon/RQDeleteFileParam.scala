package typingsSlinky.minappEnv.anon

import typingsSlinky.minappEnv.Array
import typingsSlinky.minappEnv.ICloudConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined minapp-env.RQ<minapp-env.ICloud.DeleteFileParam> */
@js.native
trait RQDeleteFileParam extends StObject {
  
  var config: js.UndefOr[ICloudConfig] = js.native
  
  var fileList: Array[String] = js.native
}
object RQDeleteFileParam {
  
  @scala.inline
  def apply(fileList: Array[String]): RQDeleteFileParam = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQDeleteFileParam]
  }
  
  @scala.inline
  implicit class RQDeleteFileParamMutableBuilder[Self <: RQDeleteFileParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: ICloudConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setFileList(value: Array[String]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
  }
}
