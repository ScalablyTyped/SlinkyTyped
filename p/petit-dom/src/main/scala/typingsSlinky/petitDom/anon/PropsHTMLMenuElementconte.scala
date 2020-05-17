package typingsSlinky.petitDom.anon

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
import typingsSlinky.petitDom.mod.PetitDom.Content
import typingsSlinky.petitDom.mod.PetitDom.Key
import typingsSlinky.petitDom.petitDomStrings.a
import typingsSlinky.petitDom.petitDomStrings.fullscreenchange
import typingsSlinky.petitDom.petitDomStrings.httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml
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

/* Inlined petit-dom.petit-dom.PetitDom.Props<std.HTMLMenuElement> & {  content ? :petit-dom.petit-dom.PetitDom.Content | std.ReadonlyArray<petit-dom.petit-dom.PetitDom.Content>} */
@js.native
trait PropsHTMLMenuElementconte extends js.Object {
  var ATTRIBUTE_NODE: js.UndefOr[Double] = js.native
  var CDATA_SECTION_NODE: js.UndefOr[Double] = js.native
  var COMMENT_NODE: js.UndefOr[Double] = js.native
  var DOCUMENT_FRAGMENT_NODE: js.UndefOr[Double] = js.native
  var DOCUMENT_NODE: js.UndefOr[Double] = js.native
  var DOCUMENT_POSITION_CONTAINED_BY: js.UndefOr[Double] = js.native
  var DOCUMENT_POSITION_CONTAINS: js.UndefOr[Double] = js.native
  var DOCUMENT_POSITION_DISCONNECTED: js.UndefOr[Double] = js.native
  var DOCUMENT_POSITION_FOLLOWING: js.UndefOr[Double] = js.native
  var DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: js.UndefOr[Double] = js.native
  var DOCUMENT_POSITION_PRECEDING: js.UndefOr[Double] = js.native
  var DOCUMENT_TYPE_NODE: js.UndefOr[Double] = js.native
  var ELEMENT_NODE: js.UndefOr[Double] = js.native
  var ENTITY_NODE: js.UndefOr[Double] = js.native
  var ENTITY_REFERENCE_NODE: js.UndefOr[Double] = js.native
  var NOTATION_NODE: js.UndefOr[Double] = js.native
  var PROCESSING_INSTRUCTION_NODE: js.UndefOr[Double] = js.native
  var TEXT_NODE: js.UndefOr[Double] = js.native
  var accessKey: js.UndefOr[String] = js.native
  var accessKeyLabel: js.UndefOr[String] = js.native
  var addEventListener: js.UndefOr[
    js.Function2[
      fullscreenchange, 
      /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event, _], 
      Unit
    ]
  ] = js.native
  var after: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.native
  var animate: js.UndefOr[js.Function1[/* keyframes */ js.Array[Keyframe], Animation]] = js.native
  var append: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.native
  var appendChild: js.UndefOr[js.Function1[/* newChild */ Node, Node]] = js.native
  var assignedSlot: js.UndefOr[HTMLSlotElement] = js.native
  var attachShadow: js.UndefOr[js.Function1[/* init */ ShadowRootInit, ShadowRoot]] = js.native
  var attributes: js.UndefOr[NamedNodeMap] = js.native
  var autocapitalize: js.UndefOr[String] = js.native
  var autofocus: js.UndefOr[Boolean] = js.native
  var baseURI: js.UndefOr[String] = js.native
  var before: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.native
  var blur: js.UndefOr[js.Function0[Unit]] = js.native
  var childElementCount: js.UndefOr[Double] = js.native
  var childNodes: js.UndefOr[NodeListOf[ChildNode with Node]] = js.native
  var children: js.UndefOr[HTMLCollection] = js.native
  var classList: js.UndefOr[DOMTokenList] = js.native
  var className: js.UndefOr[String] = js.native
  var click: js.UndefOr[js.Function0[Unit]] = js.native
  var clientHeight: js.UndefOr[Double] = js.native
  var clientLeft: js.UndefOr[Double] = js.native
  var clientTop: js.UndefOr[Double] = js.native
  var clientWidth: js.UndefOr[Double] = js.native
  var cloneNode: js.UndefOr[js.Function0[Node]] = js.native
  var closest: js.UndefOr[js.Function1[a, HTMLAnchorElement | Null]] = js.native
  var compact: js.UndefOr[Boolean] = js.native
  var compareDocumentPosition: js.UndefOr[js.Function1[/* other */ Node, Double]] = js.native
  var contains: js.UndefOr[js.Function1[/* other */ Node, Boolean]] = js.native
  var content: js.UndefOr[Content | js.Array[Content]] = js.native
  var contentEditable: js.UndefOr[String] = js.native
  var dataset: js.UndefOr[DOMStringMap] = js.native
  var dir: js.UndefOr[String] = js.native
  var dispatchEvent: js.UndefOr[js.Function1[/* event */ Event, Boolean]] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var firstChild: js.UndefOr[ChildNode] = js.native
  var firstElementChild: js.UndefOr[Element] = js.native
  var focus: js.UndefOr[js.Function0[Unit]] = js.native
  var getAnimations: js.UndefOr[js.Function0[js.Array[Animation]]] = js.native
  var getAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, String | Null]] = js.native
  var getAttributeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, String | Null]] = js.native
  var getAttributeNames: js.UndefOr[js.Function0[js.Array[String]]] = js.native
  var getAttributeNode: js.UndefOr[js.Function1[/* name */ String, Attr | Null]] = js.native
  var getAttributeNodeNS: js.UndefOr[js.Function2[/* namespaceURI */ String, /* localName */ String, Attr | Null]] = js.native
  var getBoundingClientRect: js.UndefOr[js.Function0[DOMRect]] = js.native
  var getClientRects: js.UndefOr[js.Function0[DOMRectList]] = js.native
  var getElementsByClassName: js.UndefOr[js.Function1[/* classNames */ String, HTMLCollectionOf[Element]]] = js.native
  var getElementsByTagName: js.UndefOr[js.Function1[a, HTMLCollectionOf[HTMLAnchorElement]]] = js.native
  var getElementsByTagNameNS: js.UndefOr[
    js.Function2[
      httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, 
      /* localName */ String, 
      HTMLCollectionOf[HTMLElement]
    ]
  ] = js.native
  var getRootNode: js.UndefOr[js.Function0[Node]] = js.native
  var hasAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Boolean]] = js.native
  var hasAttributeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, Boolean]] = js.native
  var hasAttributes: js.UndefOr[js.Function0[Boolean]] = js.native
  var hasChildNodes: js.UndefOr[js.Function0[Boolean]] = js.native
  var hasPointerCapture: js.UndefOr[js.Function1[/* pointerId */ Double, Boolean]] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var innerHTML: js.UndefOr[String] = js.native
  var innerText: js.UndefOr[String] = js.native
  var inputMode: js.UndefOr[String] = js.native
  var insertAdjacentElement: js.UndefOr[
    js.Function2[/* position */ InsertPosition, /* insertedElement */ Element, Element | Null]
  ] = js.native
  var insertAdjacentHTML: js.UndefOr[js.Function2[/* where */ InsertPosition, /* html */ String, Unit]] = js.native
  var insertAdjacentText: js.UndefOr[js.Function2[/* where */ InsertPosition, /* text */ String, Unit]] = js.native
  var insertBefore: js.UndefOr[js.Function2[/* newChild */ Node, /* refChild */ Node, Node]] = js.native
  var isConnected: js.UndefOr[Boolean] = js.native
  var isContentEditable: js.UndefOr[Boolean] = js.native
  var isDefaultNamespace: js.UndefOr[js.Function1[/* namespace */ String, Boolean]] = js.native
  var isEqualNode: js.UndefOr[js.Function1[/* otherNode */ Node, Boolean]] = js.native
  var isSameNode: js.UndefOr[js.Function1[/* otherNode */ Node, Boolean]] = js.native
  var key: js.UndefOr[Key] = js.native
  var lang: js.UndefOr[String] = js.native
  var lastChild: js.UndefOr[ChildNode] = js.native
  var lastElementChild: js.UndefOr[Element] = js.native
  var localName: js.UndefOr[String] = js.native
  var lookupNamespaceURI: js.UndefOr[js.Function1[/* prefix */ String, String | Null]] = js.native
  var lookupPrefix: js.UndefOr[js.Function1[/* namespace */ String, String | Null]] = js.native
  var matches: js.UndefOr[js.Function1[/* selectors */ String, Boolean]] = js.native
  var msGetRegionContent: js.UndefOr[js.Function0[_]] = js.native
  var namespaceURI: js.UndefOr[String] = js.native
  var nextElementSibling: js.UndefOr[Element] = js.native
  var nextSibling: js.UndefOr[ChildNode] = js.native
  var nodeName: js.UndefOr[String] = js.native
  var nodeType: js.UndefOr[Double] = js.native
  var nodeValue: js.UndefOr[String] = js.native
  var nonce: js.UndefOr[String] = js.native
  var normalize: js.UndefOr[js.Function0[Unit]] = js.native
  var offsetHeight: js.UndefOr[Double] = js.native
  var offsetLeft: js.UndefOr[Double] = js.native
  var offsetParent: js.UndefOr[Element] = js.native
  var offsetTop: js.UndefOr[Double] = js.native
  var offsetWidth: js.UndefOr[Double] = js.native
  var onabort: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]] = js.native
  var onanimationcancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.native
  var onanimationend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.native
  var onanimationiteration: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.native
  var onanimationstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.native
  var onauxclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  var onblur: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]] = js.native
  var oncancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var oncanplay: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var oncanplaythrough: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var onchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var onclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  var onclose: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var oncontextmenu: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  var oncopy: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]] = js.native
  var oncuechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var oncut: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]] = js.native
  var ondblclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  var ondrag: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.native
  var ondragend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.native
  var ondragenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.native
  var ondragexit: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var ondragleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.native
  var ondragover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.native
  var ondragstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.native
  var ondrop: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.native
  var ondurationchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var onemptied: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var onended: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var onerror: js.UndefOr[OnErrorEventHandler] = js.native
  var onfocus: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]] = js.native
  var onfullscreenchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var onfullscreenerror: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var ongotpointercapture: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  var oninput: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var oninvalid: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var onkeydown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.native
  var onkeypress: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.native
  var onkeyup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.native
  var onload: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var onloadeddata: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var onloadedmetadata: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var onloadstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var onlostpointercapture: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  var onmousedown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  var onmouseenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  var onmouseleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  var onmousemove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  var onmouseout: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  var onmouseover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  var onmouseup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  var onpaste: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]] = js.native
  var onpause: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var onplay: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var onplaying: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var onpointercancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  var onpointerdown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  var onpointerenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  var onpointerleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  var onpointermove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  var onpointerout: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  var onpointerover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  var onpointerup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  var onprogress: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]] = js.native
  var onratechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var onreset: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var onresize: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]] = js.native
  var onscroll: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var onsecuritypolicyviolation: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]] = js.native
  var onseeked: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var onseeking: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var onselect: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var onselectionchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var onselectstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var onstalled: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var onsubmit: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var onsuspend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var ontimeupdate: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var ontoggle: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var ontouchcancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.native
  var ontouchend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.native
  var ontouchmove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.native
  var ontouchstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.native
  var ontransitioncancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.native
  var ontransitionend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.native
  var ontransitionrun: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.native
  var ontransitionstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.native
  var onvolumechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var onwaiting: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var onwheel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]] = js.native
  var outerHTML: js.UndefOr[String] = js.native
  var ownerDocument: js.UndefOr[Document] = js.native
  var parentElement: js.UndefOr[HTMLElement] = js.native
  var parentNode: js.UndefOr[Node with ParentNode] = js.native
  var prefix: js.UndefOr[String] = js.native
  var prepend: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.native
  var previousElementSibling: js.UndefOr[Element] = js.native
  var previousSibling: js.UndefOr[ChildNode] = js.native
  var querySelector: js.UndefOr[js.Function1[a, HTMLAnchorElement | Null]] = js.native
  var querySelectorAll: js.UndefOr[js.Function1[a, NodeListOf[HTMLAnchorElement with Node]]] = js.native
  var releasePointerCapture: js.UndefOr[js.Function1[/* pointerId */ Double, Unit]] = js.native
  var remove: js.UndefOr[js.Function0[Unit]] = js.native
  var removeAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Unit]] = js.native
  var removeAttributeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, Unit]] = js.native
  var removeAttributeNode: js.UndefOr[js.Function1[/* attr */ Attr, Attr]] = js.native
  var removeChild: js.UndefOr[js.Function1[/* oldChild */ Node, Node]] = js.native
  var removeEventListener: js.UndefOr[
    js.Function2[
      fullscreenchange, 
      /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event, _], 
      Unit
    ]
  ] = js.native
  var replaceChild: js.UndefOr[js.Function2[/* newChild */ Node, /* oldChild */ Node, Node]] = js.native
  var replaceWith: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.native
  var requestFullscreen: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
  var requestPointerLock: js.UndefOr[js.Function0[Unit]] = js.native
  var scroll: js.UndefOr[js.Function0[Unit]] = js.native
  var scrollBy: js.UndefOr[js.Function0[Unit]] = js.native
  var scrollHeight: js.UndefOr[Double] = js.native
  var scrollIntoView: js.UndefOr[js.Function0[Unit]] = js.native
  var scrollLeft: js.UndefOr[Double] = js.native
  var scrollTo: js.UndefOr[js.Function0[Unit]] = js.native
  var scrollTop: js.UndefOr[Double] = js.native
  var scrollWidth: js.UndefOr[Double] = js.native
  var setAttribute: js.UndefOr[js.Function2[/* qualifiedName */ String, /* value */ String, Unit]] = js.native
  var setAttributeNS: js.UndefOr[
    js.Function3[/* namespace */ String, /* qualifiedName */ String, /* value */ String, Unit]
  ] = js.native
  var setAttributeNode: js.UndefOr[js.Function1[/* attr */ Attr, Attr | Null]] = js.native
  var setAttributeNodeNS: js.UndefOr[js.Function1[/* attr */ Attr, Attr | Null]] = js.native
  var setPointerCapture: js.UndefOr[js.Function1[/* pointerId */ Double, Unit]] = js.native
  var shadowRoot: js.UndefOr[ShadowRoot] = js.native
  var slot: js.UndefOr[String] = js.native
  var spellcheck: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSStyleDeclaration] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var tagName: js.UndefOr[String] = js.native
  var textContent: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var toggleAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Boolean]] = js.native
  var translate: js.UndefOr[Boolean] = js.native
  var webkitMatchesSelector: js.UndefOr[js.Function1[/* selectors */ String, Boolean]] = js.native
}

