package typingsSlinky.qlikEngineapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQPathSeparator extends js.Object {
  /**
    * Path Separator for the OS
    */
  var qPathSeparator: String = js.native
}

object AnonQPathSeparator {
  @scala.inline
  def apply(qPathSeparator: String): AnonQPathSeparator = {
    val __obj = js.Dynamic.literal(qPathSeparator = qPathSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQPathSeparator]
  }
  @scala.inline
  implicit class AnonQPathSeparatorOps[Self <: AnonQPathSeparator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQPathSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qPathSeparator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

