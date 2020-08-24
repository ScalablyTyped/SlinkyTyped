package typingsSlinky.plottable

import typingsSlinky.plottable.animatorMod.IAnimator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/animators/easingAnimator", JSImport.Namespace)
@js.native
object easingAnimatorMod extends js.Object {
  /* keyof plottable.anon.Back */ /* Rewritten from type alias, can be one of: 
    - typingsSlinky.plottable.plottableStrings.circle
    - typingsSlinky.plottable.plottableStrings.linear
    - typingsSlinky.plottable.plottableStrings.quad
    - typingsSlinky.plottable.plottableStrings.quadIn
    - typingsSlinky.plottable.plottableStrings.quadOut
    - typingsSlinky.plottable.plottableStrings.quadInOut
    - typingsSlinky.plottable.plottableStrings.cubic
    - typingsSlinky.plottable.plottableStrings.cubicIn
    - typingsSlinky.plottable.plottableStrings.cubicOut
    - typingsSlinky.plottable.plottableStrings.cubicInOut
    - typingsSlinky.plottable.plottableStrings.poly
    - typingsSlinky.plottable.plottableStrings.polyIn
    - typingsSlinky.plottable.plottableStrings.polyOut
    - typingsSlinky.plottable.plottableStrings.polyInOut
    - typingsSlinky.plottable.plottableStrings.sin
    - typingsSlinky.plottable.plottableStrings.sinIn
    - typingsSlinky.plottable.plottableStrings.sinOut
    - typingsSlinky.plottable.plottableStrings.sinInOut
    - typingsSlinky.plottable.plottableStrings.exp
    - typingsSlinky.plottable.plottableStrings.expIn
    - typingsSlinky.plottable.plottableStrings.expOut
    - typingsSlinky.plottable.plottableStrings.expInOut
    - typingsSlinky.plottable.plottableStrings.circleIn
    - typingsSlinky.plottable.plottableStrings.circleOut
    - typingsSlinky.plottable.plottableStrings.circleInOut
    - typingsSlinky.plottable.plottableStrings.bounce
    - typingsSlinky.plottable.plottableStrings.bounceIn
    - typingsSlinky.plottable.plottableStrings.bounceOut
    - typingsSlinky.plottable.plottableStrings.bounceInOut
    - typingsSlinky.plottable.plottableStrings.back
    - typingsSlinky.plottable.plottableStrings.backIn
    - typingsSlinky.plottable.plottableStrings.backOut
    - typingsSlinky.plottable.plottableStrings.backInOut
    - typingsSlinky.plottable.plottableStrings.elastic
    - typingsSlinky.plottable.plottableStrings.elasticIn
    - typingsSlinky.plottable.plottableStrings.elasticOut
    - typingsSlinky.plottable.plottableStrings.elasticInOut
  */
  trait EaseName extends js.Object
  
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
  
  @js.native
  object EaseName extends js.Object {
    var back: typingsSlinky.plottable.plottableStrings.back = js.native
    var backIn: typingsSlinky.plottable.plottableStrings.backIn = js.native
    var backInOut: typingsSlinky.plottable.plottableStrings.backInOut = js.native
    var backOut: typingsSlinky.plottable.plottableStrings.backOut = js.native
    var bounce: typingsSlinky.plottable.plottableStrings.bounce = js.native
    var bounceIn: typingsSlinky.plottable.plottableStrings.bounceIn = js.native
    var bounceInOut: typingsSlinky.plottable.plottableStrings.bounceInOut = js.native
    var bounceOut: typingsSlinky.plottable.plottableStrings.bounceOut = js.native
    var circle: typingsSlinky.plottable.plottableStrings.circle = js.native
    var circleIn: typingsSlinky.plottable.plottableStrings.circleIn = js.native
    var circleInOut: typingsSlinky.plottable.plottableStrings.circleInOut = js.native
    var circleOut: typingsSlinky.plottable.plottableStrings.circleOut = js.native
    var cubic: typingsSlinky.plottable.plottableStrings.cubic = js.native
    var cubicIn: typingsSlinky.plottable.plottableStrings.cubicIn = js.native
    var cubicInOut: typingsSlinky.plottable.plottableStrings.cubicInOut = js.native
    var cubicOut: typingsSlinky.plottable.plottableStrings.cubicOut = js.native
    var elastic: typingsSlinky.plottable.plottableStrings.elastic = js.native
    var elasticIn: typingsSlinky.plottable.plottableStrings.elasticIn = js.native
    var elasticInOut: typingsSlinky.plottable.plottableStrings.elasticInOut = js.native
    var elasticOut: typingsSlinky.plottable.plottableStrings.elasticOut = js.native
    var exp: typingsSlinky.plottable.plottableStrings.exp = js.native
    var expIn: typingsSlinky.plottable.plottableStrings.expIn = js.native
    var expInOut: typingsSlinky.plottable.plottableStrings.expInOut = js.native
    var expOut: typingsSlinky.plottable.plottableStrings.expOut = js.native
    var linear: typingsSlinky.plottable.plottableStrings.linear = js.native
    var poly: typingsSlinky.plottable.plottableStrings.poly = js.native
    var polyIn: typingsSlinky.plottable.plottableStrings.polyIn = js.native
    var polyInOut: typingsSlinky.plottable.plottableStrings.polyInOut = js.native
    var polyOut: typingsSlinky.plottable.plottableStrings.polyOut = js.native
    var quad: typingsSlinky.plottable.plottableStrings.quad = js.native
    var quadIn: typingsSlinky.plottable.plottableStrings.quadIn = js.native
    var quadInOut: typingsSlinky.plottable.plottableStrings.quadInOut = js.native
    var quadOut: typingsSlinky.plottable.plottableStrings.quadOut = js.native
    var sin: typingsSlinky.plottable.plottableStrings.sin = js.native
    var sinIn: typingsSlinky.plottable.plottableStrings.sinIn = js.native
    var sinInOut: typingsSlinky.plottable.plottableStrings.sinInOut = js.native
    var sinOut: typingsSlinky.plottable.plottableStrings.sinOut = js.native
  }
  
  /* static members */
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
  
  type EaseFn = js.Function1[/* normalizedTime */ Double, Double]
}

