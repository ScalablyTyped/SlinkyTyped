package typingsSlinky.plotlyDotJs.plotlyDotJsMod

import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.all
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.backward
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.day
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.hour
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.minute
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.month
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.second
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.todate
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSelectorButton extends js.Object {
  var count: Double
  var label: String
  var step: second | minute | hour | day | month | year | all
  var stepmode: backward | todate
}

object RangeSelectorButton {
  @scala.inline
  def apply(
    count: Double,
    label: String,
    step: second | minute | hour | day | month | year | all,
    stepmode: backward | todate
  ): RangeSelectorButton = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], stepmode = stepmode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RangeSelectorButton]
  }
}

