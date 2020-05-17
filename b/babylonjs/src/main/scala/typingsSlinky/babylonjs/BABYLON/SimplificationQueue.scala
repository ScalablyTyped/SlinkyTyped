package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimplificationQueue extends js.Object {
  var _simplificationArray: js.Any = js.native
  var getSimplifier: js.Any = js.native
  /**
    * Gets a boolean indicating that the process is still running
    */
  var running: Boolean = js.native
  /**
    * Adds a new simplification task
    * @param task defines a task to add
    */
  def addTask(task: ISimplificationTask): Unit = js.native
  /**
    * Execute next task
    */
  def executeNext(): Unit = js.native
  /**
    * Execute a simplification task
    * @param task defines the task to run
    */
  def runSimplification(task: ISimplificationTask): Unit = js.native
}

object SimplificationQueue {
  @scala.inline
  def apply(
    _simplificationArray: js.Any,
    addTask: ISimplificationTask => Unit,
    executeNext: () => Unit,
    getSimplifier: js.Any,
    runSimplification: ISimplificationTask => Unit,
    running: Boolean
  ): SimplificationQueue = {
    val __obj = js.Dynamic.literal(_simplificationArray = _simplificationArray.asInstanceOf[js.Any], addTask = js.Any.fromFunction1(addTask), executeNext = js.Any.fromFunction0(executeNext), getSimplifier = getSimplifier.asInstanceOf[js.Any], runSimplification = js.Any.fromFunction1(runSimplification), running = running.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimplificationQueue]
  }
  @scala.inline
  implicit class SimplificationQueueOps[Self <: SimplificationQueue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_simplificationArray(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_simplificationArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddTask(value: ISimplificationTask => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTask")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExecuteNext(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSimplifier(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSimplifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunSimplification(value: ISimplificationTask => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runSimplification")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRunning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("running")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

