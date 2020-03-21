package typingsSlinky.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/animators", JSImport.Namespace)
@js.native
object animatorsMod extends js.Object {
  @js.native
  /**
    * Constructs the default animator
    *
    * @constructor
    */
  class Easing ()
    extends typingsSlinky.plottable.easingAnimatorMod.Easing
  
  @js.native
  class Null ()
    extends typingsSlinky.plottable.nullAnimatorMod.Null
  
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
  
}

