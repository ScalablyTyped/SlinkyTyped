package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGElementInstance extends js.Object {
  @JSName("MSHTML.SVGElementInstance_typekey")
  var MSHTMLDotSVGElementInstance_typekey: SVGElementInstance = js.native
  val childNodes: ISVGElementInstanceList = js.native
  val correspondingElement: ISVGElement = js.native
  val correspondingUseElement: ISVGUseElement = js.native
  val firstChild: ISVGElementInstance = js.native
  val lastChild: ISVGElementInstance = js.native
  val nextSibling: ISVGElementInstance = js.native
  val parentNode: ISVGElementInstance = js.native
  val previousSibling: ISVGElementInstance = js.native
  def addEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
  def dispatchEvent(evt: IDOMEvent): Boolean = js.native
  def removeEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
}

object SVGElementInstance {
  @scala.inline
  def apply(
    MSHTMLDotSVGElementInstance_typekey: SVGElementInstance,
    addEventListener: (String, js.Any, Boolean) => Unit,
    childNodes: ISVGElementInstanceList,
    correspondingElement: ISVGElement,
    correspondingUseElement: ISVGUseElement,
    dispatchEvent: IDOMEvent => Boolean,
    firstChild: ISVGElementInstance,
    lastChild: ISVGElementInstance,
    nextSibling: ISVGElementInstance,
    parentNode: ISVGElementInstance,
    previousSibling: ISVGElementInstance,
    removeEventListener: (String, js.Any, Boolean) => Unit
  ): SVGElementInstance = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction3(addEventListener), childNodes = childNodes.asInstanceOf[js.Any], correspondingElement = correspondingElement.asInstanceOf[js.Any], correspondingUseElement = correspondingUseElement.asInstanceOf[js.Any], dispatchEvent = js.Any.fromFunction1(dispatchEvent), firstChild = firstChild.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction3(removeEventListener))
    __obj.updateDynamic("MSHTML.SVGElementInstance_typekey")(MSHTMLDotSVGElementInstance_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGElementInstance]
  }
  @scala.inline
  implicit class SVGElementInstanceOps[Self <: SVGElementInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGElementInstance_typekey(value: SVGElementInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGElementInstance_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddEventListener(value: (String, js.Any, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withChildNodes(value: ISVGElementInstanceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCorrespondingElement(value: ISVGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correspondingElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCorrespondingUseElement(value: ISVGUseElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correspondingUseElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispatchEvent(value: IDOMEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFirstChild(value: ISVGElementInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastChild(value: ISVGElementInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextSibling(value: ISVGElementInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentNode(value: ISVGElementInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousSibling(value: ISVGElementInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: (String, js.Any, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

