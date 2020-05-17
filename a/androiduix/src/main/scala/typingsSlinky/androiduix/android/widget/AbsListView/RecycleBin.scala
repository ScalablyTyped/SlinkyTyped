package typingsSlinky.androiduix.android.widget.AbsListView

import typingsSlinky.androiduix.android.view.View
import typingsSlinky.androiduix.java_.util.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecycleBin extends js.Object {
  var _AbsListView_this: typingsSlinky.androiduix.android.widget.AbsListView = js.native
  var mActiveViews: js.Array[View] = js.native
  var mCurrentScrap: js.Any = js.native
  var mFirstActivePosition: js.Any = js.native
  var mRecyclerListener: RecyclerListener = js.native
  var mScrapViews: js.Any = js.native
  var mSkippedScrap: js.Any = js.native
  var mTransientStateViews: js.Any = js.native
  var mTransientStateViewsById: js.Any = js.native
  var mViewTypeCount: js.Any = js.native
  def addScrapView(scrap: View, position: Double): Unit = js.native
  def clear(): Unit = js.native
  def clearTransientStateViews(): Unit = js.native
  def fillActiveViews(childCount: Double, firstActivePosition: Double): Unit = js.native
  def getActiveView(position: Double): View = js.native
  def getScrapView(position: Double): View = js.native
  def getTransientStateView(position: Double): View = js.native
  def markChildrenDirty(): Unit = js.native
  /* private */ def pruneScrapViews(): js.Any = js.native
  def reclaimScrapViews(views: List[View]): Unit = js.native
  def removeSkippedScrap(): Unit = js.native
  def scrapActiveViews(): Unit = js.native
  def setCacheColorHint(color: Double): Unit = js.native
  def setViewTypeCount(viewTypeCount: Double): Unit = js.native
  def shouldRecycleViewType(viewType: Double): Boolean = js.native
}

object RecycleBin {
  @scala.inline
  def apply(
    _AbsListView_this: typingsSlinky.androiduix.android.widget.AbsListView,
    addScrapView: (View, Double) => Unit,
    clear: () => Unit,
    clearTransientStateViews: () => Unit,
    fillActiveViews: (Double, Double) => Unit,
    getActiveView: Double => View,
    getScrapView: Double => View,
    getTransientStateView: Double => View,
    mActiveViews: js.Array[View],
    mCurrentScrap: js.Any,
    mFirstActivePosition: js.Any,
    mRecyclerListener: RecyclerListener,
    mScrapViews: js.Any,
    mSkippedScrap: js.Any,
    mTransientStateViews: js.Any,
    mTransientStateViewsById: js.Any,
    mViewTypeCount: js.Any,
    markChildrenDirty: () => Unit,
    pruneScrapViews: () => js.Any,
    reclaimScrapViews: List[View] => Unit,
    removeSkippedScrap: () => Unit,
    scrapActiveViews: () => Unit,
    setCacheColorHint: Double => Unit,
    setViewTypeCount: Double => Unit,
    shouldRecycleViewType: Double => Boolean
  ): RecycleBin = {
    val __obj = js.Dynamic.literal(_AbsListView_this = _AbsListView_this.asInstanceOf[js.Any], addScrapView = js.Any.fromFunction2(addScrapView), clear = js.Any.fromFunction0(clear), clearTransientStateViews = js.Any.fromFunction0(clearTransientStateViews), fillActiveViews = js.Any.fromFunction2(fillActiveViews), getActiveView = js.Any.fromFunction1(getActiveView), getScrapView = js.Any.fromFunction1(getScrapView), getTransientStateView = js.Any.fromFunction1(getTransientStateView), mActiveViews = mActiveViews.asInstanceOf[js.Any], mCurrentScrap = mCurrentScrap.asInstanceOf[js.Any], mFirstActivePosition = mFirstActivePosition.asInstanceOf[js.Any], mRecyclerListener = mRecyclerListener.asInstanceOf[js.Any], mScrapViews = mScrapViews.asInstanceOf[js.Any], mSkippedScrap = mSkippedScrap.asInstanceOf[js.Any], mTransientStateViews = mTransientStateViews.asInstanceOf[js.Any], mTransientStateViewsById = mTransientStateViewsById.asInstanceOf[js.Any], mViewTypeCount = mViewTypeCount.asInstanceOf[js.Any], markChildrenDirty = js.Any.fromFunction0(markChildrenDirty), pruneScrapViews = js.Any.fromFunction0(pruneScrapViews), reclaimScrapViews = js.Any.fromFunction1(reclaimScrapViews), removeSkippedScrap = js.Any.fromFunction0(removeSkippedScrap), scrapActiveViews = js.Any.fromFunction0(scrapActiveViews), setCacheColorHint = js.Any.fromFunction1(setCacheColorHint), setViewTypeCount = js.Any.fromFunction1(setViewTypeCount), shouldRecycleViewType = js.Any.fromFunction1(shouldRecycleViewType))
    __obj.asInstanceOf[RecycleBin]
  }
  @scala.inline
  implicit class RecycleBinOps[Self <: RecycleBin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_AbsListView_this(value: typingsSlinky.androiduix.android.widget.AbsListView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_AbsListView_this")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddScrapView(value: (View, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addScrapView")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClearTransientStateViews(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearTransientStateViews")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFillActiveViews(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillActiveViews")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetActiveView(value: Double => View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetScrapView(value: Double => View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrapView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTransientStateView(value: Double => View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTransientStateView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMActiveViews(value: js.Array[View]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mActiveViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMCurrentScrap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mCurrentScrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMFirstActivePosition(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mFirstActivePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMRecyclerListener(value: RecyclerListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mRecyclerListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMScrapViews(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mScrapViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMSkippedScrap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mSkippedScrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTransientStateViews(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTransientStateViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTransientStateViewsById(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTransientStateViewsById")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMViewTypeCount(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mViewTypeCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkChildrenDirty(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markChildrenDirty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPruneScrapViews(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pruneScrapViews")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReclaimScrapViews(value: List[View] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reclaimScrapViews")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveSkippedScrap(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSkippedScrap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScrapActiveViews(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrapActiveViews")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCacheColorHint(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCacheColorHint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetViewTypeCount(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setViewTypeCount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShouldRecycleViewType(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRecycleViewType")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

