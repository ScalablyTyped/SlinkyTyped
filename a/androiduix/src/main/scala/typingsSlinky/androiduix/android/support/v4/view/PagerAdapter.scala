package typingsSlinky.androiduix.android.support.v4.view

import typingsSlinky.androiduix.android.database.DataSetObserver
import typingsSlinky.androiduix.android.view.View
import typingsSlinky.androiduix.android.view.ViewGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagerAdapter extends js.Object {
  var mObservable: js.Any = js.native
  def destroyItem(container: ViewGroup, position: Double, `object`: js.Any): Unit = js.native
  def finishUpdate(container: ViewGroup): Unit = js.native
  def getCount(): Double = js.native
  def getItemPosition(`object`: js.Any): Double = js.native
  def getPageTitle(position: Double): String = js.native
  def getPageWidth(position: Double): Double = js.native
  def instantiateItem(container: ViewGroup, position: Double): js.Any = js.native
  def isViewFromObject(view: View, `object`: js.Any): Boolean = js.native
  def notifyDataSetChanged(): Unit = js.native
  def registerDataSetObserver(observer: DataSetObserver): Unit = js.native
  def setPrimaryItem(container: ViewGroup, position: Double, `object`: js.Any): Unit = js.native
  def startUpdate(container: ViewGroup): Unit = js.native
  def unregisterDataSetObserver(observer: DataSetObserver): Unit = js.native
}

object PagerAdapter {
  @scala.inline
  def apply(
    destroyItem: (ViewGroup, Double, js.Any) => Unit,
    finishUpdate: ViewGroup => Unit,
    getCount: () => Double,
    getItemPosition: js.Any => Double,
    getPageTitle: Double => String,
    getPageWidth: Double => Double,
    instantiateItem: (ViewGroup, Double) => js.Any,
    isViewFromObject: (View, js.Any) => Boolean,
    mObservable: js.Any,
    notifyDataSetChanged: () => Unit,
    registerDataSetObserver: DataSetObserver => Unit,
    setPrimaryItem: (ViewGroup, Double, js.Any) => Unit,
    startUpdate: ViewGroup => Unit,
    unregisterDataSetObserver: DataSetObserver => Unit
  ): PagerAdapter = {
    val __obj = js.Dynamic.literal(destroyItem = js.Any.fromFunction3(destroyItem), finishUpdate = js.Any.fromFunction1(finishUpdate), getCount = js.Any.fromFunction0(getCount), getItemPosition = js.Any.fromFunction1(getItemPosition), getPageTitle = js.Any.fromFunction1(getPageTitle), getPageWidth = js.Any.fromFunction1(getPageWidth), instantiateItem = js.Any.fromFunction2(instantiateItem), isViewFromObject = js.Any.fromFunction2(isViewFromObject), mObservable = mObservable.asInstanceOf[js.Any], notifyDataSetChanged = js.Any.fromFunction0(notifyDataSetChanged), registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), setPrimaryItem = js.Any.fromFunction3(setPrimaryItem), startUpdate = js.Any.fromFunction1(startUpdate), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
    __obj.asInstanceOf[PagerAdapter]
  }
  @scala.inline
  implicit class PagerAdapterOps[Self <: PagerAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroyItem(value: (ViewGroup, Double, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyItem")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFinishUpdate(value: ViewGroup => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetItemPosition(value: js.Any => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPageTitle(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPageWidth(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInstantiateItem(value: (ViewGroup, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instantiateItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsViewFromObject(value: (View, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isViewFromObject")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMObservable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mObservable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotifyDataSetChanged(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyDataSetChanged")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegisterDataSetObserver(value: DataSetObserver => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerDataSetObserver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPrimaryItem(value: (ViewGroup, Double, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPrimaryItem")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withStartUpdate(value: ViewGroup => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnregisterDataSetObserver(value: DataSetObserver => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregisterDataSetObserver")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

