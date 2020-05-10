package typingsSlinky.reactAdaptiveHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNumberOfLogicalProcessors extends js.Object {
  var numberOfLogicalProcessors: js.UndefOr[Double] = js.native
  var unsupported: Boolean = js.native
}

object AnonNumberOfLogicalProcessors {
  @scala.inline
  def apply(unsupported: Boolean): AnonNumberOfLogicalProcessors = {
    val __obj = js.Dynamic.literal(unsupported = unsupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNumberOfLogicalProcessors]
  }
  @scala.inline
  implicit class AnonNumberOfLogicalProcessorsOps[Self <: AnonNumberOfLogicalProcessors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnsupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfLogicalProcessors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfLogicalProcessors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfLogicalProcessors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfLogicalProcessors")(js.undefined)
        ret
    }
  }
  
}

