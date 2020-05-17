package typingsSlinky.handsontable.mod.Handsontable.plugins

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.WeakSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusableWrapper extends js.Object {
  var eventManager: EventManager = js.native
  var listenersCount: WeakSet[HTMLElement] = js.native
  var mainElement: HTMLElement = js.native
  var rootDocument: Document = js.native
  def focus(): Unit = js.native
  def getFocusableElement(): HTMLElement = js.native
  def setFocusableElement(element: HTMLElement): Unit = js.native
  def useSecondaryElement(): Unit = js.native
}

object FocusableWrapper {
  @scala.inline
  def apply(
    eventManager: EventManager,
    focus: () => Unit,
    getFocusableElement: () => HTMLElement,
    listenersCount: WeakSet[HTMLElement],
    mainElement: HTMLElement,
    rootDocument: Document,
    setFocusableElement: HTMLElement => Unit,
    useSecondaryElement: () => Unit
  ): FocusableWrapper = {
    val __obj = js.Dynamic.literal(eventManager = eventManager.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), getFocusableElement = js.Any.fromFunction0(getFocusableElement), listenersCount = listenersCount.asInstanceOf[js.Any], mainElement = mainElement.asInstanceOf[js.Any], rootDocument = rootDocument.asInstanceOf[js.Any], setFocusableElement = js.Any.fromFunction1(setFocusableElement), useSecondaryElement = js.Any.fromFunction0(useSecondaryElement))
    __obj.asInstanceOf[FocusableWrapper]
  }
  @scala.inline
  implicit class FocusableWrapperOps[Self <: FocusableWrapper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventManager(value: EventManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFocusableElement(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFocusableElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withListenersCount(value: WeakSet[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listenersCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMainElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootDocument(value: Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetFocusableElement(value: HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFocusableElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUseSecondaryElement(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSecondaryElement")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

