package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "MorphTargetManager")
@js.native
/**
  * Creates a new MorphTargetManager
  * @param scene defines the current scene
  */
class MorphTargetManager ()
  extends typingsSlinky.babylonjs.morphIndexMod.MorphTargetManager {
  def this(scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]) = this()
}
/* static members */
@JSImport("babylonjs/index", "MorphTargetManager")
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
