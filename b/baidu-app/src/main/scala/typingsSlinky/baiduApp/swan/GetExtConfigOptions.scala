package typingsSlinky.baiduApp.swan

import typingsSlinky.baiduApp.anon.errMsgstringExtConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetExtConfigOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  def success_MGetExtConfigOptions(res: errMsgstringExtConfig): Unit = js.native
}
object GetExtConfigOptions {
  
  @scala.inline
  def apply(success: errMsgstringExtConfig => Unit): GetExtConfigOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetExtConfigOptions]
  }
  
  @scala.inline
  implicit class GetExtConfigOptionsMutableBuilder[Self <: GetExtConfigOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: errMsgstringExtConfig => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
