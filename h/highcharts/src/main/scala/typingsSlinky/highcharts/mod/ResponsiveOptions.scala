package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponsiveOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A set of rules for responsive
    * settings. The rules are executed from the top down.
    */
  var rules: js.UndefOr[js.Array[ResponsiveRulesOptions]] = js.native
}

object ResponsiveOptions {
  @scala.inline
  def apply(): ResponsiveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveOptions]
  }
  @scala.inline
  implicit class ResponsiveOptionsOps[Self <: ResponsiveOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRules(value: js.Array[ResponsiveRulesOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
  }
  
}

