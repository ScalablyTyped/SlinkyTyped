package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ActionManager")
@js.native
class ActionManager protected ()
  extends typingsSlinky.babylonjs.legacyMod.ActionManager {
  /**
    * Creates a new action manager
    * @param scene defines the hosting scene
    */
  def this(scene: typingsSlinky.babylonjs.sceneMod.Scene) = this()
}
/* static members */
object ActionManager {
  
  /**
    * Get a trigger name by index
    * @param trigger defines the trigger index
    * @returns a trigger name
    */
  @JSImport("babylonjs", "ActionManager.GetTriggerName")
  @js.native
  def GetTriggerName(trigger: Double): String = js.native
  
  /**
    * Nothing
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSImport("babylonjs", "ActionManager.NothingTrigger")
  @js.native
  val NothingTrigger: Double = js.native
  
  /**
    * On center pick
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSImport("babylonjs", "ActionManager.OnCenterPickTrigger")
  @js.native
  val OnCenterPickTrigger: Double = js.native
  
  /**
    * On double pick
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSImport("babylonjs", "ActionManager.OnDoublePickTrigger")
  @js.native
  val OnDoublePickTrigger: Double = js.native
  
  /**
    * On every frame
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSImport("babylonjs", "ActionManager.OnEveryFrameTrigger")
  @js.native
  val OnEveryFrameTrigger: Double = js.native
  
  /**
    * On intersection enter
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSImport("babylonjs", "ActionManager.OnIntersectionEnterTrigger")
  @js.native
  val OnIntersectionEnterTrigger: Double = js.native
  
  /**
    * On intersection exit
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSImport("babylonjs", "ActionManager.OnIntersectionExitTrigger")
  @js.native
  val OnIntersectionExitTrigger: Double = js.native
  
  /**
    * On key down
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSImport("babylonjs", "ActionManager.OnKeyDownTrigger")
  @js.native
  val OnKeyDownTrigger: Double = js.native
  
  /**
    * On key up
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSImport("babylonjs", "ActionManager.OnKeyUpTrigger")
  @js.native
  val OnKeyUpTrigger: Double = js.native
  
  /**
    * On left pick
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSImport("babylonjs", "ActionManager.OnLeftPickTrigger")
  @js.native
  val OnLeftPickTrigger: Double = js.native
  
  /**
    * On long press
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSImport("babylonjs", "ActionManager.OnLongPressTrigger")
  @js.native
  val OnLongPressTrigger: Double = js.native
  
  /**
    * On pick down
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSImport("babylonjs", "ActionManager.OnPickDownTrigger")
  @js.native
  val OnPickDownTrigger: Double = js.native
  
  /**
    * On pick out.
    * This trigger will only be raised if you also declared a OnPickDown
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSImport("babylonjs", "ActionManager.OnPickOutTrigger")
  @js.native
  val OnPickOutTrigger: Double = js.native
  
  /**
    * On pick
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSImport("babylonjs", "ActionManager.OnPickTrigger")
  @js.native
  val OnPickTrigger: Double = js.native
  
  /**
    * On pick up
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSImport("babylonjs", "ActionManager.OnPickUpTrigger")
  @js.native
  val OnPickUpTrigger: Double = js.native
  
  /**
    * On pointer out
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSImport("babylonjs", "ActionManager.OnPointerOutTrigger")
  @js.native
  val OnPointerOutTrigger: Double = js.native
  
  /**
    * On pointer over
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSImport("babylonjs", "ActionManager.OnPointerOverTrigger")
  @js.native
  val OnPointerOverTrigger: Double = js.native
  
  /**
    * On right pick
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSImport("babylonjs", "ActionManager.OnRightPickTrigger")
  @js.native
  val OnRightPickTrigger: Double = js.native
  
  /**
    * Creates a new ActionManager from a JSON data
    * @param parsedActions defines the JSON data to read from
    * @param object defines the hosting mesh
    * @param scene defines the hosting scene
    */
  @JSImport("babylonjs", "ActionManager.Parse")
  @js.native
  def Parse(
    parsedActions: js.Any,
    `object`: Nullable[typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh],
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ): Unit = js.native
}
