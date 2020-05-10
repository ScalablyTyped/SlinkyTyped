package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrimaryYAxisMultiLevelLabel extends js.Object {
  /** Options for customizing the border of the series.
    */
  var border: js.UndefOr[PrimaryYAxisMultiLevelLabelsBorder] = js.native
  /** Ending value of the multi level labels.
    * @Default {null}
    */
  var end: js.UndefOr[Double] = js.native
  /** Options for customizing the font of the text.
    */
  var font: js.UndefOr[PrimaryYAxisMultiLevelLabelsFont] = js.native
  /** Specifies the level of multi level labels.
    * @Default {0}
    */
  var level: js.UndefOr[Double] = js.native
  /** Specifies the maximum width of the text in multi level labels.
    * @Default {null}
    */
  var maximumTextWidth: js.UndefOr[Double] = js.native
  /** Starting value of the multi level labels.
    * @Default {null}
    */
  var start: js.UndefOr[Double] = js.native
  /** Text of the multi level labels.
    */
  var text: js.UndefOr[String] = js.native
  /** Specifies the alignment of the text in multi level labels.
    * @Default {center. See TextAlignment}
    */
  var textAlignment: js.UndefOr[TextAlignment | String] = js.native
  /** Specifies the handling of text over flow in multi level labels.
    * @Default {center. See TextOverflow}
    */
  var textOverflow: js.UndefOr[TextOverflow | String] = js.native
  /** Visibility of the multi level labels.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object PrimaryYAxisMultiLevelLabel {
  @scala.inline
  def apply(): PrimaryYAxisMultiLevelLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimaryYAxisMultiLevelLabel]
  }
  @scala.inline
  implicit class PrimaryYAxisMultiLevelLabelOps[Self <: PrimaryYAxisMultiLevelLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorder(value: PrimaryYAxisMultiLevelLabelsBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: PrimaryYAxisMultiLevelLabelsFont): Self = {
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
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumTextWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumTextWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumTextWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumTextWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
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
    def withTextAlignment(value: TextAlignment | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withTextOverflow(value: TextOverflow | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOverflow")(js.undefined)
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

