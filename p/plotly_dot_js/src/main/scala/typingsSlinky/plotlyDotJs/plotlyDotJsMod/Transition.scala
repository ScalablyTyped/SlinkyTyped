package typingsSlinky.plotlyDotJs.plotlyDotJsMod

import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`back-in-out`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`back-in`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`back-out`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`bounce-in-out`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`bounce-in`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`bounce-out`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`circle-in-out`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`circle-in`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`circle-out`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`cubic-in-out`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`cubic-in`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`cubic-out`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`elastic-in-out`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`elastic-in`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`elastic-out`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`exp-in-out`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`exp-in`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`exp-out`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`linear-in-out`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`linear-in`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`linear-out`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`quad-in-out`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`quad-in`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`quad-out`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`sin-in-out`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`sin-in`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`sin-out`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.back
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.bounce
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.circle
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.cubic
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.elastic
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.exp
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.linear
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.quad
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.sin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transition extends js.Object {
  /**
  	 * Sets the duration of the slider transition
  	 */
  var duration: Double
  /**
  	 * Sets the easing function of the slider transition
  	 */
  var easing: linear | quad | cubic | sin | exp | circle | elastic | back | bounce | `linear-in` | `quad-in` | `cubic-in` | `sin-in` | `exp-in` | `circle-in` | `elastic-in` | `back-in` | `bounce-in` | `linear-out` | `quad-out` | `cubic-out` | `sin-out` | `exp-out` | `circle-out` | `elastic-out` | `back-out` | `bounce-out` | `linear-in-out` | `quad-in-out` | `cubic-in-out` | `sin-in-out` | `exp-in-out` | `circle-in-out` | `elastic-in-out` | `back-in-out` | `bounce-in-out`
}

object Transition {
  @scala.inline
  def apply(
    duration: Double,
    easing: linear | quad | cubic | sin | exp | circle | elastic | back | bounce | `linear-in` | `quad-in` | `cubic-in` | `sin-in` | `exp-in` | `circle-in` | `elastic-in` | `back-in` | `bounce-in` | `linear-out` | `quad-out` | `cubic-out` | `sin-out` | `exp-out` | `circle-out` | `elastic-out` | `back-out` | `bounce-out` | `linear-in-out` | `quad-in-out` | `cubic-in-out` | `sin-in-out` | `exp-in-out` | `circle-in-out` | `elastic-in-out` | `back-in-out` | `bounce-in-out`
  ): Transition = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Transition]
  }
}

