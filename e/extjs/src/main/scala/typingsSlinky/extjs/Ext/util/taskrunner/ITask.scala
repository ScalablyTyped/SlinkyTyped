package typingsSlinky.extjs.Ext.util.taskrunner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITask extends js.Object {
  /** [Method] Destroys this instance stopping this task s execution  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Boolean) */
  var fireOnStart: js.UndefOr[Boolean] = js.native
  /** [Method] Restarts this task clearing it duration expiration and run count
  		* @param interval Number Optionally reset this task's interval.
  		*/
  var restart: js.UndefOr[js.Function1[/* interval */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Starts this task if it is not already started
  		* @param interval Number Optionally reset this task's interval.
  		*/
  var start: js.UndefOr[js.Function1[/* interval */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Stops this task  */
  var stop: js.UndefOr[js.Function0[Unit]] = js.native
}

object ITask {
  @scala.inline
  def apply(): ITask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITask]
  }
  @scala.inline
  implicit class ITaskOps[Self <: ITask] (val x: Self) extends AnyVal {
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
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withFireOnStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireOnStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFireOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireOnStart")(js.undefined)
        ret
    }
    @scala.inline
    def withRestart(value: /* interval */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRestart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restart")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: /* interval */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.undefined)
        ret
    }
  }
  
}

