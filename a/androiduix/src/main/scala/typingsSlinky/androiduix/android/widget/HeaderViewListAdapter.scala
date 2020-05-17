package typingsSlinky.androiduix.android.widget

import typingsSlinky.androiduix.android.database.DataSetObserver
import typingsSlinky.androiduix.android.view.View
import typingsSlinky.androiduix.android.view.ViewGroup
import typingsSlinky.androiduix.android.widget.ListView.FixedViewInfo
import typingsSlinky.androiduix.java_.util.ArrayList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderViewListAdapter extends WrapperListAdapter {
  var mAdapter: js.Any = js.native
  var mAreAllFixedViewsSelectable: Boolean = js.native
  var mFooterViewInfos: ArrayList[FixedViewInfo] = js.native
  var mHeaderViewInfos: ArrayList[FixedViewInfo] = js.native
  var mIsFilterable: js.Any = js.native
  /* private */ def areAllListInfosSelectable(infos: js.Any): js.Any = js.native
  def getFilter(): js.Any = js.native
  def getFootersCount(): Double = js.native
  def getHeadersCount(): Double = js.native
  def removeFooter(v: View): Boolean = js.native
  def removeHeader(v: View): Boolean = js.native
}

object HeaderViewListAdapter {
  @scala.inline
  def apply(
    areAllItemsEnabled: () => Boolean,
    areAllListInfosSelectable: js.Any => js.Any,
    getCount: () => Double,
    getFilter: () => js.Any,
    getFootersCount: () => Double,
    getHeadersCount: () => Double,
    getItem: Double => js.Any,
    getItemId: Double => Double,
    getItemViewType: Double => Double,
    getView: (Double, View, ViewGroup) => View,
    getViewTypeCount: () => Double,
    getWrappedAdapter: () => ListAdapter,
    hasStableIds: () => Boolean,
    isEmpty: () => Boolean,
    isEnabled: Double => Boolean,
    mAdapter: js.Any,
    mAreAllFixedViewsSelectable: Boolean,
    mFooterViewInfos: ArrayList[FixedViewInfo],
    mHeaderViewInfos: ArrayList[FixedViewInfo],
    mIsFilterable: js.Any,
    registerDataSetObserver: DataSetObserver => Unit,
    removeFooter: View => Boolean,
    removeHeader: View => Boolean,
    unregisterDataSetObserver: DataSetObserver => Unit
  ): HeaderViewListAdapter = {
    val __obj = js.Dynamic.literal(areAllItemsEnabled = js.Any.fromFunction0(areAllItemsEnabled), areAllListInfosSelectable = js.Any.fromFunction1(areAllListInfosSelectable), getCount = js.Any.fromFunction0(getCount), getFilter = js.Any.fromFunction0(getFilter), getFootersCount = js.Any.fromFunction0(getFootersCount), getHeadersCount = js.Any.fromFunction0(getHeadersCount), getItem = js.Any.fromFunction1(getItem), getItemId = js.Any.fromFunction1(getItemId), getItemViewType = js.Any.fromFunction1(getItemViewType), getView = js.Any.fromFunction3(getView), getViewTypeCount = js.Any.fromFunction0(getViewTypeCount), getWrappedAdapter = js.Any.fromFunction0(getWrappedAdapter), hasStableIds = js.Any.fromFunction0(hasStableIds), isEmpty = js.Any.fromFunction0(isEmpty), isEnabled = js.Any.fromFunction1(isEnabled), mAdapter = mAdapter.asInstanceOf[js.Any], mAreAllFixedViewsSelectable = mAreAllFixedViewsSelectable.asInstanceOf[js.Any], mFooterViewInfos = mFooterViewInfos.asInstanceOf[js.Any], mHeaderViewInfos = mHeaderViewInfos.asInstanceOf[js.Any], mIsFilterable = mIsFilterable.asInstanceOf[js.Any], registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), removeFooter = js.Any.fromFunction1(removeFooter), removeHeader = js.Any.fromFunction1(removeHeader), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
    __obj.asInstanceOf[HeaderViewListAdapter]
  }
  @scala.inline
  implicit class HeaderViewListAdapterOps[Self <: HeaderViewListAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAreAllListInfosSelectable(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areAllListInfosSelectable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFilter(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFootersCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFootersCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHeadersCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeadersCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMAdapter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mAdapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMAreAllFixedViewsSelectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mAreAllFixedViewsSelectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMFooterViewInfos(value: ArrayList[FixedViewInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mFooterViewInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMHeaderViewInfos(value: ArrayList[FixedViewInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mHeaderViewInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIsFilterable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mIsFilterable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveFooter(value: View => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFooter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveHeader(value: View => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeHeader")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

