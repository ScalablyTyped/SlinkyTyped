package typingsSlinky.androiduix.android.widget.Spinner

import typingsSlinky.androiduix.android.graphics.drawable.Drawable
import typingsSlinky.androiduix.android.widget.ListAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpinnerPopup extends js.Object {
  def dismiss(): Unit = js.native
  def getBackground(): Drawable = js.native
  def getHintText(): String = js.native
  def getHorizontalOffset(): Double = js.native
  def getVerticalOffset(): Double = js.native
  def isShowing(): Boolean = js.native
  def setAdapter(adapter: ListAdapter): Unit = js.native
  def setBackgroundDrawable(bg: Drawable): Unit = js.native
  def setHorizontalOffset(px: Double): Unit = js.native
  def setPromptText(hintText: String): Unit = js.native
  def setVerticalOffset(px: Double): Unit = js.native
  def showPopup(textDirection: Double, textAlignment: Double): Unit = js.native
}

object SpinnerPopup {
  @scala.inline
  def apply(
    dismiss: () => Unit,
    getBackground: () => Drawable,
    getHintText: () => String,
    getHorizontalOffset: () => Double,
    getVerticalOffset: () => Double,
    isShowing: () => Boolean,
    setAdapter: ListAdapter => Unit,
    setBackgroundDrawable: Drawable => Unit,
    setHorizontalOffset: Double => Unit,
    setPromptText: String => Unit,
    setVerticalOffset: Double => Unit,
    showPopup: (Double, Double) => Unit
  ): SpinnerPopup = {
    val __obj = js.Dynamic.literal(dismiss = js.Any.fromFunction0(dismiss), getBackground = js.Any.fromFunction0(getBackground), getHintText = js.Any.fromFunction0(getHintText), getHorizontalOffset = js.Any.fromFunction0(getHorizontalOffset), getVerticalOffset = js.Any.fromFunction0(getVerticalOffset), isShowing = js.Any.fromFunction0(isShowing), setAdapter = js.Any.fromFunction1(setAdapter), setBackgroundDrawable = js.Any.fromFunction1(setBackgroundDrawable), setHorizontalOffset = js.Any.fromFunction1(setHorizontalOffset), setPromptText = js.Any.fromFunction1(setPromptText), setVerticalOffset = js.Any.fromFunction1(setVerticalOffset), showPopup = js.Any.fromFunction2(showPopup))
    __obj.asInstanceOf[SpinnerPopup]
  }
  @scala.inline
  implicit class SpinnerPopupOps[Self <: SpinnerPopup] (val x: Self) extends AnyVal {
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
    def withGetBackground(value: () => Drawable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBackground")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHintText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHintText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHorizontalOffset(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHorizontalOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVerticalOffset(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVerticalOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsShowing(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isShowing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAdapter(value: ListAdapter => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAdapter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetBackgroundDrawable(value: Drawable => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBackgroundDrawable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHorizontalOffset(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHorizontalOffset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPromptText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPromptText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetVerticalOffset(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVerticalOffset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowPopup(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPopup")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

