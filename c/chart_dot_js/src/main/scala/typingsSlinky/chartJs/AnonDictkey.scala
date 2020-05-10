package typingsSlinky.chartJs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  var global: ChartOptionsChartFontOpti = js.native
}

object AnonDictkey {
  @scala.inline
  def apply(global: ChartOptionsChartFontOpti): AnonDictkey = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictkey]
  }
  @scala.inline
  implicit class AnonDictkeyOps[Self <: AnonDictkey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobal(value: ChartOptionsChartFontOpti): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

