package typingsSlinky.dojo.dijit.base

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.dojo.dijit.WidgetBase
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_base/focus.html
  *
  * Deprecated module to monitor currently focused node and stack of currently focused widgets.
  * New code should access dijit/focus directly.
  * 
  */
@js.native
trait focus extends js.Object {
  /**
    * Retrieves a bookmark that can be used with moveToBookmark to return to the same range
    * 
    */
  def getBookmark(): js.Any = js.native
  /**
    * Called as getFocus(), this returns an Object showing the current focus
    * and selected text.
    * 
    * Called as getFocus(widget), where widget is a (widget representing) a button
    * that was just pressed, it returns where focus was before that button
    * was pressed.   (Pressing the button may have either shifted focus to the button,
    * or removed focus altogether.)   In this case the selected text is not returned,
    * since it can't be accurately determined.
    * 
    * @param menu               OptionalThe button that was just pressed.  If focus has disappeared or movedto this button, returns the previous focus.  In this case the bookmarkinformation is already lost, and null is returned.             
    * @param openedForWindow               Optionaliframe in which menu was opened             
    */
  def getFocus(menu: WidgetBase, openedForWindow: Window_): js.Any = js.native
  /**
    * Returns true if there is no text selected
    * 
    */
  def isCollapsed(): js.Any = js.native
  /**
    * Moves current selection to a bookmark
    * 
    * @param bookmark This should be a returned object from dijit.getBookmark()             
    */
  def moveToBookmark(bookmark: js.Object): js.Any = js.native
  /**
    * Registers listeners on the specified iframe so that any click
    * or focus event on that iframe (or anything in it) is reported
    * as a focus/click event on the <iframe> itself.
    * Currently only used by editor.
    * 
    * @param iframe             
    */
  def registerIframe(iframe: HTMLElement): js.Any = js.native
  /**
    * Registers listeners on the specified window (either the main
    * window or an iframe's window) to detect when the user has clicked somewhere
    * or focused somewhere.
    * Users should call registerIframe() instead of this method.
    * 
    * @param targetWindow               OptionalIf specified this is the window associated with the iframe,i.e. iframe.contentWindow.             
    * @param effectiveNode               OptionalIf specified, report any focus events inside targetWindow asan event on effectiveNode, rather than on evt.target.             
    */
  def registerWin(targetWindow: Window_, effectiveNode: HTMLElement): js.Any = js.native
  /**
    * Unregisters listeners on the specified iframe created by registerIframe.
    * After calling be sure to delete or null out the handle itself.
    * 
    * @param handle Handle returned by registerIframe()             
    */
  def unregisterIframe(handle: js.Object): Unit = js.native
  /**
    * Unregisters listeners on the specified window (either the main
    * window or an iframe's window) according to handle returned from registerWin().
    * After calling be sure to delete or null out the handle itself.
    * 
    * @param handle             
    */
  def unregisterWin(handle: js.Object): Unit = js.native
}

object focus {
  @scala.inline
  def apply(
    getBookmark: () => js.Any,
    getFocus: (WidgetBase, Window_) => js.Any,
    isCollapsed: () => js.Any,
    moveToBookmark: js.Object => js.Any,
    registerIframe: HTMLElement => js.Any,
    registerWin: (Window_, HTMLElement) => js.Any,
    unregisterIframe: js.Object => Unit,
    unregisterWin: js.Object => Unit
  ): focus = {
    val __obj = js.Dynamic.literal(getBookmark = js.Any.fromFunction0(getBookmark), getFocus = js.Any.fromFunction2(getFocus), isCollapsed = js.Any.fromFunction0(isCollapsed), moveToBookmark = js.Any.fromFunction1(moveToBookmark), registerIframe = js.Any.fromFunction1(registerIframe), registerWin = js.Any.fromFunction2(registerWin), unregisterIframe = js.Any.fromFunction1(unregisterIframe), unregisterWin = js.Any.fromFunction1(unregisterWin))
    __obj.asInstanceOf[focus]
  }
  @scala.inline
  implicit class focusOps[Self <: focus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBookmark(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBookmark")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFocus(value: (WidgetBase, Window_) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFocus")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsCollapsed(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollapsed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMoveToBookmark(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToBookmark")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterIframe(value: HTMLElement => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerIframe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterWin(value: (Window_, HTMLElement) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerWin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnregisterIframe(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregisterIframe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnregisterWin(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregisterWin")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

