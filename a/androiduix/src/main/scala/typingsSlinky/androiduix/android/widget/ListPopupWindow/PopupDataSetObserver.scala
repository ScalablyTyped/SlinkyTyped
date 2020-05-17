package typingsSlinky.androiduix.android.widget.ListPopupWindow

import typingsSlinky.androiduix.android.database.DataSetObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupDataSetObserver extends DataSetObserver {
  var _ListPopupWindow_this: typingsSlinky.androiduix.android.widget.ListPopupWindow = js.native
}

object PopupDataSetObserver {
  @scala.inline
  def apply(
    _ListPopupWindow_this: typingsSlinky.androiduix.android.widget.ListPopupWindow,
    onChanged: () => Unit,
    onInvalidated: () => Unit
  ): PopupDataSetObserver = {
    val __obj = js.Dynamic.literal(_ListPopupWindow_this = _ListPopupWindow_this.asInstanceOf[js.Any], onChanged = js.Any.fromFunction0(onChanged), onInvalidated = js.Any.fromFunction0(onInvalidated))
    __obj.asInstanceOf[PopupDataSetObserver]
  }
  @scala.inline
  implicit class PopupDataSetObserverOps[Self <: PopupDataSetObserver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_ListPopupWindow_this(value: typingsSlinky.androiduix.android.widget.ListPopupWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ListPopupWindow_this")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

