package typingsSlinky.androiduix.android.view.ViewRootImpl

import typingsSlinky.androiduix.android.os.Handler
import typingsSlinky.androiduix.java_.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunQueue extends js.Object {
  var mActions: js.Any = js.native
  def executeActions(handler: Handler): Unit = js.native
  def post(action: Runnable): Unit = js.native
  def postDelayed(action: Runnable, delayMillis: Double): Unit = js.native
  def removeCallbacks(action: Runnable): Unit = js.native
}

object RunQueue {
  @scala.inline
  def apply(
    executeActions: Handler => Unit,
    mActions: js.Any,
    post: Runnable => Unit,
    postDelayed: (Runnable, Double) => Unit,
    removeCallbacks: Runnable => Unit
  ): RunQueue = {
    val __obj = js.Dynamic.literal(executeActions = js.Any.fromFunction1(executeActions), mActions = mActions.asInstanceOf[js.Any], post = js.Any.fromFunction1(post), postDelayed = js.Any.fromFunction2(postDelayed), removeCallbacks = js.Any.fromFunction1(removeCallbacks))
    __obj.asInstanceOf[RunQueue]
  }
  @scala.inline
  implicit class RunQueueOps[Self <: RunQueue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecuteActions(value: Handler => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeActions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMActions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPost(value: Runnable => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPostDelayed(value: (Runnable, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postDelayed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveCallbacks(value: Runnable => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCallbacks")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

