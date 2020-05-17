package typingsSlinky.androiduix.android.widget

import typingsSlinky.androiduix.android.database.DataSetObserver
import typingsSlinky.androiduix.android.view.View
import typingsSlinky.androiduix.android.view.ViewGroup
import typingsSlinky.androiduix.android.widget.ExpandableListConnector.GroupMetadata
import typingsSlinky.androiduix.android.widget.ExpandableListConnector.PositionMetadata
import typingsSlinky.androiduix.java_.util.ArrayList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpandableListConnector_ extends BaseAdapter {
  var mDataSetObserver: js.Any = js.native
  var mExpGroupMetadataList: js.Any = js.native
  var mExpandableListAdapter: js.Any = js.native
  var mMaxExpGroupCount: js.Any = js.native
  var mTotalExpChildrenCount: js.Any = js.native
  def collapseGroup(groupPos: Double): Boolean = js.native
  def collapseGroupWithMeta(posMetadata: PositionMetadata): Boolean = js.native
  def expandGroup(groupPos: Double): Boolean = js.native
  def expandGroupWithMeta(posMetadata: PositionMetadata): Boolean = js.native
  def findGroupPosition(groupIdToMatch: Double, seedGroupPosition: Double): Double = js.native
  def getAdapter(): ExpandableListAdapter = js.native
  def getExpandedGroupMetadataList(): ArrayList[GroupMetadata] = js.native
  def getFlattenedPos(pos: ExpandableListPosition): PositionMetadata = js.native
  def getUnflattenedPos(flPos: Double): PositionMetadata = js.native
  def isGroupExpanded(groupPosition: Double): Boolean = js.native
  /* private */ def refreshExpGroupMetadataList(forceChildrenCountRefresh: js.Any, syncGroupPositions: js.Any): js.Any = js.native
  def setExpandableListAdapter(expandableListAdapter: ExpandableListAdapter): Unit = js.native
  def setExpandedGroupMetadataList(expandedGroupMetadataList: ArrayList[GroupMetadata]): Unit = js.native
  def setMaxExpGroupCount(maxExpGroupCount: Double): Unit = js.native
}

