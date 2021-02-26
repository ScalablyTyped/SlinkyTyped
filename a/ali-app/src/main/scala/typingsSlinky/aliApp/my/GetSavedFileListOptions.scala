package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.anon.FileList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSavedFileListOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_GetSavedFileListOptions: js.UndefOr[js.Function1[/* res */ FileList, Unit]] = js.native
}
object GetSavedFileListOptions {
  
  @scala.inline
  def apply(): GetSavedFileListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSavedFileListOptions]
  }
  
  @scala.inline
  implicit class GetSavedFileListOptionsMutableBuilder[Self <: GetSavedFileListOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* res */ FileList => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
