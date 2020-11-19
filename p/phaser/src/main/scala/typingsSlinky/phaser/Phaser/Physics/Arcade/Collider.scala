package typingsSlinky.phaser.Phaser.Physics.Arcade

import typingsSlinky.phaser.ArcadePhysicsCallback
import typingsSlinky.phaser.Phaser.Types.Physics.Arcade.ArcadeColliderType
import typingsSlinky.phaser.Phaser.Types.Physics.Arcade.GameObjectWithBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Arcade Physics Collider will automatically check for collision, or overlaps, between two objects
  * every step. If a collision, or overlap, occurs it will invoke the given callbacks.
  */
@js.native
trait Collider extends js.Object {
  
  /**
    * Whether the collider is active.
    */
  var active: Boolean = js.native
  
  /**
    * The context the collideCallback and processCallback will run in.
    */
  var callbackContext: js.Object = js.native
  
  /**
    * The callback to invoke when the two objects collide.
    */
  def collideCallback(object1: GameObjectWithBody, object2: GameObjectWithBody): Unit = js.native
  /**
    * The callback to invoke when the two objects collide.
    */
  @JSName("collideCallback")
  var collideCallback_Original: ArcadePhysicsCallback = js.native
  
  /**
    * Removes Collider from World and disposes of its resources.
    */
  def destroy(): Unit = js.native
  
  /**
    * The name of the collider (unused by Phaser).
    */
  var name: String = js.native
  
  /**
    * The first object to check for collision.
    */
  var object1: ArcadeColliderType = js.native
  
  /**
    * The second object to check for collision.
    */
  var object2: ArcadeColliderType = js.native
  
  /**
    * Whether to check for collisions or overlaps.
    */
  var overlapOnly: Boolean = js.native
  
  /**
    * If a processCallback exists it must return true or collision checking will be skipped.
    */
  def processCallback(object1: GameObjectWithBody, object2: GameObjectWithBody): Unit = js.native
  /**
    * If a processCallback exists it must return true or collision checking will be skipped.
    */
  @JSName("processCallback")
  var processCallback_Original: ArcadePhysicsCallback = js.native
  
  /**
    * A name for the Collider.
    * 
    * Phaser does not use this value, it's for your own reference.
    * @param name The name to assign to the Collider.
    */
  def setName(name: String): Collider = js.native
  
  /**
    * Called by World as part of its step processing, initial operation of collision checking.
    */
  def update(): Unit = js.native
  
  /**
    * The world in which the bodies will collide.
    */
  var world: World = js.native
}
