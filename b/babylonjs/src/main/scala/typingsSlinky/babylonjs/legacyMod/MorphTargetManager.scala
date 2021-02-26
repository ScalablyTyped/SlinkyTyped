package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object MorphTargetManager {
  
  /**
    * Creates a new MorphTargetManager from serialized data
    * @param serializationObject defines the serialized data
    * @param scene defines the hosting scene
    * @returns the new MorphTargetManager
    */
  @JSImport("babylonjs/Legacy/legacy", "MorphTargetManager.Parse")
  @js.native
  def Parse(serializationObject: js.Any, scene: typingsSlinky.babylonjs.sceneMod.Scene): typingsSlinky.babylonjs.morphTargetManagerMod.MorphTargetManager = js.native
}
