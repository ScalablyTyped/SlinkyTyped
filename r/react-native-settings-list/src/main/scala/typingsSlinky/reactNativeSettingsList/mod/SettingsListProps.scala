package typingsSlinky.reactNativeSettingsList.mod

import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsListProps extends js.Object {
  /**
    * default: white
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * default: black
    */
  var borderColor: js.UndefOr[String] = js.native
  /**
    * default: 50
    */
  var defaultItemSize: js.UndefOr[Double] = js.native
  var defaultTitleInfoPosition: js.UndefOr[String] = js.native
  /**
    * default: {fontSize: 16}
    */
  var defaultTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var scrollViewProps: js.UndefOr[js.Object] = js.native
  /**
    * default: transparent
    */
  var underlayColor: js.UndefOr[String] = js.native
}

object SettingsListProps {
  @scala.inline
  def apply(): SettingsListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingsListProps]
  }
  @scala.inline
  implicit class SettingsListPropsOps[Self <: SettingsListProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultItemSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultItemSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultItemSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultItemSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultTitleInfoPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTitleInfoPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTitleInfoPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTitleInfoPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultTitleStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTitleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTitleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultTitleStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTitleStyle")(null)
        ret
    }
    @scala.inline
    def withScrollViewProps(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollViewProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollViewProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollViewProps")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlayColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlayColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayColor")(js.undefined)
        ret
    }
  }
  
}

