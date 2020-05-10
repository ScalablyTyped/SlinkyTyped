package typingsSlinky.mendixmodelsdk.modelEventManagerMod

import typingsSlinky.mendixmodelsdk.commonMod.common.IErrorCallback
import typingsSlinky.mendixmodelsdk.commonMod.common.IVoidCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModelEventManager extends js.Object {
  def loadUnitCompleted(eventId: Double, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
  def loadUnitStarted(): Unit = js.native
  def onEventProcessed(callback: IVoidCallback): Unit = js.native
  def onFileChangesReceived(callback: js.Function1[/* files */ js.Array[String], Unit]): Unit = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
}

object IModelEventManager {
  @scala.inline
  def apply(
    loadUnitCompleted: (Double, IVoidCallback, IErrorCallback) => Unit,
    loadUnitStarted: () => Unit,
    onEventProcessed: IVoidCallback => Unit,
    onFileChangesReceived: js.Function1[/* files */ js.Array[String], Unit] => Unit,
    start: () => Unit,
    stop: () => Unit
  ): IModelEventManager = {
    val __obj = js.Dynamic.literal(loadUnitCompleted = js.Any.fromFunction3(loadUnitCompleted), loadUnitStarted = js.Any.fromFunction0(loadUnitStarted), onEventProcessed = js.Any.fromFunction1(onEventProcessed), onFileChangesReceived = js.Any.fromFunction1(onFileChangesReceived), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[IModelEventManager]
  }
  @scala.inline
  implicit class IModelEventManagerOps[Self <: IModelEventManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadUnitCompleted(value: (Double, IVoidCallback, IErrorCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadUnitCompleted")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withLoadUnitStarted(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadUnitStarted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnEventProcessed(value: IVoidCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEventProcessed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnFileChangesReceived(value: js.Function1[/* files */ js.Array[String], Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFileChangesReceived")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

