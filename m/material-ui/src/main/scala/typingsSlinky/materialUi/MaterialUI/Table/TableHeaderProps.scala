package typingsSlinky.materialUi.MaterialUI.Table

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableHeaderProps extends js.Object {
  var adjustForCheckbox: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var displaySelectAll: js.UndefOr[Boolean] = js.native
  var enableSelectAll: js.UndefOr[Boolean] = js.native
  /** @deprecated Instead, use event handler on Table */
  var onSelectAll: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.native
  /** @deprecated Instead, use event handler on Table */
  var selectAllSelected: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object TableHeaderProps {
  @scala.inline
  def apply(): TableHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableHeaderProps]
  }
  @scala.inline
  implicit class TableHeaderPropsOps[Self <: TableHeaderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustForCheckbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustForCheckbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjustForCheckbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustForCheckbox")(js.undefined)
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
    def withDisplaySelectAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displaySelectAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplaySelectAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displaySelectAll")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSelectAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSelectAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSelectAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSelectAll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectAll(value: /* checked */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectAll")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAllSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAllSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

