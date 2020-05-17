package typingsSlinky.androiduix.android.widget

import typingsSlinky.androiduix.android.content.Context
import typingsSlinky.androiduix.android.view.View
import typingsSlinky.androiduix.android.widget.Toast.TN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Toast_ extends js.Object {
  var mContext: Context = js.native
  var mDelayHide: js.Any = js.native
  var mDuration: Double = js.native
  var mHandler: js.Any = js.native
  var mNextView: View = js.native
  var mTN: TN = js.native
  def cancel(): Unit = js.native
  def getDuration(): Double = js.native
  def getGravity(): Double = js.native
  def getView(): View = js.native
  def getXOffset(): Double = js.native
  def getYOffset(): Double = js.native
  def setDuration(duration: Double): Unit = js.native
  def setGravity(gravity: Double, xOffset: Double, yOffset: Double): Unit = js.native
  def setText(s: String): Unit = js.native
  def setView(view: View): Unit = js.native
  def show(): Unit = js.native
}

object Toast_ {
  @scala.inline
  def apply(
    cancel: () => Unit,
    getDuration: () => Double,
    getGravity: () => Double,
    getView: () => View,
    getXOffset: () => Double,
    getYOffset: () => Double,
    mContext: Context,
    mDelayHide: js.Any,
    mDuration: Double,
    mHandler: js.Any,
    mNextView: View,
    mTN: TN,
    setDuration: Double => Unit,
    setGravity: (Double, Double, Double) => Unit,
    setText: String => Unit,
    setView: View => Unit,
    show: () => Unit
  ): Toast_ = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), getDuration = js.Any.fromFunction0(getDuration), getGravity = js.Any.fromFunction0(getGravity), getView = js.Any.fromFunction0(getView), getXOffset = js.Any.fromFunction0(getXOffset), getYOffset = js.Any.fromFunction0(getYOffset), mContext = mContext.asInstanceOf[js.Any], mDelayHide = mDelayHide.asInstanceOf[js.Any], mDuration = mDuration.asInstanceOf[js.Any], mHandler = mHandler.asInstanceOf[js.Any], mNextView = mNextView.asInstanceOf[js.Any], mTN = mTN.asInstanceOf[js.Any], setDuration = js.Any.fromFunction1(setDuration), setGravity = js.Any.fromFunction3(setGravity), setText = js.Any.fromFunction1(setText), setView = js.Any.fromFunction1(setView), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Toast_]
  }
  @scala.inline
  implicit class Toast_Ops[Self <: Toast_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDuration(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDuration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGravity(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGravity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetView(value: () => View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetXOffset(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetYOffset(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMContext(value: Context): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDelayHide(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDelayHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMNextView(value: View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mNextView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTN(value: TN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetDuration(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDuration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetGravity(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGravity")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetView(value: View => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setView")(js.Any.fromFunction1(value))
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

