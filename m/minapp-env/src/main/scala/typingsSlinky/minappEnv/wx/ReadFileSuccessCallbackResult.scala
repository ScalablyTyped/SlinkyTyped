package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadFileSuccessCallbackResult extends StObject {
  
  /** 文件内容 */
  var data: String | ArrayBuffer = js.native
}
object ReadFileSuccessCallbackResult {
  
  @scala.inline
  def apply(data: String | ArrayBuffer): ReadFileSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadFileSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class ReadFileSuccessCallbackResultMutableBuilder[Self <: ReadFileSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String | ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
