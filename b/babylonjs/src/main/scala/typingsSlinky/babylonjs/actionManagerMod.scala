package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.abstractActionManagerMod.AbstractActionManager
import typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionManagerMod {
  
  @JSImport("babylonjs/Actions/actionManager", "ActionManager")
  @js.native
  class ActionManager protected () extends AbstractActionManager {
    /**
      * Creates a new action manager
      * @param scene defines the hosting scene
      */
    def this(scene: Scene) = this()
    
    /** @hidden */
    def _getEffectiveTarget(target: js.Any, propertyPath: String): js.Any = js.native
    
    /** @hidden */
    def _getProperty(propertyPath: String): String = js.native
    
    var _scene: js.Any = js.native
    
    /**
      * Gets hosting scene
      * @returns the hosting scene
      */
    def getScene(): Scene = js.native
  }
  /* static members */
  object ActionManager {
    
    /**
      * Get a trigger name by index
      * @param trigger defines the trigger index
      * @returns a trigger name
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.GetTriggerName")
    @js.native
    def GetTriggerName(trigger: Double): String = js.native
    
    /**
      * Nothing
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.NothingTrigger")
    @js.native
    val NothingTrigger: Double = js.native
    
    /**
      * On center pick
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnCenterPickTrigger")
    @js.native
    val OnCenterPickTrigger: Double = js.native
    
    /**
      * On double pick
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnDoublePickTrigger")
    @js.native
    val OnDoublePickTrigger: Double = js.native
    
    /**
      * On every frame
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnEveryFrameTrigger")
    @js.native
    val OnEveryFrameTrigger: Double = js.native
    
    /**
      * On intersection enter
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnIntersectionEnterTrigger")
    @js.native
    val OnIntersectionEnterTrigger: Double = js.native
    
    /**
      * On intersection exit
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnIntersectionExitTrigger")
    @js.native
    val OnIntersectionExitTrigger: Double = js.native
    
    /**
      * On key down
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnKeyDownTrigger")
    @js.native
    val OnKeyDownTrigger: Double = js.native
    
    /**
      * On key up
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnKeyUpTrigger")
    @js.native
    val OnKeyUpTrigger: Double = js.native
    
    /**
      * On left pick
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnLeftPickTrigger")
    @js.native
    val OnLeftPickTrigger: Double = js.native
    
    /**
      * On long press
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnLongPressTrigger")
    @js.native
    val OnLongPressTrigger: Double = js.native
    
    /**
      * On pick down
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnPickDownTrigger")
    @js.native
    val OnPickDownTrigger: Double = js.native
    
    /**
      * On pick out.
      * This trigger will only be raised if you also declared a OnPickDown
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnPickOutTrigger")
    @js.native
    val OnPickOutTrigger: Double = js.native
    
    /**
      * On pick
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnPickTrigger")
    @js.native
    val OnPickTrigger: Double = js.native
    
    /**
      * On pick up
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnPickUpTrigger")
    @js.native
    val OnPickUpTrigger: Double = js.native
    
    /**
      * On pointer out
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnPointerOutTrigger")
    @js.native
    val OnPointerOutTrigger: Double = js.native
    
    /**
      * On pointer over
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnPointerOverTrigger")
    @js.native
    val OnPointerOverTrigger: Double = js.native
    
    /**
      * On right pick
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnRightPickTrigger")
    @js.native
    val OnRightPickTrigger: Double = js.native
    
    /**
      * Creates a new ActionManager from a JSON data
      * @param parsedActions defines the JSON data to read from
      * @param object defines the hosting mesh
      * @param scene defines the hosting scene
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.Parse")
    @js.native
    def Parse(parsedActions: js.Any, `object`: Nullable[AbstractMesh], scene: Scene): Unit = js.native
  }
}
