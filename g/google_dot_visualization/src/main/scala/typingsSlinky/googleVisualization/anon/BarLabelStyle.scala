package typingsSlinky.googleVisualization.anon

import typingsSlinky.googleVisualization.google.visualization.LabelStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarLabelStyle extends js.Object {
  var barLabelStyle: js.UndefOr[LabelStyle] = js.native
  var colorByRowLabel: js.UndefOr[Boolean] = js.native
  var groupByRowLabel: js.UndefOr[Boolean] = js.native
  var rowLabelStyle: js.UndefOr[LabelStyle] = js.native
  var showRowLabels: js.UndefOr[Boolean] = js.native
  var singleColor: js.UndefOr[String] = js.native
}

object BarLabelStyle {
  @scala.inline
  def apply(): BarLabelStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarLabelStyle]
  }
  @scala.inline
  implicit class BarLabelStyleOps[Self <: BarLabelStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarLabelStyle(value: LabelStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barLabelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarLabelStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barLabelStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withColorByRowLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorByRowLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorByRowLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorByRowLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupByRowLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByRowLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupByRowLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByRowLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withRowLabelStyle(value: LabelStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowLabelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowLabelStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowLabelStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRowLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRowLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleColor")(js.undefined)
        ret
    }
  }
  
}

