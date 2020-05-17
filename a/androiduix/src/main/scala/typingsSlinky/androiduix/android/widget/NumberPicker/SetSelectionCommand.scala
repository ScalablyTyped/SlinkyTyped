package typingsSlinky.androiduix.android.widget.NumberPicker

import typingsSlinky.androiduix.java_.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetSelectionCommand extends Runnable {
  var _NumberPicker_this: typingsSlinky.androiduix.android.widget.NumberPicker = js.native
  var mSelectionEnd: js.Any = js.native
  var mSelectionStart: js.Any = js.native
}

object SetSelectionCommand {
  @scala.inline
  def apply(
    _NumberPicker_this: typingsSlinky.androiduix.android.widget.NumberPicker,
    mSelectionEnd: js.Any,
    mSelectionStart: js.Any,
    run: () => js.Any
  ): SetSelectionCommand = {
    val __obj = js.Dynamic.literal(_NumberPicker_this = _NumberPicker_this.asInstanceOf[js.Any], mSelectionEnd = mSelectionEnd.asInstanceOf[js.Any], mSelectionStart = mSelectionStart.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[SetSelectionCommand]
  }
  @scala.inline
  implicit class SetSelectionCommandOps[Self <: SetSelectionCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_NumberPicker_this(value: typingsSlinky.androiduix.android.widget.NumberPicker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_NumberPicker_this")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMSelectionEnd(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mSelectionEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMSelectionStart(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mSelectionStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

