package typingsSlinky.reactBootstrapTable.mod

import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonProps extends js.Object {
  /**
  	 * Bootstrap css style class for the button, e.g. 'btn-warning'
  	 */
  var btnContextual: js.UndefOr[String] = js.native
  /**
  	 * Glyphicon glyph string for the button, e.g. 'glyphicon-edit'
  	 */
  var btnGlyphicon: js.UndefOr[String] = js.native
  /**
  	 * Label for the button
  	 */
  var btnText: js.UndefOr[String] = js.native
  /**
  	 * Custom class for the button
  	 */
  var className: js.UndefOr[String] = js.native
  /**
  	 * Function to be called to activate the normal onClick functionality for this button.
  	 */
  var onClick: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[_], Unit]] = js.native
}

object ButtonProps {
  @scala.inline
  def apply(): ButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonProps]
  }
  @scala.inline
  implicit class ButtonPropsOps[Self <: ButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBtnContextual(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnContextual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtnContextual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnContextual")(js.undefined)
        ret
    }
    @scala.inline
    def withBtnGlyphicon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnGlyphicon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtnGlyphicon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnGlyphicon")(js.undefined)
        ret
    }
    @scala.inline
    def withBtnText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtnText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnText")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* e */ SyntheticMouseEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
  }
  
}

