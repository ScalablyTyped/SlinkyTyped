package typingsSlinky.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.depthRendererMod.DepthRenderer
import typingsSlinky.babylonjs.sceneComponentMod.ISceneComponent
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object depthRendererSceneComponentMod {
  
  @JSImport("babylonjs/Rendering/depthRendererSceneComponent", "DepthRendererSceneComponent")
  @js.native
  class DepthRendererSceneComponent protected () extends ISceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
    var _gatherActiveCameraRenderTargets: js.Any = js.native
    
    var _gatherRenderTargets: js.Any = js.native
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /** @hidden (Backing field) */
      var _depthRenderer: StringDictionary[DepthRenderer] = js.native
      
      /**
        * Disables a depth renderer for a given camera
        * @param camera The camera to disable the depth renderer on (default: scene's active camera)
        */
      def disableDepthRenderer(): Unit = js.native
      def disableDepthRenderer(camera: Nullable[Camera]): Unit = js.native
      
      /**
        * Creates a depth renderer a given camera which contains a depth map which can be used for post processing.
        * @param camera The camera to create the depth renderer on (default: scene's active camera)
        * @param storeNonLinearDepth Defines whether the depth is stored linearly like in Babylon Shadows or directly like glFragCoord.z
        * @param force32bitsFloat Forces 32 bits float when supported (else 16 bits float is prioritized over 32 bits float if supported)
        * @returns the created depth renderer
        */
      def enableDepthRenderer(): DepthRenderer = js.native
      def enableDepthRenderer(
        camera: js.UndefOr[Nullable[Camera]],
        storeNonLinearDepth: js.UndefOr[scala.Nothing],
        force32bitsFloat: Boolean
      ): DepthRenderer = js.native
      def enableDepthRenderer(camera: js.UndefOr[Nullable[Camera]], storeNonLinearDepth: Boolean): DepthRenderer = js.native
      def enableDepthRenderer(camera: js.UndefOr[Nullable[Camera]], storeNonLinearDepth: Boolean, force32bitsFloat: Boolean): DepthRenderer = js.native
      def enableDepthRenderer(camera: Nullable[Camera]): DepthRenderer = js.native
    }
  }
}
