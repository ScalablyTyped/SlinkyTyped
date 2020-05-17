package typingsSlinky.androiduix.android.widget.Spinner

import typingsSlinky.androiduix.android.graphics.drawable.Drawable
import typingsSlinky.androiduix.android.view.KeyEvent
import typingsSlinky.androiduix.android.view.View
import typingsSlinky.androiduix.android.view.View.OnTouchListener
import typingsSlinky.androiduix.android.view.animation.Animation
import typingsSlinky.androiduix.android.widget.AdapterView.OnItemClickListener
import typingsSlinky.androiduix.android.widget.AdapterView.OnItemSelectedListener
import typingsSlinky.androiduix.android.widget.ListAdapter
import typingsSlinky.androiduix.android.widget.ListPopupWindow
import typingsSlinky.androiduix.android.widget.ListView
import typingsSlinky.androiduix.android.widget.PopupWindow.OnDismissListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownPopup
  extends ListPopupWindow
     with SpinnerPopup {
  var _Spinner_this: typingsSlinky.androiduix.android.widget.Spinner = js.native
  var mHintText: js.Any = js.native
  /* InferMemberOverrides */
  /* private */ override def buildDropDown(): js.Any = js.native
  /* InferMemberOverrides */
  override def clearListSelection(): Unit = js.native
  def computeContentWidth(): Unit = js.native
  /* InferMemberOverrides */
  override def createDragToOpenListener(src: View): OnTouchListener = js.native
  /* InferMemberOverrides */
  override def dismiss(): Unit = js.native
  /* InferMemberOverrides */
  override def getAnchorView(): View = js.native
  /* InferMemberOverrides */
  override def getBackground(): Drawable = js.native
  /* InferMemberOverrides */
  override def getEnterAnimation(): Animation = js.native
  /* InferMemberOverrides */
  override def getExitAnimation(): Animation = js.native
  /* InferMemberOverrides */
  override def getHeight(): Double = js.native
  /* InferMemberOverrides */
  override def getHorizontalOffset(): Double = js.native
  /* InferMemberOverrides */
  override def getInputMethodMode(): Double = js.native
  /* InferMemberOverrides */
  override def getListView(): ListView = js.native
  /* InferMemberOverrides */
  override def getPromptPosition(): Double = js.native
  /* InferMemberOverrides */
  override def getSelectedItem(): js.Any = js.native
  /* InferMemberOverrides */
  override def getSelectedItemId(): Double = js.native
  /* InferMemberOverrides */
  override def getSelectedItemPosition(): Double = js.native
  /* InferMemberOverrides */
  override def getSelectedView(): View = js.native
  /* InferMemberOverrides */
  override def getVerticalOffset(): Double = js.native
  /* InferMemberOverrides */
  override def getWidth(): Double = js.native
  /* InferMemberOverrides */
  override def isDropDownAlwaysVisible(): Boolean = js.native
  /* InferMemberOverrides */
  override def isInputMethodNotNeeded(): Boolean = js.native
  /* InferMemberOverrides */
  override def isModal(): Boolean = js.native
  /* InferMemberOverrides */
  override def isShowing(): Boolean = js.native
  /* InferMemberOverrides */
  override def onKeyDown(keyCode: Double, event: KeyEvent): Boolean = js.native
  /* InferMemberOverrides */
  override def onKeyPreIme(keyCode: Double, event: KeyEvent): Boolean = js.native
  /* InferMemberOverrides */
  override def onKeyUp(keyCode: Double, event: KeyEvent): Boolean = js.native
  /* InferMemberOverrides */
  override def performItemClick(position: Double): Boolean = js.native
  /* InferMemberOverrides */
  override def postShow(): Unit = js.native
  /* InferMemberOverrides */
  /* private */ override def removePromptView(): js.Any = js.native
  /* InferMemberOverrides */
  override def setAdapter(adapter: ListAdapter): Unit = js.native
  /* InferMemberOverrides */
  override def setAnchorView(anchor: View): Unit = js.native
  /* InferMemberOverrides */
  override def setBackgroundDrawable(d: Drawable): Unit = js.native
  /* InferMemberOverrides */
  override def setContentWidth(width: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setDropDownAlwaysVisible(dropDownAlwaysVisible: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setDropDownGravity(gravity: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setForceIgnoreOutsideTouch(forceIgnoreOutsideTouch: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setHeight(height: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setHorizontalOffset(offset: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setInputMethodMode(mode: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setListItemExpandMax(max: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setModal(modal: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setOnDismissListener(listener: OnDismissListener): Unit = js.native
  /* InferMemberOverrides */
  override def setOnItemClickListener(clickListener: OnItemClickListener): Unit = js.native
  /* InferMemberOverrides */
  override def setOnItemSelectedListener(selectedListener: OnItemSelectedListener): Unit = js.native
  /* InferMemberOverrides */
  override def setPromptPosition(position: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setPromptView(prompt: View): Unit = js.native
  /* InferMemberOverrides */
  override def setSelection(position: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setVerticalOffset(offset: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setWidth(width: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setWindowAnimation(enterAnimation: Animation, exitAnimation: Animation): Unit = js.native
  /* InferMemberOverrides */
  override def show(): Unit = js.native
}

object DropdownPopup {
  @scala.inline
  def apply(
    _Spinner_this: typingsSlinky.androiduix.android.widget.Spinner,
    buildDropDown: () => js.Any,
    clearListSelection: () => Unit,
    computeContentWidth: () => Unit,
    createDragToOpenListener: View => OnTouchListener,
    dismiss: () => Unit,
    getAnchorView: () => View,
    getBackground: () => Drawable,
    getEnterAnimation: () => Animation,
    getExitAnimation: () => Animation,
    getHeight: () => Double,
    getHintText: () => String,
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
    mHintText: js.Any,
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
    setPromptText: String => Unit,
    setPromptView: View => Unit,
    setSelection: Double => Unit,
    setVerticalOffset: Double => Unit,
    setWidth: Double => Unit,
    setWindowAnimation: (Animation, Animation) => Unit,
    show: () => Unit,
    showPopup: (Double, Double) => Unit
  ): DropdownPopup = {
    val __obj = js.Dynamic.literal(_Spinner_this = _Spinner_this.asInstanceOf[js.Any], buildDropDown = js.Any.fromFunction0(buildDropDown), clearListSelection = js.Any.fromFunction0(clearListSelection), computeContentWidth = js.Any.fromFunction0(computeContentWidth), createDragToOpenListener = js.Any.fromFunction1(createDragToOpenListener), dismiss = js.Any.fromFunction0(dismiss), getAnchorView = js.Any.fromFunction0(getAnchorView), getBackground = js.Any.fromFunction0(getBackground), getEnterAnimation = js.Any.fromFunction0(getEnterAnimation), getExitAnimation = js.Any.fromFunction0(getExitAnimation), getHeight = js.Any.fromFunction0(getHeight), getHintText = js.Any.fromFunction0(getHintText), getHorizontalOffset = js.Any.fromFunction0(getHorizontalOffset), getInputMethodMode = js.Any.fromFunction0(getInputMethodMode), getListView = js.Any.fromFunction0(getListView), getPromptPosition = js.Any.fromFunction0(getPromptPosition), getSelectedItem = js.Any.fromFunction0(getSelectedItem), getSelectedItemId = js.Any.fromFunction0(getSelectedItemId), getSelectedItemPosition = js.Any.fromFunction0(getSelectedItemPosition), getSelectedView = js.Any.fromFunction0(getSelectedView), getVerticalOffset = js.Any.fromFunction0(getVerticalOffset), getWidth = js.Any.fromFunction0(getWidth), isDropDownAlwaysVisible = js.Any.fromFunction0(isDropDownAlwaysVisible), isInputMethodNotNeeded = js.Any.fromFunction0(isInputMethodNotNeeded), isModal = js.Any.fromFunction0(isModal), isShowing = js.Any.fromFunction0(isShowing), mAdapter = mAdapter.asInstanceOf[js.Any], mContext = mContext.asInstanceOf[js.Any], mDropDownAlwaysVisible = mDropDownAlwaysVisible.asInstanceOf[js.Any], mDropDownAnchorView = mDropDownAnchorView.asInstanceOf[js.Any], mDropDownGravity = mDropDownGravity.asInstanceOf[js.Any], mDropDownHeight = mDropDownHeight.asInstanceOf[js.Any], mDropDownHorizontalOffset = mDropDownHorizontalOffset.asInstanceOf[js.Any], mDropDownList = mDropDownList.asInstanceOf[js.Any], mDropDownListHighlight = mDropDownListHighlight.asInstanceOf[js.Any], mDropDownVerticalOffset = mDropDownVerticalOffset.asInstanceOf[js.Any], mDropDownVerticalOffsetSet = mDropDownVerticalOffsetSet.asInstanceOf[js.Any], mDropDownWidth = mDropDownWidth.asInstanceOf[js.Any], mForceIgnoreOutsideTouch = mForceIgnoreOutsideTouch.asInstanceOf[js.Any], mHandler = mHandler.asInstanceOf[js.Any], mHideSelector = mHideSelector.asInstanceOf[js.Any], mHintText = mHintText.asInstanceOf[js.Any], mItemClickListener = mItemClickListener.asInstanceOf[js.Any], mItemSelectedListener = mItemSelectedListener.asInstanceOf[js.Any], mLayoutDirection = mLayoutDirection.asInstanceOf[js.Any], mListItemExpandMaximum = mListItemExpandMaximum.asInstanceOf[js.Any], mModal = mModal.asInstanceOf[js.Any], mObserver = mObserver.asInstanceOf[js.Any], mPopup = mPopup.asInstanceOf[js.Any], mPromptPosition = mPromptPosition.asInstanceOf[js.Any], mPromptView = mPromptView.asInstanceOf[js.Any], mResizePopupRunnable = mResizePopupRunnable.asInstanceOf[js.Any], mScrollListener = mScrollListener.asInstanceOf[js.Any], mShowDropDownRunnable = mShowDropDownRunnable.asInstanceOf[js.Any], mTempRect = mTempRect.asInstanceOf[js.Any], mTouchInterceptor = mTouchInterceptor.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction2(onKeyDown), onKeyPreIme = js.Any.fromFunction2(onKeyPreIme), onKeyUp = js.Any.fromFunction2(onKeyUp), performItemClick = js.Any.fromFunction1(performItemClick), postShow = js.Any.fromFunction0(postShow), removePromptView = js.Any.fromFunction0(removePromptView), setAdapter = js.Any.fromFunction1(setAdapter), setAnchorView = js.Any.fromFunction1(setAnchorView), setBackgroundDrawable = js.Any.fromFunction1(setBackgroundDrawable), setContentWidth = js.Any.fromFunction1(setContentWidth), setDropDownAlwaysVisible = js.Any.fromFunction1(setDropDownAlwaysVisible), setDropDownGravity = js.Any.fromFunction1(setDropDownGravity), setForceIgnoreOutsideTouch = js.Any.fromFunction1(setForceIgnoreOutsideTouch), setHeight = js.Any.fromFunction1(setHeight), setHorizontalOffset = js.Any.fromFunction1(setHorizontalOffset), setInputMethodMode = js.Any.fromFunction1(setInputMethodMode), setListItemExpandMax = js.Any.fromFunction1(setListItemExpandMax), setModal = js.Any.fromFunction1(setModal), setOnDismissListener = js.Any.fromFunction1(setOnDismissListener), setOnItemClickListener = js.Any.fromFunction1(setOnItemClickListener), setOnItemSelectedListener = js.Any.fromFunction1(setOnItemSelectedListener), setPromptPosition = js.Any.fromFunction1(setPromptPosition), setPromptText = js.Any.fromFunction1(setPromptText), setPromptView = js.Any.fromFunction1(setPromptView), setSelection = js.Any.fromFunction1(setSelection), setVerticalOffset = js.Any.fromFunction1(setVerticalOffset), setWidth = js.Any.fromFunction1(setWidth), setWindowAnimation = js.Any.fromFunction2(setWindowAnimation), show = js.Any.fromFunction0(show), showPopup = js.Any.fromFunction2(showPopup))
    __obj.asInstanceOf[DropdownPopup]
  }
  @scala.inline
  implicit class DropdownPopupOps[Self <: DropdownPopup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_Spinner_this(value: typingsSlinky.androiduix.android.widget.Spinner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_Spinner_this")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withComputeContentWidth(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeContentWidth")(js.Any.fromFunction0(value))
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
    def withMHintText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mHintText")(value.asInstanceOf[js.Any])
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

