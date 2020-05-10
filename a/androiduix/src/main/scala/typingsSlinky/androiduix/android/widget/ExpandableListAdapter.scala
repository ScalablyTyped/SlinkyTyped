package typingsSlinky.androiduix.android.widget

import typingsSlinky.androiduix.android.database.DataSetObserver
import typingsSlinky.androiduix.android.view.View
import typingsSlinky.androiduix.android.view.ViewGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpandableListAdapter extends js.Object {
  def areAllItemsEnabled(): Boolean = js.native
  def getChild(groupPosition: Double, childPosition: Double): js.Any = js.native
  def getChildId(groupPosition: Double, childPosition: Double): Double = js.native
  def getChildView(
    groupPosition: Double,
    childPosition: Double,
    isLastChild: Boolean,
    convertView: View,
    parent: ViewGroup
  ): View = js.native
  def getChildrenCount(groupPosition: Double): Double = js.native
  def getCombinedChildId(groupId: Double, childId: Double): Double = js.native
  def getCombinedGroupId(groupId: Double): Double = js.native
  def getGroup(groupPosition: Double): js.Any = js.native
  def getGroupCount(): Double = js.native
  def getGroupId(groupPosition: Double): Double = js.native
  def getGroupView(groupPosition: Double, isExpanded: Boolean, convertView: View, parent: ViewGroup): View = js.native
  def hasStableIds(): Boolean = js.native
  def isChildSelectable(groupPosition: Double, childPosition: Double): Boolean = js.native
  def isEmpty(): Boolean = js.native
  def onGroupCollapsed(groupPosition: Double): Unit = js.native
  def onGroupExpanded(groupPosition: Double): Unit = js.native
  def registerDataSetObserver(observer: DataSetObserver): Unit = js.native
  def unregisterDataSetObserver(observer: DataSetObserver): Unit = js.native
}

object ExpandableListAdapter {
  @scala.inline
  def apply(
    areAllItemsEnabled: () => Boolean,
    getChild: (Double, Double) => js.Any,
    getChildId: (Double, Double) => Double,
    getChildView: (Double, Double, Boolean, View, ViewGroup) => View,
    getChildrenCount: Double => Double,
    getCombinedChildId: (Double, Double) => Double,
    getCombinedGroupId: Double => Double,
    getGroup: Double => js.Any,
    getGroupCount: () => Double,
    getGroupId: Double => Double,
    getGroupView: (Double, Boolean, View, ViewGroup) => View,
    hasStableIds: () => Boolean,
    isChildSelectable: (Double, Double) => Boolean,
    isEmpty: () => Boolean,
    onGroupCollapsed: Double => Unit,
    onGroupExpanded: Double => Unit,
    registerDataSetObserver: DataSetObserver => Unit,
    unregisterDataSetObserver: DataSetObserver => Unit
  ): ExpandableListAdapter = {
    val __obj = js.Dynamic.literal(areAllItemsEnabled = js.Any.fromFunction0(areAllItemsEnabled), getChild = js.Any.fromFunction2(getChild), getChildId = js.Any.fromFunction2(getChildId), getChildView = js.Any.fromFunction5(getChildView), getChildrenCount = js.Any.fromFunction1(getChildrenCount), getCombinedChildId = js.Any.fromFunction2(getCombinedChildId), getCombinedGroupId = js.Any.fromFunction1(getCombinedGroupId), getGroup = js.Any.fromFunction1(getGroup), getGroupCount = js.Any.fromFunction0(getGroupCount), getGroupId = js.Any.fromFunction1(getGroupId), getGroupView = js.Any.fromFunction4(getGroupView), hasStableIds = js.Any.fromFunction0(hasStableIds), isChildSelectable = js.Any.fromFunction2(isChildSelectable), isEmpty = js.Any.fromFunction0(isEmpty), onGroupCollapsed = js.Any.fromFunction1(onGroupCollapsed), onGroupExpanded = js.Any.fromFunction1(onGroupExpanded), registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
    __obj.asInstanceOf[ExpandableListAdapter]
  }
  @scala.inline
  implicit class ExpandableListAdapterOps[Self <: ExpandableListAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAreAllItemsEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areAllItemsEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetChild(value: (Double, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChild")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetChildId(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildId")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetChildView(value: (Double, Double, Boolean, View, ViewGroup) => View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildView")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withGetChildrenCount(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildrenCount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCombinedChildId(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCombinedChildId")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetCombinedGroupId(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCombinedGroupId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetGroup(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetGroupCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGroupId(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetGroupView(value: (Double, Boolean, View, ViewGroup) => View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupView")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withHasStableIds(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasStableIds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsChildSelectable(value: (Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChildSelectable")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsEmpty(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnGroupCollapsed(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGroupCollapsed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnGroupExpanded(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGroupExpanded")(js.Any.fromFunction1(value))
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

