package typingsSlinky.androiduix.android.database

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSetObserver extends js.Object {
  def onChanged(): Unit = js.native
  def onInvalidated(): Unit = js.native
}

object DataSetObserver {
  @scala.inline
  def apply(onChanged: () => Unit, onInvalidated: () => Unit): DataSetObserver = {
    val __obj = js.Dynamic.literal(onChanged = js.Any.fromFunction0(onChanged), onInvalidated = js.Any.fromFunction0(onInvalidated))
    __obj.asInstanceOf[DataSetObserver]
  }
  @scala.inline
  implicit class DataSetObserverOps[Self <: DataSetObserver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnChanged(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnInvalidated(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalidated")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

