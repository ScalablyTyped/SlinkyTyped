package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "MorphTargetManager")
@js.native
/**
  * Creates a new MorphTargetManager
  * @param scene defines the current scene
  */
class MorphTargetManager ()
  extends typingsSlinky.babylonjs.indexMod.MorphTargetManager {
  def this(scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]) = this()
}

/* static members */
@JSImport("babylonjs/Legacy/legacy", "MorphTargetManager")
@js.native
object MorphTargetManager extends js.Object {
  /**
    * Creates a new MorphTargetManager from serialized data
    * @param serializationObject defines the serialized data
    * @param scene defines the hosting scene
    * @returns the new MorphTargetManager
    */
  def Parse(serializationObject: js.Any, scene: typingsSlinky.babylonjs.sceneMod.Scene): typingsSlinky.babylonjs.morphTargetManagerMod.MorphTargetManager = js.native
}

