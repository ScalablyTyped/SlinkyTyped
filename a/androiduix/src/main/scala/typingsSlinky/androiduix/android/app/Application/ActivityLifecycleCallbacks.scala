package typingsSlinky.androiduix.android.app.Application

import typingsSlinky.androiduix.android.app.Activity
import typingsSlinky.androiduix.android.os.Bundle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityLifecycleCallbacks extends js.Object {
  def onActivityCreated(activity: Activity, savedInstanceState: Bundle): Unit = js.native
  def onActivityDestroyed(activity: Activity): Unit = js.native
  def onActivityPaused(activity: Activity): Unit = js.native
  def onActivityResumed(activity: Activity): Unit = js.native
  def onActivitySaveInstanceState(activity: Activity, outState: Bundle): Unit = js.native
  def onActivityStarted(activity: Activity): Unit = js.native
  def onActivityStopped(activity: Activity): Unit = js.native
}

object ActivityLifecycleCallbacks {
  @scala.inline
  def apply(
    onActivityCreated: (Activity, Bundle) => Unit,
    onActivityDestroyed: Activity => Unit,
    onActivityPaused: Activity => Unit,
    onActivityResumed: Activity => Unit,
    onActivitySaveInstanceState: (Activity, Bundle) => Unit,
    onActivityStarted: Activity => Unit,
    onActivityStopped: Activity => Unit
  ): ActivityLifecycleCallbacks = {
    val __obj = js.Dynamic.literal(onActivityCreated = js.Any.fromFunction2(onActivityCreated), onActivityDestroyed = js.Any.fromFunction1(onActivityDestroyed), onActivityPaused = js.Any.fromFunction1(onActivityPaused), onActivityResumed = js.Any.fromFunction1(onActivityResumed), onActivitySaveInstanceState = js.Any.fromFunction2(onActivitySaveInstanceState), onActivityStarted = js.Any.fromFunction1(onActivityStarted), onActivityStopped = js.Any.fromFunction1(onActivityStopped))
    __obj.asInstanceOf[ActivityLifecycleCallbacks]
  }
  @scala.inline
  implicit class ActivityLifecycleCallbacksOps[Self <: ActivityLifecycleCallbacks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnActivityCreated(value: (Activity, Bundle) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivityCreated")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnActivityDestroyed(value: Activity => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivityDestroyed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnActivityPaused(value: Activity => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivityPaused")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnActivityResumed(value: Activity => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivityResumed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnActivitySaveInstanceState(value: (Activity, Bundle) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivitySaveInstanceState")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnActivityStarted(value: Activity => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivityStarted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnActivityStopped(value: Activity => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivityStopped")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

