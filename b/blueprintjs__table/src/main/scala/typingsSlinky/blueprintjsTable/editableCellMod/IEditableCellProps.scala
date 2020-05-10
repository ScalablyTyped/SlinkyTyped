package typingsSlinky.blueprintjsTable.editableCellMod

import typingsSlinky.blueprintjsCore.editableTextMod.IEditableTextProps
import typingsSlinky.blueprintjsTable.cellMod.ICellProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditableCellProps extends ICellProps {
  /**
    * Props that should be passed to the EditableText when it is used to edit
    */
  var editableTextProps: js.UndefOr[IEditableTextProps] = js.native
  /**
    * Whether the given cell is the current active/focused cell.
    */
  var isFocused: js.UndefOr[Boolean] = js.native
  /**
    * A listener that is triggered if the user cancels the edit. This is
    * important to listen to if you are doing anything with `onChange` events,
    * since you'll likely want to revert whatever changes you made. The
    * callback will also receive the row index and column index if they were
    * originally provided via props.
    */
  var onCancel: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* rowIndex */ js.UndefOr[Double], 
      /* columnIndex */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /**
    * A listener that is triggered as soon as the editable name is modified.
    * This can be due, for example, to keyboard input or the clipboard. The
    * callback will also receive the row index and column index if they were
    * originally provided via props.
    */
  var onChange: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* rowIndex */ js.UndefOr[Double], 
      /* columnIndex */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /**
    * A listener that is triggered once the editing is confirmed. This is
    * usually due to the <code>return</code> (or <code>enter</code>) key press.
    * The callback will also receive the row index and column index if they
    * were originally provided via props.
    */
  var onConfirm: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* rowIndex */ js.UndefOr[Double], 
      /* columnIndex */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /**
    * The value displayed in the text box. Be sure to update this value when
    * rendering this component after a confirmed change.
    */
  var value: js.UndefOr[String] = js.native
}

object IEditableCellProps {
  @scala.inline
  def apply(): IEditableCellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditableCellProps]
  }
  @scala.inline
  implicit class IEditableCellPropsOps[Self <: IEditableCellProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEditableTextProps(value: IEditableTextProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editableTextProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditableTextProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editableTextProps")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCancel(
      value: (/* value */ String, /* rowIndex */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(
      value: (/* value */ String, /* rowIndex */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnConfirm(
      value: (/* value */ String, /* rowIndex */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConfirm")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnConfirm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConfirm")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

