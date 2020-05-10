package typingsSlinky.atom.mod

import typingsSlinky.atom.AnonReloaded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryManager extends js.Object {
  /**
    *  Clear all projects from the history.
    *  Note: This is not a privacy function - other traces will still exist, e.g.
    *  window state.
    */
  def clearProjects(): Unit = js.native
  /** Obtain a list of previously opened projects. */
  def getProjects(): js.Array[ProjectHistory] = js.native
  /** Invoke the given callback when the list of projects changes. */
  def onDidChangeProjects(callback: js.Function1[/* args */ AnonReloaded, Unit]): Disposable = js.native
}

object HistoryManager {
  @scala.inline
  def apply(
    clearProjects: () => Unit,
    getProjects: () => js.Array[ProjectHistory],
    onDidChangeProjects: js.Function1[/* args */ AnonReloaded, Unit] => Disposable
  ): HistoryManager = {
    val __obj = js.Dynamic.literal(clearProjects = js.Any.fromFunction0(clearProjects), getProjects = js.Any.fromFunction0(getProjects), onDidChangeProjects = js.Any.fromFunction1(onDidChangeProjects))
    __obj.asInstanceOf[HistoryManager]
  }
  @scala.inline
  implicit class HistoryManagerOps[Self <: HistoryManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearProjects(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearProjects")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetProjects(value: () => js.Array[ProjectHistory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProjects")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnDidChangeProjects(value: js.Function1[/* args */ AnonReloaded, Unit] => Disposable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidChangeProjects")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

