package typingsSlinky.androiduix.android.widget

import typingsSlinky.androiduix.android.view.View
import typingsSlinky.androiduix.android.widget.ListView.FixedViewInfo
import typingsSlinky.androiduix.java_.util.ArrayList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.HeaderViewListAdapter")
@js.native
class HeaderViewListAdapter protected () extends WrapperListAdapter {
  def this(
    headerViewInfos: ArrayList[FixedViewInfo],
    footerViewInfos: ArrayList[FixedViewInfo],
    adapter: ListAdapter
  ) = this()
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

/* static members */
@JSGlobal("android.widget.HeaderViewListAdapter")
@js.native
object HeaderViewListAdapter extends js.Object {
  var EMPTY_INFO_LIST: ArrayList[FixedViewInfo] = js.native
}

