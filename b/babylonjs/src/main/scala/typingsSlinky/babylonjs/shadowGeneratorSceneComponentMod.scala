package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.sceneComponentMod.ISceneSerializableComponent
import typingsSlinky.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Lights/Shadows/shadowGeneratorSceneComponent", JSImport.Namespace)
@js.native
object shadowGeneratorSceneComponentMod extends js.Object {
  
  @js.native
  class ShadowGeneratorSceneComponent protected () extends ISceneSerializableComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
    var _gatherRenderTargets: js.Any = js.native
  }
}
