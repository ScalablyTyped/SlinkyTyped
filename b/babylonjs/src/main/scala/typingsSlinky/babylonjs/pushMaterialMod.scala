package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.effectMod.Effect
import typingsSlinky.babylonjs.materialMod.Material
import typingsSlinky.babylonjs.mathVectorMod.Matrix
import typingsSlinky.babylonjs.meshMod.Mesh
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.subMeshMod.SubMesh
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/pushMaterial", JSImport.Namespace)
@js.native
object pushMaterialMod extends js.Object {
  
  @js.native
  class PushMaterial protected () extends Material {
    def this(name: String, scene: Scene) = this()
    
    var _activeEffect: Effect = js.native
    
    /* protected */ def _afterBind(mesh: Mesh, effect: Nullable[Effect]): Unit = js.native
    
    /* protected */ def _isReadyForSubMesh(subMesh: SubMesh): Boolean = js.native
    
    /* protected */ def _mustRebind(scene: Scene, effect: Effect): Boolean = js.native
    /* protected */ def _mustRebind(scene: Scene, effect: Effect, visibility: Double): Boolean = js.native
    
    var _normalMatrix: Matrix = js.native
    
    /**
      * Binds the given normal matrix to the active effect
      *
      * @param normalMatrix the matrix to bind
      */
    def bindOnlyNormalMatrix(normalMatrix: Matrix): Unit = js.native
  }
}
