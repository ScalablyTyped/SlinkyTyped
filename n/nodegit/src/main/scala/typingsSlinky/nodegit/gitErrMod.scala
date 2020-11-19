package typingsSlinky.nodegit

import typingsSlinky.nodegit.errorMod.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/git-err", JSImport.Namespace)
@js.native
object gitErrMod extends js.Object {
  
  @js.native
  class Giterr () extends js.Object
  /* static members */
  @js.native
  object Giterr extends js.Object {
    
    def errClear(): Unit = js.native
    
    def errLast(): Error = js.native
    
    def errSetOom(): Unit = js.native
    
    def errSetString(errorClass: Double, string: String): Unit = js.native
  }
}
