package typingsSlinky.androiduix.android.widget

import typingsSlinky.androiduix.android.graphics.drawable.Drawable
import typingsSlinky.androiduix.android.view.KeyEvent
import typingsSlinky.androiduix.android.view.View
import typingsSlinky.androiduix.android.view.View.OnTouchListener
import typingsSlinky.androiduix.android.view.animation.Animation
import typingsSlinky.androiduix.android.widget.AdapterView.OnItemClickListener
import typingsSlinky.androiduix.android.widget.AdapterView.OnItemSelectedListener
import typingsSlinky.androiduix.android.widget.PopupWindow.OnDismissListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPopupWindow_ extends js.Object {
  var mAdapter: js.Any = js.native
  var mContext: js.Any = js.native
  var mDropDownAlwaysVisible: js.Any = js.native
  var mDropDownAnchorView: js.Any = js.native
  var mDropDownGravity: js.Any = js.native
  var mDropDownHeight: js.Any = js.native
  var mDropDownHorizontalOffset: js.Any = js.native
  var mDropDownList: js.Any = js.native
  var mDropDownListHighlight: js.Any = js.native
  var mDropDownVerticalOffset: js.Any = js.native
  var mDropDownVerticalOffsetSet: js.Any = js.native
  var mDropDownWidth: js.Any = js.native
  var mForceIgnoreOutsideTouch: js.Any = js.native
  var mHandler: js.Any = js.native
  var mHideSelector: js.Any = js.native
  var mItemClickListener: js.Any = js.native
  var mItemSelectedListener: js.Any = js.native
  var mLayoutDirection: js.Any = js.native
  var mListItemExpandMaximum: Double = js.native
  var mModal: js.Any = js.native
  var mObserver: js.Any = js.native
  var mPopup: js.Any = js.native
  var mPromptPosition: js.Any = js.native
  var mPromptView: js.Any = js.native
  var mResizePopupRunnable: js.Any = js.native
  var mScrollListener: js.Any = js.native
  var mShowDropDownRunnable: js.Any = js.native
  var mTempRect: js.Any = js.native
  var mTouchInterceptor: js.Any = js.native
  /* private */ def buildDropDown(): js.Any = js.native
  def clearListSelection(): Unit = js.native
  def createDragToOpenListener(src: View): OnTouchListener = js.native
  def dismiss(): Unit = js.native
  def getAnchorView(): View = js.native
  def getBackground(): Drawable = js.native
  def getEnterAnimation(): Animation = js.native
  def getExitAnimation(): Animation = js.native
  def getHeight(): Double = js.native
  def getHorizontalOffset(): Double = js.native
  def getInputMethodMode(): Double = js.native
  def getListView(): ListView = js.native
  def getPromptPosition(): Double = js.native
  def getSelectedItem(): js.Any = js.native
  def getSelectedItemId(): Double = js.native
  def getSelectedItemPosition(): Double = js.native
  def getSelectedView(): View = js.native
  def getVerticalOffset(): Double = js.native
  def getWidth(): Double = js.native
  def isDropDownAlwaysVisible(): Boolean = js.native
  def isInputMethodNotNeeded(): Boolean = js.native
  def isModal(): Boolean = js.native
  def isShowing(): Boolean = js.native
  def onKeyDown(keyCode: Double, event: KeyEvent): Boolean = js.native
  def onKeyPreIme(keyCode: Double, event: KeyEvent): Boolean = js.native
  def onKeyUp(keyCode: Double, event: KeyEvent): Boolean = js.native
  def performItemClick(position: Double): Boolean = js.native
  def postShow(): Unit = js.native
  /* private */ def removePromptView(): js.Any = js.native
  def setAdapter(adapter: ListAdapter): Unit = js.native
  def setAnchorView(anchor: View): Unit = js.native
  def setBackgroundDrawable(d: Drawable): Unit = js.native
  def setContentWidth(width: Double): Unit = js.native
  def setDropDownAlwaysVisible(dropDownAlwaysVisible: Boolean): Unit = js.native
  def setDropDownGravity(gravity: Double): Unit = js.native
  def setForceIgnoreOutsideTouch(forceIgnoreOutsideTouch: Boolean): Unit = js.native
  def setHeight(height: Double): Unit = js.native
  def setHorizontalOffset(offset: Double): Unit = js.native
  def setInputMethodMode(mode: Double): Unit = js.native
  def setListItemExpandMax(max: Double): Unit = js.native
  def setModal(modal: Boolean): Unit = js.native
  def setOnDismissListener(listener: OnDismissListener): Unit = js.native
  def setOnItemClickListener(clickListener: OnItemClickListener): Unit = js.native
  def setOnItemSelectedListener(selectedListener: OnItemSelectedListener): Unit = js.native
  def setPromptPosition(position: Double): Unit = js.native
  def setPromptView(prompt: View): Unit = js.native
  def setSelection(position: Double): Unit = js.native
  def setVerticalOffset(offset: Double): Unit = js.native
  def setWidth(width: Double): Unit = js.native
  def setWindowAnimation(enterAnimation: Animation, exitAnimation: Animation): Unit = js.native
  def show(): Unit = js.native
}

