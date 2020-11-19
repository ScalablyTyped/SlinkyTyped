package typingsSlinky.aureliaKnockout

import typingsSlinky.aureliaDependencyInjection.mod.Container
import typingsSlinky.aureliaLoader.mod.Loader
import typingsSlinky.aureliaTemplating.mod.CompositionEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-knockout/dist/commonjs/knockout-composition", JSImport.Namespace)
@js.native
object knockoutCompositionMod extends js.Object {
  
  @js.native
  class KnockoutComposition protected () extends js.Object {
    def this(compositionEngine: CompositionEngine, container: Container, loader: Loader) = this()
    
    /** internal: do not use */
    def buildCompositionSettings(value: js.Any, bindingContext: js.Any): js.Promise[_] = js.native
    
    var compositionEngine: CompositionEngine = js.native
    
    var container: Container = js.native
    
    /** internal: do not use */
    def getViewModelInstance(moduleId: String): js.Promise[_] = js.native
    
    var loader: Loader = js.native
    
    /**
      * Registers the `compose` Knockout Binding to use Compositions in your Views.
      */
    def register(): Unit = js.native
  }
}
