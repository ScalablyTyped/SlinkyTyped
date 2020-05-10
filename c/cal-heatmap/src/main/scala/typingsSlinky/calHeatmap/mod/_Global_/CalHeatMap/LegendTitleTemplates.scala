package typingsSlinky.calHeatmap.mod._Global_.CalHeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendTitleTemplates extends js.Object {
  /** Formatting of all the value but the first and the last. Default value: "between {down} and {up} {name}" */
  var inner: js.UndefOr[String] = js.native
  /** Formatting of the smallest (leftmost) value of the legend. Default value: "less than {min} {name}" */
  var lower: js.UndefOr[String] = js.native
  /** Formatting of the biggest (rightmost) value of the legend. Default value: "more than {max} {name}" */
  var upper: js.UndefOr[String] = js.native
}

object LegendTitleTemplates {
  @scala.inline
  def apply(): LegendTitleTemplates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendTitleTemplates]
  }
  @scala.inline
  implicit class LegendTitleTemplatesOps[Self <: LegendTitleTemplates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inner")(js.undefined)
        ret
    }
    @scala.inline
    def withLower(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lower")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLower: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lower")(js.undefined)
        ret
    }
    @scala.inline
    def withUpper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upper")(js.undefined)
        ret
    }
  }
  
}

