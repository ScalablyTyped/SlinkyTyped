package typingsSlinky.reactNativeElements.mod

import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextProps
  extends typingsSlinky.reactNative.mod.TextProps
     with HeaderSubComponent {
  /**
    * font size 40
    */
  var h1: js.UndefOr[Boolean] = js.native
  /**
    * Styling for when `h1` is set
    */
  var h1Style: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * font size 34
    */
  var h2: js.UndefOr[Boolean] = js.native
  /**
    * Styling for when `h2` is set
    */
  var h2Style: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * font size 28
    */
  var h3: js.UndefOr[Boolean] = js.native
  /**
    * Styling for when `h3` is set
    */
  var h3Style: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * font size 22
    */
  var h4: js.UndefOr[Boolean] = js.native
  /**
    * Styling for when `h4` is set
    */
  var h4Style: js.UndefOr[StyleProp[TextStyle]] = js.native
}

object TextProps {
  @scala.inline
  def apply(): TextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextProps]
  }
  @scala.inline
  implicit class TextPropsOps[Self <: TextProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withH1(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h1")(js.undefined)
        ret
    }
    @scala.inline
    def withH1Style(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h1Style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH1Style: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h1Style")(js.undefined)
        ret
    }
    @scala.inline
    def withH1StyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h1Style")(null)
        ret
    }
    @scala.inline
    def withH2(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h2")(js.undefined)
        ret
    }
    @scala.inline
    def withH2Style(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h2Style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH2Style: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h2Style")(js.undefined)
        ret
    }
    @scala.inline
    def withH2StyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h2Style")(null)
        ret
    }
    @scala.inline
    def withH3(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h3")(js.undefined)
        ret
    }
    @scala.inline
    def withH3Style(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h3Style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH3Style: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h3Style")(js.undefined)
        ret
    }
    @scala.inline
    def withH3StyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h3Style")(null)
        ret
    }
    @scala.inline
    def withH4(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h4")(js.undefined)
        ret
    }
    @scala.inline
    def withH4Style(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h4Style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH4Style: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h4Style")(js.undefined)
        ret
    }
    @scala.inline
    def withH4StyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h4Style")(null)
        ret
    }
  }
  
}

