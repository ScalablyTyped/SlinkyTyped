package typingsSlinky.ace.AceAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollBar extends js.Object {
  /**
    * Returns the width of the scroll bar.
    **/
  def getWidth(): Double = js.native
  /**
    * Emitted when the scroll bar, well, scrolls.
    * @param e Contains one property, `"data"`, which indicates the current scroll top position
    **/
  def onScroll(e: js.Any): Unit = js.native
  /**
    * Sets the height of the scroll bar, in pixels.
    * @param height The new height
    **/
  def setHeight(height: Double): Unit = js.native
  /**
    * Sets the inner height of the scroll bar, in pixels.
    * @param height The new inner height
    **/
  def setInnerHeight(height: Double): Unit = js.native
  /**
    * Sets the scroll top of the scroll bar.
    * @param scrollTop The new scroll top
    **/
  def setScrollTop(scrollTop: Double): Unit = js.native
}

object ScrollBar {
  @scala.inline
  def apply(
    getWidth: () => Double,
    onScroll: js.Any => Unit,
    setHeight: Double => Unit,
    setInnerHeight: Double => Unit,
    setScrollTop: Double => Unit
  ): ScrollBar = {
    val __obj = js.Dynamic.literal(getWidth = js.Any.fromFunction0(getWidth), onScroll = js.Any.fromFunction1(onScroll), setHeight = js.Any.fromFunction1(setHeight), setInnerHeight = js.Any.fromFunction1(setInnerHeight), setScrollTop = js.Any.fromFunction1(setScrollTop))
    __obj.asInstanceOf[ScrollBar]
  }
  @scala.inline
  implicit class ScrollBarOps[Self <: ScrollBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnScroll(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHeight(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetInnerHeight(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInnerHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetScrollTop(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollTop")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

