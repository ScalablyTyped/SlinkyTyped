package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISVGElementInstance extends js.Object {
  @JSName("MSHTML.ISVGElementInstance_typekey")
  var MSHTMLDotISVGElementInstance_typekey: ISVGElementInstance = js.native
  val childNodes: ISVGElementInstanceList = js.native
  val correspondingElement: ISVGElement = js.native
  val correspondingUseElement: ISVGUseElement = js.native
  val firstChild: ISVGElementInstance = js.native
  val lastChild: ISVGElementInstance = js.native
  val nextSibling: ISVGElementInstance = js.native
  val parentNode: ISVGElementInstance = js.native
  val previousSibling: ISVGElementInstance = js.native
}

object ISVGElementInstance {
  @scala.inline
  def apply(
    MSHTMLDotISVGElementInstance_typekey: ISVGElementInstance,
    childNodes: ISVGElementInstanceList,
    correspondingElement: ISVGElement,
    correspondingUseElement: ISVGUseElement,
    firstChild: ISVGElementInstance,
    lastChild: ISVGElementInstance,
    nextSibling: ISVGElementInstance,
    parentNode: ISVGElementInstance,
    previousSibling: ISVGElementInstance
  ): ISVGElementInstance = {
    val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], correspondingElement = correspondingElement.asInstanceOf[js.Any], correspondingUseElement = correspondingUseElement.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGElementInstance_typekey")(MSHTMLDotISVGElementInstance_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGElementInstance]
  }
  @scala.inline
  implicit class ISVGElementInstanceOps[Self <: ISVGElementInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotISVGElementInstance_typekey(value: ISVGElementInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.ISVGElementInstance_typekey")(value.asInstanceOf[js.Any])
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
  }
  
}

