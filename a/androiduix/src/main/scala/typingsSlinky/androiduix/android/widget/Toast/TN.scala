package typingsSlinky.androiduix.android.widget.Toast

import typingsSlinky.androiduix.android.os.Handler
import typingsSlinky.androiduix.android.view.View
import typingsSlinky.androiduix.android.view.Window
import typingsSlinky.androiduix.android.view.WindowManager
import typingsSlinky.androiduix.java_.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TN extends js.Object {
  var mGravity: Double = js.native
  var mHandler: Handler = js.native
  var mHide: Runnable = js.native
  var mNextView: View = js.native
  var mShow: Runnable = js.native
  var mView: View = js.native
  var mWM: WindowManager = js.native
  var mWindow: Window = js.native
  var mX: Double = js.native
  var mY: Double = js.native
  def handleHide(): Unit = js.native
  def handleShow(): Unit = js.native
  def hide(): Unit = js.native
  def show(): Unit = js.native
}

object TN {
  @scala.inline
  def apply(
    handleHide: () => Unit,
    handleShow: () => Unit,
    hide: () => Unit,
    mGravity: Double,
    mHandler: Handler,
    mHide: Runnable,
    mNextView: View,
    mShow: Runnable,
    mView: View,
    mWM: WindowManager,
    mWindow: Window,
    mX: Double,
    mY: Double,
    show: () => Unit
  ): TN = {
    val __obj = js.Dynamic.literal(handleHide = js.Any.fromFunction0(handleHide), handleShow = js.Any.fromFunction0(handleShow), hide = js.Any.fromFunction0(hide), mGravity = mGravity.asInstanceOf[js.Any], mHandler = mHandler.asInstanceOf[js.Any], mHide = mHide.asInstanceOf[js.Any], mNextView = mNextView.asInstanceOf[js.Any], mShow = mShow.asInstanceOf[js.Any], mView = mView.asInstanceOf[js.Any], mWM = mWM.asInstanceOf[js.Any], mWindow = mWindow.asInstanceOf[js.Any], mX = mX.asInstanceOf[js.Any], mY = mY.asInstanceOf[js.Any], show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[TN]
  }
  @scala.inline
  implicit class TNOps[Self <: TN] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandleHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHandleShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMGravity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mGravity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMHandler(value: Handler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMHide(value: Runnable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMNextView(value: View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mNextView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMShow(value: Runnable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMView(value: View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMWM(value: WindowManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mWM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMWindow(value: Window): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mY")(value.asInstanceOf[js.Any])
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

