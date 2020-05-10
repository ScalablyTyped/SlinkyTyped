package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeRange extends js.Object {
  // The maximum size (in kilobytes) that an incoming message must have in order for a condition or exception to apply.
  var maximumSize: js.UndefOr[Double] = js.native
  // The minimum size (in kilobytes) that an incoming message must have in order for a condition or exception to apply.
  var minimumSize: js.UndefOr[Double] = js.native
}

object SizeRange {
  @scala.inline
  def apply(): SizeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeRange]
  }
  @scala.inline
  implicit class SizeRangeOps[Self <: SizeRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaximumSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumSize")(js.undefined)
        ret
    }
  }
  
}

