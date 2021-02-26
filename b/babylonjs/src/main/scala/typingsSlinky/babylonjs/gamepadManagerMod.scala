package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.observableMod.Observable
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gamepadManagerMod {
  
  @JSImport("babylonjs/Gamepads/gamepadManager", "GamepadManager")
  @js.native
  /**
    * Initializes the gamepad manager
    * @param _scene BabylonJS scene
    */
  class GamepadManager () extends StObject {
    def this(_scene: Scene) = this()
    
    var _addNewGamepad: js.Any = js.native
    
    var _babylonGamepads: js.Any = js.native
    
    /** @hidden */
    def _checkGamepadsStatus(): Unit = js.native
    
    var _gamepadEventSupported: js.Any = js.native
    
    var _gamepadSupport: js.Any = js.native
    
    /** @hidden */
    var _isMonitoring: Boolean = js.native
    
    var _onGamepadConnectedEvent: js.Any = js.native
    
    var _onGamepadDisconnectedEvent: js.Any = js.native
    
    var _oneGamepadConnected: js.Any = js.native
    
    var _scene: js.Any = js.native
    
    var _startMonitoringGamepads: js.Any = js.native
    
    var _stopMonitoringGamepads: js.Any = js.native
    
    var _updateGamepadObjects: js.Any = js.native
    
    /**
      * Disposes the gamepad manager
      */
    def dispose(): Unit = js.native
    
    /**
      * The gamepads in the game pad manager
      */
    def gamepads: js.Array[typingsSlinky.babylonjs.gamepadMod.Gamepad] = js.native
    
    /**
      * Get the gamepad controllers based on type
      * @param type The type of gamepad controller
      * @returns Nullable gamepad
      */
    def getGamepadByType(): Nullable[typingsSlinky.babylonjs.gamepadMod.Gamepad] = js.native
    def getGamepadByType(`type`: Double): Nullable[typingsSlinky.babylonjs.gamepadMod.Gamepad] = js.native
    
    /**
      * observable to be triggered when the gamepad controller has been connected
      */
    var onGamepadConnectedObservable: Observable[typingsSlinky.babylonjs.gamepadMod.Gamepad] = js.native
    
    /**
      * observable to be triggered when the gamepad controller has been disconnected
      */
    var onGamepadDisconnectedObservable: Observable[typingsSlinky.babylonjs.gamepadMod.Gamepad] = js.native
  }
}
