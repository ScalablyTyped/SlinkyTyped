package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.plotlyJsStrings.avg
import typingsSlinky.plotlyJs.plotlyJsStrings.count
import typingsSlinky.plotlyJs.plotlyJsStrings.first
import typingsSlinky.plotlyJs.plotlyJsStrings.last
import typingsSlinky.plotlyJs.plotlyJsStrings.max
import typingsSlinky.plotlyJs.plotlyJsStrings.median
import typingsSlinky.plotlyJs.plotlyJsStrings.min
import typingsSlinky.plotlyJs.plotlyJsStrings.mode
import typingsSlinky.plotlyJs.plotlyJsStrings.population
import typingsSlinky.plotlyJs.plotlyJsStrings.rms
import typingsSlinky.plotlyJs.plotlyJsStrings.sample
import typingsSlinky.plotlyJs.plotlyJsStrings.stddev
import typingsSlinky.plotlyJs.plotlyJsStrings.sum
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
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (func != null) __obj.updateDynamic("func")(func.asInstanceOf[js.Any])
    if (funcmode != null) __obj.updateDynamic("funcmode")(funcmode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformAggregation]
  }
}

