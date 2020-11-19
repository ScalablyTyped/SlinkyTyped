package typingsSlinky.ink

import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ink/build/components/AppContext", JSImport.Namespace)
@js.native
object appContextMod extends js.Object {
  
  /**
    * `AppContext` is a React context, which exposes a method to manually exit the app (unmount).
    */
  val default: Context[Props] = js.native
  
  @js.native
  trait Props extends js.Object {
    
    /**
      * Exit (unmount) the whole Ink app.
      */
    def exit(): Unit = js.native
    def exit(error: js.Error): Unit = js.native
  }
}