object ListPopupWindow_ {
  @scala.inline
  def apply(
    buildDropDown: () => js.Any,
    clearListSelection: () => Unit,
    createDragToOpenListener: View => OnTouchListener,
    dismiss: () => Unit,
    getAnchorView: () => View,
    getBackground: () => Drawable,
    getEnterAnimation: () => Animation,
    getExitAnimation: () => Animation,
    getHeight: () => Double,
    getHorizontalOffset: () => Double,
    getInputMethodMode: () => Double,
    getListView: () => ListView,
    getPromptPosition: () => Double,
    getSelectedItem: () => js.Any,
    getSelectedItemId: () => Double,
    getSelectedItemPosition: () => Double,
    getSelectedView: () => View,
    getVerticalOffset: () => Double,
    getWidth: () => Double,
    isDropDownAlwaysVisible: () => Boolean,
    isInputMethodNotNeeded: () => Boolean,
    isModal: () => Boolean,
    isShowing: () => Boolean,
    mAdapter: js.Any,
    mContext: js.Any,
    mDropDownAlwaysVisible: js.Any,
    mDropDownAnchorView: js.Any,
    mDropDownGravity: js.Any,
    mDropDownHeight: js.Any,
    mDropDownHorizontalOffset: js.Any,
    mDropDownList: js.Any,
    mDropDownListHighlight: js.Any,
    mDropDownVerticalOffset: js.Any,
    mDropDownVerticalOffsetSet: js.Any,
    mDropDownWidth: js.Any,
    mForceIgnoreOutsideTouch: js.Any,
    mHandler: js.Any,
    mHideSelector: js.Any,
    mItemClickListener: js.Any,
    mItemSelectedListener: js.Any,
    mLayoutDirection: js.Any,
    mListItemExpandMaximum: Double,
    mModal: js.Any,
    mObserver: js.Any,
    mPopup: js.Any,
    mPromptPosition: js.Any,
    mPromptView: js.Any,
    mResizePopupRunnable: js.Any,
    mScrollListener: js.Any,
    mShowDropDownRunnable: js.Any,
    mTempRect: js.Any,
    mTouchInterceptor: js.Any,
    onKeyDown: (Double, KeyEvent) => Boolean,
    onKeyPreIme: (Double, KeyEvent) => Boolean,
    onKeyUp: (Double, KeyEvent) => Boolean,
    performItemClick: Double => Boolean,
    postShow: () => Unit,
    removePromptView: () => js.Any,
    setAdapter: ListAdapter => Unit,
    setAnchorView: View => Unit,
    setBackgroundDrawable: Drawable => Unit,
    setContentWidth: Double => Unit,
    setDropDownAlwaysVisible: Boolean => Unit,
    setDropDownGravity: Double => Unit,
    setForceIgnoreOutsideTouch: Boolean => Unit,
    setHeight: Double => Unit,
    setHorizontalOffset: Double => Unit,
    setInputMethodMode: Double => Unit,
    setListItemExpandMax: Double => Unit,
    setModal: Boolean => Unit,
    setOnDismissListener: OnDismissListener => Unit,
    setOnItemClickListener: OnItemClickListener => Unit,
    setOnItemSelectedListener: OnItemSelectedListener => Unit,
    setPromptPosition: Double => Unit,
    setPromptView: View => Unit,
    setSelection: Double => Unit,
    setVerticalOffset: Double => Unit,
    setWidth: Double => Unit,
    setWindowAnimation: (Animation, Animation) => Unit,
    show: () => Unit
  ): ListPopupWindow_ = {
    val __obj = js.Dynamic.literal(buildDropDown = js.Any.fromFunction0(buildDropDown), clearListSelection = js.Any.fromFunction0(clearListSelection), createDragToOpenListener = js.Any.fromFunction1(createDragToOpenListener), dismiss = js.Any.fromFunction0(dismiss), getAnchorView = js.Any.fromFunction0(getAnchorView), getBackground = js.Any.fromFunction0(getBackground), getEnterAnimation = js.Any.fromFunction0(getEnterAnimation), getExitAnimation = js.Any.fromFunction0(getExitAnimation), getHeight = js.Any.fromFunction0(getHeight), getHorizontalOffset = js.Any.fromFunction0(getHorizontalOffset), getInputMethodMode = js.Any.fromFunction0(getInputMethodMode), getListView = js.Any.fromFunction0(getListView), getPromptPosition = js.Any.fromFunction0(getPromptPosition), getSelectedItem = js.Any.fromFunction0(getSelectedItem), getSelectedItemId = js.Any.fromFunction0(getSelectedItemId), getSelectedItemPosition = js.Any.fromFunction0(getSelectedItemPosition), getSelectedView = js.Any.fromFunction0(getSelectedView), getVerticalOffset = js.Any.fromFunction0(getVerticalOffset), getWidth = js.Any.fromFunction0(getWidth), isDropDownAlwaysVisible = js.Any.fromFunction0(isDropDownAlwaysVisible), isInputMethodNotNeeded = js.Any.fromFunction0(isInputMethodNotNeeded), isModal = js.Any.fromFunction0(isModal), isShowing = js.Any.fromFunction0(isShowing), mAdapter = mAdapter.asInstanceOf[js.Any], mContext = mContext.asInstanceOf[js.Any], mDropDownAlwaysVisible = mDropDownAlwaysVisible.asInstanceOf[js.Any], mDropDownAnchorView = mDropDownAnchorView.asInstanceOf[js.Any], mDropDownGravity = mDropDownGravity.asInstanceOf[js.Any], mDropDownHeight = mDropDownHeight.asInstanceOf[js.Any], mDropDownHorizontalOffset = mDropDownHorizontalOffset.asInstanceOf[js.Any], mDropDownList = mDropDownList.asInstanceOf[js.Any], mDropDownListHighlight = mDropDownListHighlight.asInstanceOf[js.Any], mDropDownVerticalOffset = mDropDownVerticalOffset.asInstanceOf[js.Any], mDropDownVerticalOffsetSet = mDropDownVerticalOffsetSet.asInstanceOf[js.Any], mDropDownWidth = mDropDownWidth.asInstanceOf[js.Any], mForceIgnoreOutsideTouch = mForceIgnoreOutsideTouch.asInstanceOf[js.Any], mHandler = mHandler.asInstanceOf[js.Any], mHideSelector = mHideSelector.asInstanceOf[js.Any], mItemClickListener = mItemClickListener.asInstanceOf[js.Any], mItemSelectedListener = mItemSelectedListener.asInstanceOf[js.Any], mLayoutDirection = mLayoutDirection.asInstanceOf[js.Any], mListItemExpandMaximum = mListItemExpandMaximum.asInstanceOf[js.Any], mModal = mModal.asInstanceOf[js.Any], mObserver = mObserver.asInstanceOf[js.Any], mPopup = mPopup.asInstanceOf[js.Any], mPromptPosition = mPromptPosition.asInstanceOf[js.Any], mPromptView = mPromptView.asInstanceOf[js.Any], mResizePopupRunnable = mResizePopupRunnable.asInstanceOf[js.Any], mScrollListener = mScrollListener.asInstanceOf[js.Any], mShowDropDownRunnable = mShowDropDownRunnable.asInstanceOf[js.Any], mTempRect = mTempRect.asInstanceOf[js.Any], mTouchInterceptor = mTouchInterceptor.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction2(onKeyDown), onKeyPreIme = js.Any.fromFunction2(onKeyPreIme), onKeyUp = js.Any.fromFunction2(onKeyUp), performItemClick = js.Any.fromFunction1(performItemClick), postShow = js.Any.fromFunction0(postShow), removePromptView = js.Any.fromFunction0(removePromptView), setAdapter = js.Any.fromFunction1(setAdapter), setAnchorView = js.Any.fromFunction1(setAnchorView), setBackgroundDrawable = js.Any.fromFunction1(setBackgroundDrawable), setContentWidth = js.Any.fromFunction1(setContentWidth), setDropDownAlwaysVisible = js.Any.fromFunction1(setDropDownAlwaysVisible), setDropDownGravity = js.Any.fromFunction1(setDropDownGravity), setForceIgnoreOutsideTouch = js.Any.fromFunction1(setForceIgnoreOutsideTouch), setHeight = js.Any.fromFunction1(setHeight), setHorizontalOffset = js.Any.fromFunction1(setHorizontalOffset), setInputMethodMode = js.Any.fromFunction1(setInputMethodMode), setListItemExpandMax = js.Any.fromFunction1(setListItemExpandMax), setModal = js.Any.fromFunction1(setModal), setOnDismissListener = js.Any.fromFunction1(setOnDismissListener), setOnItemClickListener = js.Any.fromFunction1(setOnItemClickListener), setOnItemSelectedListener = js.Any.fromFunction1(setOnItemSelectedListener), setPromptPosition = js.Any.fromFunction1(setPromptPosition), setPromptView = js.Any.fromFunction1(setPromptView), setSelection = js.Any.fromFunction1(setSelection), setVerticalOffset = js.Any.fromFunction1(setVerticalOffset), setWidth = js.Any.fromFunction1(setWidth), setWindowAnimation = js.Any.fromFunction2(setWindowAnimation), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[ListPopupWindow_]
  }
  @scala.inline
  implicit class ListPopupWindow_Ops[Self <: ListPopupWindow_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildDropDown(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildDropDown")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClearListSelection(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearListSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateDragToOpenListener(value: View => OnTouchListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDragToOpenListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDismiss(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismiss")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAnchorView(value: () => View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnchorView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBackground(value: () => Drawable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBackground")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEnterAnimation(value: () => Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnterAnimation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetExitAnimation(value: () => Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExitAnimation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHorizontalOffset(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHorizontalOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInputMethodMode(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInputMethodMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetListView(value: () => ListView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getListView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPromptPosition(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPromptPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelectedItem(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelectedItemId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedItemId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelectedItemPosition(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedItemPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelectedView(value: () => View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVerticalOffset(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVerticalOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsDropDownAlwaysVisible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDropDownAlwaysVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsInputMethodNotNeeded(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInputMethodNotNeeded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsModal(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsShowing(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isShowing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMAdapter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mAdapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDropDownAlwaysVisible(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDropDownAlwaysVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDropDownAnchorView(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDropDownAnchorView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDropDownGravity(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDropDownGravity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDropDownHeight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDropDownHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDropDownHorizontalOffset(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDropDownHorizontalOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDropDownList(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDropDownList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDropDownListHighlight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDropDownListHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDropDownVerticalOffset(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDropDownVerticalOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDropDownVerticalOffsetSet(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDropDownVerticalOffsetSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDropDownWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDropDownWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMForceIgnoreOutsideTouch(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mForceIgnoreOutsideTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMHideSelector(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mHideSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMItemClickListener(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mItemClickListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMItemSelectedListener(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mItemSelectedListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMLayoutDirection(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mLayoutDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMListItemExpandMaximum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mListItemExpandMaximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMModal(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mModal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMObserver(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mObserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMPopup(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPopup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMPromptPosition(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPromptPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMPromptView(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPromptView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMResizePopupRunnable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mResizePopupRunnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMScrollListener(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mScrollListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMShowDropDownRunnable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mShowDropDownRunnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTempRect(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTempRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTouchInterceptor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTouchInterceptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnKeyDown(value: (Double, KeyEvent) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnKeyPreIme(value: (Double, KeyEvent) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPreIme")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnKeyUp(value: (Double, KeyEvent) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPerformItemClick(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performItemClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPostShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemovePromptView(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removePromptView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAdapter(value: ListAdapter => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAdapter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAnchorView(value: View => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAnchorView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetBackgroundDrawable(value: Drawable => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBackgroundDrawable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetContentWidth(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContentWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDropDownAlwaysVisible(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDropDownAlwaysVisible")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDropDownGravity(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDropDownGravity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetForceIgnoreOutsideTouch(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setForceIgnoreOutsideTouch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHeight(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHorizontalOffset(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHorizontalOffset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetInputMethodMode(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInputMethodMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetListItemExpandMax(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setListItemExpandMax")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetModal(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOnDismissListener(value: OnDismissListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnDismissListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOnItemClickListener(value: OnItemClickListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnItemClickListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOnItemSelectedListener(value: OnItemSelectedListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnItemSelectedListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPromptPosition(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPromptPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPromptView(value: View => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPromptView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSelection(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetVerticalOffset(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVerticalOffset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetWidth(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetWindowAnimation(value: (Animation, Animation) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWindowAnimation")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

