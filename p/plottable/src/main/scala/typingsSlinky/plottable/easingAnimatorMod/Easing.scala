package typingsSlinky.plottable.easingAnimatorMod

import typingsSlinky.plottable.animatorMod.IAnimator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/animators/easingAnimator", "Easing")
@js.native
/**
  * Constructs the default animator
  *
  * @constructor
  */
class Easing () extends IAnimator {
  var _easingMode: js.Any = js.native
  var _maxTotalDuration: js.Any = js.native
  var _startDelay: js.Any = js.native
  var _stepDelay: js.Any = js.native
  var _stepDuration: js.Any = js.native
  /**
    * Adjust the iterative delay, such that it takes into account the maxTotalDuration constraint
    */
  /* private */ def _getAdjustedIterativeDelay(numberOfSteps: js.Any): js.Any = js.native
  /* protected */ def _getEaseFactory(): EaseFn = js.native
  /**
    * Gets the current easing mode of the animation.
    *
    * @returns {string} the current easing mode.
    */
  def easingMode(): EaseName | EaseFn = js.native
  def easingMode(easingMode: EaseFn): this.type = js.native
  /**
    * Sets the easing mode of the animation.
    *
    * @param {string} easingMode The desired easing mode.
    * @returns {Easing} The calling Easing Animator.
    */
  def easingMode(easingMode: EaseName): this.type = js.native
  /**
    * Gets the maximum total animation duration constraint in milliseconds.
    *
    * If the animation time would exceed the specified time, the duration of each step
    * and the delay between each step will be reduced until the animation fits within
    * the specified time.
    *
    * @returns {number} The current maximum total animation duration.
    */
  def maxTotalDuration(): Double = js.native
  /**
    * Sets the maximum total animation duration constraint in miliseconds.
    *
    * If the animation time would exceed the specified time, the duration of each step
    * and the delay between each step will be reduced until the animation fits within
    * the specified time.
    *
    * @param {number} maxTotalDuration The maximum total animation duration in milliseconds.
    * @returns {Easing} The calling Easing Animator.
    */
  def maxTotalDuration(maxTotalDuration: Double): this.type = js.native
  /**
    * Gets the start delay of the animation in milliseconds.
    *
    * @returns {number} The current start delay.
    */
  def startDelay(): Double = js.native
  /**
    * Sets the start delay of the animation in milliseconds.
    *
    * @param {number} startDelay The start delay in milliseconds.
    * @returns {Easing} The calling Easing Animator.
    */
  def startDelay(startDelay: Double): this.type = js.native
  /**
    * Gets the maximum start delay between animation steps in milliseconds.
    *
    * @returns {number} The current maximum iterative delay.
    */
  def stepDelay(): Double = js.native
  /**
    * Sets the maximum start delay between animation steps in milliseconds.
    *
    * @param {number} stepDelay The maximum iterative delay in milliseconds.
    * @returns {Easing} The calling Easing Animator.
    */
  def stepDelay(stepDelay: Double): this.type = js.native
  /**
    * Gets the duration of one animation step in milliseconds.
    *
    * @returns {number} The current duration.
    */
  def stepDuration(): Double = js.native
  /**
    * Sets the duration of one animation step in milliseconds.
    *
    * @param {number} stepDuration The duration in milliseconds.
    * @returns {Easing} The calling Easing Animator.
    */
  def stepDuration(stepDuration: Double): this.type = js.native
}

/* static members */
@JSImport("plottable/build/src/animators/easingAnimator", "Easing")
@js.native
object Easing extends js.Object {
  /**
    * The default easing of the animation
    */
  var _DEFAULT_EASING_MODE: js.Any = js.native
  /**
    * The default maximum start delay between each step of an animation
    */
  var _DEFAULT_ITERATIVE_DELAY_MILLISECONDS: js.Any = js.native
  /**
    * The default maximum total animation duration
    */
  var _DEFAULT_MAX_TOTAL_DURATION_MILLISECONDS: js.Any = js.native
  /**
    * The default starting delay of the animation in milliseconds
    */
  var _DEFAULT_START_DELAY_MILLISECONDS: js.Any = js.native
  /**
    * The default duration of one animation step in milliseconds
    */
  var _DEFAULT_STEP_DURATION_MILLISECONDS: js.Any = js.native
}

