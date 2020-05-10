package typingsSlinky.reactFlatpickr.components

import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.Attr
import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.DOMTokenList
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.FileList
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HTMLAnchorElement
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
import typingsSlinky.flatpickr.globalsMod._Global_.Date
import typingsSlinky.flatpickr.instanceMod.Instance
import typingsSlinky.flatpickr.mod.flatpickr.Options.Options
import typingsSlinky.reactFlatpickr.OmitDateTimePickerPropsop
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
import typingsSlinky.std.Document_
import typingsSlinky.std.Event_
import typingsSlinky.std.HTMLCollectionOf
import typingsSlinky.std.HTMLSlotElement
import typingsSlinky.std.InsertPosition
import typingsSlinky.std.Keyframe
import typingsSlinky.std.SecurityPolicyViolationEvent
import typingsSlinky.std.ShadowRoot
import typingsSlinky.std.ShadowRootInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
      value: (fullscreenchange, /* listener */ js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]) => Unit
    ): this.type = set("addEventListener", js.Any.fromFunction2(value))
    @scala.inline
    def after(value: /* repeated */ Node | String => Unit): this.type = set("after", js.Any.fromFunction1(value))
    @scala.inline
    def align(value: String): this.type = set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def alt(value: String): this.type = set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def animate(value: /* keyframes */ js.Array[Keyframe] => Animation): this.type = set("animate", js.Any.fromFunction1(value))
    @scala.inline
    def append(value: /* repeated */ Node | String => Unit): this.type = set("append", js.Any.fromFunction1(value))
    @scala.inline
    def appendChild(value: /* newChild */ Node => Node): this.type = set("appendChild", js.Any.fromFunction1(value))
    @scala.inline
    def assignedSlot(value: HTMLSlotElement): this.type = set("assignedSlot", value.asInstanceOf[js.Any])
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
    def contains(value: /* other */ Node => Boolean): this.type = set("contains", js.Any.fromFunction1(value))
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
    def dispatchEvent(value: /* event */ Event_ => Boolean): this.type = set("dispatchEvent", js.Any.fromFunction1(value))
    @scala.inline
    def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def files(value: FileList): this.type = set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def firstChild(value: ChildNode): this.type = set("firstChild", value.asInstanceOf[js.Any])
    @scala.inline
    def firstElementChild(value: Element): this.type = set("firstElementChild", value.asInstanceOf[js.Any])
    @scala.inline
    def focus(value: () => Unit): this.type = set("focus", js.Any.fromFunction0(value))
    @scala.inline
    def form(value: HTMLFormElement): this.type = set("form", value.asInstanceOf[js.Any])
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
    def insertBefore(value: (/* newChild */ Node, /* refChild */ Node) => Node): this.type = set("insertBefore", js.Any.fromFunction2(value))
    @scala.inline
    def isConnected(value: Boolean): this.type = set("isConnected", value.asInstanceOf[js.Any])
    @scala.inline
    def isContentEditable(value: Boolean): this.type = set("isContentEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def isDefaultNamespace(value: /* namespace */ String => Boolean): this.type = set("isDefaultNamespace", js.Any.fromFunction1(value))
    @scala.inline
    def isEqualNode(value: /* otherNode */ Node => Boolean): this.type = set("isEqualNode", js.Any.fromFunction1(value))
    @scala.inline
    def isSameNode(value: /* otherNode */ Node => Boolean): this.type = set("isSameNode", js.Any.fromFunction1(value))
    @scala.inline
    def labels(value: NodeListOf[HTMLLabelElement with Node]): this.type = set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def lastChild(value: ChildNode): this.type = set("lastChild", value.asInstanceOf[js.Any])
    @scala.inline
    def lastElementChild(value: Element): this.type = set("lastElementChild", value.asInstanceOf[js.Any])
    @scala.inline
    def list(value: HTMLElement): this.type = set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def localName(value: String): this.type = set("localName", value.asInstanceOf[js.Any])
    @scala.inline
    def lookupNamespaceURI(value: /* prefix */ String => String | Null): this.type = set("lookupNamespaceURI", js.Any.fromFunction1(value))
    @scala.inline
    def lookupPrefix(value: /* namespace */ String => String | Null): this.type = set("lookupPrefix", js.Any.fromFunction1(value))
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
    def nextElementSibling(value: Element): this.type = set("nextElementSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def nextSibling(value: ChildNode): this.type = set("nextSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def nodeName(value: String): this.type = set("nodeName", value.asInstanceOf[js.Any])
    @scala.inline
    def nodeType(value: Double): this.type = set("nodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def nodeValue(value: String): this.type = set("nodeValue", value.asInstanceOf[js.Any])
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
    def onanimationcancel(value: js.ThisFunction1[DateTimePickerProps, /* ev */ AnimationEvent, _]): this.type = set("onanimationcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def onanimationend(value: js.ThisFunction1[DateTimePickerProps, /* ev */ AnimationEvent, _]): this.type = set("onanimationend", value.asInstanceOf[js.Any])
    @scala.inline
    def onanimationiteration(value: js.ThisFunction1[DateTimePickerProps, /* ev */ AnimationEvent, _]): this.type = set("onanimationiteration", value.asInstanceOf[js.Any])
    @scala.inline
    def onanimationstart(value: js.ThisFunction1[DateTimePickerProps, /* ev */ AnimationEvent, _]): this.type = set("onanimationstart", value.asInstanceOf[js.Any])
    @scala.inline
    def onauxclick(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _]): this.type = set("onauxclick", value.asInstanceOf[js.Any])
    @scala.inline
    def onblur(value: js.ThisFunction1[DateTimePickerProps, /* ev */ FocusEvent, _]): this.type = set("onblur", value.asInstanceOf[js.Any])
    @scala.inline
    def oncancel(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("oncancel", value.asInstanceOf[js.Any])
    @scala.inline
    def oncanplay(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("oncanplay", value.asInstanceOf[js.Any])
    @scala.inline
    def oncanplaythrough(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("oncanplaythrough", value.asInstanceOf[js.Any])
    @scala.inline
    def onclick(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _]): this.type = set("onclick", value.asInstanceOf[js.Any])
    @scala.inline
    def oncontextmenu(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _]): this.type = set("oncontextmenu", value.asInstanceOf[js.Any])
    @scala.inline
    def oncopy(value: js.ThisFunction1[DateTimePickerProps, /* ev */ ClipboardEvent, _]): this.type = set("oncopy", value.asInstanceOf[js.Any])
    @scala.inline
    def oncuechange(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("oncuechange", value.asInstanceOf[js.Any])
    @scala.inline
    def oncut(value: js.ThisFunction1[DateTimePickerProps, /* ev */ ClipboardEvent, _]): this.type = set("oncut", value.asInstanceOf[js.Any])
    @scala.inline
    def ondblclick(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _]): this.type = set("ondblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def ondrag(value: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _]): this.type = set("ondrag", value.asInstanceOf[js.Any])
    @scala.inline
    def ondragend(value: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _]): this.type = set("ondragend", value.asInstanceOf[js.Any])
    @scala.inline
    def ondragenter(value: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _]): this.type = set("ondragenter", value.asInstanceOf[js.Any])
    @scala.inline
    def ondragexit(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("ondragexit", value.asInstanceOf[js.Any])
    @scala.inline
    def ondragleave(value: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _]): this.type = set("ondragleave", value.asInstanceOf[js.Any])
    @scala.inline
    def ondragover(value: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _]): this.type = set("ondragover", value.asInstanceOf[js.Any])
    @scala.inline
    def ondragstart(value: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _]): this.type = set("ondragstart", value.asInstanceOf[js.Any])
    @scala.inline
    def ondrop(value: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _]): this.type = set("ondrop", value.asInstanceOf[js.Any])
    @scala.inline
    def ondurationchange(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("ondurationchange", value.asInstanceOf[js.Any])
    @scala.inline
    def onemptied(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("onemptied", value.asInstanceOf[js.Any])
    @scala.inline
    def onended(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("onended", value.asInstanceOf[js.Any])
    @scala.inline
    def onerror(
      value: (/* event */ Event_ | String, /* source */ js.UndefOr[String], /* lineno */ js.UndefOr[Double], /* colno */ js.UndefOr[Double], /* error */ js.UndefOr[js.Error]) => js.Any
    ): this.type = set("onerror", js.Any.fromFunction5(value))
    @scala.inline
    def onerrorNull: this.type = set("onerror", null)
    @scala.inline
    def onfocus(value: js.ThisFunction1[DateTimePickerProps, /* ev */ FocusEvent, _]): this.type = set("onfocus", value.asInstanceOf[js.Any])
    @scala.inline
    def onfullscreenchange(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("onfullscreenchange", value.asInstanceOf[js.Any])
    @scala.inline
    def onfullscreenerror(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("onfullscreenerror", value.asInstanceOf[js.Any])
    @scala.inline
    def ongotpointercapture(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _]): this.type = set("ongotpointercapture", value.asInstanceOf[js.Any])
    @scala.inline
    def oninput(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("oninput", value.asInstanceOf[js.Any])
    @scala.inline
    def oninvalid(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("oninvalid", value.asInstanceOf[js.Any])
    @scala.inline
    def onkeydown(value: js.ThisFunction1[DateTimePickerProps, /* ev */ KeyboardEvent, _]): this.type = set("onkeydown", value.asInstanceOf[js.Any])
    @scala.inline
    def onkeypress(value: js.ThisFunction1[DateTimePickerProps, /* ev */ KeyboardEvent, _]): this.type = set("onkeypress", value.asInstanceOf[js.Any])
    @scala.inline
    def onkeyup(value: js.ThisFunction1[DateTimePickerProps, /* ev */ KeyboardEvent, _]): this.type = set("onkeyup", value.asInstanceOf[js.Any])
    @scala.inline
    def onload(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("onload", value.asInstanceOf[js.Any])
    @scala.inline
    def onloadeddata(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("onloadeddata", value.asInstanceOf[js.Any])
    @scala.inline
    def onloadedmetadata(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("onloadedmetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def onloadstart(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("onloadstart", value.asInstanceOf[js.Any])
    @scala.inline
    def onlostpointercapture(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _]): this.type = set("onlostpointercapture", value.asInstanceOf[js.Any])
    @scala.inline
    def onmousedown(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _]): this.type = set("onmousedown", value.asInstanceOf[js.Any])
    @scala.inline
    def onmouseenter(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _]): this.type = set("onmouseenter", value.asInstanceOf[js.Any])
    @scala.inline
    def onmouseleave(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _]): this.type = set("onmouseleave", value.asInstanceOf[js.Any])
    @scala.inline
    def onmousemove(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _]): this.type = set("onmousemove", value.asInstanceOf[js.Any])
    @scala.inline
    def onmouseout(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _]): this.type = set("onmouseout", value.asInstanceOf[js.Any])
    @scala.inline
    def onmouseover(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _]): this.type = set("onmouseover", value.asInstanceOf[js.Any])
    @scala.inline
    def onmouseup(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _]): this.type = set("onmouseup", value.asInstanceOf[js.Any])
    @scala.inline
    def onpaste(value: js.ThisFunction1[DateTimePickerProps, /* ev */ ClipboardEvent, _]): this.type = set("onpaste", value.asInstanceOf[js.Any])
    @scala.inline
    def onpause(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("onpause", value.asInstanceOf[js.Any])
    @scala.inline
    def onplay(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("onplay", value.asInstanceOf[js.Any])
    @scala.inline
    def onplaying(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("onplaying", value.asInstanceOf[js.Any])
    @scala.inline
    def onpointercancel(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _]): this.type = set("onpointercancel", value.asInstanceOf[js.Any])
    @scala.inline
    def onpointerdown(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _]): this.type = set("onpointerdown", value.asInstanceOf[js.Any])
    @scala.inline
    def onpointerenter(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _]): this.type = set("onpointerenter", value.asInstanceOf[js.Any])
    @scala.inline
    def onpointerleave(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _]): this.type = set("onpointerleave", value.asInstanceOf[js.Any])
    @scala.inline
    def onpointermove(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _]): this.type = set("onpointermove", value.asInstanceOf[js.Any])
    @scala.inline
    def onpointerout(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _]): this.type = set("onpointerout", value.asInstanceOf[js.Any])
    @scala.inline
    def onpointerover(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _]): this.type = set("onpointerover", value.asInstanceOf[js.Any])
    @scala.inline
    def onpointerup(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _]): this.type = set("onpointerup", value.asInstanceOf[js.Any])
    @scala.inline
    def onprogress(value: js.ThisFunction1[DateTimePickerProps, /* ev */ ProgressEvent, _]): this.type = set("onprogress", value.asInstanceOf[js.Any])
    @scala.inline
    def onratechange(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("onratechange", value.asInstanceOf[js.Any])
    @scala.inline
    def onreset(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("onreset", value.asInstanceOf[js.Any])
    @scala.inline
    def onresize(value: js.ThisFunction1[DateTimePickerProps, /* ev */ UIEvent, _]): this.type = set("onresize", value.asInstanceOf[js.Any])
    @scala.inline
    def onscroll(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("onscroll", value.asInstanceOf[js.Any])
    @scala.inline
    def onsecuritypolicyviolation(value: js.ThisFunction1[DateTimePickerProps, /* ev */ SecurityPolicyViolationEvent, _]): this.type = set("onsecuritypolicyviolation", value.asInstanceOf[js.Any])
    @scala.inline
    def onseeked(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("onseeked", value.asInstanceOf[js.Any])
    @scala.inline
    def onseeking(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("onseeking", value.asInstanceOf[js.Any])
    @scala.inline
    def onselect(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("onselect", value.asInstanceOf[js.Any])
    @scala.inline
    def onselectionchange(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("onselectionchange", value.asInstanceOf[js.Any])
    @scala.inline
    def onselectstart(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("onselectstart", value.asInstanceOf[js.Any])
    @scala.inline
    def onstalled(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("onstalled", value.asInstanceOf[js.Any])
    @scala.inline
    def onsubmit(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("onsubmit", value.asInstanceOf[js.Any])
    @scala.inline
    def onsuspend(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("onsuspend", value.asInstanceOf[js.Any])
    @scala.inline
    def ontimeupdate(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("ontimeupdate", value.asInstanceOf[js.Any])
    @scala.inline
    def ontoggle(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("ontoggle", value.asInstanceOf[js.Any])
    @scala.inline
    def ontouchcancel(value: js.ThisFunction1[DateTimePickerProps, /* ev */ TouchEvent, _]): this.type = set("ontouchcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def ontouchend(value: js.ThisFunction1[DateTimePickerProps, /* ev */ TouchEvent, _]): this.type = set("ontouchend", value.asInstanceOf[js.Any])
    @scala.inline
    def ontouchmove(value: js.ThisFunction1[DateTimePickerProps, /* ev */ TouchEvent, _]): this.type = set("ontouchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def ontouchstart(value: js.ThisFunction1[DateTimePickerProps, /* ev */ TouchEvent, _]): this.type = set("ontouchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def ontransitioncancel(value: js.ThisFunction1[DateTimePickerProps, /* ev */ TransitionEvent, _]): this.type = set("ontransitioncancel", value.asInstanceOf[js.Any])
    @scala.inline
    def ontransitionend(value: js.ThisFunction1[DateTimePickerProps, /* ev */ TransitionEvent, _]): this.type = set("ontransitionend", value.asInstanceOf[js.Any])
    @scala.inline
    def ontransitionrun(value: js.ThisFunction1[DateTimePickerProps, /* ev */ TransitionEvent, _]): this.type = set("ontransitionrun", value.asInstanceOf[js.Any])
    @scala.inline
    def ontransitionstart(value: js.ThisFunction1[DateTimePickerProps, /* ev */ TransitionEvent, _]): this.type = set("ontransitionstart", value.asInstanceOf[js.Any])
    @scala.inline
    def onvolumechange(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("onvolumechange", value.asInstanceOf[js.Any])
    @scala.inline
    def onwaiting(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]): this.type = set("onwaiting", value.asInstanceOf[js.Any])
    @scala.inline
    def onwheel(value: js.ThisFunction1[DateTimePickerProps, /* ev */ WheelEvent, _]): this.type = set("onwheel", value.asInstanceOf[js.Any])
    @scala.inline
    def options(value: Options): this.type = set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def outerHTML(value: String): this.type = set("outerHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def ownerDocument(value: Document_): this.type = set("ownerDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def parentElement(value: HTMLElement): this.type = set("parentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def parentNode(value: Node with ParentNode): this.type = set("parentNode", value.asInstanceOf[js.Any])
    @scala.inline
    def pattern(value: String): this.type = set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def prepend(value: /* repeated */ Node | String => Unit): this.type = set("prepend", js.Any.fromFunction1(value))
    @scala.inline
    def previousElementSibling(value: Element): this.type = set("previousElementSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def previousSibling(value: ChildNode): this.type = set("previousSibling", value.asInstanceOf[js.Any])
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
      value: (fullscreenchange, /* listener */ js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]) => Unit
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
    def selectionEnd(value: Double): this.type = set("selectionEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def selectionStart(value: Double): this.type = set("selectionStart", value.asInstanceOf[js.Any])
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
    def valueDate(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: String | js.Date | Double | (js.Array[String | js.Date | Double])): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def valueAsDate(value: js.Date): this.type = set("valueAsDate", value.asInstanceOf[js.Any])
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

