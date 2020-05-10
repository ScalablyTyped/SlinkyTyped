package typingsSlinky.materialMenuSurface.adapterMod

import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.Element
import typingsSlinky.materialMenuSurface.PartialMDCMenuDistance
import typingsSlinky.materialMenuSurface.typesMod.MDCMenuDimensions
import typingsSlinky.materialMenuSurface.typesMod.MDCMenuPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCMenuSurfaceAdapter extends js.Object {
  def addClass(className: String): Unit = js.native
  def getAnchorDimensions(): ClientRect | Null = js.native
  def getBodyDimensions(): MDCMenuDimensions = js.native
  def getInnerDimensions(): MDCMenuDimensions = js.native
  def getWindowDimensions(): MDCMenuDimensions = js.native
  def getWindowScroll(): MDCMenuPoint = js.native
  def hasAnchor(): Boolean = js.native
  def hasClass(className: String): Boolean = js.native
  def isElementInContainer(el: Element): Boolean = js.native
  def isFocused(): Boolean = js.native
  def isRtl(): Boolean = js.native
  /** Emits an event when the menu surface is closed. */
  def notifyClose(): Unit = js.native
  /** Emits an event when the menu surface is opened. */
  def notifyOpen(): Unit = js.native
  def removeClass(className: String): Unit = js.native
  /** Restores focus to the element that was focused before the menu surface was opened. */
  def restoreFocus(): Unit = js.native
  /** Saves the element that was focused before the menu surface was opened. */
  def saveFocus(): Unit = js.native
  def setMaxHeight(height: String): Unit = js.native
  def setPosition(position: PartialMDCMenuDistance): Unit = js.native
  def setTransformOrigin(origin: String): Unit = js.native
}

object MDCMenuSurfaceAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    getAnchorDimensions: () => ClientRect | Null,
    getBodyDimensions: () => MDCMenuDimensions,
    getInnerDimensions: () => MDCMenuDimensions,
    getWindowDimensions: () => MDCMenuDimensions,
    getWindowScroll: () => MDCMenuPoint,
    hasAnchor: () => Boolean,
    hasClass: String => Boolean,
    isElementInContainer: Element => Boolean,
    isFocused: () => Boolean,
    isRtl: () => Boolean,
    notifyClose: () => Unit,
    notifyOpen: () => Unit,
    removeClass: String => Unit,
    restoreFocus: () => Unit,
    saveFocus: () => Unit,
    setMaxHeight: String => Unit,
    setPosition: PartialMDCMenuDistance => Unit,
    setTransformOrigin: String => Unit
  ): MDCMenuSurfaceAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), getAnchorDimensions = js.Any.fromFunction0(getAnchorDimensions), getBodyDimensions = js.Any.fromFunction0(getBodyDimensions), getInnerDimensions = js.Any.fromFunction0(getInnerDimensions), getWindowDimensions = js.Any.fromFunction0(getWindowDimensions), getWindowScroll = js.Any.fromFunction0(getWindowScroll), hasAnchor = js.Any.fromFunction0(hasAnchor), hasClass = js.Any.fromFunction1(hasClass), isElementInContainer = js.Any.fromFunction1(isElementInContainer), isFocused = js.Any.fromFunction0(isFocused), isRtl = js.Any.fromFunction0(isRtl), notifyClose = js.Any.fromFunction0(notifyClose), notifyOpen = js.Any.fromFunction0(notifyOpen), removeClass = js.Any.fromFunction1(removeClass), restoreFocus = js.Any.fromFunction0(restoreFocus), saveFocus = js.Any.fromFunction0(saveFocus), setMaxHeight = js.Any.fromFunction1(setMaxHeight), setPosition = js.Any.fromFunction1(setPosition), setTransformOrigin = js.Any.fromFunction1(setTransformOrigin))
    __obj.asInstanceOf[MDCMenuSurfaceAdapter]
  }
  @scala.inline
  implicit class MDCMenuSurfaceAdapterOps[Self <: MDCMenuSurfaceAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAnchorDimensions(value: () => ClientRect | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnchorDimensions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBodyDimensions(value: () => MDCMenuDimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBodyDimensions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInnerDimensions(value: () => MDCMenuDimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInnerDimensions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWindowDimensions(value: () => MDCMenuDimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWindowDimensions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWindowScroll(value: () => MDCMenuPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWindowScroll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasAnchor(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAnchor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasClass(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsElementInContainer(value: Element => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isElementInContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsFocused(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsRtl(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRtl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotifyClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotifyOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRestoreFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSaveFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetMaxHeight(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPosition(value: PartialMDCMenuDistance => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTransformOrigin(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTransformOrigin")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

