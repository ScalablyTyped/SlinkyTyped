package typingsSlinky.plotlyDotJs.plotlyDotJsMod

import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.avg
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.count
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.first
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.last
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.max
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.median
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.min
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.mode
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.population
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.rms
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.sample
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.stddev
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformAggregation extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var func: js.UndefOr[count | sum | avg | median | mode | rms | stddev | min | max | first | last] = js.undefined
  var funcmode: js.UndefOr[sample | population] = js.undefined
  var target: String
}

object TransformAggregation {
  @scala.inline
  def apply(
    target: String,
    enabled: js.UndefOr[Boolean] = js.undefined,
    func: count | sum | avg | median | mode | rms | stddev | min | max | first | last = null,
    funcmode: sample | population = null
  ): TransformAggregation = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (func != null) __obj.updateDynamic("func")(func.asInstanceOf[js.Any])
    if (funcmode != null) __obj.updateDynamic("funcmode")(funcmode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformAggregation]
  }
}

