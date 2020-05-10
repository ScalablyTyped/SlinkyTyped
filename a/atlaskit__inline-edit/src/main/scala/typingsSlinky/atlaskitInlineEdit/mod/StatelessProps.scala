package typingsSlinky.atlaskitInlineEdit.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatelessProps extends BaseProps {
  /** Whether the component shows the readView or the editView. */
  var isEditing: Boolean = js.native
  /** Handler called when the wrapper or the label are clicked. */
  def onEditRequested(): Unit = js.native
}

object StatelessProps {
  @scala.inline
  def apply(
    isEditing: Boolean,
    onCancel: () => Unit,
    onConfirm: () => Unit,
    onEditRequested: () => Unit,
    readView: ReactElement
  ): StatelessProps = {
    val __obj = js.Dynamic.literal(isEditing = isEditing.asInstanceOf[js.Any], onCancel = js.Any.fromFunction0(onCancel), onConfirm = js.Any.fromFunction0(onConfirm), onEditRequested = js.Any.fromFunction0(onEditRequested), readView = readView.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatelessProps]
  }
  @scala.inline
  implicit class StatelessPropsOps[Self <: StatelessProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsEditing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnEditRequested(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditRequested")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

