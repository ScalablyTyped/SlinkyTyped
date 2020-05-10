package typingsSlinky.mermaid.mermaidAPIMod.mermaidAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttConfig extends js.Object {
  /**
    * **axisFormat** - datetime format of the axis, this might need adjustment to match your locale and preferences
    * default: '%Y-%m-%d'
    */
  var axisFormat: js.UndefOr[String] = js.native
  /**
    * **barGap** - the margin between the different activities in the gantt diagram
    * default: 4
    */
  var barGap: js.UndefOr[Double] = js.native
  /**
    * **barHeight** - the height of the bars in the graph
    * default: 20
    */
  var barHeight: js.UndefOr[Double] = js.native
  /**
    * **fontFamily** - font family ...
    * default:  '"Open-Sans", "sans-serif"'
    */
  var fontFamily: js.UndefOr[String] = js.native
  /**
    *  **fontSize** - font size ...
    * default: 11
    */
  var fontSize: js.UndefOr[Double] = js.native
  /**
    *  **gridLineStartPadding** - Vertical starting position of the grid lines
    * default: 35
    */
  var gridLineStartPadding: js.UndefOr[Double] = js.native
  /**
    *  **leftPadding** - the space allocated for the section name to the left of the activities.
    * default: 75
    */
  var leftPadding: js.UndefOr[Double] = js.native
  /**
    * **numberSectionStyles** - the number of alternating section styles
    * default: 4
    */
  var numberSectionStyles: js.UndefOr[Double] = js.native
  /**
    * **titleTopMargin** - margin top for the text over the gantt diagram
    * default: 25
    */
  var titleTopMargin: js.UndefOr[Double] = js.native
  /**
    *  **topPadding** - margin between title and gantt diagram and between axis and gantt diagram.
    * default: 50
    */
  var topPadding: js.UndefOr[Double] = js.native
}

object GanttConfig {
  @scala.inline
  def apply(): GanttConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttConfig]
  }
  @scala.inline
  implicit class GanttConfigOps[Self <: GanttConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxisFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withBarGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barGap")(js.undefined)
        ret
    }
    @scala.inline
    def withBarHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGridLineStartPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLineStartPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridLineStartPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLineStartPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberSectionStyles(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberSectionStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberSectionStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberSectionStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleTopMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTopMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleTopMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTopMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withTopPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topPadding")(js.undefined)
        ret
    }
  }
  
}

