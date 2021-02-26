package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLNoShowElement extends StObject {
  
  def FireEvent(bstrEventName: String): Boolean = js.native
  def FireEvent(bstrEventName: String, pvarEventObject: js.Any): Boolean = js.native
  
  @JSName("MSHTML.HTMLNoShowElement_typekey")
  var MSHTMLDotHTMLNoShowElement_typekey: HTMLNoShowElement = js.native
  
  var accessKey: String = js.native
  
  def addBehavior(bstrURL: String): Double = js.native
  def addBehavior(bstrURL: String, pvarFactory: js.Any): Double = js.native
  
  def addFilter(pUnk: js.Any): Unit = js.native
  
  val all: js.Any = js.native
  
  def appendChild(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def applyElement(apply: IHTMLElement, where: String): IHTMLElement = js.native
  
  var ariaActivedescendant: String = js.native
  
  var ariaBusy: String = js.native
  
  var ariaChecked: String = js.native
  
  var ariaControls: String = js.native
  
  var ariaDescribedby: String = js.native
  
  var ariaDisabled: String = js.native
  
  var ariaExpanded: String = js.native
  
  var ariaFlowto: String = js.native
  
  var ariaHaspopup: String = js.native
  
  var ariaHidden: String = js.native
  
  var ariaInvalid: String = js.native
  
  var ariaLabelledby: String = js.native
  
  var ariaLevel: Double = js.native
  
  var ariaLive: String = js.native
  
  var ariaMultiselectable: String = js.native
  
  var ariaOwns: String = js.native
  
  var ariaPosinset: Double = js.native
  
  var ariaPressed: String = js.native
  
  var ariaReadonly: String = js.native
  
  var ariaRelevant: String = js.native
  
  var ariaRequired: String = js.native
  
  var ariaSecret: String = js.native
  
  var ariaSelected: String = js.native
  
  var ariaSetsize: Double = js.native
  
  var ariaValuemax: String = js.native
  
  var ariaValuemin: String = js.native
  
  var ariaValuenow: String = js.native
  
  def attachEvent(event: String, pdisp: js.Any): Boolean = js.native
  
  val attributes: js.Any = js.native
  
  val behaviorUrns: js.Any = js.native
  
  def blur(): Unit = js.native
  
  val canHaveChildren: Boolean = js.native
  
  val canHaveHTML: Boolean = js.native
  
  val childNodes: js.Any = js.native
  
  val children: js.Any = js.native
  
  var className: String = js.native
  
  def clearAttributes(): Unit = js.native
  
  def click(): Unit = js.native
  
  val clientHeight: Double = js.native
  
  val clientLeft: Double = js.native
  
  val clientTop: Double = js.native
  
  val clientWidth: Double = js.native
  
  def cloneNode(fDeep: Boolean): IHTMLDOMNode = js.native
  
  def componentFromPoint(x: Double, y: Double): String = js.native
  
  val constructor: js.Any = js.native
  
  def contains(pChild: IHTMLElement): Boolean = js.native
  
  var contentEditable: String = js.native
  
  def createControlRange(): js.Any = js.native
  
  val currentStyle: IHTMLCurrentStyle = js.native
  
  def detachEvent(event: String, pdisp: js.Any): Unit = js.native
  
  var dir: String = js.native
  
  var disabled: Boolean = js.native
  
  def doScroll(): Unit = js.native
  def doScroll(component: js.Any): Unit = js.native
  
  val document: js.Any = js.native
  
  def dragDrop(): Boolean = js.native
  
  def filters(pvarIndex: js.Any): js.Any = js.native
  @JSName("filters")
  val filters_Original: IHTMLFiltersCollection = js.native
  
  val firstChild: IHTMLDOMNode = js.native
  
  def focus(): Unit = js.native
  
  def getAdjacentText(where: String): String = js.native
  
  /** @param lFlags [lFlags=0] */
  def getAttribute(strAttributeName: String): js.Any = js.native
  def getAttribute(strAttributeName: String, lFlags: Double): js.Any = js.native
  
  def getAttributeNS(pvarNS: js.Any, strAttributeName: String): js.Any = js.native
  
  def getAttributeNode(bstrName: String): IHTMLDOMAttribute = js.native
  
  def getAttributeNodeNS(pvarNS: js.Any, bstrName: String): IHTMLDOMAttribute2 = js.native
  
  def getBoundingClientRect(): IHTMLRect = js.native
  
  def getClientRects(): IHTMLRectCollection = js.native
  
  def getElementsByClassName(v: String): IHTMLElementCollection = js.native
  
  def getElementsByTagName(v: String): IHTMLElementCollection = js.native
  
  def getElementsByTagNameNS(varNS: js.Any, bstrLocalName: String): IHTMLElementCollection = js.native
  
  def getExpression(propname: String): js.Any = js.native
  
  def hasAttribute(name: String): Boolean = js.native
  
  def hasAttributeNS(pvarNS: js.Any, name: String): Boolean = js.native
  
  def hasAttributes(): Boolean = js.native
  
  def hasChildNodes(): Boolean = js.native
  
  var hideFocus: Boolean = js.native
  
  var id: String = js.native
  
  val ie8_attributes: IHTMLAttributeCollection3 = js.native
  
  def ie8_getAttribute(strAttributeName: String): js.Any = js.native
  
  def ie8_getAttributeNode(bstrName: String): IHTMLDOMAttribute2 = js.native
  
  def ie8_removeAttribute(strAttributeName: String): Boolean = js.native
  
  def ie8_removeAttributeNode(pattr: IHTMLDOMAttribute2): IHTMLDOMAttribute2 = js.native
  
  def ie8_setAttribute(strAttributeName: String, AttributeValue: js.Any): Unit = js.native
  
  def ie8_setAttributeNode(pattr: IHTMLDOMAttribute2): IHTMLDOMAttribute2 = js.native
  
  def ie9_getAttribute(strAttributeName: String): js.Any = js.native
  
  def ie9_getAttributeNode(strAttributeName: String): IHTMLDOMAttribute2 = js.native
  
  def ie9_hasAttribute(name: String): Boolean = js.native
  
  def ie9_hasAttributes(): Boolean = js.native
  
  val ie9_nodeName: String = js.native
  
  def ie9_removeAttribute(strAttributeName: String): Unit = js.native
  
  def ie9_removeAttributeNode(pattr: IHTMLDOMAttribute2): IHTMLDOMAttribute2 = js.native
  
  def ie9_setAttribute(strAttributeName: String, pvarAttributeValue: js.Any): Unit = js.native
  
  def ie9_setAttributeNode(pattr: IHTMLDOMAttribute2): IHTMLDOMAttribute2 = js.native
  
  val ie9_tagName: String = js.native
  
  var innerHTML: String = js.native
  
  var innerText: String = js.native
  
  def insertAdjacentElement(where: String, insertedElement: IHTMLElement): IHTMLElement = js.native
  
  def insertAdjacentHTML(where: String, html: String): Unit = js.native
  
  def insertAdjacentText(where: String, text: String): Unit = js.native
  
  def insertBefore(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def insertBefore(newChild: IHTMLDOMNode, refChild: js.Any): IHTMLDOMNode = js.native
  
  val isContentEditable: Boolean = js.native
  
  val isDisabled: Boolean = js.native
  
  val isMultiLine: Boolean = js.native
  
  val isTextEdit: Boolean = js.native
  
  var lang: String = js.native
  
  var language: String = js.native
  
  val lastChild: IHTMLDOMNode = js.native
  
  def mergeAttributes(mergeThis: IHTMLElement): Unit = js.native
  def mergeAttributes(mergeThis: IHTMLElement, pvarFlags: js.Any): Unit = js.native
  
  def msMatchesSelector(v: String): Boolean = js.native
  
  def msReleasePointerCapture(pointerId: Double): Unit = js.native
  
  def msSetPointerCapture(pointerId: Double): Unit = js.native
  
  val nextSibling: IHTMLDOMNode = js.native
  
  val nodeName: String = js.native
  
  val nodeType: Double = js.native
  
  var nodeValue: js.Any = js.native
  
  def normalize(): Unit = js.native
  
  val offsetHeight: Double = js.native
  
  val offsetLeft: Double = js.native
  
  val offsetParent: IHTMLElement = js.native
  
  val offsetTop: Double = js.native
  
  val offsetWidth: Double = js.native
  
  var onabort: js.Any = js.native
  
  var onactivate: js.Any = js.native
  
  var onafterupdate: js.Any = js.native
  
  var onbeforeactivate: js.Any = js.native
  
  var onbeforecopy: js.Any = js.native
  
  var onbeforecut: js.Any = js.native
  
  var onbeforedeactivate: js.Any = js.native
  
  var onbeforeeditfocus: js.Any = js.native
  
  var onbeforepaste: js.Any = js.native
  
  var onbeforeupdate: js.Any = js.native
  
  var onblur: js.Any = js.native
  
  var oncanplay: js.Any = js.native
  
  var oncanplaythrough: js.Any = js.native
  
  var oncellchange: js.Any = js.native
  
  var onchange: js.Any = js.native
  
  var onclick: js.Any = js.native
  
  var oncontextmenu: js.Any = js.native
  
  var oncontrolselect: js.Any = js.native
  
  var oncopy: js.Any = js.native
  
  var oncuechange: js.Any = js.native
  
  var oncut: js.Any = js.native
  
  var ondataavailable: js.Any = js.native
  
  var ondatasetchanged: js.Any = js.native
  
  var ondatasetcomplete: js.Any = js.native
  
  var ondblclick: js.Any = js.native
  
  var ondeactivate: js.Any = js.native
  
  var ondrag: js.Any = js.native
  
  var ondragend: js.Any = js.native
  
  var ondragenter: js.Any = js.native
  
  var ondragleave: js.Any = js.native
  
  var ondragover: js.Any = js.native
  
  var ondragstart: js.Any = js.native
  
  var ondrop: js.Any = js.native
  
  var ondurationchange: js.Any = js.native
  
  var onemptied: js.Any = js.native
  
  var onended: js.Any = js.native
  
  var onerror: js.Any = js.native
  
  var onerrorupdate: js.Any = js.native
  
  var onfilterchange: js.Any = js.native
  
  var onfocus: js.Any = js.native
  
  var onfocusin: js.Any = js.native
  
  var onfocusout: js.Any = js.native
  
  var onhelp: js.Any = js.native
  
  var oninput: js.Any = js.native
  
  var oninvalid: js.Any = js.native
  
  var onkeydown: js.Any = js.native
  
  var onkeypress: js.Any = js.native
  
  var onkeyup: js.Any = js.native
  
  var onlayoutcomplete: js.Any = js.native
  
  var onload: js.Any = js.native
  
  var onloadeddata: js.Any = js.native
  
  var onloadedmetadata: js.Any = js.native
  
  var onloadstart: js.Any = js.native
  
  var onlosecapture: js.Any = js.native
  
  var onmousedown: js.Any = js.native
  
  var onmouseenter: js.Any = js.native
  
  var onmouseleave: js.Any = js.native
  
  var onmousemove: js.Any = js.native
  
  var onmouseout: js.Any = js.native
  
  var onmouseover: js.Any = js.native
  
  var onmouseup: js.Any = js.native
  
  var onmousewheel: js.Any = js.native
  
  var onmove: js.Any = js.native
  
  var onmoveend: js.Any = js.native
  
  var onmovestart: js.Any = js.native
  
  var onmsanimationend: js.Any = js.native
  
  var onmsanimationiteration: js.Any = js.native
  
  var onmsanimationstart: js.Any = js.native
  
  var onmsgesturechange: js.Any = js.native
  
  var onmsgesturedoubletap: js.Any = js.native
  
  var onmsgestureend: js.Any = js.native
  
  var onmsgesturehold: js.Any = js.native
  
  var onmsgesturestart: js.Any = js.native
  
  var onmsgesturetap: js.Any = js.native
  
  var onmsgotpointercapture: js.Any = js.native
  
  var onmsinertiastart: js.Any = js.native
  
  var onmslostpointercapture: js.Any = js.native
  
  var onmsmanipulationstatechanged: js.Any = js.native
  
  var onmspointercancel: js.Any = js.native
  
  var onmspointerdown: js.Any = js.native
  
  var onmspointerhover: js.Any = js.native
  
  var onmspointermove: js.Any = js.native
  
  var onmspointerout: js.Any = js.native
  
  var onmspointerover: js.Any = js.native
  
  var onmspointerup: js.Any = js.native
  
  var onmstransitionend: js.Any = js.native
  
  var onmstransitionstart: js.Any = js.native
  
  var onpage: js.Any = js.native
  
  var onpaste: js.Any = js.native
  
  var onpause: js.Any = js.native
  
  var onplay: js.Any = js.native
  
  var onplaying: js.Any = js.native
  
  var onprogress: js.Any = js.native
  
  var onpropertychange: js.Any = js.native
  
  var onratechange: js.Any = js.native
  
  var onreadystatechange: js.Any = js.native
  
  var onreset: js.Any = js.native
  
  var onresize: js.Any = js.native
  
  var onresizeend: js.Any = js.native
  
  var onresizestart: js.Any = js.native
  
  var onrowenter: js.Any = js.native
  
  var onrowexit: js.Any = js.native
  
  var onrowsdelete: js.Any = js.native
  
  var onrowsinserted: js.Any = js.native
  
  var onscroll: js.Any = js.native
  
  var onseeked: js.Any = js.native
  
  var onseeking: js.Any = js.native
  
  var onselect: js.Any = js.native
  
  var onselectstart: js.Any = js.native
  
  var onstalled: js.Any = js.native
  
  var onsubmit: js.Any = js.native
  
  var onsuspend: js.Any = js.native
  
  var ontimeupdate: js.Any = js.native
  
  var onvolumechange: js.Any = js.native
  
  var onwaiting: js.Any = js.native
  
  var outerHTML: String = js.native
  
  var outerText: String = js.native
  
  val ownerDocument: js.Any = js.native
  
  val parentElement: IHTMLElement = js.native
  
  val parentNode: IHTMLDOMNode = js.native
  
  val parentTextEdit: IHTMLElement = js.native
  
  val previousSibling: IHTMLDOMNode = js.native
  
  val readyState: js.Any = js.native
  
  val recordNumber: js.Any = js.native
  
  def releaseCapture(): Unit = js.native
  
  /** @param lFlags [lFlags=1] */
  def removeAttribute(strAttributeName: String): Boolean = js.native
  def removeAttribute(strAttributeName: String, lFlags: Double): Boolean = js.native
  
  def removeAttributeNS(pvarNS: js.Any, strAttributeName: String): Unit = js.native
  
  def removeAttributeNode(pattr: IHTMLDOMAttribute): IHTMLDOMAttribute = js.native
  
  def removeBehavior(cookie: Double): Boolean = js.native
  
  def removeChild(oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def removeExpression(propname: String): Boolean = js.native
  
  def removeFilter(pUnk: js.Any): Unit = js.native
  
  /** @param fDeep [fDeep=false] */
  def removeNode(): IHTMLDOMNode = js.native
  def removeNode(fDeep: Boolean): IHTMLDOMNode = js.native
  
  def replaceAdjacentText(where: String, newText: String): String = js.native
  
  def replaceChild(newChild: IHTMLDOMNode, oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def replaceNode(replacement: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  var role: String = js.native
  
  val runtimeStyle: IHTMLStyle = js.native
  
  val scopeName: String = js.native
  
  val scrollHeight: Double = js.native
  
  def scrollIntoView(): Unit = js.native
  def scrollIntoView(varargStart: js.Any): Unit = js.native
  
  var scrollLeft: Double = js.native
  
  var scrollTop: Double = js.native
  
  val scrollWidth: Double = js.native
  
  def setActive(): Unit = js.native
  
  /** @param lFlags [lFlags=1] */
  def setAttribute(strAttributeName: String, AttributeValue: js.Any): Unit = js.native
  def setAttribute(strAttributeName: String, AttributeValue: js.Any, lFlags: Double): Unit = js.native
  
  def setAttributeNS(pvarNS: js.Any, strAttributeName: String, pvarAttributeValue: js.Any): Unit = js.native
  
  def setAttributeNode(pattr: IHTMLDOMAttribute): IHTMLDOMAttribute = js.native
  
  def setAttributeNodeNS(pattr: IHTMLDOMAttribute2): IHTMLDOMAttribute2 = js.native
  
  /** @param containerCapture [containerCapture=true] */
  def setCapture(): Unit = js.native
  def setCapture(containerCapture: Boolean): Unit = js.native
  
  /** @param language [language=''] */
  def setExpression(propname: String, expression: String): Unit = js.native
  def setExpression(propname: String, expression: String, language: String): Unit = js.native
  
  val sourceIndex: Double = js.native
  
  var spellcheck: js.Any = js.native
  
  val style: IHTMLStyle = js.native
  
  def swapNode(otherNode: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  var tabIndex: Double = js.native
  
  val tagName: String = js.native
  
  var tagUrn: String = js.native
  
  var title: String = js.native
  
  val uniqueID: String = js.native
  
  val uniqueNumber: Double = js.native
  
  var xmsAcceleratorKey: String = js.native
}
