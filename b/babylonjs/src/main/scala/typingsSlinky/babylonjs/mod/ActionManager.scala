package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.typesMod.Nullable
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
@JSImport("babylonjs", "ActionManager")
@js.native
object ActionManager extends js.Object {
  
  /**
    * Get a trigger name by index
    * @param trigger defines the trigger index
    * @returns a trigger name
    */
  def GetTriggerName(trigger: Double): String = js.native
  
  /**
    * Nothing
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val NothingTrigger: Double = js.native
  
  /**
    * On center pick
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnCenterPickTrigger: Double = js.native
  
  /**
    * On double pick
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnDoublePickTrigger: Double = js.native
  
  /**
    * On every frame
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnEveryFrameTrigger: Double = js.native
  
  /**
    * On intersection enter
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnIntersectionEnterTrigger: Double = js.native
  
  /**
    * On intersection exit
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnIntersectionExitTrigger: Double = js.native
  
  /**
    * On key down
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnKeyDownTrigger: Double = js.native
  
  /**
    * On key up
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnKeyUpTrigger: Double = js.native
  
  /**
    * On left pick
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnLeftPickTrigger: Double = js.native
  
  /**
    * On long press
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnLongPressTrigger: Double = js.native
  
  /**
    * On pick down
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnPickDownTrigger: Double = js.native
  
  /**
    * On pick out.
    * This trigger will only be raised if you also declared a OnPickDown
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnPickOutTrigger: Double = js.native
  
  /**
    * On pick
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnPickTrigger: Double = js.native
  
  /**
    * On pick up
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnPickUpTrigger: Double = js.native
  
  /**
    * On pointer out
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnPointerOutTrigger: Double = js.native
  
  /**
    * On pointer over
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnPointerOverTrigger: Double = js.native
  
  /**
    * On right pick
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnRightPickTrigger: Double = js.native
  
  /**
    * Creates a new ActionManager from a JSON data
    * @param parsedActions defines the JSON data to read from
    * @param object defines the hosting mesh
    * @param scene defines the hosting scene
    */
  def Parse(
    parsedActions: js.Any,
    `object`: Nullable[typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh],
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ): Unit = js.native
}
