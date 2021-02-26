package typingsSlinky.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TakePhotoSuccessCallbackResult extends StObject {
  
  /** 照片文件的临时路径 */
  var tempImagePath: String = js.native
}
object TakePhotoSuccessCallbackResult {
  
  @scala.inline
  def apply(tempImagePath: String): TakePhotoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(tempImagePath = tempImagePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TakePhotoSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class TakePhotoSuccessCallbackResultMutableBuilder[Self <: TakePhotoSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTempImagePath(value: String): Self = StObject.set(x, "tempImagePath", value.asInstanceOf[js.Any])
  }
}
