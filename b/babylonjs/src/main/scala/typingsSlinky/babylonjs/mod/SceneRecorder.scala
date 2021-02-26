package typingsSlinky.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "SceneRecorder")
@js.native
class SceneRecorder ()
  extends typingsSlinky.babylonjs.legacyMod.SceneRecorder
/* static members */
object SceneRecorder {
  
  @JSImport("babylonjs", "SceneRecorder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs", "SceneRecorder.ApplyDelta")
  @js.native
  def ApplyDelta(deltaJSON: String, scene: typingsSlinky.babylonjs.sceneMod.Scene): Unit = js.native
  /**
    * Apply a given delta to a given scene
    * @param deltaJSON defines the JSON containing the delta
    * @param scene defines the scene to apply the delta to
    */
  @JSImport("babylonjs", "SceneRecorder.ApplyDelta")
  @js.native
  def ApplyDelta(deltaJSON: js.Any, scene: typingsSlinky.babylonjs.sceneMod.Scene): Unit = js.native
  
  @JSImport("babylonjs", "SceneRecorder.GetShadowGeneratorById")
  @js.native
  def GetShadowGeneratorById: js.Any = js.native
  @scala.inline
  def GetShadowGeneratorById_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetShadowGeneratorById")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "SceneRecorder._ApplyDeltaForEntity")
  @js.native
  def _ApplyDeltaForEntity: js.Any = js.native
  @scala.inline
  def _ApplyDeltaForEntity_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ApplyDeltaForEntity")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "SceneRecorder._ApplyPropertiesToEntity")
  @js.native
  def _ApplyPropertiesToEntity: js.Any = js.native
  @scala.inline
  def _ApplyPropertiesToEntity_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ApplyPropertiesToEntity")(x.asInstanceOf[js.Any])
}
