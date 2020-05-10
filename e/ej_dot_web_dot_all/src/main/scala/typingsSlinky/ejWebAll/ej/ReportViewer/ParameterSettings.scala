package typingsSlinky.ejWebAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterSettings extends js.Object {
  /** Sets the separator when the multiSelectMode with delimiter option or checkbox is enabled with the dropdown. When you enter the delimiter value, the texts after the delimiter are
    * considered as a separate word or query. The delimiter string is a single character and must be a symbol. Mostly, the delimiter symbol is used as comma (,) or semi-colon (;) or
    * any other special character.
    * @Default {,}
    */
  var delimiterChar: js.UndefOr[String] = js.native
  /** Specifies the width of the parameter item. By default, the item width value is set as &quot;185px&quot;.
    * @Default {185px}
    */
  var itemWidth: js.UndefOr[String] = js.native
  /** Specifies the width of the parameter label. By default, the parameter label width value is set as &quot;110px&quot;.
    * @Default {110px}
    */
  var labelWidth: js.UndefOr[String] = js.native
  /** Specifies the height of the combobox parameter popup list. By default, the popup height value is &quot;152px&quot;.
    * @Default {152px}
    */
  var popupHeight: js.UndefOr[String] = js.native
  /** Specifies the width of the combobox parameter popup list. By default, the popup width sets based on the width of the component.
    * @Default {auto}
    */
  var popupWidth: js.UndefOr[String] = js.native
}

object ParameterSettings {
  @scala.inline
  def apply(): ParameterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterSettings]
  }
  @scala.inline
  implicit class ParameterSettingsOps[Self <: ParameterSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelimiterChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiterChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiterChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiterChar")(js.undefined)
        ret
    }
    @scala.inline
    def withItemWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupWidth")(js.undefined)
        ret
    }
  }
  
}

