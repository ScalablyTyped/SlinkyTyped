package typingsSlinky.chartJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartTooltipsStaticConfiguration extends js.Object {
  var positioners: StringDictionary[ChartTooltipPositioner] = js.native
}

object ChartTooltipsStaticConfiguration {
  @scala.inline
  def apply(positioners: StringDictionary[ChartTooltipPositioner]): ChartTooltipsStaticConfiguration = {
    val __obj = js.Dynamic.literal(positioners = positioners.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTooltipsStaticConfiguration]
  }
  @scala.inline
  implicit class ChartTooltipsStaticConfigurationOps[Self <: ChartTooltipsStaticConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPositioners(value: StringDictionary[ChartTooltipPositioner]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positioners")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

