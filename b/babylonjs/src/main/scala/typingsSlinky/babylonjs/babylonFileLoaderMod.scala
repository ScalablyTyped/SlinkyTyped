package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Loading/Plugins/babylonFileLoader", JSImport.Namespace)
@js.native
object babylonFileLoaderMod extends js.Object {
  
  @JSName("_BabylonLoaderRegistered")
  var BabylonLoaderRegistered: Boolean = js.native
  
  @js.native
  class BabylonFileLoaderConfiguration () extends js.Object
  /* static members */
  @js.native
  object BabylonFileLoaderConfiguration extends js.Object {
    
    /**
      * The loader does not allow injecting custom physix engine into the plugins.
      * Unfortunately in ES6, we need to manually inject them into the plugin.
      * So you could set this variable to your engine import to make it work.
      */
    var LoaderInjectedPhysicsEngine: js.Any = js.native
  }
}
