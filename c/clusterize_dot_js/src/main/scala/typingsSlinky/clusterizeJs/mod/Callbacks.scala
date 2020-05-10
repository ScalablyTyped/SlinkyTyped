package typingsSlinky.clusterizeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callbacks extends js.Object {
  var clusterChanged: js.UndefOr[js.Function0[Unit]] = js.native
  var clusterWillChange: js.UndefOr[js.Function0[Unit]] = js.native
  var scrollingProgress: js.UndefOr[js.Function1[/* progress */ Double, Unit]] = js.native
}

object Callbacks {
  @scala.inline
  def apply(): Callbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callbacks]
  }
  @scala.inline
  implicit class CallbacksOps[Self <: Callbacks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterChanged(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterChanged")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClusterChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterWillChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterWillChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClusterWillChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterWillChange")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollingProgress(value: /* progress */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollingProgress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScrollingProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollingProgress")(js.undefined)
        ret
    }
  }
  
}

