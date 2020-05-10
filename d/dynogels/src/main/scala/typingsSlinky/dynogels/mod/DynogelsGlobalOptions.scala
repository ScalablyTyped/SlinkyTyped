package typingsSlinky.dynogels.mod

import typingsSlinky.dynogels.AnonPollingInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynogelsGlobalOptions extends js.Object {
  @JSName("$dynogels")
  var $dynogels: AnonPollingInterval = js.native
}

object DynogelsGlobalOptions {
  @scala.inline
  def apply($dynogels: AnonPollingInterval): DynogelsGlobalOptions = {
    val __obj = js.Dynamic.literal($dynogels = $dynogels.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynogelsGlobalOptions]
  }
  @scala.inline
  implicit class DynogelsGlobalOptionsOps[Self <: DynogelsGlobalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$dynogels(value: AnonPollingInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$dynogels")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

