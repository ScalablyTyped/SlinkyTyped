package typingsSlinky.phaser.Phaser.GameObjects

import typingsSlinky.phaser.Phaser.Scene
import typingsSlinky.phaser.Phaser.Scenes.Systems
import typingsSlinky.phaser.Phaser.Structs.ProcessQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Update List plugin.
  * 
  * Update Lists belong to a Scene and maintain the list Game Objects to be updated every frame.
  * 
  * Some or all of these Game Objects may also be part of the Scene's [Display List]{@link Phaser.GameObjects.DisplayList}, for Rendering.
  */
@js.native
trait UpdateList extends ProcessQueue[GameObject] {
  
  /**
    * The Scene that the Update List belongs to.
    */
  var scene: Scene = js.native
  
  /**
    * The update step.
    * 
    * Pre-updates every active Game Object in the list.
    * @param time The current timestamp.
    * @param delta The delta time elapsed since the last frame.
    */
  def sceneUpdate(time: Double, delta: Double): Unit = js.native
  
  /**
    * The Scene's Systems.
    */
  var systems: Systems = js.native
}
