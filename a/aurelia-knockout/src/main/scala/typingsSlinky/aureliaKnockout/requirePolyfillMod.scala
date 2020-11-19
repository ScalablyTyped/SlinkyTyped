package typingsSlinky.aureliaKnockout

import typingsSlinky.aureliaLoader.mod.Loader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-knockout/dist/commonjs/require-polyfill", JSImport.Namespace)
@js.native
object requirePolyfillMod extends js.Object {
  
  @js.native
  class RequirePolyfill protected () extends js.Object {
    def this(loader: Loader) = this()
    
    var loader: Loader = js.native
    
    /**
      * Registers the `require` function if not set.
      */
    def register(): Unit = js.native
  }
}