object ExpandableListConnector_ {
  @scala.inline
  def apply(
    areAllItemsEnabled: () => Boolean,
    collapseGroup: Double => Boolean,
    collapseGroupWithMeta: PositionMetadata => Boolean,
    expandGroup: Double => Boolean,
    expandGroupWithMeta: PositionMetadata => Boolean,
    findGroupPosition: (Double, Double) => Double,
    getAdapter: () => ExpandableListAdapter,
    getCount: () => Double,
    getDropDownView: (Double, View, ViewGroup) => View,
    getExpandedGroupMetadataList: () => ArrayList[GroupMetadata],
    getFlattenedPos: ExpandableListPosition => PositionMetadata,
    getItem: Double => js.Any,
    getItemId: Double => Double,
    getItemViewType: Double => Double,
    getUnflattenedPos: Double => PositionMetadata,
    getView: (Double, View, ViewGroup) => View,
    getViewTypeCount: () => Double,
    hasStableIds: () => Boolean,
    isEmpty: () => Boolean,
    isEnabled: Double => Boolean,
    isGroupExpanded: Double => Boolean,
    mDataSetObservable: js.Any,
    mDataSetObserver: js.Any,
    mExpGroupMetadataList: js.Any,
    mExpandableListAdapter: js.Any,
    mMaxExpGroupCount: js.Any,
    mTotalExpChildrenCount: js.Any,
    notifyDataSetChanged: () => Unit,
    notifyDataSetInvalidated: () => Unit,
    refreshExpGroupMetadataList: (js.Any, js.Any) => js.Any,
    registerDataSetObserver: DataSetObserver => Unit,
    setExpandableListAdapter: ExpandableListAdapter => Unit,
    setExpandedGroupMetadataList: ArrayList[GroupMetadata] => Unit,
    setMaxExpGroupCount: Double => Unit,
    unregisterDataSetObserver: DataSetObserver => Unit
  ): ExpandableListConnector_ = {
    val __obj = js.Dynamic.literal(areAllItemsEnabled = js.Any.fromFunction0(areAllItemsEnabled), collapseGroup = js.Any.fromFunction1(collapseGroup), collapseGroupWithMeta = js.Any.fromFunction1(collapseGroupWithMeta), expandGroup = js.Any.fromFunction1(expandGroup), expandGroupWithMeta = js.Any.fromFunction1(expandGroupWithMeta), findGroupPosition = js.Any.fromFunction2(findGroupPosition), getAdapter = js.Any.fromFunction0(getAdapter), getCount = js.Any.fromFunction0(getCount), getDropDownView = js.Any.fromFunction3(getDropDownView), getExpandedGroupMetadataList = js.Any.fromFunction0(getExpandedGroupMetadataList), getFlattenedPos = js.Any.fromFunction1(getFlattenedPos), getItem = js.Any.fromFunction1(getItem), getItemId = js.Any.fromFunction1(getItemId), getItemViewType = js.Any.fromFunction1(getItemViewType), getUnflattenedPos = js.Any.fromFunction1(getUnflattenedPos), getView = js.Any.fromFunction3(getView), getViewTypeCount = js.Any.fromFunction0(getViewTypeCount), hasStableIds = js.Any.fromFunction0(hasStableIds), isEmpty = js.Any.fromFunction0(isEmpty), isEnabled = js.Any.fromFunction1(isEnabled), isGroupExpanded = js.Any.fromFunction1(isGroupExpanded), mDataSetObservable = mDataSetObservable.asInstanceOf[js.Any], mDataSetObserver = mDataSetObserver.asInstanceOf[js.Any], mExpGroupMetadataList = mExpGroupMetadataList.asInstanceOf[js.Any], mExpandableListAdapter = mExpandableListAdapter.asInstanceOf[js.Any], mMaxExpGroupCount = mMaxExpGroupCount.asInstanceOf[js.Any], mTotalExpChildrenCount = mTotalExpChildrenCount.asInstanceOf[js.Any], notifyDataSetChanged = js.Any.fromFunction0(notifyDataSetChanged), notifyDataSetInvalidated = js.Any.fromFunction0(notifyDataSetInvalidated), refreshExpGroupMetadataList = js.Any.fromFunction2(refreshExpGroupMetadataList), registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), setExpandableListAdapter = js.Any.fromFunction1(setExpandableListAdapter), setExpandedGroupMetadataList = js.Any.fromFunction1(setExpandedGroupMetadataList), setMaxExpGroupCount = js.Any.fromFunction1(setMaxExpGroupCount), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
    __obj.asInstanceOf[ExpandableListConnector_]
  }
  @scala.inline
  implicit class ExpandableListConnector_Ops[Self <: ExpandableListConnector_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapseGroup(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCollapseGroupWithMeta(value: PositionMetadata => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseGroupWithMeta")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExpandGroup(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExpandGroupWithMeta(value: PositionMetadata => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandGroupWithMeta")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindGroupPosition(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findGroupPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetAdapter(value: () => ExpandableListAdapter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAdapter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetExpandedGroupMetadataList(value: () => ArrayList[GroupMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExpandedGroupMetadataList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFlattenedPos(value: ExpandableListPosition => PositionMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFlattenedPos")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetUnflattenedPos(value: Double => PositionMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUnflattenedPos")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsGroupExpanded(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGroupExpanded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMDataSetObserver(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDataSetObserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMExpGroupMetadataList(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mExpGroupMetadataList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMExpandableListAdapter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mExpandableListAdapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMMaxExpGroupCount(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mMaxExpGroupCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTotalExpChildrenCount(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTotalExpChildrenCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshExpGroupMetadataList(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshExpGroupMetadataList")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetExpandableListAdapter(value: ExpandableListAdapter => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExpandableListAdapter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetExpandedGroupMetadataList(value: ArrayList[GroupMetadata] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExpandedGroupMetadataList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMaxExpGroupCount(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxExpGroupCount")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

