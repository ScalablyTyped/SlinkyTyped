package typingsSlinky.phaser.global.Phaser.Input

import typingsSlinky.phaser.Phaser.Game
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Input Manager is responsible for handling the pointer related systems in a single Phaser Game instance.
  * 
  * Based on the Game Config it will create handlers for mouse and touch support.
  * 
  * Keyboard and Gamepad are plugins, handled directly by the InputPlugin class.
  * 
  * It then manages the events, pointer creation and general hit test related operations.
  * 
  * You rarely need to interact with the Input Manager directly, and as such, all of its properties and methods
  * should be considered private. Instead, you should use the Input Plugin, which is a Scene level system, responsible
  * for dealing with all input events for a Scene.
  */
@JSGlobal("Phaser.Input.InputManager")
@js.native
class InputManager protected ()
  extends typingsSlinky.phaser.Phaser.Input.InputManager {
  /**
    * 
    * @param game The Game instance that owns the Input Manager.
    * @param config The Input Configuration object, as set in the Game Config.
    */
  def this(game: Game, config: js.Object) = this()
}
