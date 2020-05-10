package typingsSlinky.reactBootstrapTable.mod

import typingsSlinky.reactBootstrapTable.AnonText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizePerPageDropDownProps extends js.Object {
  /**
  	 * Bootstrap css style class for the button, e.g. 'btn-warning'
  	 */
  var btnContextual: js.UndefOr[String] = js.native
  /**
  	 * Custom class name to use for the component.
  	 */
  var className: js.UndefOr[String] = js.native
  /**
  	 * Current size per page
  	 */
  var currSizePerPage: js.UndefOr[String] = js.native
  /**
  	 * Flag to indicate that the dropdown is currently hidden
  	 */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
  	 * Callback function that should be triggered when the user clicks on the dropdown button.
  	 */
  var onClick: js.UndefOr[js.Function1[/* toggleDropDown */ js.Function0[Unit], Unit]] = js.native
  /**
  	 * Flag to indicate that the dropdown is open
  	 */
  var open: js.UndefOr[Boolean] = js.native
  /**
  	 * Size Per Page options list
  	 */
  var options: js.UndefOr[js.Array[AnonText | Double]] = js.native
  /**
  	 * Whether the button menu should 'dropup' or 'dropdown'.
  	 */
  var variation: js.UndefOr[DropDirection] = js.native
}

object SizePerPageDropDownProps {
  @scala.inline
  def apply(): SizePerPageDropDownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizePerPageDropDownProps]
  }
  @scala.inline
  implicit class SizePerPageDropDownPropsOps[Self <: SizePerPageDropDownProps] (val x: Self) extends AnyVal {
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
    def withCurrSizePerPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currSizePerPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrSizePerPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currSizePerPage")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* toggleDropDown */ js.Function0[Unit] => Unit): Self = {
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
    @scala.inline
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[AnonText | Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withVariation(value: DropDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variation")(js.undefined)
        ret
    }
  }
  
}

