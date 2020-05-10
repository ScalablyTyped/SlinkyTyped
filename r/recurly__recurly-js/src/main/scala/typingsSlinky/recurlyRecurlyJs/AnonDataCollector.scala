package typingsSlinky.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDataCollector extends js.Object {
  var dataCollector: js.UndefOr[Boolean] = js.native
}

object AnonDataCollector {
  @scala.inline
  def apply(): AnonDataCollector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDataCollector]
  }
  @scala.inline
  implicit class AnonDataCollectorOps[Self <: AnonDataCollector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataCollector(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCollector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataCollector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCollector")(js.undefined)
        ret
    }
  }
  
}

