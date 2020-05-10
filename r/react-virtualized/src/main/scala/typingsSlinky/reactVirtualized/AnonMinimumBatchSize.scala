package typingsSlinky.reactVirtualized

import typingsSlinky.reactVirtualized.reactVirtualizedNumbers.`0`
import typingsSlinky.reactVirtualized.reactVirtualizedNumbers.`10`
import typingsSlinky.reactVirtualized.reactVirtualizedNumbers.`15`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMinimumBatchSize extends js.Object {
  var minimumBatchSize: `10` = js.native
  var rowCount: `0` = js.native
  var threshold: `15` = js.native
}

object AnonMinimumBatchSize {
  @scala.inline
  def apply(minimumBatchSize: `10`, rowCount: `0`, threshold: `15`): AnonMinimumBatchSize = {
    val __obj = js.Dynamic.literal(minimumBatchSize = minimumBatchSize.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMinimumBatchSize]
  }
  @scala.inline
  implicit class AnonMinimumBatchSizeOps[Self <: AnonMinimumBatchSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinimumBatchSize(value: `10`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumBatchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowCount(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreshold(value: `15`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

