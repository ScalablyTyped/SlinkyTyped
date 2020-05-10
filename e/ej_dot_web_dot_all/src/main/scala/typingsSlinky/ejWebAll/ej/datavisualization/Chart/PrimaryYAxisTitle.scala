package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrimaryYAxisTitle extends js.Object {
  /** Specifies the position of the axis title.
    * @Default {center. See Alignment}
    */
  var alignment: js.UndefOr[TextAlignment | String] = js.native
  /** Specifies whether to trim the axis title when it exceeds the chart area or the maximum width of the title.
    * @Default {ej.datavisualization.Chart.enableTrim}
    */
  var enableTrim: js.UndefOr[Boolean] = js.native
  /** Options for customizing the title font.
    */
  var font: js.UndefOr[PrimaryYAxisTitleFont] = js.native
  /** Maximum width of the title, when the title exceeds this width, the title gets trimmed, when enableTrim is true.
    * @Default {ej.datavisualization.Chart.maximumTitleWidth.null}
    */
  var maximumTitleWidth: js.UndefOr[Double] = js.native
  /** offset value for axis title.
    * @Default {0}
    */
  var offset: js.UndefOr[Double] = js.native
  /** Specifies the position of the axis title.
    * @Default {outside. See Position}
    */
  var position: js.UndefOr[LabelPosition | String] = js.native
  /** Title for the axis.
    */
  var text: js.UndefOr[String] = js.native
  /** Controls the visibility of axis title.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object PrimaryYAxisTitle {
  @scala.inline
  def apply(): PrimaryYAxisTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimaryYAxisTitle]
  }
  @scala.inline
  implicit class PrimaryYAxisTitleOps[Self <: PrimaryYAxisTitle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: TextAlignment | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTrim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTrim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTrim")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: PrimaryYAxisTitleFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumTitleWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumTitleWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumTitleWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumTitleWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: LabelPosition | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

