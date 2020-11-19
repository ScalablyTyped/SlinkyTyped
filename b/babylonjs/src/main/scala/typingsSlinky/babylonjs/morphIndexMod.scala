package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Morph/index", JSImport.Namespace)
@js.native
object morphIndexMod extends js.Object {
  
  @js.native
  class MorphTarget protected ()
    extends typingsSlinky.babylonjs.morphTargetMod.MorphTarget {
    /**
      * Creates a new MorphTarget
      * @param name defines the name of the target
      * @param influence defines the influence to use
      * @param scene defines the scene the morphtarget belongs to
      */
    def this(/** defines the name of the target */
    name: String) = this()
    def this(/** defines the name of the target */
    name: String, influence: Double) = this()
    def this(
      /** defines the name of the target */
    name: String,
      influence: js.UndefOr[scala.Nothing],
      scene: Nullable[Scene]
    ) = this()
    def this(/** defines the name of the target */
    name: String, influence: Double, scene: Nullable[Scene]) = this()
  }
  /* static members */
  @js.native
  object MorphTarget extends js.Object {
    
    /**
      * Creates a MorphTarget from mesh data
      * @param mesh defines the source mesh
      * @param name defines the name to use for the new target
      * @param influence defines the influence to attach to the target
      * @returns a new MorphTarget
      */
    def FromMesh(mesh: AbstractMesh): typingsSlinky.babylonjs.morphTargetMod.MorphTarget = js.native
    def FromMesh(mesh: AbstractMesh, name: js.UndefOr[scala.Nothing], influence: Double): typingsSlinky.babylonjs.morphTargetMod.MorphTarget = js.native
    def FromMesh(mesh: AbstractMesh, name: String): typingsSlinky.babylonjs.morphTargetMod.MorphTarget = js.native
    def FromMesh(mesh: AbstractMesh, name: String, influence: Double): typingsSlinky.babylonjs.morphTargetMod.MorphTarget = js.native
    
    /**
      * Creates a new target from serialized data
      * @param serializationObject defines the serialized data to use
      * @returns a new MorphTarget
      */
    def Parse(serializationObject: js.Any): typingsSlinky.babylonjs.morphTargetMod.MorphTarget = js.native
  }
  
  @js.native
  /**
    * Creates a new MorphTargetManager
    * @param scene defines the current scene
    */
  class MorphTargetManager ()
    extends typingsSlinky.babylonjs.morphTargetManagerMod.MorphTargetManager {
    def this(scene: Nullable[Scene]) = this()
  }
  /* static members */
  @js.native
  object MorphTargetManager extends js.Object {
    
    /**
      * Creates a new MorphTargetManager from serialized data
      * @param serializationObject defines the serialized data
      * @param scene defines the hosting scene
      * @returns the new MorphTargetManager
      */
    def Parse(serializationObject: js.Any, scene: Scene): typingsSlinky.babylonjs.morphTargetManagerMod.MorphTargetManager = js.native
  }
}
