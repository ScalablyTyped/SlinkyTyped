package typingsSlinky.androiduix.android.widget

import typingsSlinky.androiduix.android.content.Context
import typingsSlinky.androiduix.android.database.DataSetObserver
import typingsSlinky.androiduix.android.view.View
import typingsSlinky.androiduix.android.view.ViewGroup
import typingsSlinky.androiduix.java_.util.Comparator
import typingsSlinky.androiduix.java_.util.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayAdapter[T] extends BaseAdapter {
  var mContext: js.Any = js.native
  var mDropDownResource: js.Any = js.native
  var mFieldId: js.Any = js.native
  var mInflater: js.Any = js.native
  var mNotifyOnChange: js.Any = js.native
  var mObjects: js.Any = js.native
  var mResource: js.Any = js.native
  def add(`object`: T): Unit = js.native
  def addAll(collection: List[T]): Unit = js.native
  def clear(): Unit = js.native
  /* private */ def createViewFromResource(position: js.Any, convertView: js.Any, parent: js.Any, resource: js.Any): js.Any = js.native
  def getContext(): Context = js.native
  def getPosition(item: T): Double = js.native
  /* private */ def init(context: js.Any, resource: js.Any, textViewResourceId: js.Any, objects: js.Any): js.Any = js.native
  def insert(`object`: T, index: Double): Unit = js.native
  def remove(`object`: T): Unit = js.native
  def setDropDownViewResource(resource: String): Unit = js.native
  def setNotifyOnChange(notifyOnChange: Boolean): Unit = js.native
  def sort(comparator: Comparator[T]): Unit = js.native
}

object ArrayAdapter {
  @scala.inline
  def apply[T](
    add: T => Unit,
    addAll: List[T] => Unit,
    areAllItemsEnabled: () => Boolean,
    clear: () => Unit,
    createViewFromResource: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    getContext: () => Context,
    getCount: () => Double,
    getDropDownView: (Double, View, ViewGroup) => View,
    getItem: Double => js.Any,
    getItemId: Double => Double,
    getItemViewType: Double => Double,
    getPosition: T => Double,
    getView: (Double, View, ViewGroup) => View,
    getViewTypeCount: () => Double,
    hasStableIds: () => Boolean,
    init: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    insert: (T, Double) => Unit,
    isEmpty: () => Boolean,
    isEnabled: Double => Boolean,
    mContext: js.Any,
    mDataSetObservable: js.Any,
    mDropDownResource: js.Any,
    mFieldId: js.Any,
    mInflater: js.Any,
    mNotifyOnChange: js.Any,
    mObjects: js.Any,
    mResource: js.Any,
    notifyDataSetChanged: () => Unit,
    notifyDataSetInvalidated: () => Unit,
    registerDataSetObserver: DataSetObserver => Unit,
    remove: T => Unit,
    setDropDownViewResource: String => Unit,
    setNotifyOnChange: Boolean => Unit,
    sort: Comparator[T] => Unit,
    unregisterDataSetObserver: DataSetObserver => Unit
  ): ArrayAdapter[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addAll = js.Any.fromFunction1(addAll), areAllItemsEnabled = js.Any.fromFunction0(areAllItemsEnabled), clear = js.Any.fromFunction0(clear), createViewFromResource = js.Any.fromFunction4(createViewFromResource), getContext = js.Any.fromFunction0(getContext), getCount = js.Any.fromFunction0(getCount), getDropDownView = js.Any.fromFunction3(getDropDownView), getItem = js.Any.fromFunction1(getItem), getItemId = js.Any.fromFunction1(getItemId), getItemViewType = js.Any.fromFunction1(getItemViewType), getPosition = js.Any.fromFunction1(getPosition), getView = js.Any.fromFunction3(getView), getViewTypeCount = js.Any.fromFunction0(getViewTypeCount), hasStableIds = js.Any.fromFunction0(hasStableIds), init = js.Any.fromFunction4(init), insert = js.Any.fromFunction2(insert), isEmpty = js.Any.fromFunction0(isEmpty), isEnabled = js.Any.fromFunction1(isEnabled), mContext = mContext.asInstanceOf[js.Any], mDataSetObservable = mDataSetObservable.asInstanceOf[js.Any], mDropDownResource = mDropDownResource.asInstanceOf[js.Any], mFieldId = mFieldId.asInstanceOf[js.Any], mInflater = mInflater.asInstanceOf[js.Any], mNotifyOnChange = mNotifyOnChange.asInstanceOf[js.Any], mObjects = mObjects.asInstanceOf[js.Any], mResource = mResource.asInstanceOf[js.Any], notifyDataSetChanged = js.Any.fromFunction0(notifyDataSetChanged), notifyDataSetInvalidated = js.Any.fromFunction0(notifyDataSetInvalidated), registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), remove = js.Any.fromFunction1(remove), setDropDownViewResource = js.Any.fromFunction1(setDropDownViewResource), setNotifyOnChange = js.Any.fromFunction1(setNotifyOnChange), sort = js.Any.fromFunction1(sort), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
    __obj.asInstanceOf[ArrayAdapter[T]]
  }
  @scala.inline
  implicit class ArrayAdapterOps[Self[t] <: ArrayAdapter[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAdd(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddAll(value: List[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateViewFromResource(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createViewFromResource")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGetContext(value: () => Context): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPosition(value: T => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInit(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withInsert(value: (T, Double) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMContext(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDropDownResource(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDropDownResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMFieldId(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mFieldId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMInflater(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mInflater")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMNotifyOnChange(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mNotifyOnChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMObjects(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMResource(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDropDownViewResource(value: String => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDropDownViewResource")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetNotifyOnChange(value: Boolean => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNotifyOnChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSort(value: Comparator[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

