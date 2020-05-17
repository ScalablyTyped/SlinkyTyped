package typingsSlinky.androiduix.android.widget.AdapterView

import typingsSlinky.androiduix.android.database.DataSetObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdapterDataSetObserver extends DataSetObserver {
  var AdapterView_this: typingsSlinky.androiduix.android.widget.AdapterView[_] = js.native
  def clearSavedState(): Unit = js.native
}

object AdapterDataSetObserver {
  @scala.inline
  def apply(
    AdapterView_this: typingsSlinky.androiduix.android.widget.AdapterView[_],
    clearSavedState: () => Unit,
    onChanged: () => Unit,
    onInvalidated: () => Unit
  ): AdapterDataSetObserver = {
    val __obj = js.Dynamic.literal(AdapterView_this = AdapterView_this.asInstanceOf[js.Any], clearSavedState = js.Any.fromFunction0(clearSavedState), onChanged = js.Any.fromFunction0(onChanged), onInvalidated = js.Any.fromFunction0(onInvalidated))
    __obj.asInstanceOf[AdapterDataSetObserver]
  }
  @scala.inline
  implicit class AdapterDataSetObserverOps[Self <: AdapterDataSetObserver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdapterView_this(value: typingsSlinky.androiduix.android.widget.AdapterView[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdapterView_this")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearSavedState(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearSavedState")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

