package typingsSlinky.babylonjs.miscIndexMod

import typingsSlinky.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "SceneSerializer")
@js.native
class SceneSerializer ()
  extends typingsSlinky.babylonjs.sceneSerializerMod.SceneSerializer
/* static members */
object SceneSerializer {
  
  /**
    * Clear cache used by a previous serialization
    */
  @JSImport("babylonjs/Misc/index", "SceneSerializer.ClearCache")
  @js.native
  def ClearCache(): Unit = js.native
  
  /**
    * Serialize a scene into a JSON compatible object
    * @param scene defines the scene to serialize
    * @returns a JSON compatible object
    */
  @JSImport("babylonjs/Misc/index", "SceneSerializer.Serialize")
  @js.native
  def Serialize(scene: Scene): js.Any = js.native
  
  /**
    * Serialize a mesh into a JSON compatible object
    * @param toSerialize defines the mesh to serialize
    * @param withParents defines if parents must be serialized as well
    * @param withChildren defines if children must be serialized as well
    * @returns a JSON compatible object
    */
  @JSImport("babylonjs/Misc/index", "SceneSerializer.SerializeMesh")
  @js.native
  def SerializeMesh(toSerialize: js.Any): js.Any = js.native
  @JSImport("babylonjs/Misc/index", "SceneSerializer.SerializeMesh")
  @js.native
  def SerializeMesh(toSerialize: js.Any, withParents: js.UndefOr[scala.Nothing], withChildren: Boolean): js.Any = js.native
  @JSImport("babylonjs/Misc/index", "SceneSerializer.SerializeMesh")
  @js.native
  def SerializeMesh(toSerialize: js.Any, withParents: Boolean): js.Any = js.native
  @JSImport("babylonjs/Misc/index", "SceneSerializer.SerializeMesh")
  @js.native
  def SerializeMesh(toSerialize: js.Any, withParents: Boolean, withChildren: Boolean): js.Any = js.native
}
