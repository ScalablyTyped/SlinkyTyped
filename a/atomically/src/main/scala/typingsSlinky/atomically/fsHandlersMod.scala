package typingsSlinky.atomically

import typingsSlinky.atomically.typesMod.Exception
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("atomically/dist/utils/fs_handlers", JSImport.Namespace)
@js.native
object fsHandlersMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def isChangeErrorOk(error: Exception): Boolean = js.native
    
    def isRetriableError(error: Exception): Boolean = js.native
    
    def onChangeError(error: Exception): Unit = js.native
  }
}
