package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "MorphTarget")
@js.native
class MorphTarget protected ()
  extends typingsSlinky.babylonjs.legacyMod.MorphTarget {
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
    scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]
  ) = this()
  def this(
    /** defines the name of the target */
  name: String,
    influence: Double,
    scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]
  ) = this()
}
/* static members */
object MorphTarget {
  
  /**
    * Creates a MorphTarget from mesh data
    * @param mesh defines the source mesh
    * @param name defines the name to use for the new target
    * @param influence defines the influence to attach to the target
    * @returns a new MorphTarget
    */
  @JSImport("babylonjs", "MorphTarget.FromMesh")
  @js.native
  def FromMesh(mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh): typingsSlinky.babylonjs.morphTargetMod.MorphTarget = js.native
  @JSImport("babylonjs", "MorphTarget.FromMesh")
  @js.native
  def FromMesh(
    mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    name: js.UndefOr[scala.Nothing],
    influence: Double
  ): typingsSlinky.babylonjs.morphTargetMod.MorphTarget = js.native
  @JSImport("babylonjs", "MorphTarget.FromMesh")
  @js.native
  def FromMesh(mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh, name: String): typingsSlinky.babylonjs.morphTargetMod.MorphTarget = js.native
  @JSImport("babylonjs", "MorphTarget.FromMesh")
  @js.native
  def FromMesh(mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh, name: String, influence: Double): typingsSlinky.babylonjs.morphTargetMod.MorphTarget = js.native
  
  /**
    * Creates a new target from serialized data
    * @param serializationObject defines the serialized data to use
    * @returns a new MorphTarget
    */
  @JSImport("babylonjs", "MorphTarget.Parse")
  @js.native
  def Parse(serializationObject: js.Any): typingsSlinky.babylonjs.morphTargetMod.MorphTarget = js.native
}
