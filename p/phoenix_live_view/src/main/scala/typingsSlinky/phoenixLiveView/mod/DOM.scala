package typingsSlinky.phoenixLiveView.mod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("phoenix_live_view", "DOM")
@js.native
object DOM extends js.Object {
  
  def all(node: Node, query: String, callback: js.Function1[/* el */ HTMLElement, HTMLElement]): js.Array[HTMLElement] = js.native
  
  def byId(id: String): HTMLElement | Unit = js.native
  
  def cleanChildNodes(container: js.Any, phxUpdate: js.Any): Unit = js.native
  
  def cloneNode(node: Node, html: js.Any): Node = js.native
  
  def copyPrivates(target: HTMLElement, source: HTMLElement): Unit = js.native
  
  def debounce(
    el: HTMLElement,
    event: Event,
    phxDebounce: String,
    defaultDebounce: String,
    phxThrottle: String,
    defaultThrottle: String,
    callback: js.Function0[_]
  ): js.Any = js.native
  def debounce(
    el: HTMLElement,
    event: Event,
    phxDebounce: String,
    defaultDebounce: String,
    phxThrottle: String,
    defaultThrottle: Null,
    callback: js.Function0[_]
  ): js.Any = js.native
  def debounce(
    el: HTMLElement,
    event: Event,
    phxDebounce: String,
    defaultDebounce: Null,
    phxThrottle: String,
    defaultThrottle: String,
    callback: js.Function0[_]
  ): js.Any = js.native
  def debounce(
    el: HTMLElement,
    event: Event,
    phxDebounce: String,
    defaultDebounce: Null,
    phxThrottle: String,
    defaultThrottle: Null,
    callback: js.Function0[_]
  ): js.Any = js.native
  
  def deletePrivate(el: HTMLElement, key: String): Unit = js.native
  
  def discardError(container: HTMLElement, el: HTMLElement, phxFeedbackFor: String): Unit = js.native
  
  def dispatchEvent(target: Node, eventString: String): Unit = js.native
  def dispatchEvent(target: Node, eventString: String, detail: js.Object): Unit = js.native
  
  def findComponentNode(node: Node, cid: Double): js.Array[HTMLElement] = js.native
  
  def findParentCIDs(node: Node, cids: js.Array[Double]): Set[Double] = js.native
  
  def findPhxChildren(el: HTMLElement, parentId: String): js.Array[HTMLElement] = js.native
  
  def findPhxChildrenInFragment(html: String, parentId: String): js.Array[HTMLElement] = js.native
  
  def incCycle(el: HTMLElement, key: String): Double = js.native
  def incCycle(el: HTMLElement, key: String, trigger: js.Any): Double = js.native
  
  def isFormInput(el: HTMLElement): Boolean = js.native
  
  def isNowTriggerFormExternal(el: HTMLElement, phxTriggerExternal: String): Boolean = js.native
  
  def isPhxChild(el: HTMLElement): Boolean = js.native
  
  def isPhxUpdate(el: HTMLElement, phxUpdate: js.Any, updateTypes: js.Array[String]): Boolean = js.native
  
  def isTextualInput(el: HTMLElement): Boolean = js.native
  
  def mergeAttrs(target: HTMLElement, source: HTMLElement): Unit = js.native
  def mergeAttrs(target: HTMLElement, source: HTMLElement, exclude: js.Array[String]): Unit = js.native
  
  def mergeFocusedInput(target: HTMLElement, source: HTMLElement): Unit = js.native
  
  def once(el: HTMLElement, key: String): Boolean = js.native
  
  def putPrivate(el: HTMLElement, key: String, value: js.Any): Unit = js.native
  
  def putTitle(str: String): Unit = js.native
  
  def removeClass(el: HTMLElement, className: String): Unit = js.native
  
  def restoreFocus(focused: HTMLElement, selectionStart: Double, selectionEnd: Double): Unit = js.native
  
  def syncAttrsToProps(el: HTMLElement): Unit = js.native
  
  def syncPendingRef(ref: Double, fromEl: HTMLElement, toEl: HTMLElement): Boolean = js.native
  def syncPendingRef(ref: Null, fromEl: HTMLElement, toEl: HTMLElement): Boolean = js.native
  
  def triggerCycle(el: HTMLElement, key: String): Unit = js.native
  def triggerCycle(el: HTMLElement, key: String, currentCycle: Double): Unit = js.native
}