object PropsHTMLMenuElementconte {
  @scala.inline
  def apply(): PropsHTMLMenuElementconte = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropsHTMLMenuElementconte]
  }
  @scala.inline
  implicit class PropsHTMLMenuElementconteOps[Self <: PropsHTMLMenuElementconte] (val x: Self) extends AnyVal {
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
    def withoutATTRIBUTE_NODE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTE_NODE")(js.undefined)
        ret
    }
    @scala.inline
    def withCDATA_SECTION_NODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CDATA_SECTION_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCDATA_SECTION_NODE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CDATA_SECTION_NODE")(js.undefined)
        ret
    }
    @scala.inline
    def withCOMMENT_NODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COMMENT_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCOMMENT_NODE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COMMENT_NODE")(js.undefined)
        ret
    }
    @scala.inline
    def withDOCUMENT_FRAGMENT_NODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_FRAGMENT_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDOCUMENT_FRAGMENT_NODE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_FRAGMENT_NODE")(js.undefined)
        ret
    }
    @scala.inline
    def withDOCUMENT_NODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDOCUMENT_NODE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_NODE")(js.undefined)
        ret
    }
    @scala.inline
    def withDOCUMENT_POSITION_CONTAINED_BY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_CONTAINED_BY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDOCUMENT_POSITION_CONTAINED_BY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_CONTAINED_BY")(js.undefined)
        ret
    }
    @scala.inline
    def withDOCUMENT_POSITION_CONTAINS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_CONTAINS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDOCUMENT_POSITION_CONTAINS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_CONTAINS")(js.undefined)
        ret
    }
    @scala.inline
    def withDOCUMENT_POSITION_DISCONNECTED(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_DISCONNECTED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDOCUMENT_POSITION_DISCONNECTED: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_DISCONNECTED")(js.undefined)
        ret
    }
    @scala.inline
    def withDOCUMENT_POSITION_FOLLOWING(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_FOLLOWING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDOCUMENT_POSITION_FOLLOWING: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_FOLLOWING")(js.undefined)
        ret
    }
    @scala.inline
    def withDOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC")(js.undefined)
        ret
    }
    @scala.inline
    def withDOCUMENT_POSITION_PRECEDING(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_PRECEDING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDOCUMENT_POSITION_PRECEDING: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_PRECEDING")(js.undefined)
        ret
    }
    @scala.inline
    def withDOCUMENT_TYPE_NODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_TYPE_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDOCUMENT_TYPE_NODE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_TYPE_NODE")(js.undefined)
        ret
    }
    @scala.inline
    def withELEMENT_NODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ELEMENT_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutELEMENT_NODE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ELEMENT_NODE")(js.undefined)
        ret
    }
    @scala.inline
    def withENTITY_NODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ENTITY_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutENTITY_NODE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ENTITY_NODE")(js.undefined)
        ret
    }
    @scala.inline
    def withENTITY_REFERENCE_NODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ENTITY_REFERENCE_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutENTITY_REFERENCE_NODE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ENTITY_REFERENCE_NODE")(js.undefined)
        ret
    }
    @scala.inline
    def withNOTATION_NODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOTATION_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNOTATION_NODE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOTATION_NODE")(js.undefined)
        ret
    }
    @scala.inline
    def withPROCESSING_INSTRUCTION_NODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PROCESSING_INSTRUCTION_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPROCESSING_INSTRUCTION_NODE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PROCESSING_INSTRUCTION_NODE")(js.undefined)
        ret
    }
    @scala.inline
    def withTEXT_NODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TEXT_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTEXT_NODE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TEXT_NODE")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKey")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessKeyLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKeyLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessKeyLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKeyLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAddEventListener(
      value: (fullscreenchange, /* listener */ js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAddEventListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.undefined)
        ret
    }
    @scala.inline
    def withAfter(value: /* repeated */ Node | String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimate(value: /* keyframes */ js.Array[Keyframe] => Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withAppend(value: /* repeated */ Node | String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAppend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendChild(value: /* newChild */ Node => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAppendChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendChild")(js.undefined)
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
    def withAttachShadow(value: /* init */ ShadowRootInit => ShadowRoot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachShadow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAttachShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributes(value: NamedNodeMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withAutocapitalize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocapitalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutocapitalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocapitalize")(js.undefined)
        ret
    }
    @scala.inline
    def withAutofocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutofocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofocus")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseURI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseURI")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: /* repeated */ Node | String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withBlur(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.undefined)
        ret
    }
    @scala.inline
    def withChildElementCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childElementCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildElementCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childElementCount")(js.undefined)
        ret
    }
    @scala.inline
    def withChildNodes(value: NodeListOf[ChildNode with Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: HTMLCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withClassList(value: DOMTokenList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classList")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withClientHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withClientLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withClientTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientTop")(js.undefined)
        ret
    }
    @scala.inline
    def withClientWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCloneNode(value: () => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCloneNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneNode")(js.undefined)
        ret
    }
    @scala.inline
    def withClosest(value: a => HTMLAnchorElement | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClosest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closest")(js.undefined)
        ret
    }
    @scala.inline
    def withCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withCompareDocumentPosition(value: /* other */ Node => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareDocumentPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCompareDocumentPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareDocumentPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withContains(value: /* other */ Node => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: Content | js.Array[Content]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withContentEditable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEditable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEditable")(js.undefined)
        ret
    }
    @scala.inline
    def withDataset(value: DOMStringMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(js.undefined)
        ret
    }
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withDispatchEvent(value: /* event */ Event => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDispatchEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
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
    def withFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAnimations(value: () => js.Array[Animation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnimations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAnimations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnimations")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAttribute(value: /* qualifiedName */ String => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAttributeNS(value: (/* namespace */ String, /* localName */ String) => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributeNS")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetAttributeNS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributeNS")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAttributeNames(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributeNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAttributeNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributeNames")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAttributeNode(value: /* name */ String => Attr | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributeNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetAttributeNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributeNode")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAttributeNodeNS(value: (/* namespaceURI */ String, /* localName */ String) => Attr | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributeNodeNS")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetAttributeNodeNS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributeNodeNS")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBoundingClientRect(value: () => DOMRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBoundingClientRect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBoundingClientRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBoundingClientRect")(js.undefined)
        ret
    }
    @scala.inline
    def withGetClientRects(value: () => DOMRectList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClientRects")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetClientRects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClientRects")(js.undefined)
        ret
    }
    @scala.inline
    def withGetElementsByClassName(value: /* classNames */ String => HTMLCollectionOf[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementsByClassName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetElementsByClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementsByClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withGetElementsByTagName(value: a => HTMLCollectionOf[HTMLAnchorElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementsByTagName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetElementsByTagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementsByTagName")(js.undefined)
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
    def withoutGetElementsByTagNameNS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementsByTagNameNS")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRootNode(value: () => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRootNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRootNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRootNode")(js.undefined)
        ret
    }
    @scala.inline
    def withHasAttribute(value: /* qualifiedName */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHasAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withHasAttributeNS(value: (/* namespace */ String, /* localName */ String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttributeNS")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHasAttributeNS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttributeNS")(js.undefined)
        ret
    }
    @scala.inline
    def withHasAttributes(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttributes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHasAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withHasChildNodes(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChildNodes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHasChildNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChildNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withHasPointerCapture(value: /* pointerId */ Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPointerCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHasPointerCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPointerCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerText")(js.undefined)
        ret
    }
    @scala.inline
    def withInputMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMode")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertAdjacentElement(value: (/* position */ InsertPosition, /* insertedElement */ Element) => Element | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAdjacentElement")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInsertAdjacentElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAdjacentElement")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertAdjacentHTML(value: (/* where */ InsertPosition, /* html */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAdjacentHTML")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInsertAdjacentHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAdjacentHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertAdjacentText(value: (/* where */ InsertPosition, /* text */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAdjacentText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInsertAdjacentText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAdjacentText")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertBefore(value: (/* newChild */ Node, /* refChild */ Node) => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInsertBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withIsConnected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConnected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsConnected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConnected")(js.undefined)
        ret
    }
    @scala.inline
    def withIsContentEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isContentEditable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsContentEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isContentEditable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDefaultNamespace(value: /* namespace */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefaultNamespace")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsDefaultNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefaultNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEqualNode(value: /* otherNode */ Node => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEqualNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsEqualNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEqualNode")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSameNode(value: /* otherNode */ Node => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSameNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsSameNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSameNode")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
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
    def withLocalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localName")(js.undefined)
        ret
    }
    @scala.inline
    def withLookupNamespaceURI(value: /* prefix */ String => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupNamespaceURI")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLookupNamespaceURI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupNamespaceURI")(js.undefined)
        ret
    }
    @scala.inline
    def withLookupPrefix(value: /* namespace */ String => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupPrefix")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLookupPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withMatches(value: /* selectors */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(js.undefined)
        ret
    }
    @scala.inline
    def withMsGetRegionContent(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msGetRegionContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutMsGetRegionContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msGetRegionContent")(js.undefined)
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
    def withNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeName")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeType")(js.undefined)
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
    def withNormalize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutNormalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetLeft")(js.undefined)
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
    def withOffsetTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetTop")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOnabort(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ UIEvent, _]): Self = {
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
    def withOnanimationcancel(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ AnimationEvent, _]): Self = {
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
    def withOnanimationend(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ AnimationEvent, _]): Self = {
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
    def withOnanimationiteration(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ AnimationEvent, _]): Self = {
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
    def withOnanimationstart(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ AnimationEvent, _]): Self = {
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
    def withOnauxclick(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ MouseEvent, _]): Self = {
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
    def withOnblur(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ FocusEvent, _]): Self = {
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
    def withOncancel(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOncanplay(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOncanplaythrough(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOnchange(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOnclick(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ MouseEvent, _]): Self = {
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
    def withOnclose(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOncontextmenu(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ MouseEvent, _]): Self = {
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
    def withOncopy(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ ClipboardEvent, _]): Self = {
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
    def withOncuechange(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOncut(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ ClipboardEvent, _]): Self = {
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
    def withOndblclick(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ MouseEvent, _]): Self = {
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
    def withOndrag(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ DragEvent, _]): Self = {
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
    def withOndragend(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ DragEvent, _]): Self = {
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
    def withOndragenter(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ DragEvent, _]): Self = {
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
    def withOndragexit(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOndragleave(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ DragEvent, _]): Self = {
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
    def withOndragover(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ DragEvent, _]): Self = {
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
    def withOndragstart(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ DragEvent, _]): Self = {
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
    def withOndrop(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ DragEvent, _]): Self = {
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
    def withOndurationchange(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOnemptied(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOnended(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
      value: (/* event */ Event | String, /* source */ js.UndefOr[String], /* lineno */ js.UndefOr[Double], /* colno */ js.UndefOr[Double], /* error */ js.UndefOr[js.Error]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutOnerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.undefined)
        ret
    }
    @scala.inline
    def withOnerrorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(null)
        ret
    }
    @scala.inline
    def withOnfocus(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ FocusEvent, _]): Self = {
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
    def withOnfullscreenchange(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOnfullscreenerror(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOngotpointercapture(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ PointerEvent, _]): Self = {
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
    def withOninput(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOninvalid(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOnkeydown(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ KeyboardEvent, _]): Self = {
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
    def withOnkeypress(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ KeyboardEvent, _]): Self = {
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
    def withOnkeyup(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ KeyboardEvent, _]): Self = {
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
    def withOnload(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOnloadeddata(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOnloadedmetadata(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOnloadstart(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOnlostpointercapture(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ PointerEvent, _]): Self = {
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
    def withOnmousedown(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ MouseEvent, _]): Self = {
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
    def withOnmouseenter(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ MouseEvent, _]): Self = {
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
    def withOnmouseleave(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ MouseEvent, _]): Self = {
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
    def withOnmousemove(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ MouseEvent, _]): Self = {
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
    def withOnmouseout(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ MouseEvent, _]): Self = {
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
    def withOnmouseover(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ MouseEvent, _]): Self = {
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
    def withOnmouseup(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ MouseEvent, _]): Self = {
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
    def withOnpaste(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ ClipboardEvent, _]): Self = {
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
    def withOnpause(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOnplay(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOnplaying(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOnpointercancel(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ PointerEvent, _]): Self = {
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
    def withOnpointerdown(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ PointerEvent, _]): Self = {
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
    def withOnpointerenter(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ PointerEvent, _]): Self = {
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
    def withOnpointerleave(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ PointerEvent, _]): Self = {
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
    def withOnpointermove(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ PointerEvent, _]): Self = {
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
    def withOnpointerout(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ PointerEvent, _]): Self = {
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
    def withOnpointerover(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ PointerEvent, _]): Self = {
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
    def withOnpointerup(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ PointerEvent, _]): Self = {
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
    def withOnprogress(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ ProgressEvent, _]): Self = {
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
    def withOnratechange(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOnreset(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOnresize(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ UIEvent, _]): Self = {
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
    def withOnscroll(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOnsecuritypolicyviolation(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ SecurityPolicyViolationEvent, _]): Self = {
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
    def withOnseeked(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOnseeking(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOnselect(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOnselectionchange(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOnselectstart(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOnstalled(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOnsubmit(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOnsuspend(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOntimeupdate(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOntoggle(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOntouchcancel(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ TouchEvent, _]): Self = {
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
    def withOntouchend(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ TouchEvent, _]): Self = {
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
    def withOntouchmove(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ TouchEvent, _]): Self = {
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
    def withOntouchstart(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ TouchEvent, _]): Self = {
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
    def withOntransitioncancel(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ TransitionEvent, _]): Self = {
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
    def withOntransitionend(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ TransitionEvent, _]): Self = {
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
    def withOntransitionrun(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ TransitionEvent, _]): Self = {
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
    def withOntransitionstart(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ TransitionEvent, _]): Self = {
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
    def withOnvolumechange(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOnwaiting(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]): Self = {
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
    def withOnwheel(value: js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ WheelEvent, _]): Self = {
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
    def withOuterHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerDocument(value: Document): Self = {
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
    def withPrepend(value: /* repeated */ Node | String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPrepend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepend")(js.undefined)
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
    def withQuerySelector(value: a => HTMLAnchorElement | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("querySelector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutQuerySelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("querySelector")(js.undefined)
        ret
    }
    @scala.inline
    def withQuerySelectorAll(value: a => NodeListOf[HTMLAnchorElement with Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("querySelectorAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutQuerySelectorAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("querySelectorAll")(js.undefined)
        ret
    }
    @scala.inline
    def withReleasePointerCapture(value: /* pointerId */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releasePointerCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReleasePointerCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releasePointerCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAttribute(value: /* qualifiedName */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAttributeNS(value: (/* namespace */ String, /* localName */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAttributeNS")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemoveAttributeNS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAttributeNS")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAttributeNode(value: /* attr */ Attr => Attr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAttributeNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveAttributeNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAttributeNode")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveChild(value: /* oldChild */ Node => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeChild")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveEventListener(
      value: (fullscreenchange, /* listener */ js.ThisFunction1[PropsHTMLMenuElementconte, /* ev */ Event, _]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemoveEventListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceChild(value: (/* newChild */ Node, /* oldChild */ Node) => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceChild")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReplaceChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceChild")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceWith(value: /* repeated */ Node | String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceWith")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReplaceWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceWith")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestFullscreen(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestFullscreen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRequestFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestFullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestPointerLock(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPointerLock")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRequestPointerLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPointerLock")(js.undefined)
        ret
    }
    @scala.inline
    def withScroll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollBy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutScrollBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBy")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollIntoView(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollIntoView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutScrollIntoView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollIntoView")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollTo(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutScrollTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTop")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAttribute(value: (/* qualifiedName */ String, /* value */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttribute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAttributeNS(value: (/* namespace */ String, /* qualifiedName */ String, /* value */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributeNS")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSetAttributeNS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributeNS")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAttributeNode(value: /* attr */ Attr => Attr | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributeNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAttributeNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributeNode")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAttributeNodeNS(value: /* attr */ Attr => Attr | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributeNodeNS")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAttributeNodeNS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributeNodeNS")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPointerCapture(value: /* pointerId */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPointerCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPointerCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPointerCapture")(js.undefined)
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
    def withSlot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slot")(js.undefined)
        ret
    }
    @scala.inline
    def withSpellcheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellcheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellcheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellcheck")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSStyleDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTagName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(js.undefined)
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
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleAttribute(value: /* qualifiedName */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToggleAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(js.undefined)
        ret
    }
    @scala.inline
    def withWebkitMatchesSelector(value: /* selectors */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkitMatchesSelector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWebkitMatchesSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkitMatchesSelector")(js.undefined)
        ret
    }
  }
  
}

