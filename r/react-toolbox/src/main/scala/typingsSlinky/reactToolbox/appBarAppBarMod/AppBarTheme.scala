package typingsSlinky.reactToolbox.appBarAppBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppBarTheme extends js.Object {
  /**
    * Used for the component root element.
    */
  var appBar: js.UndefOr[String] = js.native
  /**
    * Added to the root element when the app bar is fixed.
    */
  var fixed: js.UndefOr[String] = js.native
  /**
    * Added to the root element when the app bar is flat.
    */
  var flat: js.UndefOr[String] = js.native
  /**
    * Added to the left icon app bar element.
    */
  var leftIcon: js.UndefOr[String] = js.native
  /**
    * Added to the right icon app bar element.
    */
  var rightIcon: js.UndefOr[String] = js.native
  /**
    * Added to the root element when the app bar is hidden during scroll.
    */
  var scrollHide: js.UndefOr[String] = js.native
  /**
    * Used as the app bar title.
    */
  var title: js.UndefOr[String] = js.native
}

object AppBarTheme {
  @scala.inline
  def apply(): AppBarTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppBarTheme]
  }
  @scala.inline
  implicit class AppBarThemeOps[Self <: AppBarTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppBar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBar")(js.undefined)
        ret
    }
    @scala.inline
    def withFixed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(js.undefined)
        ret
    }
    @scala.inline
    def withFlat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withRightIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollHide(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHide")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

