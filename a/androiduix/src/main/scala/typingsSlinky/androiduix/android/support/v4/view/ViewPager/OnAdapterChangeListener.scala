package typingsSlinky.androiduix.android.support.v4.view.ViewPager

import typingsSlinky.androiduix.android.support.v4.view.PagerAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnAdapterChangeListener extends js.Object {
  def onAdapterChanged(oldAdapter: PagerAdapter, newAdapter: PagerAdapter): Unit = js.native
}

object OnAdapterChangeListener {
  @scala.inline
  def apply(onAdapterChanged: (PagerAdapter, PagerAdapter) => Unit): OnAdapterChangeListener = {
    val __obj = js.Dynamic.literal(onAdapterChanged = js.Any.fromFunction2(onAdapterChanged))
    __obj.asInstanceOf[OnAdapterChangeListener]
  }
  @scala.inline
  implicit class OnAdapterChangeListenerOps[Self <: OnAdapterChangeListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnAdapterChanged(value: (PagerAdapter, PagerAdapter) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdapterChanged")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

