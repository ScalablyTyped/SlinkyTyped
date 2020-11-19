package typingsSlinky.reactFlatpickr.components

import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.Attr
import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.DOMTokenList
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.FileList
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLCollection
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLFormElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLLabelElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.NamedNodeMap
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import org.scalajs.dom.raw.ParentNode
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.ValidityState
import org.scalajs.dom.raw.WheelEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.flatpickr.globalsMod.global.Date
import typingsSlinky.flatpickr.instanceMod.Instance
import typingsSlinky.flatpickr.mod.flatpickr.Options.Options
import typingsSlinky.reactFlatpickr.anon.OmitDateTimePickerPropsop
import typingsSlinky.reactFlatpickr.mod.DateTimePickerProps
import typingsSlinky.reactFlatpickr.mod.default
import typingsSlinky.reactFlatpickr.reactFlatpickrStrings.a
import typingsSlinky.reactFlatpickr.reactFlatpickrStrings.backward
import typingsSlinky.reactFlatpickr.reactFlatpickrStrings.forward
import typingsSlinky.reactFlatpickr.reactFlatpickrStrings.fullscreenchange
import typingsSlinky.reactFlatpickr.reactFlatpickrStrings.httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml
import typingsSlinky.reactFlatpickr.reactFlatpickrStrings.none
import typingsSlinky.std.Animation
import typingsSlinky.std.ChildNode
import typingsSlinky.std.DOMRect
import typingsSlinky.std.DOMRectList
import typingsSlinky.std.DOMStringMap
import typingsSlinky.std.HTMLCollectionOf
import typingsSlinky.std.HTMLSlotElement
import typingsSlinky.std.InsertPosition
import typingsSlinky.std.SecurityPolicyViolationEvent
import typingsSlinky.std.ShadowRoot
import typingsSlinky.std.ShadowRootInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactFlatpickr {
  
  @JSImport("react-flatpickr", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def ATTRIBUTE_NODE(value: Double): this.type = set("ATTRIBUTE_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def CDATA_SECTION_NODE(value: Double): this.type = set("CDATA_SECTION_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def COMMENT_NODE(value: Double): this.type = set("COMMENT_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def DOCUMENT_FRAGMENT_NODE(value: Double): this.type = set("DOCUMENT_FRAGMENT_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def DOCUMENT_NODE(value: Double): this.type = set("DOCUMENT_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def DOCUMENT_POSITION_CONTAINED_BY(value: Double): this.type = set("DOCUMENT_POSITION_CONTAINED_BY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def DOCUMENT_POSITION_CONTAINS(value: Double): this.type = set("DOCUMENT_POSITION_CONTAINS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def DOCUMENT_POSITION_DISCONNECTED(value: Double): this.type = set("DOCUMENT_POSITION_DISCONNECTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def DOCUMENT_POSITION_FOLLOWING(value: Double): this.type = set("DOCUMENT_POSITION_FOLLOWING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC(value: Double): this.type = set("DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def DOCUMENT_POSITION_PRECEDING(value: Double): this.type = set("DOCUMENT_POSITION_PRECEDING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def DOCUMENT_TYPE_NODE(value: Double): this.type = set("DOCUMENT_TYPE_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ELEMENT_NODE(value: Double): this.type = set("ELEMENT_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ENTITY_NODE(value: Double): this.type = set("ENTITY_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ENTITY_REFERENCE_NODE(value: Double): this.type = set("ENTITY_REFERENCE_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def NOTATION_NODE(value: Double): this.type = set("NOTATION_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def PROCESSING_INSTRUCTION_NODE(value: Double): this.type = set("PROCESSING_INSTRUCTION_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def TEXT_NODE(value: Double): this.type = set("TEXT_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accept(value: String): this.type = set("accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessKeyLabel(value: String): this.type = set("accessKeyLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def addEventListener(
      value: (fullscreenchange, /* listener */ js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]) => Unit
    ): this.type = set("addEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def after(value: /* repeated */ Node | String => Unit): this.type = set("after", js.Any.fromFunction1(value))
    
    @scala.inline
    def align(value: String): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alt(value: String): this.type = set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animate(value: () => Animation): this.type = set("animate", js.Any.fromFunction0(value))
    
    @scala.inline
    def append(value: /* repeated */ Node | String => Unit): this.type = set("append", js.Any.fromFunction1(value))
    
    @scala.inline
    def appendChild(value: /* newChild */ Node => Node): this.type = set("appendChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def assignedSlot(value: HTMLSlotElement): this.type = set("assignedSlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def assignedSlotNull: this.type = set("assignedSlot", null)
    
    @scala.inline
    def attachShadow(value: /* init */ ShadowRootInit => ShadowRoot): this.type = set("attachShadow", js.Any.fromFunction1(value))
    
    @scala.inline
    def attributes(value: NamedNodeMap): this.type = set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autocapitalize(value: String): this.type = set("autocapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autocomplete(value: String): this.type = set("autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autofocus(value: Boolean): this.type = set("autofocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def baseURI(value: String): this.type = set("baseURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def before(value: /* repeated */ Node | String => Unit): this.type = set("before", js.Any.fromFunction1(value))
    
    @scala.inline
    def blur(value: () => Unit): this.type = set("blur", js.Any.fromFunction0(value))
    
    @scala.inline
    def checkValidity(value: () => Boolean): this.type = set("checkValidity", js.Any.fromFunction0(value))
    
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childElementCount(value: Double): this.type = set("childElementCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childNodes(value: NodeListOf[ChildNode with Node]): this.type = set("childNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def children(value: HTMLCollection): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def classList(value: DOMTokenList): this.type = set("classList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def click(value: () => Unit): this.type = set("click", js.Any.fromFunction0(value))
    
    @scala.inline
    def clientHeight(value: Double): this.type = set("clientHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clientLeft(value: Double): this.type = set("clientLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clientTop(value: Double): this.type = set("clientTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clientWidth(value: Double): this.type = set("clientWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cloneNode(value: () => Node): this.type = set("cloneNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def closest(value: a => HTMLAnchorElement | Null): this.type = set("closest", js.Any.fromFunction1(value))
    
    @scala.inline
    def compareDocumentPosition(value: /* other */ Node => Double): this.type = set("compareDocumentPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def contains(value: () => Boolean): this.type = set("contains", js.Any.fromFunction0(value))
    
    @scala.inline
    def contentEditable(value: String): this.type = set("contentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataset(value: DOMStringMap): this.type = set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dirName(value: String): this.type = set("dirName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dispatchEvent(value: /* event */ Event => Boolean): this.type = set("dispatchEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def files(value: FileList): this.type = set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filesNull: this.type = set("files", null)
    
    @scala.inline
    def firstChild(value: ChildNode): this.type = set("firstChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def firstChildNull: this.type = set("firstChild", null)
    
    @scala.inline
    def firstElementChild(value: Element): this.type = set("firstElementChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def firstElementChildNull: this.type = set("firstElementChild", null)
    
    @scala.inline
    def focus(value: () => Unit): this.type = set("focus", js.Any.fromFunction0(value))
    
    @scala.inline
    def form(value: HTMLFormElement): this.type = set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formNull: this.type = set("form", null)
    
    @scala.inline
    def formAction(value: String): this.type = set("formAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formEnctype(value: String): this.type = set("formEnctype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formMethod(value: String): this.type = set("formMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formNoValidate(value: Boolean): this.type = set("formNoValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formTarget(value: String): this.type = set("formTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getAnimations(value: () => js.Array[Animation]): this.type = set("getAnimations", js.Any.fromFunction0(value))
    
    @scala.inline
    def getAttribute(value: /* qualifiedName */ String => String | Null): this.type = set("getAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def getAttributeNS(value: (/* namespace */ String, /* localName */ String) => String | Null): this.type = set("getAttributeNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def getAttributeNames(value: () => js.Array[String]): this.type = set("getAttributeNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def getAttributeNode(value: /* name */ String => Attr | Null): this.type = set("getAttributeNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def getAttributeNodeNS(value: (/* namespaceURI */ String, /* localName */ String) => Attr | Null): this.type = set("getAttributeNodeNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def getBoundingClientRect(value: () => DOMRect): this.type = set("getBoundingClientRect", js.Any.fromFunction0(value))
    
    @scala.inline
    def getClientRects(value: () => DOMRectList): this.type = set("getClientRects", js.Any.fromFunction0(value))
    
    @scala.inline
    def getElementsByClassName(value: /* classNames */ String => HTMLCollectionOf[Element]): this.type = set("getElementsByClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def getElementsByTagName(value: a => HTMLCollectionOf[HTMLAnchorElement]): this.type = set("getElementsByTagName", js.Any.fromFunction1(value))
    
    @scala.inline
    def getElementsByTagNameNS(
      value: (httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, /* localName */ String) => HTMLCollectionOf[HTMLElement]
    ): this.type = set("getElementsByTagNameNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def getRootNode(value: () => Node): this.type = set("getRootNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def hasAttribute(value: /* qualifiedName */ String => Boolean): this.type = set("hasAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def hasAttributeNS(value: (/* namespace */ String, /* localName */ String) => Boolean): this.type = set("hasAttributeNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def hasAttributes(value: () => Boolean): this.type = set("hasAttributes", js.Any.fromFunction0(value))
    
    @scala.inline
    def hasChildNodes(value: () => Boolean): this.type = set("hasChildNodes", js.Any.fromFunction0(value))
    
    @scala.inline
    def hasPointerCapture(value: /* pointerId */ Double => Boolean): this.type = set("hasPointerCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def indeterminate(value: Boolean): this.type = set("indeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerHTML(value: String): this.type = set("innerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerText(value: String): this.type = set("innerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputMode(value: String): this.type = set("inputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def insertAdjacentElement(value: (/* position */ InsertPosition, /* insertedElement */ Element) => Element | Null): this.type = set("insertAdjacentElement", js.Any.fromFunction2(value))
    
    @scala.inline
    def insertAdjacentHTML(value: (/* where */ InsertPosition, /* html */ String) => Unit): this.type = set("insertAdjacentHTML", js.Any.fromFunction2(value))
    
    @scala.inline
    def insertAdjacentText(value: (/* where */ InsertPosition, /* text */ String) => Unit): this.type = set("insertAdjacentText", js.Any.fromFunction2(value))
    
    @scala.inline
    def insertBefore(value: /* newChild */ Node => Node): this.type = set("insertBefore", js.Any.fromFunction1(value))
    
    @scala.inline
    def isConnected(value: Boolean): this.type = set("isConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isContentEditable(value: Boolean): this.type = set("isContentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isDefaultNamespace(value: () => Boolean): this.type = set("isDefaultNamespace", js.Any.fromFunction0(value))
    
    @scala.inline
    def isEqualNode(value: () => Boolean): this.type = set("isEqualNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def isSameNode(value: () => Boolean): this.type = set("isSameNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def labels(value: NodeListOf[HTMLLabelElement with Node]): this.type = set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelsNull: this.type = set("labels", null)
    
    @scala.inline
    def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lastChild(value: ChildNode): this.type = set("lastChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lastChildNull: this.type = set("lastChild", null)
    
    @scala.inline
    def lastElementChild(value: Element): this.type = set("lastElementChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lastElementChildNull: this.type = set("lastElementChild", null)
    
    @scala.inline
    def list(value: HTMLElement): this.type = set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listNull: this.type = set("list", null)
    
    @scala.inline
    def localName(value: String): this.type = set("localName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lookupNamespaceURI(value: () => String | Null): this.type = set("lookupNamespaceURI", js.Any.fromFunction0(value))
    
    @scala.inline
    def lookupPrefix(value: () => String | Null): this.type = set("lookupPrefix", js.Any.fromFunction0(value))
    
    @scala.inline
    def matches(value: /* selectors */ String => Boolean): this.type = set("matches", js.Any.fromFunction1(value))
    
    @scala.inline
    def max(value: String): this.type = set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def min(value: String): this.type = set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minLength(value: Double): this.type = set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def msGetRegionContent(value: () => _): this.type = set("msGetRegionContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def namespaceURI(value: String): this.type = set("namespaceURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def namespaceURINull: this.type = set("namespaceURI", null)
    
    @scala.inline
    def nextElementSibling(value: Element): this.type = set("nextElementSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nextElementSiblingNull: this.type = set("nextElementSibling", null)
    
    @scala.inline
    def nextSibling(value: ChildNode): this.type = set("nextSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nextSiblingNull: this.type = set("nextSibling", null)
    
    @scala.inline
    def nodeName(value: String): this.type = set("nodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nodeType(value: Double): this.type = set("nodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nodeValue(value: String): this.type = set("nodeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nodeValueNull: this.type = set("nodeValue", null)
    
    @scala.inline
    def nonce(value: String): this.type = set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def normalize(value: () => Unit): this.type = set("normalize", js.Any.fromFunction0(value))
    
    @scala.inline
    def offsetHeight(value: Double): this.type = set("offsetHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetLeft(value: Double): this.type = set("offsetLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetParent(value: Element): this.type = set("offsetParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetParentNull: this.type = set("offsetParent", null)
    
    @scala.inline
    def offsetTop(value: Double): this.type = set("offsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetWidth(value: Double): this.type = set("offsetWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): this.type = set("onChange", js.Any.fromFunction4(value))
    
    @scala.inline
    def onClose(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): this.type = set("onClose", js.Any.fromFunction4(value))
    
    @scala.inline
    def onDayCreate(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): this.type = set("onDayCreate", js.Any.fromFunction4(value))
    
    @scala.inline
    def onMonthChange(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): this.type = set("onMonthChange", js.Any.fromFunction4(value))
    
    @scala.inline
    def onOpen(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): this.type = set("onOpen", js.Any.fromFunction4(value))
    
    @scala.inline
    def onReady(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): this.type = set("onReady", js.Any.fromFunction4(value))
    
    @scala.inline
    def onValueUpdate(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): this.type = set("onValueUpdate", js.Any.fromFunction4(value))
    
    @scala.inline
    def onYearChange(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): this.type = set("onYearChange", js.Any.fromFunction4(value))
    
    @scala.inline
    def onabort(value: js.ThisFunction1[DateTimePickerProps, /* ev */ UIEvent, _]): this.type = set("onabort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onabortNull: this.type = set("onabort", null)
    
    @scala.inline
    def onanimationcancel(value: js.ThisFunction1[DateTimePickerProps, /* ev */ AnimationEvent, _]): this.type = set("onanimationcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onanimationcancelNull: this.type = set("onanimationcancel", null)
    
    @scala.inline
    def onanimationend(value: js.ThisFunction1[DateTimePickerProps, /* ev */ AnimationEvent, _]): this.type = set("onanimationend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onanimationendNull: this.type = set("onanimationend", null)
    
    @scala.inline
    def onanimationiteration(value: js.ThisFunction1[DateTimePickerProps, /* ev */ AnimationEvent, _]): this.type = set("onanimationiteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onanimationiterationNull: this.type = set("onanimationiteration", null)
    
    @scala.inline
    def onanimationstart(value: js.ThisFunction1[DateTimePickerProps, /* ev */ AnimationEvent, _]): this.type = set("onanimationstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onanimationstartNull: this.type = set("onanimationstart", null)
    
    @scala.inline
    def onauxclick(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _]): this.type = set("onauxclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onauxclickNull: this.type = set("onauxclick", null)
    
    @scala.inline
    def onblur(value: js.ThisFunction1[DateTimePickerProps, /* ev */ FocusEvent, _]): this.type = set("onblur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onblurNull: this.type = set("onblur", null)
    
    @scala.inline
    def oncancel(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("oncancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def oncancelNull: this.type = set("oncancel", null)
    
    @scala.inline
    def oncanplay(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("oncanplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def oncanplayNull: this.type = set("oncanplay", null)
    
    @scala.inline
    def oncanplaythrough(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("oncanplaythrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def oncanplaythroughNull: this.type = set("oncanplaythrough", null)
    
    @scala.inline
    def onchangeNull: this.type = set("onchange", null)
    
    @scala.inline
    def onclick(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _]): this.type = set("onclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onclickNull: this.type = set("onclick", null)
    
    @scala.inline
    def oncloseNull: this.type = set("onclose", null)
    
    @scala.inline
    def oncontextmenu(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _]): this.type = set("oncontextmenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def oncontextmenuNull: this.type = set("oncontextmenu", null)
    
    @scala.inline
    def oncopy(value: js.ThisFunction1[DateTimePickerProps, /* ev */ ClipboardEvent, _]): this.type = set("oncopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def oncopyNull: this.type = set("oncopy", null)
    
    @scala.inline
    def oncuechange(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("oncuechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def oncuechangeNull: this.type = set("oncuechange", null)
    
    @scala.inline
    def oncut(value: js.ThisFunction1[DateTimePickerProps, /* ev */ ClipboardEvent, _]): this.type = set("oncut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def oncutNull: this.type = set("oncut", null)
    
    @scala.inline
    def ondblclick(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _]): this.type = set("ondblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ondblclickNull: this.type = set("ondblclick", null)
    
    @scala.inline
    def ondrag(value: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _]): this.type = set("ondrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ondragNull: this.type = set("ondrag", null)
    
    @scala.inline
    def ondragend(value: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _]): this.type = set("ondragend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ondragendNull: this.type = set("ondragend", null)
    
    @scala.inline
    def ondragenter(value: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _]): this.type = set("ondragenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ondragenterNull: this.type = set("ondragenter", null)
    
    @scala.inline
    def ondragexit(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("ondragexit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ondragexitNull: this.type = set("ondragexit", null)
    
    @scala.inline
    def ondragleave(value: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _]): this.type = set("ondragleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ondragleaveNull: this.type = set("ondragleave", null)
    
    @scala.inline
    def ondragover(value: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _]): this.type = set("ondragover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ondragoverNull: this.type = set("ondragover", null)
    
    @scala.inline
    def ondragstart(value: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _]): this.type = set("ondragstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ondragstartNull: this.type = set("ondragstart", null)
    
    @scala.inline
    def ondrop(value: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _]): this.type = set("ondrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ondropNull: this.type = set("ondrop", null)
    
    @scala.inline
    def ondurationchange(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("ondurationchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ondurationchangeNull: this.type = set("ondurationchange", null)
    
    @scala.inline
    def onemptied(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("onemptied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onemptiedNull: this.type = set("onemptied", null)
    
    @scala.inline
    def onended(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("onended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onendedNull: this.type = set("onended", null)
    
    @scala.inline
    def onerror(
      value: (/* event */ Event | String, /* source */ js.UndefOr[String], /* lineno */ js.UndefOr[Double], /* colno */ js.UndefOr[Double], /* error */ js.UndefOr[js.Error]) => js.Any
    ): this.type = set("onerror", js.Any.fromFunction5(value))
    
    @scala.inline
    def onerrorNull: this.type = set("onerror", null)
    
    @scala.inline
    def onfocus(value: js.ThisFunction1[DateTimePickerProps, /* ev */ FocusEvent, _]): this.type = set("onfocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onfocusNull: this.type = set("onfocus", null)
    
    @scala.inline
    def onfullscreenchange(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("onfullscreenchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onfullscreenchangeNull: this.type = set("onfullscreenchange", null)
    
    @scala.inline
    def onfullscreenerror(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("onfullscreenerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onfullscreenerrorNull: this.type = set("onfullscreenerror", null)
    
    @scala.inline
    def ongotpointercapture(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _]): this.type = set("ongotpointercapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ongotpointercaptureNull: this.type = set("ongotpointercapture", null)
    
    @scala.inline
    def oninput(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("oninput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def oninputNull: this.type = set("oninput", null)
    
    @scala.inline
    def oninvalid(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("oninvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def oninvalidNull: this.type = set("oninvalid", null)
    
    @scala.inline
    def onkeydown(value: js.ThisFunction1[DateTimePickerProps, /* ev */ KeyboardEvent, _]): this.type = set("onkeydown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onkeydownNull: this.type = set("onkeydown", null)
    
    @scala.inline
    def onkeypress(value: js.ThisFunction1[DateTimePickerProps, /* ev */ KeyboardEvent, _]): this.type = set("onkeypress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onkeypressNull: this.type = set("onkeypress", null)
    
    @scala.inline
    def onkeyup(value: js.ThisFunction1[DateTimePickerProps, /* ev */ KeyboardEvent, _]): this.type = set("onkeyup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onkeyupNull: this.type = set("onkeyup", null)
    
    @scala.inline
    def onload(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("onload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onloadNull: this.type = set("onload", null)
    
    @scala.inline
    def onloadeddata(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("onloadeddata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onloadeddataNull: this.type = set("onloadeddata", null)
    
    @scala.inline
    def onloadedmetadata(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("onloadedmetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onloadedmetadataNull: this.type = set("onloadedmetadata", null)
    
    @scala.inline
    def onloadstart(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("onloadstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onloadstartNull: this.type = set("onloadstart", null)
    
    @scala.inline
    def onlostpointercapture(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _]): this.type = set("onlostpointercapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onlostpointercaptureNull: this.type = set("onlostpointercapture", null)
    
    @scala.inline
    def onmousedown(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _]): this.type = set("onmousedown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onmousedownNull: this.type = set("onmousedown", null)
    
    @scala.inline
    def onmouseenter(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _]): this.type = set("onmouseenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onmouseenterNull: this.type = set("onmouseenter", null)
    
    @scala.inline
    def onmouseleave(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _]): this.type = set("onmouseleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onmouseleaveNull: this.type = set("onmouseleave", null)
    
    @scala.inline
    def onmousemove(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _]): this.type = set("onmousemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onmousemoveNull: this.type = set("onmousemove", null)
    
    @scala.inline
    def onmouseout(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _]): this.type = set("onmouseout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onmouseoutNull: this.type = set("onmouseout", null)
    
    @scala.inline
    def onmouseover(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _]): this.type = set("onmouseover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onmouseoverNull: this.type = set("onmouseover", null)
    
    @scala.inline
    def onmouseup(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _]): this.type = set("onmouseup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onmouseupNull: this.type = set("onmouseup", null)
    
    @scala.inline
    def onpaste(value: js.ThisFunction1[DateTimePickerProps, /* ev */ ClipboardEvent, _]): this.type = set("onpaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onpasteNull: this.type = set("onpaste", null)
    
    @scala.inline
    def onpause(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("onpause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onpauseNull: this.type = set("onpause", null)
    
    @scala.inline
    def onplay(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("onplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onplayNull: this.type = set("onplay", null)
    
    @scala.inline
    def onplaying(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("onplaying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onplayingNull: this.type = set("onplaying", null)
    
    @scala.inline
    def onpointercancel(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _]): this.type = set("onpointercancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onpointercancelNull: this.type = set("onpointercancel", null)
    
    @scala.inline
    def onpointerdown(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _]): this.type = set("onpointerdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onpointerdownNull: this.type = set("onpointerdown", null)
    
    @scala.inline
    def onpointerenter(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _]): this.type = set("onpointerenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onpointerenterNull: this.type = set("onpointerenter", null)
    
    @scala.inline
    def onpointerleave(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _]): this.type = set("onpointerleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onpointerleaveNull: this.type = set("onpointerleave", null)
    
    @scala.inline
    def onpointermove(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _]): this.type = set("onpointermove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onpointermoveNull: this.type = set("onpointermove", null)
    
    @scala.inline
    def onpointerout(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _]): this.type = set("onpointerout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onpointeroutNull: this.type = set("onpointerout", null)
    
    @scala.inline
    def onpointerover(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _]): this.type = set("onpointerover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onpointeroverNull: this.type = set("onpointerover", null)
    
    @scala.inline
    def onpointerup(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _]): this.type = set("onpointerup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onpointerupNull: this.type = set("onpointerup", null)
    
    @scala.inline
    def onprogress(value: js.ThisFunction1[DateTimePickerProps, /* ev */ ProgressEvent, _]): this.type = set("onprogress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onprogressNull: this.type = set("onprogress", null)
    
    @scala.inline
    def onratechange(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("onratechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onratechangeNull: this.type = set("onratechange", null)
    
    @scala.inline
    def onreset(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("onreset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onresetNull: this.type = set("onreset", null)
    
    @scala.inline
    def onresize(value: js.ThisFunction1[DateTimePickerProps, /* ev */ UIEvent, _]): this.type = set("onresize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onresizeNull: this.type = set("onresize", null)
    
    @scala.inline
    def onscroll(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("onscroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onscrollNull: this.type = set("onscroll", null)
    
    @scala.inline
    def onsecuritypolicyviolation(value: js.ThisFunction1[DateTimePickerProps, /* ev */ SecurityPolicyViolationEvent, _]): this.type = set("onsecuritypolicyviolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onsecuritypolicyviolationNull: this.type = set("onsecuritypolicyviolation", null)
    
    @scala.inline
    def onseeked(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("onseeked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onseekedNull: this.type = set("onseeked", null)
    
    @scala.inline
    def onseeking(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("onseeking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onseekingNull: this.type = set("onseeking", null)
    
    @scala.inline
    def onselect(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("onselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onselectNull: this.type = set("onselect", null)
    
    @scala.inline
    def onselectionchange(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("onselectionchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onselectionchangeNull: this.type = set("onselectionchange", null)
    
    @scala.inline
    def onselectstart(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("onselectstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onselectstartNull: this.type = set("onselectstart", null)
    
    @scala.inline
    def onstalled(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("onstalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onstalledNull: this.type = set("onstalled", null)
    
    @scala.inline
    def onsubmit(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("onsubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onsubmitNull: this.type = set("onsubmit", null)
    
    @scala.inline
    def onsuspend(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("onsuspend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onsuspendNull: this.type = set("onsuspend", null)
    
    @scala.inline
    def ontimeupdate(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("ontimeupdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ontimeupdateNull: this.type = set("ontimeupdate", null)
    
    @scala.inline
    def ontoggle(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("ontoggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ontoggleNull: this.type = set("ontoggle", null)
    
    @scala.inline
    def ontouchcancel(value: js.ThisFunction1[DateTimePickerProps, /* ev */ TouchEvent, _]): this.type = set("ontouchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ontouchcancelNull: this.type = set("ontouchcancel", null)
    
    @scala.inline
    def ontouchend(value: js.ThisFunction1[DateTimePickerProps, /* ev */ TouchEvent, _]): this.type = set("ontouchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ontouchendNull: this.type = set("ontouchend", null)
    
    @scala.inline
    def ontouchmove(value: js.ThisFunction1[DateTimePickerProps, /* ev */ TouchEvent, _]): this.type = set("ontouchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ontouchmoveNull: this.type = set("ontouchmove", null)
    
    @scala.inline
    def ontouchstart(value: js.ThisFunction1[DateTimePickerProps, /* ev */ TouchEvent, _]): this.type = set("ontouchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ontouchstartNull: this.type = set("ontouchstart", null)
    
    @scala.inline
    def ontransitioncancel(value: js.ThisFunction1[DateTimePickerProps, /* ev */ TransitionEvent, _]): this.type = set("ontransitioncancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ontransitioncancelNull: this.type = set("ontransitioncancel", null)
    
    @scala.inline
    def ontransitionend(value: js.ThisFunction1[DateTimePickerProps, /* ev */ TransitionEvent, _]): this.type = set("ontransitionend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ontransitionendNull: this.type = set("ontransitionend", null)
    
    @scala.inline
    def ontransitionrun(value: js.ThisFunction1[DateTimePickerProps, /* ev */ TransitionEvent, _]): this.type = set("ontransitionrun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ontransitionrunNull: this.type = set("ontransitionrun", null)
    
    @scala.inline
    def ontransitionstart(value: js.ThisFunction1[DateTimePickerProps, /* ev */ TransitionEvent, _]): this.type = set("ontransitionstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ontransitionstartNull: this.type = set("ontransitionstart", null)
    
    @scala.inline
    def onvolumechange(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("onvolumechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onvolumechangeNull: this.type = set("onvolumechange", null)
    
    @scala.inline
    def onwaiting(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]): this.type = set("onwaiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onwaitingNull: this.type = set("onwaiting", null)
    
    @scala.inline
    def onwheel(value: js.ThisFunction1[DateTimePickerProps, /* ev */ WheelEvent, _]): this.type = set("onwheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onwheelNull: this.type = set("onwheel", null)
    
    @scala.inline
    def options(value: Options): this.type = set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def outerHTML(value: String): this.type = set("outerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ownerDocument(value: Document): this.type = set("ownerDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def parentElement(value: HTMLElement): this.type = set("parentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def parentElementNull: this.type = set("parentElement", null)
    
    @scala.inline
    def parentNode(value: Node with ParentNode): this.type = set("parentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def parentNodeNull: this.type = set("parentNode", null)
    
    @scala.inline
    def pattern(value: String): this.type = set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixNull: this.type = set("prefix", null)
    
    @scala.inline
    def prepend(value: /* repeated */ Node | String => Unit): this.type = set("prepend", js.Any.fromFunction1(value))
    
    @scala.inline
    def previousElementSibling(value: Element): this.type = set("previousElementSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def previousElementSiblingNull: this.type = set("previousElementSibling", null)
    
    @scala.inline
    def previousSibling(value: ChildNode): this.type = set("previousSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def previousSiblingNull: this.type = set("previousSibling", null)
    
    @scala.inline
    def querySelector(value: a => HTMLAnchorElement | Null): this.type = set("querySelector", js.Any.fromFunction1(value))
    
    @scala.inline
    def querySelectorAll(value: a => NodeListOf[HTMLAnchorElement with Node]): this.type = set("querySelectorAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def releasePointerCapture(value: /* pointerId */ Double => Unit): this.type = set("releasePointerCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def remove(value: () => Unit): this.type = set("remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def removeAttribute(value: /* qualifiedName */ String => Unit): this.type = set("removeAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def removeAttributeNS(value: (/* namespace */ String, /* localName */ String) => Unit): this.type = set("removeAttributeNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def removeAttributeNode(value: /* attr */ Attr => Attr): this.type = set("removeAttributeNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def removeChild(value: /* oldChild */ Node => Node): this.type = set("removeChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def removeEventListener(
      value: (fullscreenchange, /* listener */ js.ThisFunction1[DateTimePickerProps, /* ev */ Event, _]) => Unit
    ): this.type = set("removeEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def render(
      value: (/* props */ OmitDateTimePickerPropsop, /* ref */ js.Function1[/* node */ HTMLInputElement, Unit]) => ReactElement
    ): this.type = set("render", js.Any.fromFunction2(value))
    
    @scala.inline
    def replaceChild(value: (/* newChild */ Node, /* oldChild */ Node) => Node): this.type = set("replaceChild", js.Any.fromFunction2(value))
    
    @scala.inline
    def replaceWith(value: /* repeated */ Node | String => Unit): this.type = set("replaceWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def reportValidity(value: () => Boolean): this.type = set("reportValidity", js.Any.fromFunction0(value))
    
    @scala.inline
    def requestFullscreen(value: () => js.Promise[Unit]): this.type = set("requestFullscreen", js.Any.fromFunction0(value))
    
    @scala.inline
    def requestPointerLock(value: () => Unit): this.type = set("requestPointerLock", js.Any.fromFunction0(value))
    
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scroll(value: () => Unit): this.type = set("scroll", js.Any.fromFunction0(value))
    
    @scala.inline
    def scrollBy(value: () => Unit): this.type = set("scrollBy", js.Any.fromFunction0(value))
    
    @scala.inline
    def scrollHeight(value: Double): this.type = set("scrollHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollIntoView(value: () => Unit): this.type = set("scrollIntoView", js.Any.fromFunction0(value))
    
    @scala.inline
    def scrollLeft(value: Double): this.type = set("scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollTo(value: () => Unit): this.type = set("scrollTo", js.Any.fromFunction0(value))
    
    @scala.inline
    def scrollTop(value: Double): this.type = set("scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollWidth(value: Double): this.type = set("scrollWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def select(value: () => Unit): this.type = set("select", js.Any.fromFunction0(value))
    
    @scala.inline
    def selectionDirection(value: forward | backward | none): this.type = set("selectionDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectionDirectionNull: this.type = set("selectionDirection", null)
    
    @scala.inline
    def selectionEnd(value: Double): this.type = set("selectionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectionEndNull: this.type = set("selectionEnd", null)
    
    @scala.inline
    def selectionStart(value: Double): this.type = set("selectionStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectionStartNull: this.type = set("selectionStart", null)
    
    @scala.inline
    def setAttribute(value: (/* qualifiedName */ String, /* value */ String) => Unit): this.type = set("setAttribute", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAttributeNS(value: (/* namespace */ String, /* qualifiedName */ String, /* value */ String) => Unit): this.type = set("setAttributeNS", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAttributeNode(value: /* attr */ Attr => Attr | Null): this.type = set("setAttributeNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAttributeNodeNS(value: /* attr */ Attr => Attr | Null): this.type = set("setAttributeNodeNS", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomValidity(value: /* error */ String => Unit): this.type = set("setCustomValidity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointerCapture(value: /* pointerId */ Double => Unit): this.type = set("setPointerCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRangeText(value: /* replacement */ String => Unit): this.type = set("setRangeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectionRange(value: (/* start */ Double, /* end */ Double) => Unit): this.type = set("setSelectionRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def shadowRoot(value: ShadowRoot): this.type = set("shadowRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shadowRootNull: this.type = set("shadowRoot", null)
    
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def spellcheck(value: Boolean): this.type = set("spellcheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def step(value: String): this.type = set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stepDown(value: () => Unit): this.type = set("stepDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def stepUp(value: () => Unit): this.type = set("stepUp", js.Any.fromFunction0(value))
    
    @scala.inline
    def style(value: CSSStyleDeclaration): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tagName(value: String): this.type = set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textContent(value: String): this.type = set("textContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textContentNull: this.type = set("textContent", null)
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def toggleAttribute(value: /* qualifiedName */ String => Boolean): this.type = set("toggleAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def translate(value: Boolean): this.type = set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useMap(value: String): this.type = set("useMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def validationMessage(value: String): this.type = set("validationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def validity(value: ValidityState): this.type = set("validity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueVarargs(value: (String | js.Date | Double)*): this.type = set("value", js.Array(value :_*))
    
    @scala.inline
    def valueDate(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: String | js.Date | Double | (js.Array[String | js.Date | Double])): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueAsDate(value: js.Date): this.type = set("valueAsDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueAsDateNull: this.type = set("valueAsDate", null)
    
    @scala.inline
    def valueAsNumber(value: Double): this.type = set("valueAsNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def webkitMatchesSelector(value: /* selectors */ String => Boolean): this.type = set("webkitMatchesSelector", js.Any.fromFunction1(value))
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def willValidate(value: Boolean): this.type = set("willValidate", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DateTimePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactFlatpickr.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
