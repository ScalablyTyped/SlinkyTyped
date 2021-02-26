package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.actionMod.Action
import typingsSlinky.babylonjs.conditionMod.Condition
import typingsSlinky.babylonjs.soundMod.Sound
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directAudioActionsMod {
  
  @JSImport("babylonjs/Actions/directAudioActions", "PlaySoundAction")
  @js.native
  class PlaySoundAction protected () extends Action {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param sound defines the sound to play
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: js.Any, sound: Sound) = this()
    def this(triggerOptions: js.Any, sound: Sound, condition: Condition) = this()
    
    var _sound: js.Any = js.native
  }
  
  @JSImport("babylonjs/Actions/directAudioActions", "StopSoundAction")
  @js.native
  class StopSoundAction protected () extends Action {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param sound defines the sound to stop
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: js.Any, sound: Sound) = this()
    def this(triggerOptions: js.Any, sound: Sound, condition: Condition) = this()
    
    var _sound: js.Any = js.native
  }
}
