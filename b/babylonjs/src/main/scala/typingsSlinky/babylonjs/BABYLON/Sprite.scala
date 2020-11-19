package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sprite extends js.Object {
  
  /** @hidden */
  def _animate(deltaTime: Double): Unit = js.native
  
  var _animationStarted: js.Any = js.native
  
  var _delay: js.Any = js.native
  
  var _direction: js.Any = js.native
  
  var _fromIndex: js.Any = js.native
  
  var _loopAnimation: js.Any = js.native
  
  var _manager: js.Any = js.native
  
  var _onAnimationEnd: js.Any = js.native
  
  var _time: js.Any = js.native
  
  var _toIndex: js.Any = js.native
  
  /**
    * Gets or sets the associated action manager
    */
  var actionManager: Nullable[ActionManager] = js.native
  
  /** Gets or sets rotation angle */
  var angle: Double = js.native
  
  /** Gets the list of attached animations */
  var animations: js.Array[Animation] = js.native
  
  /** Gets or sets the cell index in the sprite sheet */
  var cellIndex: Double = js.native
  
  /** Gets or sets the cell reference in the sprite sheet, uses sprite's filename when added to sprite sheet */
  var cellRef: String = js.native
  
  /** Gets or sets the main color */
  var color: Color4 = js.native
  
  /** Release associated resources */
  def dispose(): Unit = js.native
  
  /** Gets or sets a boolean indicating that this sprite should be disposed after animation ends */
  var disposeWhenFinishedAnimating: Boolean = js.native
  
  /** Gets or sets the height */
  var height: Double = js.native
  
  /** Gets or sets a boolean indicating if UV coordinates should be inverted in U axis */
  var invertU: Double = js.native
  
  /** Gets or sets a boolean indicating if UV coordinates should be inverted in B axis */
  var invertV: Double = js.native
  
  /** Gets or sets a boolean indicating if the sprite can be picked */
  var isPickable: Boolean = js.native
  
  /**
    * Gets or sets a boolean indicating if the sprite is visible (renderable). Default is true
    */
  var isVisible: Boolean = js.native
  
  /** defines the name */
  var name: String = js.native
  
  /**
    * Starts an animation
    * @param from defines the initial key
    * @param to defines the end key
    * @param loop defines if the animation must loop
    * @param delay defines the start delay (in ms)
    * @param onAnimationEnd defines a callback to call when animation ends
    */
  def playAnimation(from: Double, to: Double, loop: Boolean, delay: Double, onAnimationEnd: js.Function0[Unit]): Unit = js.native
  
  /** Gets or sets the current world position */
  var position: Vector3 = js.native
  
  /**
    * Gets or sets the sprite size
    */
  def size: Double = js.native
  def size_=(value: Double): Unit = js.native
  
  /** Stops current animation (if any) */
  def stopAnimation(): Unit = js.native
  
  /** Gets or sets the width */
  var width: Double = js.native
}
