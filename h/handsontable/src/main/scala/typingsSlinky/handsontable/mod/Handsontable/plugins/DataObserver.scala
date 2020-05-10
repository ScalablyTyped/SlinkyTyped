package typingsSlinky.handsontable.mod.Handsontable.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataObserver extends js.Object {
  var observedData: js.Array[_] = js.native
  var observer: js.Object = js.native
  var paused: Boolean = js.native
  def destroy(): Unit = js.native
  def isPaused(): Boolean = js.native
  def pause(): Unit = js.native
  def resume(): Unit = js.native
  def setObservedData(observedData: js.Any): Unit = js.native
}

object DataObserver {
  @scala.inline
  def apply(
    destroy: () => Unit,
    isPaused: () => Boolean,
    observedData: js.Array[_],
    observer: js.Object,
    pause: () => Unit,
    paused: Boolean,
    resume: () => Unit,
    setObservedData: js.Any => Unit
  ): DataObserver = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), isPaused = js.Any.fromFunction0(isPaused), observedData = observedData.asInstanceOf[js.Any], observer = observer.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), paused = paused.asInstanceOf[js.Any], resume = js.Any.fromFunction0(resume), setObservedData = js.Any.fromFunction1(setObservedData))
    __obj.asInstanceOf[DataObserver]
  }
  @scala.inline
  implicit class DataObserverOps[Self <: DataObserver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsPaused(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPaused")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withObservedData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObserver(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPause(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResume(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetObservedData(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setObservedData")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

