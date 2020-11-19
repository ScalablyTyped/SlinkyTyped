package typingsSlinky.androiduix.android.widget

import typingsSlinky.androiduix.android.view.View
import typingsSlinky.androiduix.android.view.ViewGroup
import typingsSlinky.androiduix.android.widget.AdapterView.OnItemClickListener
import typingsSlinky.androiduix.android.widget.AdapterView.OnItemLongClickListener
import typingsSlinky.androiduix.android.widget.AdapterView.OnItemSelectedListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdapterView_[T /* <: Adapter */] extends ViewGroup {
  
  def checkFocus(): Unit = js.native
  
  def checkSelectionChanged(): Unit = js.native
  
  def findSyncPosition(): Double = js.native
  
  /* private */ def fireOnSelected(): js.Any = js.native
  
  def getAdapter(): T = js.native
  
  def getCount(): Double = js.native
  
  def getEmptyView(): View = js.native
  
  def getFirstVisiblePosition(): Double = js.native
  
  def getItemAtPosition(position: Double): js.Any = js.native
  
  def getItemIdAtPosition(position: Double): Double = js.native
  
  def getLastVisiblePosition(): Double = js.native
  
  def getOnItemClickListener(): OnItemClickListener = js.native
  
  def getOnItemLongClickListener(): OnItemLongClickListener = js.native
  
  def getOnItemSelectedListener(): OnItemSelectedListener = js.native
  
  def getPositionForView(view: View): Double = js.native
  
  def getSelectedItem(): js.Any = js.native
  
  def getSelectedItemId(): Double = js.native
  
  def getSelectedItemPosition(): Double = js.native
  
  def getSelectedView(): View = js.native
  
  def handleDataChanged(): Unit = js.native
  
  def isInFilterMode(): Boolean = js.native
  
  /* private */ def isScrollableForAccessibility(): js.Any = js.native
  
  def lookForSelectablePosition(position: Double, lookDown: Boolean): Double = js.native
  
  var mBlockLayoutRequests: Boolean = js.native
  
  var mDataChanged: Boolean = js.native
  
  var mDesiredFocusableInTouchModeState: js.Any = js.native
  
  var mDesiredFocusableState: js.Any = js.native
  
  var mEmptyView: js.Any = js.native
  
  var mFirstPosition: Double = js.native
  
  var mInLayout: Boolean = js.native
  
  var mItemCount: Double = js.native
  
  var mLayoutHeight: js.Any = js.native
  
  var mNeedSync: Boolean = js.native
  
  var mNextSelectedPosition: Double = js.native
  
  var mNextSelectedRowId: Double = js.native
  
  var mOldItemCount: Double = js.native
  
  var mOldSelectedPosition: Double = js.native
  
  var mOldSelectedRowId: Double = js.native
  
  var mOnItemClickListener: js.Any = js.native
  
  var mOnItemLongClickListener: OnItemLongClickListener = js.native
  
  var mOnItemSelectedListener: js.Any = js.native
  
  var mSelectedPosition: Double = js.native
  
  var mSelectedRowId: Double = js.native
  
  var mSelectionNotifier: js.Any = js.native
  
  var mSpecificTop: Double = js.native
  
  var mSyncHeight: Double = js.native
  
  var mSyncMode: Double = js.native
  
  var mSyncPosition: Double = js.native
  
  var mSyncRowId: Double = js.native
  
  /* private */ def performAccessibilityActionsOnSelected(): js.Any = js.native
  
  def performItemClick(view: View, position: Double, id: Double): Boolean = js.native
  
  def rememberSyncState(): Unit = js.native
  
  /* private */ def selectionChanged(): js.Any = js.native
  
  def setAdapter(adapter: T): Unit = js.native
  
  def setEmptyView(emptyView: View): Unit = js.native
  
  def setNextSelectedPositionInt(position: Double): Unit = js.native
  
  def setOnItemClickListener(listener: OnItemClickListener): Unit = js.native
  
  def setOnItemLongClickListener(listener: OnItemLongClickListener): Unit = js.native
  
  def setOnItemSelectedListener(listener: OnItemSelectedListener): Unit = js.native
  
  def setSelectedPositionInt(position: Double): Unit = js.native
  
  def setSelection(position: Double): Unit = js.native
  
  /* private */ def updateEmptyStatus(empty: js.Any): js.Any = js.native
}
