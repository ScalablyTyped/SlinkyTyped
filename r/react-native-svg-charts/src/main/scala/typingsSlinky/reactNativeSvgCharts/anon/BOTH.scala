package typingsSlinky.reactNativeSvgCharts.anon

import typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.HORIZONTAL
import typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.VERTICAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BOTH extends js.Object {
  var BOTH: typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.BOTH = js.native
  var HORIZONTAL: typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.HORIZONTAL = js.native
  var VERTICAL: typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.VERTICAL = js.native
}

object BOTH {
  @scala.inline
  def apply(
    BOTH: typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.BOTH,
    HORIZONTAL: HORIZONTAL,
    VERTICAL: VERTICAL
  ): BOTH = {
    val __obj = js.Dynamic.literal(BOTH = BOTH.asInstanceOf[js.Any], HORIZONTAL = HORIZONTAL.asInstanceOf[js.Any], VERTICAL = VERTICAL.asInstanceOf[js.Any])
    __obj.asInstanceOf[BOTH]
  }
  @scala.inline
  implicit class BOTHOps[Self <: BOTH] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBOTH(value: typingsSlinky.reactNativeSvgCharts.reactNativeSvgChartsStrings.BOTH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BOTH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHORIZONTAL(value: HORIZONTAL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HORIZONTAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVERTICAL(value: VERTICAL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VERTICAL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

