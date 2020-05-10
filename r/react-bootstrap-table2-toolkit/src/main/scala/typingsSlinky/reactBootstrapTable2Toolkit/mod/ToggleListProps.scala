package typingsSlinky.reactBootstrapTable2Toolkit.mod

import typingsSlinky.reactBootstrapTableNext.mod.ColumnDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToggleListProps extends js.Object {
  var btnClassName: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var columns: js.Array[ColumnDescription[_, _]] = js.native
  var contextual: js.UndefOr[String] = js.native
  /**
    * array of toggled columns
    */
  var toggles: js.Array[Boolean] = js.native
  def onColumnToggle(dataField: String): Unit = js.native
}

object ToggleListProps {
  @scala.inline
  def apply(
    columns: js.Array[ColumnDescription[_, _]],
    onColumnToggle: String => Unit,
    toggles: js.Array[Boolean]
  ): ToggleListProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], onColumnToggle = js.Any.fromFunction1(onColumnToggle), toggles = toggles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToggleListProps]
  }
  @scala.inline
  implicit class ToggleListPropsOps[Self <: ToggleListProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[ColumnDescription[_, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnColumnToggle(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnToggle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToggles(value: js.Array[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBtnClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtnClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnClassName")(js.undefined)
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
    def withContextual(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextual")(js.undefined)
        ret
    }
  }
  
}

