package typingsSlinky.blueprintjsTable.editableNameMod

import typingsSlinky.blueprintjsCore.propsMod.IIntentProps
import typingsSlinky.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditableNameProps
  extends IIntentProps
     with IProps {
  /**
    * The index of the name in the header. If provided, this will be passed as an argument to any
    * callbacks when they are invoked.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * The name displayed in the text box. Be sure to update this value when
    * rendering this component after a confirmed change.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A listener that is triggered if the user cancels the edit. This is
    * important to listen to if you are doing anything with `onChange` events,
    * since you'll likely want to revert whatever changes you made.
    */
  var onCancel: js.UndefOr[js.Function2[/* value */ String, /* columnIndex */ js.UndefOr[Double], Unit]] = js.native
  /**
    * A listener that is triggered as soon as the editable name is modified.
    * This can be due, for example, to keyboard input or the clipboard.
    */
  var onChange: js.UndefOr[js.Function2[/* value */ String, /* columnIndex */ js.UndefOr[Double], Unit]] = js.native
  /**
    * A listener that is triggered once the editing is confirmed. This is
    * usually due to the `return` (or `enter`) key press.
    */
  var onConfirm: js.UndefOr[js.Function2[/* value */ String, /* columnIndex */ js.UndefOr[Double], Unit]] = js.native
}

object IEditableNameProps {
  @scala.inline
  def apply(): IEditableNameProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditableNameProps]
  }
  @scala.inline
  implicit class IEditableNamePropsOps[Self <: IEditableNameProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCancel(value: (/* value */ String, /* columnIndex */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* value */ String, /* columnIndex */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnConfirm(value: (/* value */ String, /* columnIndex */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConfirm")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnConfirm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConfirm")(js.undefined)
        ret
    }
  }
  
}

