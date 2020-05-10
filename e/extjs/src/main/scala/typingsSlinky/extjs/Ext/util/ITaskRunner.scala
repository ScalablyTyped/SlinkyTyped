package typingsSlinky.extjs.Ext.util

import typingsSlinky.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITaskRunner extends IBase {
  /** [Method] Destroys this instance stopping all tasks that are currently running  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var fireIdleEvent: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var interval: js.UndefOr[Double] = js.native
  /** [Method] Creates a new Task instance
  		* @param config Object The config object. For details on the supported properties, see start.
  		*/
  var newTask: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Starts a new task
  		* @param task Object A config object that supports the following properties:
  		* @returns Object The task
  		*/
  var start: js.UndefOr[js.Function1[/* task */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Stops an existing running task
  		* @param task Object The task to stop
  		* @returns Object The task
  		*/
  var stop: js.UndefOr[js.Function1[/* task */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Stops all tasks that are currently running  */
  var stopAll: js.UndefOr[js.Function0[Unit]] = js.native
}

object ITaskRunner {
  @scala.inline
  def apply(): ITaskRunner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITaskRunner]
  }
  @scala.inline
  implicit class ITaskRunnerOps[Self <: ITaskRunner] (val x: Self) extends AnyVal {
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
    def withFireIdleEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireIdleEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFireIdleEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireIdleEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withNewTask(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTask")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNewTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTask")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: /* task */ js.UndefOr[js.Any] => _): Self = {
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
    def withStop(value: /* task */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.undefined)
        ret
    }
    @scala.inline
    def withStopAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutStopAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopAll")(js.undefined)
        ret
    }
  }
  
}

