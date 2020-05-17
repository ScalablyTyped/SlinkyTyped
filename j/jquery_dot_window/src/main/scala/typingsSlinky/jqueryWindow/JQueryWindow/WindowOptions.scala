package typingsSlinky.jqueryWindow.JQueryWindow

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jqueryWindow.JQuery
import typingsSlinky.jqueryWindow.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Instance options
@js.native
trait WindowOptions extends js.Object {
  /**
    a callback function after window cascaded
    **/
  var afterCascade: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function after window dragged
    **/
  var afterDrag: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function after window maximized
    **/
  var afterMaximize: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function after window minimized
    **/
  var afterMinimize: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function after window resized
    **/
  var afterResize: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    to control window with remote url could be bookmarked
    **/
  var bookmarkable: js.UndefOr[Boolean] = js.native
  /**
    to check window dialog overflow html body or caller element
    **/
  var checkBoundary: js.UndefOr[Boolean] = js.native
  /**
    to control window closable
    **/
  var closable: js.UndefOr[Boolean] = js.native
  /**
    container extra class
    **/
  var containerClass: js.UndefOr[String] = js.native
  /**
    this attribute only works when url is null. when passing a jquery object or a element, it will clone the original one to append.
    **/
  var content: js.UndefOr[String | JQuery | HTMLElement] = js.native
  /**
    random the new created window position, it only works when options x,y value both are -1
    **/
  var createRandomOffset: js.UndefOr[X] = js.native
  /**
    to describe the customized button display and callback function
    **/
  var custBtns: js.UndefOr[js.Array[Button]] = js.native
  /**
    to control window draggable
    **/
  var draggable: js.UndefOr[Boolean] = js.native
  /**
    footer extra class
    **/
  var footerClass: js.UndefOr[String] = js.native
  /**
    same as content attribute, but it's put on footer panel.
    **/
  var footerContent: js.UndefOr[String | JQuery | HTMLElement] = js.native
  /**
    frame extra class
    **/
  var frameClass: js.UndefOr[String] = js.native
  /**
    header extra class
    **/
  var headerClass: js.UndefOr[String] = js.native
  /**
    window height
    **/
  var height: js.UndefOr[Double] = js.native
  /**
    an icon image url string. if this attribute is given, it will force to replace the original favicon of remote page on window. or you can set it as null to hide icon.
    **/
  var icon: js.UndefOr[String] = js.native
  /**
    if null means no check, or pass a string to show warning message while iframe is going to redirect current top page
    **/
  var iframeRedirectCheckMsg: js.UndefOr[String] = js.native
  /**
    the maximum height, if -1 means no checking
    **/
  var maxHeight: js.UndefOr[Double] = js.native
  /**
    the maximum width, if -1 means no checking
    **/
  var maxWidth: js.UndefOr[Double] = js.native
  /**
    to control window maximizable
    **/
  var maximizable: js.UndefOr[Boolean] = js.native
  /**
    the minimum height, if -1 means no checking
    **/
  var minHeight: js.UndefOr[Double] = js.native
  /**
    the minimum width, if -1 means no checking
    **/
  var minWidth: js.UndefOr[Double] = js.native
  /**
    to control window minimizable
    **/
  var minimizable: js.UndefOr[Boolean] = js.native
  /**
    the opacity of modal dialog
    **/
  var modalOpacity: js.UndefOr[Double] = js.native
  /**
    a callback function while window is going to cascade
    **/
  var onCascade: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function while user click close button
    **/
  var onClose: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function while window is going to drag
    **/
  var onDrag: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function while iframe load finished. this attribute only works while url attribute is given
    **/
  var onIframeEnd: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function while iframe ready to connect remoting url. this attribute only works while url attribute is given
    **/
  var onIframeStart: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function while window is going to maximize
    **/
  var onMaximize: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function while window is going to minimize
    **/
  var onMinimize: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function while container is added into body
    **/
  var onOpen: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function while window is going to resize
    **/
  var onResize: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function while user select the window
    **/
  var onSelect: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function while whole window display routine is finished
    **/
  var onShow: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function while window unselected
    **/
  var onUnselect: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    to control window resizable
    **/
  var resizable: js.UndefOr[Boolean] = js.native
  /**
    to show scroll bar or not
    **/
  var scrollable: js.UndefOr[Boolean] = js.native
  /**
    selected header extra class
    **/
  var selectedHeaderClass: js.UndefOr[String] = js.native
  /**
    to control show footer panel
    **/
  var showFooter: js.UndefOr[Boolean] = js.native
  /**
    to control show modal on background
    **/
  var showModal: js.UndefOr[Boolean] = js.native
  /**
    to control display window as round corner
    **/
  var showRoundCorner: js.UndefOr[Boolean] = js.native
  /**
    the title text of window
    **/
  var title: String = js.native
  /**
    the target url of iframe ready to load.
    **/
  var url: js.UndefOr[String] = js.native
  /**
    window width
    **/
  var width: js.UndefOr[Double] = js.native
  /**
    to limit window only can be dragged within browser window. this attribute only works when checkBoundary is true and caller is null.
    **/
  var withinBrowserWindow: js.UndefOr[Boolean] = js.native
  /**
    the x-axis value on screen(or caller element), if -1 means put on screen(or caller element) center
    **/
  var x: js.UndefOr[Double] = js.native
  /**
    the y-axis value on screen(or caller element), if -1 means put on screen(or caller element) center
    **/
  var y: js.UndefOr[Double] = js.native
  /**
    the css z-index value
    **/
  var z: js.UndefOr[Double] = js.native
}

