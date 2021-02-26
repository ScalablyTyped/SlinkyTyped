package typingsSlinky.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwanIdOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_SwanIdOptions: js.UndefOr[js.Function1[/* res */ SwanIdTask, Unit]] = js.native
}
object SwanIdOptions {
  
  @scala.inline
  def apply(): SwanIdOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwanIdOptions]
  }
  
  @scala.inline
  implicit class SwanIdOptionsMutableBuilder[Self <: SwanIdOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* res */ SwanIdTask => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
