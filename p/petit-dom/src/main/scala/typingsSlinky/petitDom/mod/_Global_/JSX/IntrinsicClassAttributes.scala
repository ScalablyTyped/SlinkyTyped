package typingsSlinky.petitDom.mod._Global_.JSX

import org.scalajs.dom.raw.Attr
import org.scalajs.dom.raw.DOMTokenList
import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLCollection
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.NamedNodeMap
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import org.scalajs.dom.raw.ParentNode
import typingsSlinky.petitDom.mod.PetitDom.Content
import typingsSlinky.petitDom.mod.PetitDom.Key
import typingsSlinky.petitDom.petitDomStrings.a
import typingsSlinky.petitDom.petitDomStrings.fullscreenchange
import typingsSlinky.petitDom.petitDomStrings.httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml
import typingsSlinky.std.Animation
import typingsSlinky.std.ChildNode
import typingsSlinky.std.DOMRect
import typingsSlinky.std.DOMRectList
import typingsSlinky.std.Document_
import typingsSlinky.std.Event_
import typingsSlinky.std.HTMLCollectionOf
import typingsSlinky.std.HTMLSlotElement
import typingsSlinky.std.InsertPosition
import typingsSlinky.std.Keyframe
import typingsSlinky.std.ShadowRoot
import typingsSlinky.std.ShadowRootInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:no-empty-interface
/* Inlined parent petit-dom.petit-dom.PetitDom.Props<std.Element> */
@js.native
trait IntrinsicClassAttributes[T] extends js.Object {
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
  var addEventListener: js.UndefOr[
    js.Function2[
      fullscreenchange, 
      /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _], 
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
  var baseURI: js.UndefOr[String] = js.native
  var before: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.native
  var childElementCount: js.UndefOr[Double] = js.native
  var childNodes: js.UndefOr[NodeListOf[ChildNode with Node]] = js.native
  var children: js.UndefOr[HTMLCollection] = js.native
  var classList: js.UndefOr[DOMTokenList] = js.native
  var className: js.UndefOr[String] = js.native
  var clientHeight: js.UndefOr[Double] = js.native
  var clientLeft: js.UndefOr[Double] = js.native
  var clientTop: js.UndefOr[Double] = js.native
  var clientWidth: js.UndefOr[Double] = js.native
  var cloneNode: js.UndefOr[js.Function0[Node]] = js.native
  var closest: js.UndefOr[js.Function1[a, HTMLAnchorElement | Null]] = js.native
  var compareDocumentPosition: js.UndefOr[js.Function1[/* other */ Node, Double]] = js.native
  var contains: js.UndefOr[js.Function1[/* other */ Node, Boolean]] = js.native
  var content: js.UndefOr[Content | js.Array[Content]] = js.native
  var dispatchEvent: js.UndefOr[js.Function1[/* event */ Event_, Boolean]] = js.native
  var firstChild: js.UndefOr[ChildNode] = js.native
  var firstElementChild: js.UndefOr[org.scalajs.dom.raw.Element] = js.native
  var getAnimations: js.UndefOr[js.Function0[js.Array[Animation]]] = js.native
  var getAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, String | Null]] = js.native
  var getAttributeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, String | Null]] = js.native
  var getAttributeNames: js.UndefOr[js.Function0[js.Array[String]]] = js.native
  var getAttributeNode: js.UndefOr[js.Function1[/* name */ String, Attr | Null]] = js.native
  var getAttributeNodeNS: js.UndefOr[js.Function2[/* namespaceURI */ String, /* localName */ String, Attr | Null]] = js.native
  var getBoundingClientRect: js.UndefOr[js.Function0[DOMRect]] = js.native
  var getClientRects: js.UndefOr[js.Function0[DOMRectList]] = js.native
  var getElementsByClassName: js.UndefOr[
    js.Function1[/* classNames */ String, HTMLCollectionOf[org.scalajs.dom.raw.Element]]
  ] = js.native
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
  var id: js.UndefOr[String] = js.native
  var innerHTML: js.UndefOr[String] = js.native
  var insertAdjacentElement: js.UndefOr[
    js.Function2[
      /* position */ InsertPosition, 
      /* insertedElement */ org.scalajs.dom.raw.Element, 
      org.scalajs.dom.raw.Element | Null
    ]
  ] = js.native
  var insertAdjacentHTML: js.UndefOr[js.Function2[/* where */ InsertPosition, /* html */ String, Unit]] = js.native
  var insertAdjacentText: js.UndefOr[js.Function2[/* where */ InsertPosition, /* text */ String, Unit]] = js.native
  var insertBefore: js.UndefOr[js.Function2[/* newChild */ Node, /* refChild */ Node, Node]] = js.native
  var isConnected: js.UndefOr[Boolean] = js.native
  var isDefaultNamespace: js.UndefOr[js.Function1[/* namespace */ String, Boolean]] = js.native
  var isEqualNode: js.UndefOr[js.Function1[/* otherNode */ Node, Boolean]] = js.native
  var isSameNode: js.UndefOr[js.Function1[/* otherNode */ Node, Boolean]] = js.native
  var key: js.UndefOr[Key] = js.native
  var lastChild: js.UndefOr[ChildNode] = js.native
  var lastElementChild: js.UndefOr[org.scalajs.dom.raw.Element] = js.native
  var localName: js.UndefOr[String] = js.native
  var lookupNamespaceURI: js.UndefOr[js.Function1[/* prefix */ String, String | Null]] = js.native
  var lookupPrefix: js.UndefOr[js.Function1[/* namespace */ String, String | Null]] = js.native
  var matches: js.UndefOr[js.Function1[/* selectors */ String, Boolean]] = js.native
  var msGetRegionContent: js.UndefOr[js.Function0[_]] = js.native
  var namespaceURI: js.UndefOr[String] = js.native
  var nextElementSibling: js.UndefOr[org.scalajs.dom.raw.Element] = js.native
  var nextSibling: js.UndefOr[ChildNode] = js.native
  var nodeName: js.UndefOr[String] = js.native
  var nodeType: js.UndefOr[Double] = js.native
  var nodeValue: js.UndefOr[String] = js.native
  var normalize: js.UndefOr[js.Function0[Unit]] = js.native
  var onfullscreenchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var onfullscreenerror: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var outerHTML: js.UndefOr[String] = js.native
  var ownerDocument: js.UndefOr[Document_] = js.native
  var parentElement: js.UndefOr[HTMLElement] = js.native
  var parentNode: js.UndefOr[Node with ParentNode] = js.native
  var prefix: js.UndefOr[String] = js.native
  var prepend: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.native
  var previousElementSibling: js.UndefOr[org.scalajs.dom.raw.Element] = js.native
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
      /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _], 
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
  var tagName: js.UndefOr[String] = js.native
  var textContent: js.UndefOr[String] = js.native
  var toggleAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Boolean]] = js.native
  var webkitMatchesSelector: js.UndefOr[js.Function1[/* selectors */ String, Boolean]] = js.native
}

