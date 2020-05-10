package typingsSlinky.reactPlotlyJs

import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.Attr
import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.DOMTokenList
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLCollection
import org.scalajs.dom.raw.HTMLElement
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
import org.scalajs.dom.raw.WheelEvent
import typingsSlinky.reactPlotlyJs.reactPlotlyJsStrings.a
import typingsSlinky.reactPlotlyJs.reactPlotlyJsStrings.fullscreenchange
import typingsSlinky.reactPlotlyJs.reactPlotlyJsStrings.httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml
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
import typingsSlinky.std.OnErrorEventHandler
import typingsSlinky.std.SecurityPolicyViolationEvent
import typingsSlinky.std.ShadowRoot
import typingsSlinky.std.ShadowRootInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.HTMLElement> */
@js.native
trait ReadonlyHTMLElement extends js.Object {
  val ATTRIBUTE_NODE: Double = js.native
  val CDATA_SECTION_NODE: Double = js.native
  val COMMENT_NODE: Double = js.native
  val DOCUMENT_FRAGMENT_NODE: Double = js.native
  val DOCUMENT_NODE: Double = js.native
  val DOCUMENT_POSITION_CONTAINED_BY: Double = js.native
  val DOCUMENT_POSITION_CONTAINS: Double = js.native
  val DOCUMENT_POSITION_DISCONNECTED: Double = js.native
  val DOCUMENT_POSITION_FOLLOWING: Double = js.native
  val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Double = js.native
  val DOCUMENT_POSITION_PRECEDING: Double = js.native
  val DOCUMENT_TYPE_NODE: Double = js.native
  val ELEMENT_NODE: Double = js.native
  val ENTITY_NODE: Double = js.native
  val ENTITY_REFERENCE_NODE: Double = js.native
  val NOTATION_NODE: Double = js.native
  val PROCESSING_INSTRUCTION_NODE: Double = js.native
  val TEXT_NODE: Double = js.native
  val accessKey: String = js.native
  val accessKeyLabel: String = js.native
  val addEventListener: js.Function2[
    fullscreenchange, 
    /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _], 
    Unit
  ] = js.native
  val after: js.Function1[/* repeated */ Node | String, Unit] = js.native
  val animate: js.Function1[/* keyframes */ js.Array[Keyframe], Animation] = js.native
  val append: js.Function1[/* repeated */ Node | String, Unit] = js.native
  val appendChild: js.Function1[/* newChild */ Node, Node] = js.native
  val assignedSlot: js.UndefOr[HTMLSlotElement] = js.native
  val attachShadow: js.Function1[/* init */ ShadowRootInit, ShadowRoot] = js.native
  val attributes: NamedNodeMap = js.native
  val autocapitalize: String = js.native
  val autofocus: Boolean = js.native
  val baseURI: String = js.native
  val before: js.Function1[/* repeated */ Node | String, Unit] = js.native
  val blur: js.Function0[Unit] = js.native
  val childElementCount: Double = js.native
  val childNodes: NodeListOf[ChildNode with Node] = js.native
  val children: HTMLCollection = js.native
  val classList: DOMTokenList = js.native
  val className: String = js.native
  val click: js.Function0[Unit] = js.native
  val clientHeight: Double = js.native
  val clientLeft: Double = js.native
  val clientTop: Double = js.native
  val clientWidth: Double = js.native
  val cloneNode: js.Function0[Node] = js.native
  val closest: js.Function1[a, HTMLAnchorElement | Null] = js.native
  val compareDocumentPosition: js.Function1[/* other */ Node, Double] = js.native
  val contains: js.Function1[/* other */ Node, Boolean] = js.native
  val contentEditable: String = js.native
  val dataset: DOMStringMap = js.native
  val dir: String = js.native
  val dispatchEvent: js.Function1[/* event */ Event_, Boolean] = js.native
  val draggable: Boolean = js.native
  val firstChild: js.UndefOr[ChildNode] = js.native
  val firstElementChild: js.UndefOr[Element] = js.native
  val focus: js.Function0[Unit] = js.native
  val getAnimations: js.Function0[js.Array[Animation]] = js.native
  val getAttribute: js.Function1[/* qualifiedName */ String, String | Null] = js.native
  val getAttributeNS: js.Function2[/* namespace */ String, /* localName */ String, String | Null] = js.native
  val getAttributeNames: js.Function0[js.Array[String]] = js.native
  val getAttributeNode: js.Function1[/* name */ String, Attr | Null] = js.native
  val getAttributeNodeNS: js.Function2[/* namespaceURI */ String, /* localName */ String, Attr | Null] = js.native
  val getBoundingClientRect: js.Function0[DOMRect] = js.native
  val getClientRects: js.Function0[DOMRectList] = js.native
  val getElementsByClassName: js.Function1[/* classNames */ String, HTMLCollectionOf[Element]] = js.native
  val getElementsByTagName: js.Function1[a, HTMLCollectionOf[HTMLAnchorElement]] = js.native
  val getElementsByTagNameNS: js.Function2[
    httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, 
    /* localName */ String, 
    HTMLCollectionOf[HTMLElement]
  ] = js.native
  val getRootNode: js.Function0[Node] = js.native
  val hasAttribute: js.Function1[/* qualifiedName */ String, Boolean] = js.native
  val hasAttributeNS: js.Function2[/* namespace */ String, /* localName */ String, Boolean] = js.native
  val hasAttributes: js.Function0[Boolean] = js.native
  val hasChildNodes: js.Function0[Boolean] = js.native
  val hasPointerCapture: js.Function1[/* pointerId */ Double, Boolean] = js.native
  val hidden: Boolean = js.native
  val id: String = js.native
  val innerHTML: String = js.native
  val innerText: String = js.native
  val inputMode: String = js.native
  val insertAdjacentElement: js.Function2[/* position */ InsertPosition, /* insertedElement */ Element, Element | Null] = js.native
  val insertAdjacentHTML: js.Function2[/* where */ InsertPosition, /* html */ String, Unit] = js.native
  val insertAdjacentText: js.Function2[/* where */ InsertPosition, /* text */ String, Unit] = js.native
  val insertBefore: js.Function2[/* newChild */ Node, /* refChild */ Node, Node] = js.native
  val isConnected: Boolean = js.native
  val isContentEditable: Boolean = js.native
  val isDefaultNamespace: js.Function1[/* namespace */ String, Boolean] = js.native
  val isEqualNode: js.Function1[/* otherNode */ Node, Boolean] = js.native
  val isSameNode: js.Function1[/* otherNode */ Node, Boolean] = js.native
  val lang: String = js.native
  val lastChild: js.UndefOr[ChildNode] = js.native
  val lastElementChild: js.UndefOr[Element] = js.native
  val localName: String = js.native
  val lookupNamespaceURI: js.Function1[/* prefix */ String, String | Null] = js.native
  val lookupPrefix: js.Function1[/* namespace */ String, String | Null] = js.native
  val matches: js.Function1[/* selectors */ String, Boolean] = js.native
  val msGetRegionContent: js.Function0[_] = js.native
  val namespaceURI: js.UndefOr[String] = js.native
  val nextElementSibling: js.UndefOr[Element] = js.native
  val nextSibling: js.UndefOr[ChildNode] = js.native
  val nodeName: String = js.native
  val nodeType: Double = js.native
  val nodeValue: js.UndefOr[String] = js.native
  val nonce: js.UndefOr[String] = js.native
  val normalize: js.Function0[Unit] = js.native
  val offsetHeight: Double = js.native
  val offsetLeft: Double = js.native
  val offsetParent: js.UndefOr[Element] = js.native
  val offsetTop: Double = js.native
  val offsetWidth: Double = js.native
  val onabort: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]] = js.native
  val onanimationcancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.native
  val onanimationend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.native
  val onanimationiteration: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.native
  val onanimationstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.native
  val onauxclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  val onblur: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]] = js.native
  val oncancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val oncanplay: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val oncanplaythrough: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val onchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val onclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  val onclose: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val oncontextmenu: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  val oncopy: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]] = js.native
  val oncuechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val oncut: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]] = js.native
  val ondblclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  val ondrag: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.native
  val ondragend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.native
  val ondragenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.native
  val ondragexit: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val ondragleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.native
  val ondragover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.native
  val ondragstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.native
  val ondrop: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.native
  val ondurationchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val onemptied: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val onended: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val onerror: OnErrorEventHandler = js.native
  val onfocus: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]] = js.native
  val onfullscreenchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val onfullscreenerror: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val ongotpointercapture: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  val oninput: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val oninvalid: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val onkeydown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.native
  val onkeypress: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.native
  val onkeyup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.native
  val onload: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val onloadeddata: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val onloadedmetadata: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val onloadstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val onlostpointercapture: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  val onmousedown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  val onmouseenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  val onmouseleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  val onmousemove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  val onmouseout: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  val onmouseover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  val onmouseup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  val onpaste: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]] = js.native
  val onpause: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val onplay: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val onplaying: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val onpointercancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  val onpointerdown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  val onpointerenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  val onpointerleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  val onpointermove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  val onpointerout: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  val onpointerover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  val onpointerup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  val onprogress: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]] = js.native
  val onratechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val onreset: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val onresize: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]] = js.native
  val onscroll: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val onsecuritypolicyviolation: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]] = js.native
  val onseeked: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val onseeking: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val onselect: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val onselectionchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val onselectstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val onstalled: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val onsubmit: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val onsuspend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val ontimeupdate: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val ontoggle: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val ontouchcancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.native
  val ontouchend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.native
  val ontouchmove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.native
  val ontouchstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.native
  val ontransitioncancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.native
  val ontransitionend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.native
  val ontransitionrun: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.native
  val ontransitionstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.native
  val onvolumechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val onwaiting: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  val onwheel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]] = js.native
  val outerHTML: String = js.native
  val ownerDocument: js.UndefOr[Document_] = js.native
  val parentElement: js.UndefOr[HTMLElement] = js.native
  val parentNode: js.UndefOr[Node with ParentNode] = js.native
  val prefix: js.UndefOr[String] = js.native
  val prepend: js.Function1[/* repeated */ Node | String, Unit] = js.native
  val previousElementSibling: js.UndefOr[Element] = js.native
  val previousSibling: js.UndefOr[ChildNode] = js.native
  val querySelector: js.Function1[a, HTMLAnchorElement | Null] = js.native
  val querySelectorAll: js.Function1[a, NodeListOf[HTMLAnchorElement with Node]] = js.native
  val releasePointerCapture: js.Function1[/* pointerId */ Double, Unit] = js.native
  val remove: js.Function0[Unit] = js.native
  val removeAttribute: js.Function1[/* qualifiedName */ String, Unit] = js.native
  val removeAttributeNS: js.Function2[/* namespace */ String, /* localName */ String, Unit] = js.native
  val removeAttributeNode: js.Function1[/* attr */ Attr, Attr] = js.native
  val removeChild: js.Function1[/* oldChild */ Node, Node] = js.native
  val removeEventListener: js.Function2[
    fullscreenchange, 
    /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _], 
    Unit
  ] = js.native
  val replaceChild: js.Function2[/* newChild */ Node, /* oldChild */ Node, Node] = js.native
  val replaceWith: js.Function1[/* repeated */ Node | String, Unit] = js.native
  val requestFullscreen: js.Function0[js.Promise[Unit]] = js.native
  val requestPointerLock: js.Function0[Unit] = js.native
  val scroll: js.Function0[Unit] = js.native
  val scrollBy: js.Function0[Unit] = js.native
  val scrollHeight: Double = js.native
  val scrollIntoView: js.Function0[Unit] = js.native
  val scrollLeft: Double = js.native
  val scrollTo: js.Function0[Unit] = js.native
  val scrollTop: Double = js.native
  val scrollWidth: Double = js.native
  val setAttribute: js.Function2[/* qualifiedName */ String, /* value */ String, Unit] = js.native
  val setAttributeNS: js.Function3[/* namespace */ String, /* qualifiedName */ String, /* value */ String, Unit] = js.native
  val setAttributeNode: js.Function1[/* attr */ Attr, Attr | Null] = js.native
  val setAttributeNodeNS: js.Function1[/* attr */ Attr, Attr | Null] = js.native
  val setPointerCapture: js.Function1[/* pointerId */ Double, Unit] = js.native
  val shadowRoot: js.UndefOr[ShadowRoot] = js.native
  val slot: String = js.native
  val spellcheck: Boolean = js.native
  val style: CSSStyleDeclaration = js.native
  val tabIndex: Double = js.native
  val tagName: String = js.native
  val textContent: js.UndefOr[String] = js.native
  val title: String = js.native
  val toggleAttribute: js.Function1[/* qualifiedName */ String, Boolean] = js.native
  val translate: Boolean = js.native
  val webkitMatchesSelector: js.Function1[/* selectors */ String, Boolean] = js.native
}

