package typingsSlinky.atlaskitInlineEdit.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseProps extends js.Object {
  /** Sets whether the checkmark and cross are displayed in the bottom right fo the field. */
  var areActionButtonsHidden: js.UndefOr[Boolean] = js.native
  /** Set whether default stylings should be disabled when editing. */
  var disableEditViewFieldBase: js.UndefOr[Boolean] = js.native
  /** Component to be shown when editing. Should be an @atlaskit/input. */
  var editView: js.UndefOr[ReactElement] = js.native
  /** Component to be shown in an @atlaskit/inline-dialog when edit view is open. */
  var invalidMessage: js.UndefOr[ReactElement] = js.native
  /** Sets whether the confirm function is called when the input loses focus. */
  var isConfirmOnBlurDisabled: js.UndefOr[Boolean] = js.native
  /** Set whether the read view should fit width, most obvious when hovered. */
  var isFitContainerWidthReadView: js.UndefOr[Boolean] = js.native
  /** Sets yellow border with warning symbol at end of input. Removes confirm and cancel buttons. */
  var isInvalid: js.UndefOr[Boolean] = js.native
  /** Determine whether the label is shown. */
  var isLabelHidden: js.UndefOr[Boolean] = js.native
  /** Greys out text and shows spinner. Does not disable input. */
  var isWaiting: js.UndefOr[Boolean] = js.native
  /** Label above the input. */
  var label: js.UndefOr[String] = js.native
  /** html to pass down to the label htmlFor prop. */
  var labelHtmlFor: js.UndefOr[String] = js.native
  /** Component to be shown when reading only */
  var readView: ReactElement = js.native
  /** Set whether onConfirm is called on pressing enter. */
  var shouldConfirmOnEnter: js.UndefOr[Boolean] = js.native
  /** Handler called when the cross is clicked on. */
  def onCancel(): Unit = js.native
  /** Handler called when checkmark is clicked. Also by default called when the input loses focus. */
  def onConfirm(): Unit = js.native
}

object BaseProps {
  @scala.inline
  def apply(onCancel: () => Unit, onConfirm: () => Unit, readView: ReactElement): BaseProps = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onConfirm = js.Any.fromFunction0(onConfirm), readView = readView.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProps]
  }
  @scala.inline
  implicit class BasePropsOps[Self <: BaseProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnConfirm(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConfirm")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadView(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAreActionButtonsHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areActionButtonsHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAreActionButtonsHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areActionButtonsHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableEditViewFieldBase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableEditViewFieldBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableEditViewFieldBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableEditViewFieldBase")(js.undefined)
        ret
    }
    @scala.inline
    def withEditView(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editView")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidMessage(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withIsConfirmOnBlurDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConfirmOnBlurDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsConfirmOnBlurDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConfirmOnBlurDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFitContainerWidthReadView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFitContainerWidthReadView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFitContainerWidthReadView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFitContainerWidthReadView")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInvalid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInvalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInvalid")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLabelHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLabelHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLabelHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLabelHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withIsWaiting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWaiting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsWaiting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWaiting")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelHtmlFor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHtmlFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelHtmlFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHtmlFor")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldConfirmOnEnter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldConfirmOnEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldConfirmOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldConfirmOnEnter")(js.undefined)
        ret
    }
  }
  
}

