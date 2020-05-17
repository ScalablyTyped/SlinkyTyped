package typingsSlinky.activexLibreoffice.com_.sun.star.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Optional interface of sidebar panels. */
@js.native
trait XSidebarPanel extends js.Object {
  /** Minimal possible width of this panel. */
  val MinimalWidth: Double = js.native
  /**
    * For a given width of the container the layouter asks every ui element for its optimal height.
    *
    * The height to which a ui element is set may differ from the returned value.
    *
    * The height is set via the XWindow interface.
    */
  def getHeightForWidth(nWidth: Double): LayoutSize = js.native
  /** Minimal possible width of this panel. */
  def getMinimalWidth(): Double = js.native
}

object XSidebarPanel {
  @scala.inline
  def apply(MinimalWidth: Double, getHeightForWidth: Double => LayoutSize, getMinimalWidth: () => Double): XSidebarPanel = {
    val __obj = js.Dynamic.literal(MinimalWidth = MinimalWidth.asInstanceOf[js.Any], getHeightForWidth = js.Any.fromFunction1(getHeightForWidth), getMinimalWidth = js.Any.fromFunction0(getMinimalWidth))
    __obj.asInstanceOf[XSidebarPanel]
  }
  @scala.inline
  implicit class XSidebarPanelOps[Self <: XSidebarPanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinimalWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimalWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetHeightForWidth(value: Double => LayoutSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeightForWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMinimalWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinimalWidth")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

