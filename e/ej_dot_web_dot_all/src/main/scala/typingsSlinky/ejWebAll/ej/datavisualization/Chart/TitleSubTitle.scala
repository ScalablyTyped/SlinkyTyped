package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TitleSubTitle extends js.Object {
  /** Background color for the chart subtitle.
    * @Default {transparent}
    */
  var background: js.UndefOr[String] = js.native
  /** Options to customize the border of the title.
    */
  var border: js.UndefOr[TitleSubTitleBorder] = js.native
  /** Specifies whether to trim the Chart SubTitle when the width of the Subtitle exceeds the maximumWidth.
    * @Default {false}
    */
  var enableTrim: js.UndefOr[Boolean] = js.native
  /** Options for customizing the font of sub title.
    */
  var font: js.UndefOr[TitleSubTitleFont] = js.native
  /** Maximum width of the Subtitle, when the Subtitle exceeds this width, the Subtitle gets trimmed, when enableTrim is true.
    * @Default {auto}
    */
  var maximumWidth: js.UndefOr[String] = js.native
  /** Text to be displayed in sub title.
    */
  var text: js.UndefOr[String] = js.native
  /** Alignment of sub title text.
    * @Default {far. See TextAlignment}
    */
  var textAlignment: js.UndefOr[Alignment | String] = js.native
  /** Specifies the action taken when the Chart width is more than the SubTitleWidth.
    * @Default {trim.}
    */
  var textOverflow: js.UndefOr[TextOverflow | String] = js.native
  /** Controls the visibility of the Chart SubTitle
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object TitleSubTitle {
  @scala.inline
  def apply(): TitleSubTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitleSubTitle]
  }
  @scala.inline
  implicit class TitleSubTitleOps[Self <: TitleSubTitle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: TitleSubTitleBorder): Self = {
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
    def withFont(value: TitleSubTitleFont): Self = {
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
    def withMaximumWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumWidth")(js.undefined)
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
    def withTextAlignment(value: Alignment | String): Self = {
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

