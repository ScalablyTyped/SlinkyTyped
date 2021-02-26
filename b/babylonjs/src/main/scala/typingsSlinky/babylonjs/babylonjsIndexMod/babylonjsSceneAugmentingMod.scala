package typingsSlinky.babylonjs.babylonjsIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsSceneAugmentingMod {
  
  @js.native
  trait Scene extends StObject {
    
    /** @hidden (Backing field) */
    var _simplificationQueue: typingsSlinky.babylonjs.meshSimplificationMod.SimplificationQueue = js.native
    
    /**
      * Gets or sets the simplification queue attached to the scene
      * @see https://doc.babylonjs.com/how_to/in-browser_mesh_simplification
      */
    var simplificationQueue: typingsSlinky.babylonjs.meshSimplificationMod.SimplificationQueue = js.native
  }
  object Scene {
    
    @scala.inline
    def apply(
      _simplificationQueue: typingsSlinky.babylonjs.meshSimplificationMod.SimplificationQueue,
      simplificationQueue: typingsSlinky.babylonjs.meshSimplificationMod.SimplificationQueue
    ): Scene = {
      val __obj = js.Dynamic.literal(_simplificationQueue = _simplificationQueue.asInstanceOf[js.Any], simplificationQueue = simplificationQueue.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scene]
    }
    
    @scala.inline
    implicit class SceneMutableBuilder[Self <: Scene] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSimplificationQueue(value: typingsSlinky.babylonjs.meshSimplificationMod.SimplificationQueue): Self = StObject.set(x, "simplificationQueue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_simplificationQueue(value: typingsSlinky.babylonjs.meshSimplificationMod.SimplificationQueue): Self = StObject.set(x, "_simplificationQueue", value.asInstanceOf[js.Any])
    }
  }
}
