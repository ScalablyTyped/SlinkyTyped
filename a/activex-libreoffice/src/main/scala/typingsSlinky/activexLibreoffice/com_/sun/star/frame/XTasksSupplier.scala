package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * use {@link XFramesSupplier} instead of that
  * @deprecated Deprecated
  */
@js.native
trait XTasksSupplier extends XInterface {
  /**
    * use {@link XFramesSupplier.getActiveFrame()} instead of this one
    * @deprecated Deprecated
    */
  val ActiveTask: XTask = js.native
  /**
    * use {@link XFramesSupplier.getFrames()} instead of this one
    * @deprecated Deprecated
    */
  val Tasks: XEnumerationAccess = js.native
  /**
    * use {@link XFramesSupplier.getActiveFrame()} instead of this one
    * @deprecated Deprecated
    */
  def getActiveTask(): XTask = js.native
  /**
    * use {@link XFramesSupplier.getFrames()} instead of this one
    * @deprecated Deprecated
    */
  def getTasks(): XEnumerationAccess = js.native
}

object XTasksSupplier {
  @scala.inline
  def apply(
    ActiveTask: XTask,
    Tasks: XEnumerationAccess,
    acquire: () => Unit,
    getActiveTask: () => XTask,
    getTasks: () => XEnumerationAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTasksSupplier = {
    val __obj = js.Dynamic.literal(ActiveTask = ActiveTask.asInstanceOf[js.Any], Tasks = Tasks.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getActiveTask = js.Any.fromFunction0(getActiveTask), getTasks = js.Any.fromFunction0(getTasks), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTasksSupplier]
  }
  @scala.inline
  implicit class XTasksSupplierOps[Self <: XTasksSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveTask(value: XTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveTask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTasks(value: XEnumerationAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetActiveTask(value: () => XTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveTask")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTasks(value: () => XEnumerationAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTasks")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

