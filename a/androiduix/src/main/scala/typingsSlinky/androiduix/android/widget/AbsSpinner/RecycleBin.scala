package typingsSlinky.androiduix.android.widget.AbsSpinner

import typingsSlinky.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecycleBin extends js.Object {
  var _AbsSpinner_this: typingsSlinky.androiduix.android.widget.AbsSpinner = js.native
  var mScrapHeap: js.Any = js.native
  def clear(): Unit = js.native
  def get(position: Double): View = js.native
  def put(position: Double, v: View): Unit = js.native
}

object RecycleBin {
  @scala.inline
  def apply(
    _AbsSpinner_this: typingsSlinky.androiduix.android.widget.AbsSpinner,
    clear: () => Unit,
    get: Double => View,
    mScrapHeap: js.Any,
    put: (Double, View) => Unit
  ): RecycleBin = {
    val __obj = js.Dynamic.literal(_AbsSpinner_this = _AbsSpinner_this.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), mScrapHeap = mScrapHeap.asInstanceOf[js.Any], put = js.Any.fromFunction2(put))
    __obj.asInstanceOf[RecycleBin]
  }
  @scala.inline
  implicit class RecycleBinOps[Self <: RecycleBin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_AbsSpinner_this(value: typingsSlinky.androiduix.android.widget.AbsSpinner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_AbsSpinner_this")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet(value: Double => View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMScrapHeap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mScrapHeap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPut(value: (Double, View) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