object ReadonlyHTMLElement {
  @scala.inline
  def apply(
    ATTRIBUTE_NODE: Double,
    CDATA_SECTION_NODE: Double,
    COMMENT_NODE: Double,
    DOCUMENT_FRAGMENT_NODE: Double,
    DOCUMENT_NODE: Double,
    DOCUMENT_POSITION_CONTAINED_BY: Double,
    DOCUMENT_POSITION_CONTAINS: Double,
    DOCUMENT_POSITION_DISCONNECTED: Double,
    DOCUMENT_POSITION_FOLLOWING: Double,
    DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Double,
    DOCUMENT_POSITION_PRECEDING: Double,
    DOCUMENT_TYPE_NODE: Double,
    ELEMENT_NODE: Double,
    ENTITY_NODE: Double,
    ENTITY_REFERENCE_NODE: Double,
    NOTATION_NODE: Double,
    PROCESSING_INSTRUCTION_NODE: Double,
    TEXT_NODE: Double,
    accessKey: String,
    accessKeyLabel: String,
    addEventListener: (fullscreenchange, /* listener */ js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]) => Unit,
    after: /* repeated */ Node | String => Unit,
    animate: /* keyframes */ js.Array[Keyframe] => Animation,
    append: /* repeated */ Node | String => Unit,
    appendChild: /* newChild */ Node => Node,
    attachShadow: /* init */ ShadowRootInit => ShadowRoot,
    attributes: NamedNodeMap,
    autocapitalize: String,
    autofocus: Boolean,
    baseURI: String,
    before: /* repeated */ Node | String => Unit,
    blur: () => Unit,
    childElementCount: Double,
    childNodes: NodeListOf[ChildNode with Node],
    children: HTMLCollection,
    classList: DOMTokenList,
    className: String,
    click: () => Unit,
    clientHeight: Double,
    clientLeft: Double,
    clientTop: Double,
    clientWidth: Double,
    cloneNode: () => Node,
    closest: a => HTMLAnchorElement | Null,
    compareDocumentPosition: /* other */ Node => Double,
    contains: /* other */ Node => Boolean,
    contentEditable: String,
    dataset: DOMStringMap,
    dir: String,
    dispatchEvent: /* event */ Event_ => Boolean,
    draggable: Boolean,
    focus: () => Unit,
    getAnimations: () => js.Array[Animation],
    getAttribute: /* qualifiedName */ String => String | Null,
    getAttributeNS: (/* namespace */ String, /* localName */ String) => String | Null,
    getAttributeNames: () => js.Array[String],
    getAttributeNode: /* name */ String => Attr | Null,
    getAttributeNodeNS: (/* namespaceURI */ String, /* localName */ String) => Attr | Null,
    getBoundingClientRect: () => DOMRect,
    getClientRects: () => DOMRectList,
    getElementsByClassName: /* classNames */ String => HTMLCollectionOf[Element],
    getElementsByTagName: a => HTMLCollectionOf[HTMLAnchorElement],
    getElementsByTagNameNS: (httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, /* localName */ String) => HTMLCollectionOf[HTMLElement],
    getRootNode: () => Node,
    hasAttribute: /* qualifiedName */ String => Boolean,
    hasAttributeNS: (/* namespace */ String, /* localName */ String) => Boolean,
    hasAttributes: () => Boolean,
    hasChildNodes: () => Boolean,
    hasPointerCapture: /* pointerId */ Double => Boolean,
    hidden: Boolean,
    id: String,
    innerHTML: String,
    innerText: String,
    inputMode: String,
    insertAdjacentElement: (/* position */ InsertPosition, /* insertedElement */ Element) => Element | Null,
    insertAdjacentHTML: (/* where */ InsertPosition, /* html */ String) => Unit,
    insertAdjacentText: (/* where */ InsertPosition, /* text */ String) => Unit,
    insertBefore: (/* newChild */ Node, /* refChild */ Node) => Node,
    isConnected: Boolean,
    isContentEditable: Boolean,
    isDefaultNamespace: /* namespace */ String => Boolean,
    isEqualNode: /* otherNode */ Node => Boolean,
    isSameNode: /* otherNode */ Node => Boolean,
    lang: String,
    localName: String,
    lookupNamespaceURI: /* prefix */ String => String | Null,
    lookupPrefix: /* namespace */ String => String | Null,
    matches: /* selectors */ String => Boolean,
    msGetRegionContent: () => _,
    nodeName: String,
    nodeType: Double,
    normalize: () => Unit,
    offsetHeight: Double,
    offsetLeft: Double,
    offsetTop: Double,
    offsetWidth: Double,
    outerHTML: String,
    prepend: /* repeated */ Node | String => Unit,
    querySelector: a => HTMLAnchorElement | Null,
    querySelectorAll: a => NodeListOf[HTMLAnchorElement with Node],
    releasePointerCapture: /* pointerId */ Double => Unit,
    remove: () => Unit,
    removeAttribute: /* qualifiedName */ String => Unit,
    removeAttributeNS: (/* namespace */ String, /* localName */ String) => Unit,
    removeAttributeNode: /* attr */ Attr => Attr,
    removeChild: /* oldChild */ Node => Node,
    removeEventListener: (fullscreenchange, /* listener */ js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]) => Unit,
    replaceChild: (/* newChild */ Node, /* oldChild */ Node) => Node,
    replaceWith: /* repeated */ Node | String => Unit,
    requestFullscreen: () => js.Promise[Unit],
    requestPointerLock: () => Unit,
    scroll: () => Unit,
    scrollBy: () => Unit,
    scrollHeight: Double,
    scrollIntoView: () => Unit,
    scrollLeft: Double,
    scrollTo: () => Unit,
    scrollTop: Double,
    scrollWidth: Double,
    setAttribute: (/* qualifiedName */ String, /* value */ String) => Unit,
    setAttributeNS: (/* namespace */ String, /* qualifiedName */ String, /* value */ String) => Unit,
    setAttributeNode: /* attr */ Attr => Attr | Null,
    setAttributeNodeNS: /* attr */ Attr => Attr | Null,
    setPointerCapture: /* pointerId */ Double => Unit,
    slot: String,
    spellcheck: Boolean,
    style: CSSStyleDeclaration,
    tabIndex: Double,
    tagName: String,
    title: String,
    toggleAttribute: /* qualifiedName */ String => Boolean,
    translate: Boolean,
    webkitMatchesSelector: /* selectors */ String => Boolean
  ): ReadonlyHTMLElement = {
    val __obj = js.Dynamic.literal(ATTRIBUTE_NODE = ATTRIBUTE_NODE.asInstanceOf[js.Any], CDATA_SECTION_NODE = CDATA_SECTION_NODE.asInstanceOf[js.Any], COMMENT_NODE = COMMENT_NODE.asInstanceOf[js.Any], DOCUMENT_FRAGMENT_NODE = DOCUMENT_FRAGMENT_NODE.asInstanceOf[js.Any], DOCUMENT_NODE = DOCUMENT_NODE.asInstanceOf[js.Any], DOCUMENT_POSITION_CONTAINED_BY = DOCUMENT_POSITION_CONTAINED_BY.asInstanceOf[js.Any], DOCUMENT_POSITION_CONTAINS = DOCUMENT_POSITION_CONTAINS.asInstanceOf[js.Any], DOCUMENT_POSITION_DISCONNECTED = DOCUMENT_POSITION_DISCONNECTED.asInstanceOf[js.Any], DOCUMENT_POSITION_FOLLOWING = DOCUMENT_POSITION_FOLLOWING.asInstanceOf[js.Any], DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC = DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC.asInstanceOf[js.Any], DOCUMENT_POSITION_PRECEDING = DOCUMENT_POSITION_PRECEDING.asInstanceOf[js.Any], DOCUMENT_TYPE_NODE = DOCUMENT_TYPE_NODE.asInstanceOf[js.Any], ELEMENT_NODE = ELEMENT_NODE.asInstanceOf[js.Any], ENTITY_NODE = ENTITY_NODE.asInstanceOf[js.Any], ENTITY_REFERENCE_NODE = ENTITY_REFERENCE_NODE.asInstanceOf[js.Any], NOTATION_NODE = NOTATION_NODE.asInstanceOf[js.Any], PROCESSING_INSTRUCTION_NODE = PROCESSING_INSTRUCTION_NODE.asInstanceOf[js.Any], TEXT_NODE = TEXT_NODE.asInstanceOf[js.Any], accessKey = accessKey.asInstanceOf[js.Any], accessKeyLabel = accessKeyLabel.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener), after = js.Any.fromFunction1(after), animate = js.Any.fromFunction1(animate), append = js.Any.fromFunction1(append), appendChild = js.Any.fromFunction1(appendChild), attachShadow = js.Any.fromFunction1(attachShadow), attributes = attributes.asInstanceOf[js.Any], autocapitalize = autocapitalize.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], baseURI = baseURI.asInstanceOf[js.Any], before = js.Any.fromFunction1(before), blur = js.Any.fromFunction0(blur), childElementCount = childElementCount.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], classList = classList.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], click = js.Any.fromFunction0(click), clientHeight = clientHeight.asInstanceOf[js.Any], clientLeft = clientLeft.asInstanceOf[js.Any], clientTop = clientTop.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], cloneNode = js.Any.fromFunction0(cloneNode), closest = js.Any.fromFunction1(closest), compareDocumentPosition = js.Any.fromFunction1(compareDocumentPosition), contains = js.Any.fromFunction1(contains), contentEditable = contentEditable.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], dispatchEvent = js.Any.fromFunction1(dispatchEvent), draggable = draggable.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), getAnimations = js.Any.fromFunction0(getAnimations), getAttribute = js.Any.fromFunction1(getAttribute), getAttributeNS = js.Any.fromFunction2(getAttributeNS), getAttributeNames = js.Any.fromFunction0(getAttributeNames), getAttributeNode = js.Any.fromFunction1(getAttributeNode), getAttributeNodeNS = js.Any.fromFunction2(getAttributeNodeNS), getBoundingClientRect = js.Any.fromFunction0(getBoundingClientRect), getClientRects = js.Any.fromFunction0(getClientRects), getElementsByClassName = js.Any.fromFunction1(getElementsByClassName), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), getElementsByTagNameNS = js.Any.fromFunction2(getElementsByTagNameNS), getRootNode = js.Any.fromFunction0(getRootNode), hasAttribute = js.Any.fromFunction1(hasAttribute), hasAttributeNS = js.Any.fromFunction2(hasAttributeNS), hasAttributes = js.Any.fromFunction0(hasAttributes), hasChildNodes = js.Any.fromFunction0(hasChildNodes), hasPointerCapture = js.Any.fromFunction1(hasPointerCapture), hidden = hidden.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], innerHTML = innerHTML.asInstanceOf[js.Any], innerText = innerText.asInstanceOf[js.Any], inputMode = inputMode.asInstanceOf[js.Any], insertAdjacentElement = js.Any.fromFunction2(insertAdjacentElement), insertAdjacentHTML = js.Any.fromFunction2(insertAdjacentHTML), insertAdjacentText = js.Any.fromFunction2(insertAdjacentText), insertBefore = js.Any.fromFunction2(insertBefore), isConnected = isConnected.asInstanceOf[js.Any], isContentEditable = isContentEditable.asInstanceOf[js.Any], isDefaultNamespace = js.Any.fromFunction1(isDefaultNamespace), isEqualNode = js.Any.fromFunction1(isEqualNode), isSameNode = js.Any.fromFunction1(isSameNode), lang = lang.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], lookupNamespaceURI = js.Any.fromFunction1(lookupNamespaceURI), lookupPrefix = js.Any.fromFunction1(lookupPrefix), matches = js.Any.fromFunction1(matches), msGetRegionContent = js.Any.fromFunction0(msGetRegionContent), nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], normalize = js.Any.fromFunction0(normalize), offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetLeft = offsetLeft.asInstanceOf[js.Any], offsetTop = offsetTop.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], outerHTML = outerHTML.asInstanceOf[js.Any], prepend = js.Any.fromFunction1(prepend), querySelector = js.Any.fromFunction1(querySelector), querySelectorAll = js.Any.fromFunction1(querySelectorAll), releasePointerCapture = js.Any.fromFunction1(releasePointerCapture), remove = js.Any.fromFunction0(remove), removeAttribute = js.Any.fromFunction1(removeAttribute), removeAttributeNS = js.Any.fromFunction2(removeAttributeNS), removeAttributeNode = js.Any.fromFunction1(removeAttributeNode), removeChild = js.Any.fromFunction1(removeChild), removeEventListener = js.Any.fromFunction2(removeEventListener), replaceChild = js.Any.fromFunction2(replaceChild), replaceWith = js.Any.fromFunction1(replaceWith), requestFullscreen = js.Any.fromFunction0(requestFullscreen), requestPointerLock = js.Any.fromFunction0(requestPointerLock), scroll = js.Any.fromFunction0(scroll), scrollBy = js.Any.fromFunction0(scrollBy), scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollIntoView = js.Any.fromFunction0(scrollIntoView), scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTo = js.Any.fromFunction0(scrollTo), scrollTop = scrollTop.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any], setAttribute = js.Any.fromFunction2(setAttribute), setAttributeNS = js.Any.fromFunction3(setAttributeNS), setAttributeNode = js.Any.fromFunction1(setAttributeNode), setAttributeNodeNS = js.Any.fromFunction1(setAttributeNodeNS), setPointerCapture = js.Any.fromFunction1(setPointerCapture), slot = slot.asInstanceOf[js.Any], spellcheck = spellcheck.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], toggleAttribute = js.Any.fromFunction1(toggleAttribute), translate = translate.asInstanceOf[js.Any], webkitMatchesSelector = js.Any.fromFunction1(webkitMatchesSelector))
    __obj.asInstanceOf[ReadonlyHTMLElement]
  }
  @scala.inline
  implicit class ReadonlyHTMLElementOps[Self <: ReadonlyHTMLElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withATTRIBUTE_NODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTE_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCDATA_SECTION_NODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CDATA_SECTION_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCOMMENT_NODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COMMENT_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDOCUMENT_FRAGMENT_NODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_FRAGMENT_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDOCUMENT_NODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDOCUMENT_POSITION_CONTAINED_BY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_CONTAINED_BY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDOCUMENT_POSITION_CONTAINS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_CONTAINS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDOCUMENT_POSITION_DISCONNECTED(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_DISCONNECTED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDOCUMENT_POSITION_FOLLOWING(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_FOLLOWING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDOCUMENT_POSITION_PRECEDING(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_PRECEDING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDOCUMENT_TYPE_NODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_TYPE_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withELEMENT_NODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ELEMENT_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withENTITY_NODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ENTITY_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withENTITY_REFERENCE_NODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ENTITY_REFERENCE_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNOTATION_NODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOTATION_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPROCESSING_INSTRUCTION_NODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PROCESSING_INSTRUCTION_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTEXT_NODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TEXT_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessKeyLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKeyLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddEventListener(
      value: (fullscreenchange, /* listener */ js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAfter(value: /* repeated */ Node | String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAnimate(value: /* keyframes */ js.Array[Keyframe] => Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAppend(value: /* repeated */ Node | String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAppendChild(value: /* newChild */ Node => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAttachShadow(value: /* init */ ShadowRootInit => ShadowRoot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachShadow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAttributes(value: NamedNodeMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutocapitalize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocapitalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutofocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBefore(value: /* repeated */ Node | String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBlur(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withChildElementCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childElementCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildNodes(value: NodeListOf[ChildNode with Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: HTMLCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassList(value: DOMTokenList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClientHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloneNode(value: () => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClosest(value: a => HTMLAnchorElement | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCompareDocumentPosition(value: /* other */ Node => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareDocumentPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContains(value: /* other */ Node => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContentEditable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEditable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataset(value: DOMStringMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispatchEvent(value: /* event */ Event_ => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAnimations(value: () => js.Array[Animation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnimations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAttribute(value: /* qualifiedName */ String => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAttributeNS(value: (/* namespace */ String, /* localName */ String) => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributeNS")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetAttributeNames(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributeNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAttributeNode(value: /* name */ String => Attr | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributeNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAttributeNodeNS(value: (/* namespaceURI */ String, /* localName */ String) => Attr | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributeNodeNS")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetBoundingClientRect(value: () => DOMRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBoundingClientRect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetClientRects(value: () => DOMRectList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClientRects")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetElementsByClassName(value: /* classNames */ String => HTMLCollectionOf[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementsByClassName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetElementsByTagName(value: a => HTMLCollectionOf[HTMLAnchorElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementsByTagName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetElementsByTagNameNS(
      value: (httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, /* localName */ String) => HTMLCollectionOf[HTMLElement]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementsByTagNameNS")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetRootNode(value: () => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRootNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasAttribute(value: /* qualifiedName */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasAttributeNS(value: (/* namespace */ String, /* localName */ String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttributeNS")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHasAttributes(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttributes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasChildNodes(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChildNodes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasPointerCapture(value: /* pointerId */ Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPointerCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertAdjacentElement(value: (/* position */ InsertPosition, /* insertedElement */ Element) => Element | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAdjacentElement")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInsertAdjacentHTML(value: (/* where */ InsertPosition, /* html */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAdjacentHTML")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInsertAdjacentText(value: (/* where */ InsertPosition, /* text */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAdjacentText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInsertBefore(value: (/* newChild */ Node, /* refChild */ Node) => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsConnected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConnected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsContentEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isContentEditable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDefaultNamespace(value: /* namespace */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefaultNamespace")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEqualNode(value: /* otherNode */ Node => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEqualNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsSameNode(value: /* otherNode */ Node => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSameNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLookupNamespaceURI(value: /* prefix */ String => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupNamespaceURI")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLookupPrefix(value: /* namespace */ String => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupPrefix")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMatches(value: /* selectors */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMsGetRegionContent(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msGetRegionContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOffsetHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOuterHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrepend(value: /* repeated */ Node | String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQuerySelector(value: a => HTMLAnchorElement | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("querySelector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQuerySelectorAll(value: a => NodeListOf[HTMLAnchorElement with Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("querySelectorAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReleasePointerCapture(value: /* pointerId */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releasePointerCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveAttribute(value: /* qualifiedName */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveAttributeNS(value: (/* namespace */ String, /* localName */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAttributeNS")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveAttributeNode(value: /* attr */ Attr => Attr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAttributeNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveChild(value: /* oldChild */ Node => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveEventListener(
      value: (fullscreenchange, /* listener */ js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReplaceChild(value: (/* newChild */ Node, /* oldChild */ Node) => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceChild")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReplaceWith(value: /* repeated */ Node | String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceWith")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequestFullscreen(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestFullscreen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRequestPointerLock(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPointerLock")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScroll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScrollBy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScrollHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollIntoView(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollIntoView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScrollLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollTo(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScrollTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetAttribute(value: (/* qualifiedName */ String, /* value */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttribute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetAttributeNS(value: (/* namespace */ String, /* qualifiedName */ String, /* value */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributeNS")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetAttributeNode(value: /* attr */ Attr => Attr | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributeNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAttributeNodeNS(value: /* attr */ Attr => Attr | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributeNodeNS")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPointerCapture(value: /* pointerId */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPointerCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSlot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpellcheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellcheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: CSSStyleDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleAttribute(value: /* qualifiedName */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTranslate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebkitMatchesSelector(value: /* selectors */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkitMatchesSelector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAssignedSlot(value: HTMLSlotElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedSlot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignedSlot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedSlot")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstChild(value: ChildNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstChild")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstElementChild(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstElementChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstElementChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstElementChild")(js.undefined)
        ret
    }
    @scala.inline
    def withLastChild(value: ChildNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChild")(js.undefined)
        ret
    }
    @scala.inline
    def withLastElementChild(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastElementChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastElementChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastElementChild")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespaceURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaceURI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceURI")(js.undefined)
        ret
    }
    @scala.inline
    def withNextElementSibling(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextElementSibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextElementSibling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextElementSibling")(js.undefined)
        ret
    }
    @scala.inline
    def withNextSibling(value: ChildNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextSibling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSibling")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeValue")(js.undefined)
        ret
    }
    @scala.inline
    def withNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetParent(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetParent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnabort(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ UIEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onabort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnabort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onabort")(js.undefined)
        ret
    }
    @scala.inline
    def withOnanimationcancel(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ AnimationEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onanimationcancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnanimationcancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onanimationcancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnanimationend(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ AnimationEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onanimationend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnanimationend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onanimationend")(js.undefined)
        ret
    }
    @scala.inline
    def withOnanimationiteration(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ AnimationEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onanimationiteration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnanimationiteration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onanimationiteration")(js.undefined)
        ret
    }
    @scala.inline
    def withOnanimationstart(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ AnimationEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onanimationstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnanimationstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onanimationstart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnauxclick(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onauxclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnauxclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onauxclick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnblur(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ FocusEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onblur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnblur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onblur")(js.undefined)
        ret
    }
    @scala.inline
    def withOncancel(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOncancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOncanplay(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncanplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOncanplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncanplay")(js.undefined)
        ret
    }
    @scala.inline
    def withOncanplaythrough(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncanplaythrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOncanplaythrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncanplaythrough")(js.undefined)
        ret
    }
    @scala.inline
    def withOnchange(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnchange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onchange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnclick(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnclose(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnclose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclose")(js.undefined)
        ret
    }
    @scala.inline
    def withOncontextmenu(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncontextmenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOncontextmenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncontextmenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOncopy(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ ClipboardEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncopy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOncopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncopy")(js.undefined)
        ret
    }
    @scala.inline
    def withOncuechange(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncuechange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOncuechange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncuechange")(js.undefined)
        ret
    }
    @scala.inline
    def withOncut(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ ClipboardEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOncut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncut")(js.undefined)
        ret
    }
    @scala.inline
    def withOndblclick(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOndblclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondblclick")(js.undefined)
        ret
    }
    @scala.inline
    def withOndrag(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOndrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOndragend(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOndragend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragend")(js.undefined)
        ret
    }
    @scala.inline
    def withOndragenter(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOndragenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragenter")(js.undefined)
        ret
    }
    @scala.inline
    def withOndragexit(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragexit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOndragexit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragexit")(js.undefined)
        ret
    }
    @scala.inline
    def withOndragleave(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragleave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOndragleave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragleave")(js.undefined)
        ret
    }
    @scala.inline
    def withOndragover(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOndragover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragover")(js.undefined)
        ret
    }
    @scala.inline
    def withOndragstart(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOndragstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragstart")(js.undefined)
        ret
    }
    @scala.inline
    def withOndrop(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOndrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondrop")(js.undefined)
        ret
    }
    @scala.inline
    def withOndurationchange(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondurationchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOndurationchange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondurationchange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnemptied(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onemptied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnemptied: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onemptied")(js.undefined)
        ret
    }
    @scala.inline
    def withOnended(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnended: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onended")(js.undefined)
        ret
    }
    @scala.inline
    def withOnerror(
      value: (/* event */ Event_ | String, /* source */ js.UndefOr[String], /* lineno */ js.UndefOr[Double], /* colno */ js.UndefOr[Double], /* error */ js.UndefOr[js.Error]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withOnerrorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(null)
        ret
    }
    @scala.inline
    def withOnfocus(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ FocusEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnfocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnfullscreenchange(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfullscreenchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnfullscreenchange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfullscreenchange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnfullscreenerror(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfullscreenerror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnfullscreenerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfullscreenerror")(js.undefined)
        ret
    }
    @scala.inline
    def withOngotpointercapture(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ongotpointercapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOngotpointercapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ongotpointercapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOninput(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oninput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOninput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oninput")(js.undefined)
        ret
    }
    @scala.inline
    def withOninvalid(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oninvalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOninvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oninvalid")(js.undefined)
        ret
    }
    @scala.inline
    def withOnkeydown(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ KeyboardEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onkeydown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnkeydown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onkeydown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnkeypress(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ KeyboardEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onkeypress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnkeypress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onkeypress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnkeyup(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ KeyboardEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onkeyup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnkeyup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onkeyup")(js.undefined)
        ret
    }
    @scala.inline
    def withOnload(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(js.undefined)
        ret
    }
    @scala.inline
    def withOnloadeddata(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloadeddata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnloadeddata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloadeddata")(js.undefined)
        ret
    }
    @scala.inline
    def withOnloadedmetadata(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloadedmetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnloadedmetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloadedmetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withOnloadstart(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloadstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnloadstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloadstart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlostpointercapture(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlostpointercapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlostpointercapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlostpointercapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmousedown(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmousedown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnmousedown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmousedown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmouseenter(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnmouseenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseenter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmouseleave(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseleave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnmouseleave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseleave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmousemove(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmousemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnmousemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmousemove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmouseout(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnmouseout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmouseover(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnmouseover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseover")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmouseup(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnmouseup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseup")(js.undefined)
        ret
    }
    @scala.inline
    def withOnpaste(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ ClipboardEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnpaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpaste")(js.undefined)
        ret
    }
    @scala.inline
    def withOnpause(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnpause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpause")(js.undefined)
        ret
    }
    @scala.inline
    def withOnplay(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onplay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnplaying(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onplaying")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnplaying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onplaying")(js.undefined)
        ret
    }
    @scala.inline
    def withOnpointercancel(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointercancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnpointercancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointercancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnpointerdown(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnpointerdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerdown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnpointerenter(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnpointerenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerenter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnpointerleave(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerleave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnpointerleave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerleave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnpointermove(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointermove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnpointermove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointermove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnpointerout(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnpointerout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnpointerover(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnpointerover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerover")(js.undefined)
        ret
    }
    @scala.inline
    def withOnpointerup(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnpointerup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerup")(js.undefined)
        ret
    }
    @scala.inline
    def withOnprogress(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ ProgressEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprogress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnprogress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprogress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnratechange(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onratechange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnratechange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onratechange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnreset(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onreset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onreset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnresize(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ UIEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onresize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnresize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onresize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnscroll(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onscroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnscroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onscroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnsecuritypolicyviolation(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ SecurityPolicyViolationEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsecuritypolicyviolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnsecuritypolicyviolation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsecuritypolicyviolation")(js.undefined)
        ret
    }
    @scala.inline
    def withOnseeked(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onseeked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnseeked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onseeked")(js.undefined)
        ret
    }
    @scala.inline
    def withOnseeking(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onseeking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnseeking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onseeking")(js.undefined)
        ret
    }
    @scala.inline
    def withOnselect(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onselect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnselectionchange(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onselectionchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnselectionchange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onselectionchange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnselectstart(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onselectstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnselectstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onselectstart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnstalled(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onstalled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnstalled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onstalled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnsubmit(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsubmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnsubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnsuspend(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsuspend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnsuspend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsuspend")(js.undefined)
        ret
    }
    @scala.inline
    def withOntimeupdate(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontimeupdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOntimeupdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontimeupdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOntoggle(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontoggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOntoggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontoggle")(js.undefined)
        ret
    }
    @scala.inline
    def withOntouchcancel(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TouchEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontouchcancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOntouchcancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontouchcancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOntouchend(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TouchEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontouchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOntouchend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontouchend")(js.undefined)
        ret
    }
    @scala.inline
    def withOntouchmove(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TouchEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontouchmove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOntouchmove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontouchmove")(js.undefined)
        ret
    }
    @scala.inline
    def withOntouchstart(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TouchEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontouchstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOntouchstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontouchstart")(js.undefined)
        ret
    }
    @scala.inline
    def withOntransitioncancel(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TransitionEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontransitioncancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOntransitioncancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontransitioncancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOntransitionend(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TransitionEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontransitionend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOntransitionend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontransitionend")(js.undefined)
        ret
    }
    @scala.inline
    def withOntransitionrun(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TransitionEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontransitionrun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOntransitionrun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontransitionrun")(js.undefined)
        ret
    }
    @scala.inline
    def withOntransitionstart(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TransitionEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontransitionstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOntransitionstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontransitionstart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnvolumechange(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onvolumechange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnvolumechange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onvolumechange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnwaiting(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onwaiting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnwaiting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onwaiting")(js.undefined)
        ret
    }
    @scala.inline
    def withOnwheel(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ WheelEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onwheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnwheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onwheel")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerDocument(value: Document_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerDocument")(js.undefined)
        ret
    }
    @scala.inline
    def withParentElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentElement")(js.undefined)
        ret
    }
    @scala.inline
    def withParentNode(value: Node with ParentNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNode")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousElementSibling(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousElementSibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousElementSibling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousElementSibling")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousSibling(value: ChildNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousSibling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSibling")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowRoot(value: ShadowRoot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withTextContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textContent")(js.undefined)
        ret
    }
  }
  
}

