package typingsSlinky.androiduix.android.view.menu

import typingsSlinky.androiduix.android.view.KeyEvent
import typingsSlinky.androiduix.android.view.View
import typingsSlinky.androiduix.android.view.View.OnKeyListener
import typingsSlinky.androiduix.android.view.ViewTreeObserver.OnGlobalLayoutListener
import typingsSlinky.androiduix.android.widget.AdapterView
import typingsSlinky.androiduix.android.widget.AdapterView.OnItemClickListener
import typingsSlinky.androiduix.android.widget.PopupWindow.OnDismissListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuPopupHelper_
  extends OnItemClickListener
     with OnKeyListener
     with OnGlobalLayoutListener
     with OnDismissListener {
  var mAdapter: js.Any = js.native
  var mAnchorView: js.Any = js.native
  var mContext: js.Any = js.native
  var mInflater: js.Any = js.native
  var mMeasureParent: js.Any = js.native
  var mMenu: js.Any = js.native
  var mPopup: js.Any = js.native
  var mPopupMaxWidth: js.Any = js.native
  var mTreeObserver: js.Any = js.native
  def dismiss(): Unit = js.native
  def isShowing(): Boolean = js.native
  /* private */ def measureContentWidth(adapter: js.Any): js.Any = js.native
  def setAnchorView(anchor: View): Unit = js.native
  def show(): Unit = js.native
  def tryShow(): Boolean = js.native
}

object MenuPopupHelper_ {
  @scala.inline
  def apply(
    dismiss: () => Unit,
    isShowing: () => Boolean,
    mAdapter: js.Any,
    mAnchorView: js.Any,
    mContext: js.Any,
    mInflater: js.Any,
    mMeasureParent: js.Any,
    mMenu: js.Any,
    mPopup: js.Any,
    mPopupMaxWidth: js.Any,
    mTreeObserver: js.Any,
    measureContentWidth: js.Any => js.Any,
    onDismiss: () => Unit,
    onGlobalLayout: () => js.Any,
    onItemClick: (AdapterView[_], View, Double, Double) => Unit,
    onKey: (View, Double, KeyEvent) => Unit,
    setAnchorView: View => Unit,
    show: () => Unit,
    tryShow: () => Boolean
  ): MenuPopupHelper_ = {
    val __obj = js.Dynamic.literal(dismiss = js.Any.fromFunction0(dismiss), isShowing = js.Any.fromFunction0(isShowing), mAdapter = mAdapter.asInstanceOf[js.Any], mAnchorView = mAnchorView.asInstanceOf[js.Any], mContext = mContext.asInstanceOf[js.Any], mInflater = mInflater.asInstanceOf[js.Any], mMeasureParent = mMeasureParent.asInstanceOf[js.Any], mMenu = mMenu.asInstanceOf[js.Any], mPopup = mPopup.asInstanceOf[js.Any], mPopupMaxWidth = mPopupMaxWidth.asInstanceOf[js.Any], mTreeObserver = mTreeObserver.asInstanceOf[js.Any], measureContentWidth = js.Any.fromFunction1(measureContentWidth), onDismiss = js.Any.fromFunction0(onDismiss), onGlobalLayout = js.Any.fromFunction0(onGlobalLayout), onItemClick = js.Any.fromFunction4(onItemClick), onKey = js.Any.fromFunction3(onKey), setAnchorView = js.Any.fromFunction1(setAnchorView), show = js.Any.fromFunction0(show), tryShow = js.Any.fromFunction0(tryShow))
    __obj.asInstanceOf[MenuPopupHelper_]
  }
  @scala.inline
  implicit class MenuPopupHelper_Ops[Self <: MenuPopupHelper_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDismiss(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismiss")(js.Any.fromFunction0(value))
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
    def withMAnchorView(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mAnchorView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMInflater(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mInflater")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMMeasureParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mMeasureParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMMenu(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMPopup(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPopup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMPopupMaxWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPopupMaxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTreeObserver(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTreeObserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeasureContentWidth(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureContentWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAnchorView(value: View => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAnchorView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTryShow(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryShow")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

