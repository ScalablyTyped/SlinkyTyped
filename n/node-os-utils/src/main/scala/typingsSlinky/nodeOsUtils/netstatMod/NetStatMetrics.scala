package typingsSlinky.nodeOsUtils.netstatMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodeOsUtils.AnonInputMb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetStatMetrics extends /* key */ StringDictionary[AnonInputMb] {
  var total: AnonInputMb = js.native
}

object NetStatMetrics {
  @scala.inline
  def apply(total: AnonInputMb): NetStatMetrics = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetStatMetrics]
  }
  @scala.inline
  implicit class NetStatMetricsOps[Self <: NetStatMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTotal(value: AnonInputMb): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

