package typingsSlinky.androiduix.android.widget

import typingsSlinky.androiduix.android.database.DataSetObserver
import typingsSlinky.androiduix.android.view.View
import typingsSlinky.androiduix.android.view.ViewGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Adapter extends js.Object {
  def getCount(): Double = js.native
  def getItem(position: Double): js.Any = js.native
  def getItemId(position: Double): Double = js.native
  def getItemViewType(position: Double): Double = js.native
  def getView(position: Double, convertView: View, parent: ViewGroup): View = js.native
  def getViewTypeCount(): Double = js.native
  def hasStableIds(): Boolean = js.native
  def isEmpty(): Boolean = js.native
  def registerDataSetObserver(observer: DataSetObserver): Unit = js.native
  def unregisterDataSetObserver(observer: DataSetObserver): Unit = js.native
}

object Adapter {
  @scala.inline
  def apply(
    getCount: () => Double,
    getItem: Double => js.Any,
    getItemId: Double => Double,
    getItemViewType: Double => Double,
    getView: (Double, View, ViewGroup) => View,
    getViewTypeCount: () => Double,
    hasStableIds: () => Boolean,
    isEmpty: () => Boolean,
    registerDataSetObserver: DataSetObserver => Unit,
    unregisterDataSetObserver: DataSetObserver => Unit
  ): Adapter = {
    val __obj = js.Dynamic.literal(getCount = js.Any.fromFunction0(getCount), getItem = js.Any.fromFunction1(getItem), getItemId = js.Any.fromFunction1(getItemId), getItemViewType = js.Any.fromFunction1(getItemViewType), getView = js.Any.fromFunction3(getView), getViewTypeCount = js.Any.fromFunction0(getViewTypeCount), hasStableIds = js.Any.fromFunction0(hasStableIds), isEmpty = js.Any.fromFunction0(isEmpty), registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
    __obj.asInstanceOf[Adapter]
  }
  @scala.inline
  implicit class AdapterOps[Self <: Adapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetItem(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetItemId(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetItemViewType(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemViewType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetView(value: (Double, View, ViewGroup) => View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getView")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetViewTypeCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewTypeCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasStableIds(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasStableIds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsEmpty(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegisterDataSetObserver(value: DataSetObserver => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerDataSetObserver")(js.Any.fromFunction1(value))
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

