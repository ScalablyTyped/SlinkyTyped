package typingsSlinky.reactBootstrapTable.mod

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardNavigation extends js.Object {
  /**
  	 * Set to false to disable click to navigate, usually user wants to click to select row instead of navigation.
  	 */
  var clickToNav: js.UndefOr[Boolean] = js.native
  /**
  	 * Return a style object which will be applied on the navigating cell.
  	 */
  var customStyle: js.UndefOr[js.Function2[/* cell */ js.Any, /* row */ js.Any, CSSProperties]] = js.native
  /**
  	 * Return a style object which will be applied on the both of navigating and editing cell.
  	 */
  var customStyleOnEditCell: js.UndefOr[js.Function2[/* cell */ js.Any, /* row */ js.Any, CSSProperties]] = js.native
  /**
  	 * When set to true, pressing ENTER will begin to edit the cell if cellEdit is also enabled.
  	 */
  var enterToEdit: js.UndefOr[Boolean] = js.native
  /**
  	 * When set to true, pressing ENTER will expand or collapse the current row.
  	 */
  var enterToExpand: js.UndefOr[Boolean] = js.native
  /**
  	 * When set to true, pressing ENTER will select or unselect the current row.
  	 */
  var enterToSelect: js.UndefOr[Boolean] = js.native
}

object KeyboardNavigation {
  @scala.inline
  def apply(): KeyboardNavigation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardNavigation]
  }
  @scala.inline
  implicit class KeyboardNavigationOps[Self <: KeyboardNavigation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClickToNav(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToNav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickToNav: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToNav")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomStyle(value: (/* cell */ js.Any, /* row */ js.Any) => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStyle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCustomStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomStyleOnEditCell(value: (/* cell */ js.Any, /* row */ js.Any) => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStyleOnEditCell")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCustomStyleOnEditCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStyleOnEditCell")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterToEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterToEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterToEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterToEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterToExpand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterToExpand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterToExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterToExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterToSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterToSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterToSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterToSelect")(js.undefined)
        ret
    }
  }
  
}

