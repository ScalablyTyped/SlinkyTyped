package typingsSlinky.dockSpawn.dockspawn

import org.scalajs.dom.raw.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tab Host control contains tabs known as TabPages.
  * The tab strip can be aligned in different orientations
  */
@js.native
trait TabHost extends js.Object {
  var contentElement: HTMLDivElement = js.native
  var displayCloseButton: Boolean = js.native
  var hostElement: HTMLDivElement = js.native
  var pages: js.Array[TabPage] = js.native
  var separatorElement: HTMLDivElement = js.native
  var tabListElement: HTMLDivElement = js.native
  var tabStripDirection: TabStripDirection = js.native
  /** Set the selected TabPage. */
  def onTabPageSelected(page: TabPage): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
  def setActiveTab(container: PanelContainer): Unit = js.native
}

object TabHost {
  @scala.inline
  def apply(
    contentElement: HTMLDivElement,
    displayCloseButton: Boolean,
    hostElement: HTMLDivElement,
    onTabPageSelected: TabPage => Unit,
    pages: js.Array[TabPage],
    resize: (Double, Double) => Unit,
    separatorElement: HTMLDivElement,
    setActiveTab: PanelContainer => Unit,
    tabListElement: HTMLDivElement,
    tabStripDirection: TabStripDirection
  ): TabHost = {
    val __obj = js.Dynamic.literal(contentElement = contentElement.asInstanceOf[js.Any], displayCloseButton = displayCloseButton.asInstanceOf[js.Any], hostElement = hostElement.asInstanceOf[js.Any], onTabPageSelected = js.Any.fromFunction1(onTabPageSelected), pages = pages.asInstanceOf[js.Any], resize = js.Any.fromFunction2(resize), separatorElement = separatorElement.asInstanceOf[js.Any], setActiveTab = js.Any.fromFunction1(setActiveTab), tabListElement = tabListElement.asInstanceOf[js.Any], tabStripDirection = tabStripDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabHost]
  }
  @scala.inline
  implicit class TabHostOps[Self <: TabHost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentElement(value: HTMLDivElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayCloseButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostElement(value: HTMLDivElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnTabPageSelected(value: TabPage => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabPageSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPages(value: js.Array[TabPage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResize(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSeparatorElement(value: HTMLDivElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separatorElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetActiveTab(value: PanelContainer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveTab")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTabListElement(value: HTMLDivElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabListElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabStripDirection(value: TabStripDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabStripDirection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

