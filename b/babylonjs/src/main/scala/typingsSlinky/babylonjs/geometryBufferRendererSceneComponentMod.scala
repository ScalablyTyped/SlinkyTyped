package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.geometryBufferRendererMod.GeometryBufferRenderer
import typingsSlinky.babylonjs.sceneComponentMod.ISceneComponent
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometryBufferRendererSceneComponentMod {
  
  @JSImport("babylonjs/Rendering/geometryBufferRendererSceneComponent", "GeometryBufferRendererSceneComponent")
  @js.native
  class GeometryBufferRendererSceneComponent protected () extends ISceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
    var _gatherRenderTargets: js.Any = js.native
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /** @hidden (Backing field) */
      var _geometryBufferRenderer: Nullable[GeometryBufferRenderer] = js.native
      
      /**
        * Disables the GeometryBufferRender associated with the scene
        */
      def disableGeometryBufferRenderer(): Unit = js.native
      
      /**
        * Enables a GeometryBufferRender and associates it with the scene
        * @param ratio defines the scaling ratio to apply to the renderer (1 by default which means same resolution)
        * @returns the GeometryBufferRenderer
        */
      def enableGeometryBufferRenderer(): Nullable[GeometryBufferRenderer] = js.native
      def enableGeometryBufferRenderer(ratio: Double): Nullable[GeometryBufferRenderer] = js.native
      
      /**
        * Gets or Sets the current geometry buffer associated to the scene.
        */
      var geometryBufferRenderer: Nullable[GeometryBufferRenderer] = js.native
    }
  }
}
