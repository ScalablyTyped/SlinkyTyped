package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ActionManager")
@js.native
class ActionManager protected ()
  extends typingsSlinky.babylonjs.BABYLON.ActionManager {
  /**
    * Creates a new action manager
    * @param scene defines the hosting scene
    */
  def this(scene: typingsSlinky.babylonjs.BABYLON.Scene) = this()
}
/* static members */
object ActionManager {
  
  /**
    * Get a trigger name by index
    * @param trigger defines the trigger index
    * @returns a trigger name
    */
  @JSGlobal("BABYLON.ActionManager.GetTriggerName")
  @js.native
  def GetTriggerName(trigger: Double): String = js.native
  
  /**
    * Nothing
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.NothingTrigger")
  @js.native
  val NothingTrigger: Double = js.native
  
  /**
    * On center pick
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnCenterPickTrigger")
  @js.native
  val OnCenterPickTrigger: Double = js.native
  
  /**
    * On double pick
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnDoublePickTrigger")
  @js.native
  val OnDoublePickTrigger: Double = js.native
  
  /**
    * On every frame
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnEveryFrameTrigger")
  @js.native
  val OnEveryFrameTrigger: Double = js.native
  
  /**
    * On intersection enter
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnIntersectionEnterTrigger")
  @js.native
  val OnIntersectionEnterTrigger: Double = js.native
  
  /**
    * On intersection exit
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnIntersectionExitTrigger")
  @js.native
  val OnIntersectionExitTrigger: Double = js.native
  
  /**
    * On key down
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnKeyDownTrigger")
  @js.native
  val OnKeyDownTrigger: Double = js.native
  
  /**
    * On key up
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnKeyUpTrigger")
  @js.native
  val OnKeyUpTrigger: Double = js.native
  
  /**
    * On left pick
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnLeftPickTrigger")
  @js.native
  val OnLeftPickTrigger: Double = js.native
  
  /**
    * On long press
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnLongPressTrigger")
  @js.native
  val OnLongPressTrigger: Double = js.native
  
  /**
    * On pick down
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnPickDownTrigger")
  @js.native
  val OnPickDownTrigger: Double = js.native
  
  /**
    * On pick out.
    * This trigger will only be raised if you also declared a OnPickDown
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnPickOutTrigger")
  @js.native
  val OnPickOutTrigger: Double = js.native
  
  /**
    * On pick
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnPickTrigger")
  @js.native
  val OnPickTrigger: Double = js.native
  
  /**
    * On pick up
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnPickUpTrigger")
  @js.native
  val OnPickUpTrigger: Double = js.native
  
  /**
    * On pointer out
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnPointerOutTrigger")
  @js.native
  val OnPointerOutTrigger: Double = js.native
  
  /**
    * On pointer over
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnPointerOverTrigger")
  @js.native
  val OnPointerOverTrigger: Double = js.native
  
  /**
    * On right pick
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnRightPickTrigger")
  @js.native
  val OnRightPickTrigger: Double = js.native
  
  /**
    * Creates a new ActionManager from a JSON data
    * @param parsedActions defines the JSON data to read from
    * @param object defines the hosting mesh
    * @param scene defines the hosting scene
    */
  @JSGlobal("BABYLON.ActionManager.Parse")
  @js.native
  def Parse(
    parsedActions: js.Any,
    `object`: Nullable[typingsSlinky.babylonjs.BABYLON.AbstractMesh],
    scene: typingsSlinky.babylonjs.BABYLON.Scene
  ): Unit = js.native
}
