package typingsSlinky.androiduix.android.widget

import typingsSlinky.androiduix.android.database.DataSetObserver
import typingsSlinky.androiduix.android.view.View
import typingsSlinky.androiduix.android.view.ViewGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseExpandableListAdapter
  extends ExpandableListAdapter
     with HeterogeneousExpandableList {
  
  var mDataSetObservable: js.Any = js.native
  
  def notifyDataSetChanged(): Unit = js.native
  
  def notifyDataSetInvalidated(): Unit = js.native
}
object BaseExpandableListAdapter {
  
  @scala.inline
  def apply(
    areAllItemsEnabled: () => Boolean,
    getChild: (Double, Double) => js.Any,
    getChildId: (Double, Double) => Double,
    getChildType: (Double, Double) => Double,
    getChildTypeCount: () => Double,
    getChildView: (Double, Double, Boolean, View, ViewGroup) => View,
    getChildrenCount: Double => Double,
    getCombinedChildId: (Double, Double) => Double,
    getCombinedGroupId: Double => Double,
    getGroup: Double => js.Any,
    getGroupCount: () => Double,
    getGroupId: Double => Double,
    getGroupType: Double => Double,
    getGroupTypeCount: () => Double,
    getGroupView: (Double, Boolean, View, ViewGroup) => View,
    hasStableIds: () => Boolean,
    isChildSelectable: (Double, Double) => Boolean,
    isEmpty: () => Boolean,
    mDataSetObservable: js.Any,
    notifyDataSetChanged: () => Unit,
    notifyDataSetInvalidated: () => Unit,
    onGroupCollapsed: Double => Unit,
    onGroupExpanded: Double => Unit,
    registerDataSetObserver: DataSetObserver => Unit,
    unregisterDataSetObserver: DataSetObserver => Unit
  ): BaseExpandableListAdapter = {
    val __obj = js.Dynamic.literal(areAllItemsEnabled = js.Any.fromFunction0(areAllItemsEnabled), getChild = js.Any.fromFunction2(getChild), getChildId = js.Any.fromFunction2(getChildId), getChildType = js.Any.fromFunction2(getChildType), getChildTypeCount = js.Any.fromFunction0(getChildTypeCount), getChildView = js.Any.fromFunction5(getChildView), getChildrenCount = js.Any.fromFunction1(getChildrenCount), getCombinedChildId = js.Any.fromFunction2(getCombinedChildId), getCombinedGroupId = js.Any.fromFunction1(getCombinedGroupId), getGroup = js.Any.fromFunction1(getGroup), getGroupCount = js.Any.fromFunction0(getGroupCount), getGroupId = js.Any.fromFunction1(getGroupId), getGroupType = js.Any.fromFunction1(getGroupType), getGroupTypeCount = js.Any.fromFunction0(getGroupTypeCount), getGroupView = js.Any.fromFunction4(getGroupView), hasStableIds = js.Any.fromFunction0(hasStableIds), isChildSelectable = js.Any.fromFunction2(isChildSelectable), isEmpty = js.Any.fromFunction0(isEmpty), mDataSetObservable = mDataSetObservable.asInstanceOf[js.Any], notifyDataSetChanged = js.Any.fromFunction0(notifyDataSetChanged), notifyDataSetInvalidated = js.Any.fromFunction0(notifyDataSetInvalidated), onGroupCollapsed = js.Any.fromFunction1(onGroupCollapsed), onGroupExpanded = js.Any.fromFunction1(onGroupExpanded), registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
    __obj.asInstanceOf[BaseExpandableListAdapter]
  }
  
  @scala.inline
  implicit class BaseExpandableListAdapterMutableBuilder[Self <: BaseExpandableListAdapter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMDataSetObservable(value: js.Any): Self = StObject.set(x, "mDataSetObservable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifyDataSetChanged(value: () => Unit): Self = StObject.set(x, "notifyDataSetChanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNotifyDataSetInvalidated(value: () => Unit): Self = StObject.set(x, "notifyDataSetInvalidated", js.Any.fromFunction0(value))
  }
}
