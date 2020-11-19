package typingsSlinky.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "Skeleton")
@js.native
class Skeleton protected ()
  extends typingsSlinky.babylonjs.legacyMod.Skeleton {
  /**
    * Creates a new skeleton
    * @param name defines the skeleton name
    * @param id defines the skeleton Id
    * @param scene defines the hosting scene
    */
  def this(
    /** defines the skeleton name */
  name: String,
    /** defines the skeleton Id */
  id: String,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ) = this()
}
/* static members */
@JSImport("babylonjs", "Skeleton")
@js.native
object Skeleton extends js.Object {
  
  /**
    * Creates a new skeleton from serialized data
    * @param parsedSkeleton defines the serialized data
    * @param scene defines the hosting scene
    * @returns a new skeleton
    */
  def Parse(parsedSkeleton: js.Any, scene: typingsSlinky.babylonjs.sceneMod.Scene): typingsSlinky.babylonjs.skeletonMod.Skeleton = js.native
}
