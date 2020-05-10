package typingsSlinky.falcorJsonGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sentinel extends js.Object {
  @JSName("$expires")
  var $expires: js.UndefOr[Double] = js.native
}

object Sentinel {
  @scala.inline
  def apply(): Sentinel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sentinel]
  }
  @scala.inline
  implicit class SentinelOps[Self <: Sentinel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$expires(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$expires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$expires")(js.undefined)
        ret
    }
  }
  
}

