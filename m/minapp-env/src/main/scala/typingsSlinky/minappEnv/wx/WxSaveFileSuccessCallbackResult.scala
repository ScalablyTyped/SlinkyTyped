package typingsSlinky.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WxSaveFileSuccessCallbackResult extends StObject {
  
  /** 存储后的文件路径 */
  var savedFilePath: Double = js.native
}
object WxSaveFileSuccessCallbackResult {
  
  @scala.inline
  def apply(savedFilePath: Double): WxSaveFileSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(savedFilePath = savedFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[WxSaveFileSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class WxSaveFileSuccessCallbackResultMutableBuilder[Self <: WxSaveFileSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSavedFilePath(value: Double): Self = StObject.set(x, "savedFilePath", value.asInstanceOf[js.Any])
  }
}