object IntrinsicClassAttributes {
  @scala.inline
  def apply[T](): IntrinsicClassAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntrinsicClassAttributes[T]]
  }
  @scala.inline
  implicit class IntrinsicClassAttributesOps[Self[t] <: IntrinsicClassAttributes[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withATTRIBUTE_NODE(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTE_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutATTRIBUTE_NODE: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTE_NODE")(js.undefined)
        ret
    }
    @scala.inline
    def withCDATA_SECTION_NODE(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CDATA_SECTION_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCDATA_SECTION_NODE: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CDATA_SECTION_NODE")(js.undefined)
        ret
    }
    @scala.inline
    def withCOMMENT_NODE(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COMMENT_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCOMMENT_NODE: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COMMENT_NODE")(js.undefined)
        ret
    }
    @scala.inline
    def withDOCUMENT_FRAGMENT_NODE(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_FRAGMENT_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDOCUMENT_FRAGMENT_NODE: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_FRAGMENT_NODE")(js.undefined)
        ret
    }
    @scala.inline
    def withDOCUMENT_NODE(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDOCUMENT_NODE: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_NODE")(js.undefined)
        ret
    }
    @scala.inline
    def withDOCUMENT_POSITION_CONTAINED_BY(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_CONTAINED_BY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDOCUMENT_POSITION_CONTAINED_BY: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_CONTAINED_BY")(js.undefined)
        ret
    }
    @scala.inline
    def withDOCUMENT_POSITION_CONTAINS(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_CONTAINS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDOCUMENT_POSITION_CONTAINS: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_CONTAINS")(js.undefined)
        ret
    }
    @scala.inline
    def withDOCUMENT_POSITION_DISCONNECTED(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_DISCONNECTED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDOCUMENT_POSITION_DISCONNECTED: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_DISCONNECTED")(js.undefined)
        ret
    }
    @scala.inline
    def withDOCUMENT_POSITION_FOLLOWING(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_FOLLOWING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDOCUMENT_POSITION_FOLLOWING: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_FOLLOWING")(js.undefined)
        ret
    }
    @scala.inline
    def withDOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC")(js.undefined)
        ret
    }
    @scala.inline
    def withDOCUMENT_POSITION_PRECEDING(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_PRECEDING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDOCUMENT_POSITION_PRECEDING: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_POSITION_PRECEDING")(js.undefined)
        ret
    }
    @scala.inline
    def withDOCUMENT_TYPE_NODE(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_TYPE_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDOCUMENT_TYPE_NODE: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_TYPE_NODE")(js.undefined)
        ret
    }
    @scala.inline
    def withELEMENT_NODE(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ELEMENT_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutELEMENT_NODE: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ELEMENT_NODE")(js.undefined)
        ret
    }
    @scala.inline
    def withENTITY_NODE(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ENTITY_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutENTITY_NODE: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ENTITY_NODE")(js.undefined)
        ret
    }
    @scala.inline
    def withENTITY_REFERENCE_NODE(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ENTITY_REFERENCE_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutENTITY_REFERENCE_NODE: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ENTITY_REFERENCE_NODE")(js.undefined)
        ret
    }
    @scala.inline
    def withNOTATION_NODE(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOTATION_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNOTATION_NODE: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOTATION_NODE")(js.undefined)
        ret
    }
    @scala.inline
    def withPROCESSING_INSTRUCTION_NODE(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PROCESSING_INSTRUCTION_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPROCESSING_INSTRUCTION_NODE: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PROCESSING_INSTRUCTION_NODE")(js.undefined)
        ret
    }
    @scala.inline
    def withTEXT_NODE(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TEXT_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTEXT_NODE: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TEXT_NODE")(js.undefined)
        ret
    }
    @scala.inline
    def withAddEventListener(
      value: (fullscreenchange, /* listener */ js.ThisFunction1[IntrinsicClassAttributes[T], /* ev */ Event_, _]) => Unit
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAddEventListener: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.undefined)
        ret
    }
    @scala.inline
    def withAfter(value: /* repeated */ Node | String => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimate(value: /* keyframes */ js.Array[Keyframe] => Animation): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAnimate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withAppend(value: /* repeated */ Node | String => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAppend: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendChild(value: /* newChild */ Node => Node): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAppendChild: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendChild")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignedSlot(value: HTMLSlotElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedSlot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignedSlot: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedSlot")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachShadow(value: /* init */ ShadowRootInit => ShadowRoot): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachShadow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAttachShadow: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributes(value: NamedNodeMap): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseURI(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseURI: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseURI")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: /* repeated */ Node | String => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBefore: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withChildElementCount(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childElementCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildElementCount: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childElementCount")(js.undefined)
        ret
    }
    @scala.inline
    def withChildNodes(value: NodeListOf[ChildNode with Node]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildNodes: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: HTMLCollection): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withClassList(value: DOMTokenList): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassList: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classList")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withClientHeight(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientHeight: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withClientLeft(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientLeft: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withClientTop(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientTop: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientTop")(js.undefined)
        ret
    }
    @scala.inline
    def withClientWidth(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientWidth: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCloneNode(value: () => Node): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCloneNode: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneNode")(js.undefined)
        ret
    }
    @scala.inline
    def withClosest(value: a => HTMLAnchorElement | Null): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClosest: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closest")(js.undefined)
        ret
    }
    @scala.inline
    def withCompareDocumentPosition(value: /* other */ Node => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareDocumentPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCompareDocumentPosition: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareDocumentPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withContains(value: /* other */ Node => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContains: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: Content | js.Array[Content]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withDispatchEvent(value: /* event */ Event_ => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDispatchEvent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstChild(value: ChildNode): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstChild: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstChild")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstElementChild(value: org.scalajs.dom.raw.Element): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstElementChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstElementChild: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstElementChild")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAnimations(value: () => js.Array[Animation]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnimations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAnimations: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnimations")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAttribute(value: /* qualifiedName */ String => String | Null): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetAttribute: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAttributeNS(value: (/* namespace */ String, /* localName */ String) => String | Null): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributeNS")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetAttributeNS: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributeNS")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAttributeNames(value: () => js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributeNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAttributeNames: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributeNames")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAttributeNode(value: /* name */ String => Attr | Null): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributeNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetAttributeNode: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributeNode")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAttributeNodeNS(value: (/* namespaceURI */ String, /* localName */ String) => Attr | Null): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributeNodeNS")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetAttributeNodeNS: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributeNodeNS")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBoundingClientRect(value: () => DOMRect): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBoundingClientRect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBoundingClientRect: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBoundingClientRect")(js.undefined)
        ret
    }
    @scala.inline
    def withGetClientRects(value: () => DOMRectList): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClientRects")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetClientRects: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClientRects")(js.undefined)
        ret
    }
    @scala.inline
    def withGetElementsByClassName(value: /* classNames */ String => HTMLCollectionOf[org.scalajs.dom.raw.Element]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementsByClassName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetElementsByClassName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementsByClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withGetElementsByTagName(value: a => HTMLCollectionOf[HTMLAnchorElement]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementsByTagName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetElementsByTagName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementsByTagName")(js.undefined)
        ret
    }
    @scala.inline
    def withGetElementsByTagNameNS(
      value: (httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, /* localName */ String) => HTMLCollectionOf[HTMLElement]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementsByTagNameNS")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetElementsByTagNameNS: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementsByTagNameNS")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRootNode(value: () => Node): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRootNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRootNode: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRootNode")(js.undefined)
        ret
    }
    @scala.inline
    def withHasAttribute(value: /* qualifiedName */ String => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHasAttribute: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withHasAttributeNS(value: (/* namespace */ String, /* localName */ String) => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttributeNS")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHasAttributeNS: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttributeNS")(js.undefined)
        ret
    }
    @scala.inline
    def withHasAttributes(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttributes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHasAttributes: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withHasChildNodes(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChildNodes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHasChildNodes: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChildNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withHasPointerCapture(value: /* pointerId */ Double => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPointerCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHasPointerCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPointerCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerHTML(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerHTML: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertAdjacentElement(
      value: (/* position */ InsertPosition, /* insertedElement */ org.scalajs.dom.raw.Element) => org.scalajs.dom.raw.Element | Null
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAdjacentElement")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInsertAdjacentElement: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAdjacentElement")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertAdjacentHTML(value: (/* where */ InsertPosition, /* html */ String) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAdjacentHTML")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInsertAdjacentHTML: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAdjacentHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertAdjacentText(value: (/* where */ InsertPosition, /* text */ String) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAdjacentText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInsertAdjacentText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAdjacentText")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertBefore(value: (/* newChild */ Node, /* refChild */ Node) => Node): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInsertBefore: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withIsConnected(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConnected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsConnected: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConnected")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDefaultNamespace(value: /* namespace */ String => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefaultNamespace")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsDefaultNamespace: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefaultNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEqualNode(value: /* otherNode */ Node => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEqualNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsEqualNode: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEqualNode")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSameNode(value: /* otherNode */ Node => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSameNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsSameNode: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSameNode")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: Key): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLastChild(value: ChildNode): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastChild: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChild")(js.undefined)
        ret
    }
    @scala.inline
    def withLastElementChild(value: org.scalajs.dom.raw.Element): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastElementChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastElementChild: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastElementChild")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localName")(js.undefined)
        ret
    }
    @scala.inline
    def withLookupNamespaceURI(value: /* prefix */ String => String | Null): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupNamespaceURI")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLookupNamespaceURI: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupNamespaceURI")(js.undefined)
        ret
    }
    @scala.inline
    def withLookupPrefix(value: /* namespace */ String => String | Null): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupPrefix")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLookupPrefix: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withMatches(value: /* selectors */ String => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMatches: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(js.undefined)
        ret
    }
    @scala.inline
    def withMsGetRegionContent(value: () => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msGetRegionContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutMsGetRegionContent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msGetRegionContent")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespaceURI(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaceURI: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceURI")(js.undefined)
        ret
    }
    @scala.inline
    def withNextElementSibling(value: org.scalajs.dom.raw.Element): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextElementSibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextElementSibling: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextElementSibling")(js.undefined)
        ret
    }
    @scala.inline
    def withNextSibling(value: ChildNode): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextSibling: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSibling")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeName")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeType(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeType: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeType")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeValue(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeValue")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalize(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutNormalize: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnfullscreenchange(value: js.ThisFunction1[IntrinsicClassAttributes[T], /* ev */ Event_, _]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfullscreenchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnfullscreenchange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfullscreenchange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnfullscreenerror(value: js.ThisFunction1[IntrinsicClassAttributes[T], /* ev */ Event_, _]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfullscreenerror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnfullscreenerror: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfullscreenerror")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterHTML(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterHTML: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerDocument(value: Document_): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerDocument: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerDocument")(js.undefined)
        ret
    }
    @scala.inline
    def withParentElement(value: HTMLElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentElement: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentElement")(js.undefined)
        ret
    }
    @scala.inline
    def withParentNode(value: Node with ParentNode): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentNode: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNode")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepend(value: /* repeated */ Node | String => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPrepend: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepend")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousElementSibling(value: org.scalajs.dom.raw.Element): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousElementSibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousElementSibling: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousElementSibling")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousSibling(value: ChildNode): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousSibling: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSibling")(js.undefined)
        ret
    }
    @scala.inline
    def withQuerySelector(value: a => HTMLAnchorElement | Null): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("querySelector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutQuerySelector: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("querySelector")(js.undefined)
        ret
    }
    @scala.inline
    def withQuerySelectorAll(value: a => NodeListOf[HTMLAnchorElement with Node]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("querySelectorAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutQuerySelectorAll: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("querySelectorAll")(js.undefined)
        ret
    }
    @scala.inline
    def withReleasePointerCapture(value: /* pointerId */ Double => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releasePointerCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReleasePointerCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releasePointerCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAttribute(value: /* qualifiedName */ String => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveAttribute: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAttributeNS(value: (/* namespace */ String, /* localName */ String) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAttributeNS")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemoveAttributeNS: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAttributeNS")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAttributeNode(value: /* attr */ Attr => Attr): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAttributeNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveAttributeNode: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAttributeNode")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveChild(value: /* oldChild */ Node => Node): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveChild: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeChild")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveEventListener(
      value: (fullscreenchange, /* listener */ js.ThisFunction1[IntrinsicClassAttributes[T], /* ev */ Event_, _]) => Unit
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemoveEventListener: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceChild(value: (/* newChild */ Node, /* oldChild */ Node) => Node): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceChild")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReplaceChild: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceChild")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceWith(value: /* repeated */ Node | String => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceWith")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReplaceWith: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceWith")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestFullscreen(value: () => js.Promise[Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestFullscreen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRequestFullscreen: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestFullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestPointerLock(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPointerLock")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRequestPointerLock: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPointerLock")(js.undefined)
        ret
    }
    @scala.inline
    def withScroll(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutScroll: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollBy(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutScrollBy: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBy")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollHeight(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollHeight: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollIntoView(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollIntoView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutScrollIntoView: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollIntoView")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollLeft(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollLeft: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollTo(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutScrollTo: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollTop(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollTop: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTop")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollWidth(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollWidth: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAttribute(value: (/* qualifiedName */ String, /* value */ String) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttribute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetAttribute: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAttributeNS(value: (/* namespace */ String, /* qualifiedName */ String, /* value */ String) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributeNS")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSetAttributeNS: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributeNS")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAttributeNode(value: /* attr */ Attr => Attr | Null): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributeNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAttributeNode: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributeNode")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAttributeNodeNS(value: /* attr */ Attr => Attr | Null): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributeNodeNS")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAttributeNodeNS: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributeNodeNS")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPointerCapture(value: /* pointerId */ Double => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPointerCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPointerCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPointerCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowRoot(value: ShadowRoot): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowRoot: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withSlot(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlot: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slot")(js.undefined)
        ret
    }
    @scala.inline
    def withTagName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(js.undefined)
        ret
    }
    @scala.inline
    def withTextContent(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextContent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textContent")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleAttribute(value: /* qualifiedName */ String => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToggleAttribute: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withWebkitMatchesSelector(value: /* selectors */ String => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkitMatchesSelector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWebkitMatchesSelector: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkitMatchesSelector")(js.undefined)
        ret
    }
  }
  
}

