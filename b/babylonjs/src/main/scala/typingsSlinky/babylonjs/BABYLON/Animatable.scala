package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animatable extends js.Object {
  
  /** @hidden */
  def _animate(delay: Double): Boolean = js.native
  
  var _localDelayOffset: js.Any = js.native
  
  var _paused: js.Any = js.native
  
  var _pausedDelay: js.Any = js.native
  
  var _raiseOnAnimationEnd: js.Any = js.native
  
  var _runtimeAnimations: js.Any = js.native
  
  var _scene: js.Any = js.native
  
  var _speedRatio: js.Any = js.native
  
  var _syncRoot: js.Any = js.native
  
  var _weight: js.Any = js.native
  
  /**
    * Gets a boolean indicating if the animation has started
    */
  var animationStarted: Boolean = js.native
  
  /**
    * Adds more animations to the current animatable
    * @param target defines the target of the animations
    * @param animations defines the new animations to add
    */
  def appendAnimations(target: js.Any, animations: js.Array[Animation]): Unit = js.native
  
  /**
    * Disable animation blending
    * @see http://doc.babylonjs.com/babylon101/animations#animation-blending
    */
  def disableBlending(): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating if the animatable must be disposed and removed at the end of the animation.
    * This will only apply for non looping animation (default is true)
    */
  var disposeOnEnd: Boolean = js.native
  
  /**
    * Allows the animatable to blend with current running animations
    * @see http://doc.babylonjs.com/babylon101/animations#animation-blending
    * @param blendingSpeed defines the blending speed to use
    */
  def enableBlending(blendingSpeed: Double): Unit = js.native
  
  /** defines the starting frame number (default is 0) */
  var fromFrame: Double = js.native
  
  /**
    * Gets the source animation for a specific property
    * @param property defines the propertyu to look for
    * @returns null or the source animation for the given property
    */
  def getAnimationByTargetProperty(property: String): Nullable[Animation] = js.native
  
  /**
    * Gets the list of runtime animations
    * @returns an array of RuntimeAnimation
    */
  def getAnimations(): js.Array[RuntimeAnimation] = js.native
  
  /**
    * Gets the runtime animation for a specific property
    * @param property defines the propertyu to look for
    * @returns null or the runtime animation for the given property
    */
  def getRuntimeAnimationByTargetProperty(property: String): Nullable[RuntimeAnimation] = js.native
  
  /**
    * Jump directly to a given frame
    * @param frame defines the frame to jump to
    */
  def goToFrame(frame: Double): Unit = js.native
  
  /** defines if the animation must loop (default is false)  */
  var loopAnimation: Boolean = js.native
  
  /**
    * Gets the current frame of the first RuntimeAnimation
    * Used to synchronize Animatables
    */
  def masterFrame: Double = js.native
  
  /** defines a callback to call when animation ends if it is not looping */
  var onAnimationEnd: js.UndefOr[js.Function0[Unit] | Null] = js.native
  
  /**
    * Observer raised when the animation ends
    */
  var onAnimationEndObservable: Observable[Animatable] = js.native
  
  /** defines a callback to call when animation loops */
  var onAnimationLoop: js.UndefOr[js.Function0[Unit] | Null] = js.native
  
  /**
    * Observer raised when the animation loops
    */
  var onAnimationLoopObservable: Observable[Animatable] = js.native
  
  /**
    * Pause the animation
    */
  def pause(): Unit = js.native
  
  /**
    * Resets the animatable to its original state
    */
  def reset(): Unit = js.native
  
  /**
    * Restart the animation
    */
  def restart(): Unit = js.native
  
  /**
    * Gets or sets the speed ratio to apply to the animatable (1.0 by default)
    */
  def speedRatio: Double = js.native
  def speedRatio_=(value: Double): Unit = js.native
  
  /**
    * Stop and delete the current animation
    * @param animationName defines a string used to only stop some of the runtime animations instead of all
    * @param targetMask - a function that determines if the animation should be stopped based on its target (all animations will be stopped if both this and animationName are empty)
    */
  def stop(): Unit = js.native
  def stop(animationName: js.UndefOr[scala.Nothing], targetMask: js.Function1[/* target */ js.Any, Boolean]): Unit = js.native
  def stop(animationName: String): Unit = js.native
  def stop(animationName: String, targetMask: js.Function1[/* target */ js.Any, Boolean]): Unit = js.native
  
  /**
    * Gets the root Animatable used to synchronize and normalize animations
    */
  def syncRoot: Nullable[Animatable] = js.native
  
  /**
    * Synchronize and normalize current Animatable with a source Animatable
    * This is useful when using animation weights and when animations are not of the same length
    * @param root defines the root Animatable to synchronize with
    * @returns the current Animatable
    */
  def syncWith(root: Animatable): Animatable = js.native
  
  /** defines the target object */
  var target: js.Any = js.native
  
  /** defines the ending frame number (default is 100) */
  var toFrame: Double = js.native
  
  /**
    * Wait asynchronously for the animation to end
    * @returns a promise which will be fullfilled when the animation ends
    */
  def waitAsync(): js.Promise[Animatable] = js.native
  
  /**
    * Gets or sets the animatable weight (-1.0 by default meaning not weighted)
    */
  def weight: Double = js.native
  def weight_=(value: Double): Unit = js.native
}
