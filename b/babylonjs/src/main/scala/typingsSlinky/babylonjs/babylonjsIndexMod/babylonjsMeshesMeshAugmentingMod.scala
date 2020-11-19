package typingsSlinky.babylonjs.babylonjsIndexMod

import typingsSlinky.babylonjs.anon.Data
import typingsSlinky.babylonjs.meshSimplificationMod.ISimplificationSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("babylonjs/Meshes/index", "babylonjs/Meshes/mesh")
@js.native
object babylonjsMeshesMeshAugmentingMod extends js.Object {
  
  @js.native
  trait Mesh extends js.Object {
    
    /** @hidden */
    var _userInstancedBuffersStorage: Data = js.native
    
    /**
      * Register a custom buffer that will be instanced
      * @see https://doc.babylonjs.com/how_to/how_to_use_instances#custom-buffers
      * @param kind defines the buffer kind
      * @param stride defines the stride in floats
      */
    def registerInstancedBuffer(kind: String, stride: Double): Unit = js.native
    
    /**
      * Simplify the mesh according to the given array of settings.
      * Function will return immediately and will simplify async
      * @param settings a collection of simplification settings
      * @param parallelProcessing should all levels calculate parallel or one after the other
      * @param simplificationType the type of simplification to run
      * @param successCallback optional success callback to be called after the simplification finished processing all settings
      * @returns the current mesh
      */
    def simplify(settings: js.Array[ISimplificationSettings]): typingsSlinky.babylonjs.meshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: js.UndefOr[scala.Nothing],
      simplificationType: js.UndefOr[scala.Nothing],
      successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
    ): typingsSlinky.babylonjs.meshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: js.UndefOr[scala.Nothing],
      simplificationType: typingsSlinky.babylonjs.meshSimplificationMod.SimplificationType
    ): typingsSlinky.babylonjs.meshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: js.UndefOr[scala.Nothing],
      simplificationType: typingsSlinky.babylonjs.meshSimplificationMod.SimplificationType,
      successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
    ): typingsSlinky.babylonjs.meshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(settings: js.Array[ISimplificationSettings], parallelProcessing: Boolean): typingsSlinky.babylonjs.meshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: Boolean,
      simplificationType: js.UndefOr[scala.Nothing],
      successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
    ): typingsSlinky.babylonjs.meshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: Boolean,
      simplificationType: typingsSlinky.babylonjs.meshSimplificationMod.SimplificationType
    ): typingsSlinky.babylonjs.meshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: Boolean,
      simplificationType: typingsSlinky.babylonjs.meshSimplificationMod.SimplificationType,
      successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
    ): typingsSlinky.babylonjs.meshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
  }
}
