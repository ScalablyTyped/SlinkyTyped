package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.plotlyJsStrings.all
import typingsSlinky.plotlyJs.plotlyJsStrings.backward
import typingsSlinky.plotlyJs.plotlyJsStrings.day
import typingsSlinky.plotlyJs.plotlyJsStrings.hour
import typingsSlinky.plotlyJs.plotlyJsStrings.minute
import typingsSlinky.plotlyJs.plotlyJsStrings.month
import typingsSlinky.plotlyJs.plotlyJsStrings.second
import typingsSlinky.plotlyJs.plotlyJsStrings.todate
import typingsSlinky.plotlyJs.plotlyJsStrings.year
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

