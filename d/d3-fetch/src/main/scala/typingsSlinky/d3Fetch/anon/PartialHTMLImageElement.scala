package typingsSlinky.d3Fetch.anon

import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.Attr
import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.DOMTokenList
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
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
import typingsSlinky.d3Fetch.d3FetchStrings.a
import typingsSlinky.d3Fetch.d3FetchStrings.async
import typingsSlinky.d3Fetch.d3FetchStrings.auto
import typingsSlinky.d3Fetch.d3FetchStrings.fullscreenchange
import typingsSlinky.d3Fetch.d3FetchStrings.httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml
import typingsSlinky.d3Fetch.d3FetchStrings.sync
import typingsSlinky.std.Animation
import typingsSlinky.std.ChildNode
import typingsSlinky.std.DOMRect
import typingsSlinky.std.DOMRectList
import typingsSlinky.std.DOMStringMap
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

/* Inlined std.Partial<std.HTMLImageElement> */
trait PartialHTMLImageElement extends js.Object {
  var ATTRIBUTE_NODE: js.UndefOr[Double] = js.undefined
  var CDATA_SECTION_NODE: js.UndefOr[Double] = js.undefined
  var COMMENT_NODE: js.UndefOr[Double] = js.undefined
  var DOCUMENT_FRAGMENT_NODE: js.UndefOr[Double] = js.undefined
  var DOCUMENT_NODE: js.UndefOr[Double] = js.undefined
  var DOCUMENT_POSITION_CONTAINED_BY: js.UndefOr[Double] = js.undefined
  var DOCUMENT_POSITION_CONTAINS: js.UndefOr[Double] = js.undefined
  var DOCUMENT_POSITION_DISCONNECTED: js.UndefOr[Double] = js.undefined
  var DOCUMENT_POSITION_FOLLOWING: js.UndefOr[Double] = js.undefined
  var DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: js.UndefOr[Double] = js.undefined
  var DOCUMENT_POSITION_PRECEDING: js.UndefOr[Double] = js.undefined
  var DOCUMENT_TYPE_NODE: js.UndefOr[Double] = js.undefined
  var ELEMENT_NODE: js.UndefOr[Double] = js.undefined
  var ENTITY_NODE: js.UndefOr[Double] = js.undefined
  var ENTITY_REFERENCE_NODE: js.UndefOr[Double] = js.undefined
  var NOTATION_NODE: js.UndefOr[Double] = js.undefined
  var PROCESSING_INSTRUCTION_NODE: js.UndefOr[Double] = js.undefined
  var TEXT_NODE: js.UndefOr[Double] = js.undefined
  var accessKey: js.UndefOr[String] = js.undefined
  var accessKeyLabel: js.UndefOr[String] = js.undefined
  var addEventListener: js.UndefOr[
    js.Function2[
      fullscreenchange, 
      /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event, _], 
      Unit
    ]
  ] = js.undefined
  var after: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var align: js.UndefOr[String] = js.undefined
  var alt: js.UndefOr[String] = js.undefined
  var animate: js.UndefOr[js.Function1[/* keyframes */ js.Array[Keyframe], Animation]] = js.undefined
  var append: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var appendChild: js.UndefOr[js.Function1[/* newChild */ Node, Node]] = js.undefined
  var assignedSlot: js.UndefOr[HTMLSlotElement] = js.undefined
  var attachShadow: js.UndefOr[js.Function1[/* init */ ShadowRootInit, ShadowRoot]] = js.undefined
  var attributes: js.UndefOr[NamedNodeMap] = js.undefined
  var autocapitalize: js.UndefOr[String] = js.undefined
  var autofocus: js.UndefOr[Boolean] = js.undefined
  var baseURI: js.UndefOr[String] = js.undefined
  var before: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var blur: js.UndefOr[js.Function0[Unit]] = js.undefined
  var border: js.UndefOr[String] = js.undefined
  var childElementCount: js.UndefOr[Double] = js.undefined
  var childNodes: js.UndefOr[NodeListOf[ChildNode with Node]] = js.undefined
  var children: js.UndefOr[HTMLCollection] = js.undefined
  var classList: js.UndefOr[DOMTokenList] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var click: js.UndefOr[js.Function0[Unit]] = js.undefined
  var clientHeight: js.UndefOr[Double] = js.undefined
  var clientLeft: js.UndefOr[Double] = js.undefined
  var clientTop: js.UndefOr[Double] = js.undefined
  var clientWidth: js.UndefOr[Double] = js.undefined
  var cloneNode: js.UndefOr[js.Function0[Node]] = js.undefined
  var closest: js.UndefOr[js.Function1[a, HTMLAnchorElement | Null]] = js.undefined
  var compareDocumentPosition: js.UndefOr[js.Function1[/* other */ Node, Double]] = js.undefined
  var complete: js.UndefOr[Boolean] = js.undefined
  var contains: js.UndefOr[js.Function1[/* other */ Node, Boolean]] = js.undefined
  var contentEditable: js.UndefOr[String] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var currentSrc: js.UndefOr[String] = js.undefined
  var dataset: js.UndefOr[DOMStringMap] = js.undefined
  var decode: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  var decoding: js.UndefOr[async | sync | auto] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var dispatchEvent: js.UndefOr[js.Function1[/* event */ Event, Boolean]] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var firstChild: js.UndefOr[ChildNode] = js.undefined
  var firstElementChild: js.UndefOr[Element] = js.undefined
  var focus: js.UndefOr[js.Function0[Unit]] = js.undefined
  var getAnimations: js.UndefOr[js.Function0[js.Array[Animation]]] = js.undefined
  var getAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, String | Null]] = js.undefined
  var getAttributeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, String | Null]] = js.undefined
  var getAttributeNames: js.UndefOr[js.Function0[js.Array[String]]] = js.undefined
  var getAttributeNode: js.UndefOr[js.Function1[/* name */ String, Attr | Null]] = js.undefined
  var getAttributeNodeNS: js.UndefOr[js.Function2[/* namespaceURI */ String, /* localName */ String, Attr | Null]] = js.undefined
  var getBoundingClientRect: js.UndefOr[js.Function0[DOMRect]] = js.undefined
  var getClientRects: js.UndefOr[js.Function0[DOMRectList]] = js.undefined
  var getElementsByClassName: js.UndefOr[js.Function1[/* classNames */ String, HTMLCollectionOf[Element]]] = js.undefined
  var getElementsByTagName: js.UndefOr[js.Function1[a, HTMLCollectionOf[HTMLAnchorElement]]] = js.undefined
  var getElementsByTagNameNS: js.UndefOr[
    js.Function2[
      httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, 
      /* localName */ String, 
      HTMLCollectionOf[HTMLElement]
    ]
  ] = js.undefined
  var getRootNode: js.UndefOr[js.Function0[Node]] = js.undefined
  var hasAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Boolean]] = js.undefined
  var hasAttributeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, Boolean]] = js.undefined
  var hasAttributes: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var hasChildNodes: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var hasPointerCapture: js.UndefOr[js.Function1[/* pointerId */ Double, Boolean]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var hspace: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var innerHTML: js.UndefOr[String] = js.undefined
  var innerText: js.UndefOr[String] = js.undefined
  var inputMode: js.UndefOr[String] = js.undefined
  var insertAdjacentElement: js.UndefOr[
    js.Function2[/* position */ InsertPosition, /* insertedElement */ Element, Element | Null]
  ] = js.undefined
  var insertAdjacentHTML: js.UndefOr[js.Function2[/* where */ InsertPosition, /* html */ String, Unit]] = js.undefined
  var insertAdjacentText: js.UndefOr[js.Function2[/* where */ InsertPosition, /* text */ String, Unit]] = js.undefined
  var insertBefore: js.UndefOr[js.Function2[/* newChild */ Node, /* refChild */ Node, Node]] = js.undefined
  var isConnected: js.UndefOr[Boolean] = js.undefined
  var isContentEditable: js.UndefOr[Boolean] = js.undefined
  var isDefaultNamespace: js.UndefOr[js.Function1[/* namespace */ String, Boolean]] = js.undefined
  var isEqualNode: js.UndefOr[js.Function1[/* otherNode */ Node, Boolean]] = js.undefined
  var isMap: js.UndefOr[Boolean] = js.undefined
  var isSameNode: js.UndefOr[js.Function1[/* otherNode */ Node, Boolean]] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var lastChild: js.UndefOr[ChildNode] = js.undefined
  var lastElementChild: js.UndefOr[Element] = js.undefined
  var localName: js.UndefOr[String] = js.undefined
  var longDesc: js.UndefOr[String] = js.undefined
  var lookupNamespaceURI: js.UndefOr[js.Function1[/* prefix */ String, String | Null]] = js.undefined
  var lookupPrefix: js.UndefOr[js.Function1[/* namespace */ String, String | Null]] = js.undefined
  var lowsrc: js.UndefOr[String] = js.undefined
  var matches: js.UndefOr[js.Function1[/* selectors */ String, Boolean]] = js.undefined
  var msGetRegionContent: js.UndefOr[js.Function0[_]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namespaceURI: js.UndefOr[String] = js.undefined
  var naturalHeight: js.UndefOr[Double] = js.undefined
  var naturalWidth: js.UndefOr[Double] = js.undefined
  var nextElementSibling: js.UndefOr[Element] = js.undefined
  var nextSibling: js.UndefOr[ChildNode] = js.undefined
  var nodeName: js.UndefOr[String] = js.undefined
  var nodeType: js.UndefOr[Double] = js.undefined
  var nodeValue: js.UndefOr[String] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var normalize: js.UndefOr[js.Function0[Unit]] = js.undefined
  var offsetHeight: js.UndefOr[Double] = js.undefined
  var offsetLeft: js.UndefOr[Double] = js.undefined
  var offsetParent: js.UndefOr[Element] = js.undefined
  var offsetTop: js.UndefOr[Double] = js.undefined
  var offsetWidth: js.UndefOr[Double] = js.undefined
  var onabort: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]] = js.undefined
  var onanimationcancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  var onanimationend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  var onanimationiteration: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  var onanimationstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  var onauxclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onblur: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]] = js.undefined
  var oncancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var oncanplay: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var oncanplaythrough: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onclose: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var oncontextmenu: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var oncopy: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]] = js.undefined
  var oncuechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var oncut: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]] = js.undefined
  var ondblclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var ondrag: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondragend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondragenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondragexit: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var ondragleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondragover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondragstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondrop: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondurationchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onemptied: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onended: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onerror: js.UndefOr[OnErrorEventHandler] = js.undefined
  var onfocus: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]] = js.undefined
  var onfullscreenchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onfullscreenerror: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var ongotpointercapture: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var oninput: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var oninvalid: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onkeydown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.undefined
  var onkeypress: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.undefined
  var onkeyup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.undefined
  var onload: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onloadeddata: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onloadedmetadata: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onloadstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onlostpointercapture: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onmousedown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmouseenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmouseleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmousemove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmouseout: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmouseover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmouseup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onpaste: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]] = js.undefined
  var onpause: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onplay: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onplaying: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onpointercancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerdown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointermove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerout: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onprogress: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]] = js.undefined
  var onratechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onreset: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onresize: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]] = js.undefined
  var onscroll: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onsecuritypolicyviolation: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]] = js.undefined
  var onseeked: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onseeking: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onselect: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onselectionchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onselectstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onstalled: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onsubmit: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onsuspend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var ontimeupdate: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var ontoggle: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var ontouchcancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  var ontouchend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  var ontouchmove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  var ontouchstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  var ontransitioncancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  var ontransitionend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  var ontransitionrun: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  var ontransitionstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  var onvolumechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onwaiting: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onwheel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]] = js.undefined
  var outerHTML: js.UndefOr[String] = js.undefined
  var ownerDocument: js.UndefOr[Document] = js.undefined
  var parentElement: js.UndefOr[HTMLElement] = js.undefined
  var parentNode: js.UndefOr[Node with ParentNode] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var prepend: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var previousElementSibling: js.UndefOr[Element] = js.undefined
  var previousSibling: js.UndefOr[ChildNode] = js.undefined
  var querySelector: js.UndefOr[js.Function1[a, HTMLAnchorElement | Null]] = js.undefined
  var querySelectorAll: js.UndefOr[js.Function1[a, NodeListOf[HTMLAnchorElement with Node]]] = js.undefined
  var referrerPolicy: js.UndefOr[String] = js.undefined
  var releasePointerCapture: js.UndefOr[js.Function1[/* pointerId */ Double, Unit]] = js.undefined
  var remove: js.UndefOr[js.Function0[Unit]] = js.undefined
  var removeAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Unit]] = js.undefined
  var removeAttributeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, Unit]] = js.undefined
  var removeAttributeNode: js.UndefOr[js.Function1[/* attr */ Attr, Attr]] = js.undefined
  var removeChild: js.UndefOr[js.Function1[/* oldChild */ Node, Node]] = js.undefined
  var removeEventListener: js.UndefOr[
    js.Function2[
      fullscreenchange, 
      /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event, _], 
      Unit
    ]
  ] = js.undefined
  var replaceChild: js.UndefOr[js.Function2[/* newChild */ Node, /* oldChild */ Node, Node]] = js.undefined
  var replaceWith: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var requestFullscreen: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  var requestPointerLock: js.UndefOr[js.Function0[Unit]] = js.undefined
  var scroll: js.UndefOr[js.Function0[Unit]] = js.undefined
  var scrollBy: js.UndefOr[js.Function0[Unit]] = js.undefined
  var scrollHeight: js.UndefOr[Double] = js.undefined
  var scrollIntoView: js.UndefOr[js.Function0[Unit]] = js.undefined
  var scrollLeft: js.UndefOr[Double] = js.undefined
  var scrollTo: js.UndefOr[js.Function0[Unit]] = js.undefined
  var scrollTop: js.UndefOr[Double] = js.undefined
  var scrollWidth: js.UndefOr[Double] = js.undefined
  var setAttribute: js.UndefOr[js.Function2[/* qualifiedName */ String, /* value */ String, Unit]] = js.undefined
  var setAttributeNS: js.UndefOr[
    js.Function3[/* namespace */ String, /* qualifiedName */ String, /* value */ String, Unit]
  ] = js.undefined
  var setAttributeNode: js.UndefOr[js.Function1[/* attr */ Attr, Attr | Null]] = js.undefined
  var setAttributeNodeNS: js.UndefOr[js.Function1[/* attr */ Attr, Attr | Null]] = js.undefined
  var setPointerCapture: js.UndefOr[js.Function1[/* pointerId */ Double, Unit]] = js.undefined
  var shadowRoot: js.UndefOr[ShadowRoot] = js.undefined
  var sizes: js.UndefOr[String] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var spellcheck: js.UndefOr[Boolean] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var srcset: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSStyleDeclaration] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var tagName: js.UndefOr[String] = js.undefined
  var textContent: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var toggleAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Boolean]] = js.undefined
  var translate: js.UndefOr[Boolean] = js.undefined
  var useMap: js.UndefOr[String] = js.undefined
  var vspace: js.UndefOr[Double] = js.undefined
  var webkitMatchesSelector: js.UndefOr[js.Function1[/* selectors */ String, Boolean]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object PartialHTMLImageElement {
  @scala.inline
  def apply(): PartialHTMLImageElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHTMLImageElement]
  }
  @scala.inline
  implicit class PartialHTMLImageElementOps[Self <: PartialHTMLImageElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setATTRIBUTE_NODE(value: Double): Self = this.set("ATTRIBUTE_NODE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteATTRIBUTE_NODE: Self = this.set("ATTRIBUTE_NODE", js.undefined)
    @scala.inline
    def setCDATA_SECTION_NODE(value: Double): Self = this.set("CDATA_SECTION_NODE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCDATA_SECTION_NODE: Self = this.set("CDATA_SECTION_NODE", js.undefined)
    @scala.inline
    def setCOMMENT_NODE(value: Double): Self = this.set("COMMENT_NODE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCOMMENT_NODE: Self = this.set("COMMENT_NODE", js.undefined)
    @scala.inline
    def setDOCUMENT_FRAGMENT_NODE(value: Double): Self = this.set("DOCUMENT_FRAGMENT_NODE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDOCUMENT_FRAGMENT_NODE: Self = this.set("DOCUMENT_FRAGMENT_NODE", js.undefined)
    @scala.inline
    def setDOCUMENT_NODE(value: Double): Self = this.set("DOCUMENT_NODE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDOCUMENT_NODE: Self = this.set("DOCUMENT_NODE", js.undefined)
    @scala.inline
    def setDOCUMENT_POSITION_CONTAINED_BY(value: Double): Self = this.set("DOCUMENT_POSITION_CONTAINED_BY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDOCUMENT_POSITION_CONTAINED_BY: Self = this.set("DOCUMENT_POSITION_CONTAINED_BY", js.undefined)
    @scala.inline
    def setDOCUMENT_POSITION_CONTAINS(value: Double): Self = this.set("DOCUMENT_POSITION_CONTAINS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDOCUMENT_POSITION_CONTAINS: Self = this.set("DOCUMENT_POSITION_CONTAINS", js.undefined)
    @scala.inline
    def setDOCUMENT_POSITION_DISCONNECTED(value: Double): Self = this.set("DOCUMENT_POSITION_DISCONNECTED", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDOCUMENT_POSITION_DISCONNECTED: Self = this.set("DOCUMENT_POSITION_DISCONNECTED", js.undefined)
    @scala.inline
    def setDOCUMENT_POSITION_FOLLOWING(value: Double): Self = this.set("DOCUMENT_POSITION_FOLLOWING", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDOCUMENT_POSITION_FOLLOWING: Self = this.set("DOCUMENT_POSITION_FOLLOWING", js.undefined)
    @scala.inline
    def setDOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC(value: Double): Self = this.set("DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Self = this.set("DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC", js.undefined)
    @scala.inline
    def setDOCUMENT_POSITION_PRECEDING(value: Double): Self = this.set("DOCUMENT_POSITION_PRECEDING", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDOCUMENT_POSITION_PRECEDING: Self = this.set("DOCUMENT_POSITION_PRECEDING", js.undefined)
    @scala.inline
    def setDOCUMENT_TYPE_NODE(value: Double): Self = this.set("DOCUMENT_TYPE_NODE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDOCUMENT_TYPE_NODE: Self = this.set("DOCUMENT_TYPE_NODE", js.undefined)
    @scala.inline
    def setELEMENT_NODE(value: Double): Self = this.set("ELEMENT_NODE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteELEMENT_NODE: Self = this.set("ELEMENT_NODE", js.undefined)
    @scala.inline
    def setENTITY_NODE(value: Double): Self = this.set("ENTITY_NODE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteENTITY_NODE: Self = this.set("ENTITY_NODE", js.undefined)
    @scala.inline
    def setENTITY_REFERENCE_NODE(value: Double): Self = this.set("ENTITY_REFERENCE_NODE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteENTITY_REFERENCE_NODE: Self = this.set("ENTITY_REFERENCE_NODE", js.undefined)
    @scala.inline
    def setNOTATION_NODE(value: Double): Self = this.set("NOTATION_NODE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNOTATION_NODE: Self = this.set("NOTATION_NODE", js.undefined)
    @scala.inline
    def setPROCESSING_INSTRUCTION_NODE(value: Double): Self = this.set("PROCESSING_INSTRUCTION_NODE", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePROCESSING_INSTRUCTION_NODE: Self = this.set("PROCESSING_INSTRUCTION_NODE", js.undefined)
    @scala.inline
    def setTEXT_NODE(value: Double): Self = this.set("TEXT_NODE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTEXT_NODE: Self = this.set("TEXT_NODE", js.undefined)
    @scala.inline
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKey: Self = this.set("accessKey", js.undefined)
    @scala.inline
    def setAccessKeyLabel(value: String): Self = this.set("accessKeyLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKeyLabel: Self = this.set("accessKeyLabel", js.undefined)
    @scala.inline
    def setAddEventListener(
      value: (fullscreenchange, /* listener */ js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]) => Unit
    ): Self = this.set("addEventListener", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAddEventListener: Self = this.set("addEventListener", js.undefined)
    @scala.inline
    def setAfter(value: /* repeated */ Node | String => Unit): Self = this.set("after", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    @scala.inline
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setAnimate(value: /* keyframes */ js.Array[Keyframe] => Animation): Self = this.set("animate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setAppend(value: /* repeated */ Node | String => Unit): Self = this.set("append", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAppend: Self = this.set("append", js.undefined)
    @scala.inline
    def setAppendChild(value: /* newChild */ Node => Node): Self = this.set("appendChild", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAppendChild: Self = this.set("appendChild", js.undefined)
    @scala.inline
    def setAssignedSlot(value: HTMLSlotElement): Self = this.set("assignedSlot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignedSlot: Self = this.set("assignedSlot", js.undefined)
    @scala.inline
    def setAttachShadow(value: /* init */ ShadowRootInit => ShadowRoot): Self = this.set("attachShadow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAttachShadow: Self = this.set("attachShadow", js.undefined)
    @scala.inline
    def setAttributes(value: NamedNodeMap): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setAutocapitalize(value: String): Self = this.set("autocapitalize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutocapitalize: Self = this.set("autocapitalize", js.undefined)
    @scala.inline
    def setAutofocus(value: Boolean): Self = this.set("autofocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutofocus: Self = this.set("autofocus", js.undefined)
    @scala.inline
    def setBaseURI(value: String): Self = this.set("baseURI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseURI: Self = this.set("baseURI", js.undefined)
    @scala.inline
    def setBefore(value: /* repeated */ Node | String => Unit): Self = this.set("before", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setBlur(value: () => Unit): Self = this.set("blur", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    @scala.inline
    def setBorder(value: String): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setChildElementCount(value: Double): Self = this.set("childElementCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildElementCount: Self = this.set("childElementCount", js.undefined)
    @scala.inline
    def setChildNodes(value: NodeListOf[ChildNode with Node]): Self = this.set("childNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildNodes: Self = this.set("childNodes", js.undefined)
    @scala.inline
    def setChildren(value: HTMLCollection): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassList(value: DOMTokenList): Self = this.set("classList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassList: Self = this.set("classList", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClick(value: () => Unit): Self = this.set("click", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    @scala.inline
    def setClientHeight(value: Double): Self = this.set("clientHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientHeight: Self = this.set("clientHeight", js.undefined)
    @scala.inline
    def setClientLeft(value: Double): Self = this.set("clientLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientLeft: Self = this.set("clientLeft", js.undefined)
    @scala.inline
    def setClientTop(value: Double): Self = this.set("clientTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientTop: Self = this.set("clientTop", js.undefined)
    @scala.inline
    def setClientWidth(value: Double): Self = this.set("clientWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientWidth: Self = this.set("clientWidth", js.undefined)
    @scala.inline
    def setCloneNode(value: () => Node): Self = this.set("cloneNode", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCloneNode: Self = this.set("cloneNode", js.undefined)
    @scala.inline
    def setClosest(value: a => HTMLAnchorElement | Null): Self = this.set("closest", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClosest: Self = this.set("closest", js.undefined)
    @scala.inline
    def setCompareDocumentPosition(value: /* other */ Node => Double): Self = this.set("compareDocumentPosition", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCompareDocumentPosition: Self = this.set("compareDocumentPosition", js.undefined)
    @scala.inline
    def setComplete(value: Boolean): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setContains(value: /* other */ Node => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    @scala.inline
    def setContentEditable(value: String): Self = this.set("contentEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentEditable: Self = this.set("contentEditable", js.undefined)
    @scala.inline
    def setCrossOrigin(value: String): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    @scala.inline
    def setCurrentSrc(value: String): Self = this.set("currentSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentSrc: Self = this.set("currentSrc", js.undefined)
    @scala.inline
    def setDataset(value: DOMStringMap): Self = this.set("dataset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataset: Self = this.set("dataset", js.undefined)
    @scala.inline
    def setDecode(value: () => js.Promise[Unit]): Self = this.set("decode", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDecode: Self = this.set("decode", js.undefined)
    @scala.inline
    def setDecoding(value: async | sync | auto): Self = this.set("decoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecoding: Self = this.set("decoding", js.undefined)
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setDispatchEvent(value: /* event */ Event => Boolean): Self = this.set("dispatchEvent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDispatchEvent: Self = this.set("dispatchEvent", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setFirstChild(value: ChildNode): Self = this.set("firstChild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstChild: Self = this.set("firstChild", js.undefined)
    @scala.inline
    def setFirstElementChild(value: Element): Self = this.set("firstElementChild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstElementChild: Self = this.set("firstElementChild", js.undefined)
    @scala.inline
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setGetAnimations(value: () => js.Array[Animation]): Self = this.set("getAnimations", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAnimations: Self = this.set("getAnimations", js.undefined)
    @scala.inline
    def setGetAttribute(value: /* qualifiedName */ String => String | Null): Self = this.set("getAttribute", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetAttribute: Self = this.set("getAttribute", js.undefined)
    @scala.inline
    def setGetAttributeNS(value: (/* namespace */ String, /* localName */ String) => String | Null): Self = this.set("getAttributeNS", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetAttributeNS: Self = this.set("getAttributeNS", js.undefined)
    @scala.inline
    def setGetAttributeNames(value: () => js.Array[String]): Self = this.set("getAttributeNames", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAttributeNames: Self = this.set("getAttributeNames", js.undefined)
    @scala.inline
    def setGetAttributeNode(value: /* name */ String => Attr | Null): Self = this.set("getAttributeNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetAttributeNode: Self = this.set("getAttributeNode", js.undefined)
    @scala.inline
    def setGetAttributeNodeNS(value: (/* namespaceURI */ String, /* localName */ String) => Attr | Null): Self = this.set("getAttributeNodeNS", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetAttributeNodeNS: Self = this.set("getAttributeNodeNS", js.undefined)
    @scala.inline
    def setGetBoundingClientRect(value: () => DOMRect): Self = this.set("getBoundingClientRect", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBoundingClientRect: Self = this.set("getBoundingClientRect", js.undefined)
    @scala.inline
    def setGetClientRects(value: () => DOMRectList): Self = this.set("getClientRects", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetClientRects: Self = this.set("getClientRects", js.undefined)
    @scala.inline
    def setGetElementsByClassName(value: /* classNames */ String => HTMLCollectionOf[Element]): Self = this.set("getElementsByClassName", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetElementsByClassName: Self = this.set("getElementsByClassName", js.undefined)
    @scala.inline
    def setGetElementsByTagName(value: a => HTMLCollectionOf[HTMLAnchorElement]): Self = this.set("getElementsByTagName", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetElementsByTagName: Self = this.set("getElementsByTagName", js.undefined)
    @scala.inline
    def setGetElementsByTagNameNS(
      value: (httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, /* localName */ String) => HTMLCollectionOf[HTMLElement]
    ): Self = this.set("getElementsByTagNameNS", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetElementsByTagNameNS: Self = this.set("getElementsByTagNameNS", js.undefined)
    @scala.inline
    def setGetRootNode(value: () => Node): Self = this.set("getRootNode", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRootNode: Self = this.set("getRootNode", js.undefined)
    @scala.inline
    def setHasAttribute(value: /* qualifiedName */ String => Boolean): Self = this.set("hasAttribute", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHasAttribute: Self = this.set("hasAttribute", js.undefined)
    @scala.inline
    def setHasAttributeNS(value: (/* namespace */ String, /* localName */ String) => Boolean): Self = this.set("hasAttributeNS", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHasAttributeNS: Self = this.set("hasAttributeNS", js.undefined)
    @scala.inline
    def setHasAttributes(value: () => Boolean): Self = this.set("hasAttributes", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHasAttributes: Self = this.set("hasAttributes", js.undefined)
    @scala.inline
    def setHasChildNodes(value: () => Boolean): Self = this.set("hasChildNodes", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHasChildNodes: Self = this.set("hasChildNodes", js.undefined)
    @scala.inline
    def setHasPointerCapture(value: /* pointerId */ Double => Boolean): Self = this.set("hasPointerCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHasPointerCapture: Self = this.set("hasPointerCapture", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setHspace(value: Double): Self = this.set("hspace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHspace: Self = this.set("hspace", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInnerHTML(value: String): Self = this.set("innerHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerHTML: Self = this.set("innerHTML", js.undefined)
    @scala.inline
    def setInnerText(value: String): Self = this.set("innerText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerText: Self = this.set("innerText", js.undefined)
    @scala.inline
    def setInputMode(value: String): Self = this.set("inputMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputMode: Self = this.set("inputMode", js.undefined)
    @scala.inline
    def setInsertAdjacentElement(value: (/* position */ InsertPosition, /* insertedElement */ Element) => Element | Null): Self = this.set("insertAdjacentElement", js.Any.fromFunction2(value))
    @scala.inline
    def deleteInsertAdjacentElement: Self = this.set("insertAdjacentElement", js.undefined)
    @scala.inline
    def setInsertAdjacentHTML(value: (/* where */ InsertPosition, /* html */ String) => Unit): Self = this.set("insertAdjacentHTML", js.Any.fromFunction2(value))
    @scala.inline
    def deleteInsertAdjacentHTML: Self = this.set("insertAdjacentHTML", js.undefined)
    @scala.inline
    def setInsertAdjacentText(value: (/* where */ InsertPosition, /* text */ String) => Unit): Self = this.set("insertAdjacentText", js.Any.fromFunction2(value))
    @scala.inline
    def deleteInsertAdjacentText: Self = this.set("insertAdjacentText", js.undefined)
    @scala.inline
    def setInsertBefore(value: (/* newChild */ Node, /* refChild */ Node) => Node): Self = this.set("insertBefore", js.Any.fromFunction2(value))
    @scala.inline
    def deleteInsertBefore: Self = this.set("insertBefore", js.undefined)
    @scala.inline
    def setIsConnected(value: Boolean): Self = this.set("isConnected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsConnected: Self = this.set("isConnected", js.undefined)
    @scala.inline
    def setIsContentEditable(value: Boolean): Self = this.set("isContentEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsContentEditable: Self = this.set("isContentEditable", js.undefined)
    @scala.inline
    def setIsDefaultNamespace(value: /* namespace */ String => Boolean): Self = this.set("isDefaultNamespace", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsDefaultNamespace: Self = this.set("isDefaultNamespace", js.undefined)
    @scala.inline
    def setIsEqualNode(value: /* otherNode */ Node => Boolean): Self = this.set("isEqualNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsEqualNode: Self = this.set("isEqualNode", js.undefined)
    @scala.inline
    def setIsMap(value: Boolean): Self = this.set("isMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsMap: Self = this.set("isMap", js.undefined)
    @scala.inline
    def setIsSameNode(value: /* otherNode */ Node => Boolean): Self = this.set("isSameNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsSameNode: Self = this.set("isSameNode", js.undefined)
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setLastChild(value: ChildNode): Self = this.set("lastChild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastChild: Self = this.set("lastChild", js.undefined)
    @scala.inline
    def setLastElementChild(value: Element): Self = this.set("lastElementChild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastElementChild: Self = this.set("lastElementChild", js.undefined)
    @scala.inline
    def setLocalName(value: String): Self = this.set("localName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalName: Self = this.set("localName", js.undefined)
    @scala.inline
    def setLongDesc(value: String): Self = this.set("longDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongDesc: Self = this.set("longDesc", js.undefined)
    @scala.inline
    def setLookupNamespaceURI(value: /* prefix */ String => String | Null): Self = this.set("lookupNamespaceURI", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLookupNamespaceURI: Self = this.set("lookupNamespaceURI", js.undefined)
    @scala.inline
    def setLookupPrefix(value: /* namespace */ String => String | Null): Self = this.set("lookupPrefix", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLookupPrefix: Self = this.set("lookupPrefix", js.undefined)
    @scala.inline
    def setLowsrc(value: String): Self = this.set("lowsrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowsrc: Self = this.set("lowsrc", js.undefined)
    @scala.inline
    def setMatches(value: /* selectors */ String => Boolean): Self = this.set("matches", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMatches: Self = this.set("matches", js.undefined)
    @scala.inline
    def setMsGetRegionContent(value: () => _): Self = this.set("msGetRegionContent", js.Any.fromFunction0(value))
    @scala.inline
    def deleteMsGetRegionContent: Self = this.set("msGetRegionContent", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamespaceURI(value: String): Self = this.set("namespaceURI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespaceURI: Self = this.set("namespaceURI", js.undefined)
    @scala.inline
    def setNaturalHeight(value: Double): Self = this.set("naturalHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNaturalHeight: Self = this.set("naturalHeight", js.undefined)
    @scala.inline
    def setNaturalWidth(value: Double): Self = this.set("naturalWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNaturalWidth: Self = this.set("naturalWidth", js.undefined)
    @scala.inline
    def setNextElementSibling(value: Element): Self = this.set("nextElementSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextElementSibling: Self = this.set("nextElementSibling", js.undefined)
    @scala.inline
    def setNextSibling(value: ChildNode): Self = this.set("nextSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextSibling: Self = this.set("nextSibling", js.undefined)
    @scala.inline
    def setNodeName(value: String): Self = this.set("nodeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeName: Self = this.set("nodeName", js.undefined)
    @scala.inline
    def setNodeType(value: Double): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeType: Self = this.set("nodeType", js.undefined)
    @scala.inline
    def setNodeValue(value: String): Self = this.set("nodeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeValue: Self = this.set("nodeValue", js.undefined)
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    @scala.inline
    def setNormalize(value: () => Unit): Self = this.set("normalize", js.Any.fromFunction0(value))
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
    @scala.inline
    def setOffsetHeight(value: Double): Self = this.set("offsetHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetHeight: Self = this.set("offsetHeight", js.undefined)
    @scala.inline
    def setOffsetLeft(value: Double): Self = this.set("offsetLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetLeft: Self = this.set("offsetLeft", js.undefined)
    @scala.inline
    def setOffsetParent(value: Element): Self = this.set("offsetParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetParent: Self = this.set("offsetParent", js.undefined)
    @scala.inline
    def setOffsetTop(value: Double): Self = this.set("offsetTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetTop: Self = this.set("offsetTop", js.undefined)
    @scala.inline
    def setOffsetWidth(value: Double): Self = this.set("offsetWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetWidth: Self = this.set("offsetWidth", js.undefined)
    @scala.inline
    def setOnabort(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ UIEvent, _]): Self = this.set("onabort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnabort: Self = this.set("onabort", js.undefined)
    @scala.inline
    def setOnanimationcancel(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ AnimationEvent, _]): Self = this.set("onanimationcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnanimationcancel: Self = this.set("onanimationcancel", js.undefined)
    @scala.inline
    def setOnanimationend(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ AnimationEvent, _]): Self = this.set("onanimationend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnanimationend: Self = this.set("onanimationend", js.undefined)
    @scala.inline
    def setOnanimationiteration(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ AnimationEvent, _]): Self = this.set("onanimationiteration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnanimationiteration: Self = this.set("onanimationiteration", js.undefined)
    @scala.inline
    def setOnanimationstart(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ AnimationEvent, _]): Self = this.set("onanimationstart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnanimationstart: Self = this.set("onanimationstart", js.undefined)
    @scala.inline
    def setOnauxclick(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ MouseEvent, _]): Self = this.set("onauxclick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnauxclick: Self = this.set("onauxclick", js.undefined)
    @scala.inline
    def setOnblur(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ FocusEvent, _]): Self = this.set("onblur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnblur: Self = this.set("onblur", js.undefined)
    @scala.inline
    def setOncancel(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("oncancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOncancel: Self = this.set("oncancel", js.undefined)
    @scala.inline
    def setOncanplay(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("oncanplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOncanplay: Self = this.set("oncanplay", js.undefined)
    @scala.inline
    def setOncanplaythrough(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("oncanplaythrough", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOncanplaythrough: Self = this.set("oncanplaythrough", js.undefined)
    @scala.inline
    def setOnchange(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("onchange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnchange: Self = this.set("onchange", js.undefined)
    @scala.inline
    def setOnclick(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ MouseEvent, _]): Self = this.set("onclick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnclick: Self = this.set("onclick", js.undefined)
    @scala.inline
    def setOnclose(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("onclose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnclose: Self = this.set("onclose", js.undefined)
    @scala.inline
    def setOncontextmenu(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ MouseEvent, _]): Self = this.set("oncontextmenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOncontextmenu: Self = this.set("oncontextmenu", js.undefined)
    @scala.inline
    def setOncopy(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ ClipboardEvent, _]): Self = this.set("oncopy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOncopy: Self = this.set("oncopy", js.undefined)
    @scala.inline
    def setOncuechange(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("oncuechange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOncuechange: Self = this.set("oncuechange", js.undefined)
    @scala.inline
    def setOncut(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ ClipboardEvent, _]): Self = this.set("oncut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOncut: Self = this.set("oncut", js.undefined)
    @scala.inline
    def setOndblclick(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ MouseEvent, _]): Self = this.set("ondblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndblclick: Self = this.set("ondblclick", js.undefined)
    @scala.inline
    def setOndrag(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ DragEvent, _]): Self = this.set("ondrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndrag: Self = this.set("ondrag", js.undefined)
    @scala.inline
    def setOndragend(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ DragEvent, _]): Self = this.set("ondragend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndragend: Self = this.set("ondragend", js.undefined)
    @scala.inline
    def setOndragenter(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ DragEvent, _]): Self = this.set("ondragenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndragenter: Self = this.set("ondragenter", js.undefined)
    @scala.inline
    def setOndragexit(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("ondragexit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndragexit: Self = this.set("ondragexit", js.undefined)
    @scala.inline
    def setOndragleave(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ DragEvent, _]): Self = this.set("ondragleave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndragleave: Self = this.set("ondragleave", js.undefined)
    @scala.inline
    def setOndragover(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ DragEvent, _]): Self = this.set("ondragover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndragover: Self = this.set("ondragover", js.undefined)
    @scala.inline
    def setOndragstart(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ DragEvent, _]): Self = this.set("ondragstart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndragstart: Self = this.set("ondragstart", js.undefined)
    @scala.inline
    def setOndrop(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ DragEvent, _]): Self = this.set("ondrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndrop: Self = this.set("ondrop", js.undefined)
    @scala.inline
    def setOndurationchange(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("ondurationchange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndurationchange: Self = this.set("ondurationchange", js.undefined)
    @scala.inline
    def setOnemptied(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("onemptied", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnemptied: Self = this.set("onemptied", js.undefined)
    @scala.inline
    def setOnended(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("onended", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnended: Self = this.set("onended", js.undefined)
    @scala.inline
    def setOnerror(
      value: (/* event */ Event | String, /* source */ js.UndefOr[String], /* lineno */ js.UndefOr[Double], /* colno */ js.UndefOr[Double], /* error */ js.UndefOr[js.Error]) => js.Any
    ): Self = this.set("onerror", js.Any.fromFunction5(value))
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    @scala.inline
    def setOnerrorNull: Self = this.set("onerror", null)
    @scala.inline
    def setOnfocus(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ FocusEvent, _]): Self = this.set("onfocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnfocus: Self = this.set("onfocus", js.undefined)
    @scala.inline
    def setOnfullscreenchange(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("onfullscreenchange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnfullscreenchange: Self = this.set("onfullscreenchange", js.undefined)
    @scala.inline
    def setOnfullscreenerror(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("onfullscreenerror", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnfullscreenerror: Self = this.set("onfullscreenerror", js.undefined)
    @scala.inline
    def setOngotpointercapture(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ PointerEvent, _]): Self = this.set("ongotpointercapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOngotpointercapture: Self = this.set("ongotpointercapture", js.undefined)
    @scala.inline
    def setOninput(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("oninput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOninput: Self = this.set("oninput", js.undefined)
    @scala.inline
    def setOninvalid(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("oninvalid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOninvalid: Self = this.set("oninvalid", js.undefined)
    @scala.inline
    def setOnkeydown(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ KeyboardEvent, _]): Self = this.set("onkeydown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnkeydown: Self = this.set("onkeydown", js.undefined)
    @scala.inline
    def setOnkeypress(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ KeyboardEvent, _]): Self = this.set("onkeypress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnkeypress: Self = this.set("onkeypress", js.undefined)
    @scala.inline
    def setOnkeyup(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ KeyboardEvent, _]): Self = this.set("onkeyup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnkeyup: Self = this.set("onkeyup", js.undefined)
    @scala.inline
    def setOnload(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("onload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnload: Self = this.set("onload", js.undefined)
    @scala.inline
    def setOnloadeddata(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("onloadeddata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnloadeddata: Self = this.set("onloadeddata", js.undefined)
    @scala.inline
    def setOnloadedmetadata(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("onloadedmetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnloadedmetadata: Self = this.set("onloadedmetadata", js.undefined)
    @scala.inline
    def setOnloadstart(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("onloadstart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnloadstart: Self = this.set("onloadstart", js.undefined)
    @scala.inline
    def setOnlostpointercapture(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ PointerEvent, _]): Self = this.set("onlostpointercapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlostpointercapture: Self = this.set("onlostpointercapture", js.undefined)
    @scala.inline
    def setOnmousedown(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ MouseEvent, _]): Self = this.set("onmousedown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmousedown: Self = this.set("onmousedown", js.undefined)
    @scala.inline
    def setOnmouseenter(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ MouseEvent, _]): Self = this.set("onmouseenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmouseenter: Self = this.set("onmouseenter", js.undefined)
    @scala.inline
    def setOnmouseleave(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ MouseEvent, _]): Self = this.set("onmouseleave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmouseleave: Self = this.set("onmouseleave", js.undefined)
    @scala.inline
    def setOnmousemove(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ MouseEvent, _]): Self = this.set("onmousemove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmousemove: Self = this.set("onmousemove", js.undefined)
    @scala.inline
    def setOnmouseout(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ MouseEvent, _]): Self = this.set("onmouseout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmouseout: Self = this.set("onmouseout", js.undefined)
    @scala.inline
    def setOnmouseover(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ MouseEvent, _]): Self = this.set("onmouseover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmouseover: Self = this.set("onmouseover", js.undefined)
    @scala.inline
    def setOnmouseup(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ MouseEvent, _]): Self = this.set("onmouseup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmouseup: Self = this.set("onmouseup", js.undefined)
    @scala.inline
    def setOnpaste(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ ClipboardEvent, _]): Self = this.set("onpaste", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpaste: Self = this.set("onpaste", js.undefined)
    @scala.inline
    def setOnpause(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("onpause", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpause: Self = this.set("onpause", js.undefined)
    @scala.inline
    def setOnplay(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("onplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnplay: Self = this.set("onplay", js.undefined)
    @scala.inline
    def setOnplaying(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("onplaying", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnplaying: Self = this.set("onplaying", js.undefined)
    @scala.inline
    def setOnpointercancel(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ PointerEvent, _]): Self = this.set("onpointercancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointercancel: Self = this.set("onpointercancel", js.undefined)
    @scala.inline
    def setOnpointerdown(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ PointerEvent, _]): Self = this.set("onpointerdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointerdown: Self = this.set("onpointerdown", js.undefined)
    @scala.inline
    def setOnpointerenter(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ PointerEvent, _]): Self = this.set("onpointerenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointerenter: Self = this.set("onpointerenter", js.undefined)
    @scala.inline
    def setOnpointerleave(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ PointerEvent, _]): Self = this.set("onpointerleave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointerleave: Self = this.set("onpointerleave", js.undefined)
    @scala.inline
    def setOnpointermove(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ PointerEvent, _]): Self = this.set("onpointermove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointermove: Self = this.set("onpointermove", js.undefined)
    @scala.inline
    def setOnpointerout(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ PointerEvent, _]): Self = this.set("onpointerout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointerout: Self = this.set("onpointerout", js.undefined)
    @scala.inline
    def setOnpointerover(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ PointerEvent, _]): Self = this.set("onpointerover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointerover: Self = this.set("onpointerover", js.undefined)
    @scala.inline
    def setOnpointerup(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ PointerEvent, _]): Self = this.set("onpointerup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointerup: Self = this.set("onpointerup", js.undefined)
    @scala.inline
    def setOnprogress(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ ProgressEvent, _]): Self = this.set("onprogress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnprogress: Self = this.set("onprogress", js.undefined)
    @scala.inline
    def setOnratechange(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("onratechange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnratechange: Self = this.set("onratechange", js.undefined)
    @scala.inline
    def setOnreset(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("onreset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnreset: Self = this.set("onreset", js.undefined)
    @scala.inline
    def setOnresize(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ UIEvent, _]): Self = this.set("onresize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnresize: Self = this.set("onresize", js.undefined)
    @scala.inline
    def setOnscroll(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("onscroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnscroll: Self = this.set("onscroll", js.undefined)
    @scala.inline
    def setOnsecuritypolicyviolation(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ SecurityPolicyViolationEvent, _]): Self = this.set("onsecuritypolicyviolation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnsecuritypolicyviolation: Self = this.set("onsecuritypolicyviolation", js.undefined)
    @scala.inline
    def setOnseeked(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("onseeked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnseeked: Self = this.set("onseeked", js.undefined)
    @scala.inline
    def setOnseeking(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("onseeking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnseeking: Self = this.set("onseeking", js.undefined)
    @scala.inline
    def setOnselect(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("onselect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnselect: Self = this.set("onselect", js.undefined)
    @scala.inline
    def setOnselectionchange(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("onselectionchange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnselectionchange: Self = this.set("onselectionchange", js.undefined)
    @scala.inline
    def setOnselectstart(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("onselectstart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnselectstart: Self = this.set("onselectstart", js.undefined)
    @scala.inline
    def setOnstalled(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("onstalled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnstalled: Self = this.set("onstalled", js.undefined)
    @scala.inline
    def setOnsubmit(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("onsubmit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnsubmit: Self = this.set("onsubmit", js.undefined)
    @scala.inline
    def setOnsuspend(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("onsuspend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnsuspend: Self = this.set("onsuspend", js.undefined)
    @scala.inline
    def setOntimeupdate(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("ontimeupdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntimeupdate: Self = this.set("ontimeupdate", js.undefined)
    @scala.inline
    def setOntoggle(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("ontoggle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntoggle: Self = this.set("ontoggle", js.undefined)
    @scala.inline
    def setOntouchcancel(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ TouchEvent, _]): Self = this.set("ontouchcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntouchcancel: Self = this.set("ontouchcancel", js.undefined)
    @scala.inline
    def setOntouchend(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ TouchEvent, _]): Self = this.set("ontouchend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntouchend: Self = this.set("ontouchend", js.undefined)
    @scala.inline
    def setOntouchmove(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ TouchEvent, _]): Self = this.set("ontouchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntouchmove: Self = this.set("ontouchmove", js.undefined)
    @scala.inline
    def setOntouchstart(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ TouchEvent, _]): Self = this.set("ontouchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntouchstart: Self = this.set("ontouchstart", js.undefined)
    @scala.inline
    def setOntransitioncancel(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ TransitionEvent, _]): Self = this.set("ontransitioncancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntransitioncancel: Self = this.set("ontransitioncancel", js.undefined)
    @scala.inline
    def setOntransitionend(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ TransitionEvent, _]): Self = this.set("ontransitionend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntransitionend: Self = this.set("ontransitionend", js.undefined)
    @scala.inline
    def setOntransitionrun(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ TransitionEvent, _]): Self = this.set("ontransitionrun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntransitionrun: Self = this.set("ontransitionrun", js.undefined)
    @scala.inline
    def setOntransitionstart(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ TransitionEvent, _]): Self = this.set("ontransitionstart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntransitionstart: Self = this.set("ontransitionstart", js.undefined)
    @scala.inline
    def setOnvolumechange(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("onvolumechange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnvolumechange: Self = this.set("onvolumechange", js.undefined)
    @scala.inline
    def setOnwaiting(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]): Self = this.set("onwaiting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnwaiting: Self = this.set("onwaiting", js.undefined)
    @scala.inline
    def setOnwheel(value: js.ThisFunction1[PartialHTMLImageElement, /* ev */ WheelEvent, _]): Self = this.set("onwheel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnwheel: Self = this.set("onwheel", js.undefined)
    @scala.inline
    def setOuterHTML(value: String): Self = this.set("outerHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOuterHTML: Self = this.set("outerHTML", js.undefined)
    @scala.inline
    def setOwnerDocument(value: Document): Self = this.set("ownerDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerDocument: Self = this.set("ownerDocument", js.undefined)
    @scala.inline
    def setParentElement(value: HTMLElement): Self = this.set("parentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentElement: Self = this.set("parentElement", js.undefined)
    @scala.inline
    def setParentNode(value: Node with ParentNode): Self = this.set("parentNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentNode: Self = this.set("parentNode", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setPrepend(value: /* repeated */ Node | String => Unit): Self = this.set("prepend", js.Any.fromFunction1(value))
    @scala.inline
    def deletePrepend: Self = this.set("prepend", js.undefined)
    @scala.inline
    def setPreviousElementSibling(value: Element): Self = this.set("previousElementSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousElementSibling: Self = this.set("previousElementSibling", js.undefined)
    @scala.inline
    def setPreviousSibling(value: ChildNode): Self = this.set("previousSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousSibling: Self = this.set("previousSibling", js.undefined)
    @scala.inline
    def setQuerySelector(value: a => HTMLAnchorElement | Null): Self = this.set("querySelector", js.Any.fromFunction1(value))
    @scala.inline
    def deleteQuerySelector: Self = this.set("querySelector", js.undefined)
    @scala.inline
    def setQuerySelectorAll(value: a => NodeListOf[HTMLAnchorElement with Node]): Self = this.set("querySelectorAll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteQuerySelectorAll: Self = this.set("querySelectorAll", js.undefined)
    @scala.inline
    def setReferrerPolicy(value: String): Self = this.set("referrerPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferrerPolicy: Self = this.set("referrerPolicy", js.undefined)
    @scala.inline
    def setReleasePointerCapture(value: /* pointerId */ Double => Unit): Self = this.set("releasePointerCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReleasePointerCapture: Self = this.set("releasePointerCapture", js.undefined)
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setRemoveAttribute(value: /* qualifiedName */ String => Unit): Self = this.set("removeAttribute", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveAttribute: Self = this.set("removeAttribute", js.undefined)
    @scala.inline
    def setRemoveAttributeNS(value: (/* namespace */ String, /* localName */ String) => Unit): Self = this.set("removeAttributeNS", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRemoveAttributeNS: Self = this.set("removeAttributeNS", js.undefined)
    @scala.inline
    def setRemoveAttributeNode(value: /* attr */ Attr => Attr): Self = this.set("removeAttributeNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveAttributeNode: Self = this.set("removeAttributeNode", js.undefined)
    @scala.inline
    def setRemoveChild(value: /* oldChild */ Node => Node): Self = this.set("removeChild", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveChild: Self = this.set("removeChild", js.undefined)
    @scala.inline
    def setRemoveEventListener(
      value: (fullscreenchange, /* listener */ js.ThisFunction1[PartialHTMLImageElement, /* ev */ Event, _]) => Unit
    ): Self = this.set("removeEventListener", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRemoveEventListener: Self = this.set("removeEventListener", js.undefined)
    @scala.inline
    def setReplaceChild(value: (/* newChild */ Node, /* oldChild */ Node) => Node): Self = this.set("replaceChild", js.Any.fromFunction2(value))
    @scala.inline
    def deleteReplaceChild: Self = this.set("replaceChild", js.undefined)
    @scala.inline
    def setReplaceWith(value: /* repeated */ Node | String => Unit): Self = this.set("replaceWith", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReplaceWith: Self = this.set("replaceWith", js.undefined)
    @scala.inline
    def setRequestFullscreen(value: () => js.Promise[Unit]): Self = this.set("requestFullscreen", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRequestFullscreen: Self = this.set("requestFullscreen", js.undefined)
    @scala.inline
    def setRequestPointerLock(value: () => Unit): Self = this.set("requestPointerLock", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRequestPointerLock: Self = this.set("requestPointerLock", js.undefined)
    @scala.inline
    def setScroll(value: () => Unit): Self = this.set("scroll", js.Any.fromFunction0(value))
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    @scala.inline
    def setScrollBy(value: () => Unit): Self = this.set("scrollBy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteScrollBy: Self = this.set("scrollBy", js.undefined)
    @scala.inline
    def setScrollHeight(value: Double): Self = this.set("scrollHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollHeight: Self = this.set("scrollHeight", js.undefined)
    @scala.inline
    def setScrollIntoView(value: () => Unit): Self = this.set("scrollIntoView", js.Any.fromFunction0(value))
    @scala.inline
    def deleteScrollIntoView: Self = this.set("scrollIntoView", js.undefined)
    @scala.inline
    def setScrollLeft(value: Double): Self = this.set("scrollLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollLeft: Self = this.set("scrollLeft", js.undefined)
    @scala.inline
    def setScrollTo(value: () => Unit): Self = this.set("scrollTo", js.Any.fromFunction0(value))
    @scala.inline
    def deleteScrollTo: Self = this.set("scrollTo", js.undefined)
    @scala.inline
    def setScrollTop(value: Double): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollTop: Self = this.set("scrollTop", js.undefined)
    @scala.inline
    def setScrollWidth(value: Double): Self = this.set("scrollWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollWidth: Self = this.set("scrollWidth", js.undefined)
    @scala.inline
    def setSetAttribute(value: (/* qualifiedName */ String, /* value */ String) => Unit): Self = this.set("setAttribute", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetAttribute: Self = this.set("setAttribute", js.undefined)
    @scala.inline
    def setSetAttributeNS(value: (/* namespace */ String, /* qualifiedName */ String, /* value */ String) => Unit): Self = this.set("setAttributeNS", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSetAttributeNS: Self = this.set("setAttributeNS", js.undefined)
    @scala.inline
    def setSetAttributeNode(value: /* attr */ Attr => Attr | Null): Self = this.set("setAttributeNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAttributeNode: Self = this.set("setAttributeNode", js.undefined)
    @scala.inline
    def setSetAttributeNodeNS(value: /* attr */ Attr => Attr | Null): Self = this.set("setAttributeNodeNS", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAttributeNodeNS: Self = this.set("setAttributeNodeNS", js.undefined)
    @scala.inline
    def setSetPointerCapture(value: /* pointerId */ Double => Unit): Self = this.set("setPointerCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetPointerCapture: Self = this.set("setPointerCapture", js.undefined)
    @scala.inline
    def setShadowRoot(value: ShadowRoot): Self = this.set("shadowRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowRoot: Self = this.set("shadowRoot", js.undefined)
    @scala.inline
    def setSizes(value: String): Self = this.set("sizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
    @scala.inline
    def setSlot(value: String): Self = this.set("slot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlot: Self = this.set("slot", js.undefined)
    @scala.inline
    def setSpellcheck(value: Boolean): Self = this.set("spellcheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpellcheck: Self = this.set("spellcheck", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setSrcset(value: String): Self = this.set("srcset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcset: Self = this.set("srcset", js.undefined)
    @scala.inline
    def setStyle(value: CSSStyleDeclaration): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
    @scala.inline
    def setTextContent(value: String): Self = this.set("textContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextContent: Self = this.set("textContent", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setToggleAttribute(value: /* qualifiedName */ String => Boolean): Self = this.set("toggleAttribute", js.Any.fromFunction1(value))
    @scala.inline
    def deleteToggleAttribute: Self = this.set("toggleAttribute", js.undefined)
    @scala.inline
    def setTranslate(value: Boolean): Self = this.set("translate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    @scala.inline
    def setUseMap(value: String): Self = this.set("useMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseMap: Self = this.set("useMap", js.undefined)
    @scala.inline
    def setVspace(value: Double): Self = this.set("vspace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVspace: Self = this.set("vspace", js.undefined)
    @scala.inline
    def setWebkitMatchesSelector(value: /* selectors */ String => Boolean): Self = this.set("webkitMatchesSelector", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWebkitMatchesSelector: Self = this.set("webkitMatchesSelector", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