object WindowOptions {
  @scala.inline
  def apply(title: String): WindowOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOptions]
  }
  @scala.inline
  implicit class WindowOptionsOps[Self <: WindowOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterCascade(value: /* wnd */ Window => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCascade")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterCascade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCascade")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterDrag(value: /* wnd */ Window => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterMaximize(value: /* wnd */ Window => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterMaximize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterMaximize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterMaximize")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterMinimize(value: /* wnd */ Window => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterMinimize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterMinimize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterMinimize")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterResize(value: /* wnd */ Window => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterResize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterResize")(js.undefined)
        ret
    }
    @scala.inline
    def withBookmarkable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarkable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBookmarkable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarkable")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckBoundary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkBoundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckBoundary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkBoundary")(js.undefined)
        ret
    }
    @scala.inline
    def withClosable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closable")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withContentHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: String | JQuery | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateRandomOffset(value: X): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRandomOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateRandomOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRandomOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withCustBtns(value: js.Array[Button]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custBtns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustBtns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custBtns")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterContentHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterContent(value: String | JQuery | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerContent")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameClass")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIframeRedirectCheckMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeRedirectCheckMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIframeRedirectCheckMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeRedirectCheckMsg")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizable")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimizable")(js.undefined)
        ret
    }
    @scala.inline
    def withModalOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCascade(value: /* wnd */ Window => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCascade")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCascade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCascade")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: /* wnd */ Window => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrag(value: /* wnd */ Window => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIframeEnd(value: /* wnd */ Window => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIframeEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIframeEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIframeEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIframeStart(value: /* wnd */ Window => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIframeStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIframeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIframeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMaximize(value: /* wnd */ Window => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMaximize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMaximize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMaximize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMinimize(value: /* wnd */ Window => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMinimize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMinimize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMinimize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: /* wnd */ Window => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResize(value: /* wnd */ Window => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: /* wnd */ Window => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: /* wnd */ Window => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnselect(value: /* wnd */ Window => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnselect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUnselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnselect")(js.undefined)
        ret
    }
    @scala.inline
    def withResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollable")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedHeaderClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedHeaderClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedHeaderClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedHeaderClass")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withShowModal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showModal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showModal")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRoundCorner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoundCorner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRoundCorner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoundCorner")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWithinBrowserWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withinBrowserWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithinBrowserWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withinBrowserWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
    @scala.inline
    def withZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(js.undefined)
        ret
    }
  }
  
}

