package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.behaviorMod.Behavior
import typingsSlinky.babylonjs.meshMod.Mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Behaviors/Meshes/fadeInOutBehavior", JSImport.Namespace)
@js.native
object fadeInOutBehaviorMod extends js.Object {
  
  @js.native
  /**
    * Instatiates the FadeInOutBehavior
    */
  class FadeInOutBehavior () extends Behavior[Mesh] {
    
    var _hoverValue: js.Any = js.native
    
    var _hovered: js.Any = js.native
    
    var _millisecondsPerFrame: js.Any = js.native
    
    var _ownerNode: js.Any = js.native
    
    var _setAllVisibility: js.Any = js.native
    
    var _update: js.Any = js.native
    
    /**
      * Time in milliseconds to delay before fading in (Default: 0)
      */
    var delay: Double = js.native
    
    /**
      * Triggers the mesh to begin fading in or out
      * @param value if the object should fade in or out (true to fade in)
      */
    def fadeIn(value: Boolean): Unit = js.native
    
    /**
      * Time in milliseconds for the mesh to fade in (Default: 300)
      */
    var fadeInTime: Double = js.native
    
    /**
      *  The name of the behavior
      */
    @JSName("name")
    def name_MFadeInOutBehavior: String = js.native
  }
}
