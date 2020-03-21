package typingsSlinky.reactFlatpickr.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.Attr
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.DOMTokenList
import org.scalajs.dom.raw.DragEvent
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
import org.scalajs.dom.raw.WheelEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
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

object ReactFlatpickr
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-flatpickr", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: accept, alt, checked, className, defaultChecked, dir, disabled, draggable, hidden, id, lang, multiple, name, nonce, pattern, placeholder, readOnly, required, size, src, tabIndex, title, type */
  def apply(
    ATTRIBUTE_NODE: Int | Double = null,
    CDATA_SECTION_NODE: Int | Double = null,
    COMMENT_NODE: Int | Double = null,
    DOCUMENT_FRAGMENT_NODE: Int | Double = null,
    DOCUMENT_NODE: Int | Double = null,
    DOCUMENT_POSITION_CONTAINED_BY: Int | Double = null,
    DOCUMENT_POSITION_CONTAINS: Int | Double = null,
    DOCUMENT_POSITION_DISCONNECTED: Int | Double = null,
    DOCUMENT_POSITION_FOLLOWING: Int | Double = null,
    DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Int | Double = null,
    DOCUMENT_POSITION_PRECEDING: Int | Double = null,
    DOCUMENT_TYPE_NODE: Int | Double = null,
    ELEMENT_NODE: Int | Double = null,
    ENTITY_NODE: Int | Double = null,
    ENTITY_REFERENCE_NODE: Int | Double = null,
    NOTATION_NODE: Int | Double = null,
    PROCESSING_INSTRUCTION_NODE: Int | Double = null,
    TEXT_NODE: Int | Double = null,
    accessKey: String = null,
    accessKeyLabel: String = null,
    addEventListener: (fullscreenchange, /* listener */ js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]) => Unit = null,
    after: /* repeated */ Node | String => Unit = null,
    align: String = null,
    animate: /* keyframes */ js.Array[Keyframe] => Animation = null,
    append: /* repeated */ Node | String => Unit = null,
    appendChild: /* newChild */ Node => Node = null,
    assignedSlot: HTMLSlotElement = null,
    attachShadow: /* init */ ShadowRootInit => ShadowRoot = null,
    attributes: NamedNodeMap = null,
    autocapitalize: String = null,
    autocomplete: String = null,
    autofocus: js.UndefOr[Boolean] = js.undefined,
    baseURI: String = null,
    before: /* repeated */ Node | String => Unit = null,
    blur: () => Unit = null,
    checkValidity: () => Boolean = null,
    childElementCount: Int | Double = null,
    childNodes: NodeListOf[ChildNode with Node] = null,
    classList: DOMTokenList = null,
    click: () => Unit = null,
    clientHeight: Int | Double = null,
    clientLeft: Int | Double = null,
    clientTop: Int | Double = null,
    clientWidth: Int | Double = null,
    cloneNode: () => Node = null,
    closest: a => HTMLAnchorElement | Null = null,
    compareDocumentPosition: /* other */ Node => Double = null,
    contains: /* other */ Node => Boolean = null,
    contentEditable: String = null,
    dataset: DOMStringMap = null,
    defaultValue: String = null,
    dirName: String = null,
    dispatchEvent: /* event */ Event_ => Boolean = null,
    files: FileList = null,
    firstChild: ChildNode = null,
    firstElementChild: org.scalajs.dom.raw.Element = null,
    focus: () => Unit = null,
    form: HTMLFormElement = null,
    formAction: String = null,
    formEnctype: String = null,
    formMethod: String = null,
    formNoValidate: js.UndefOr[Boolean] = js.undefined,
    formTarget: String = null,
    getAnimations: () => js.Array[Animation] = null,
    getAttribute: /* qualifiedName */ String => String | Null = null,
    getAttributeNS: (/* namespace */ String, /* localName */ String) => String | Null = null,
    getAttributeNames: () => js.Array[String] = null,
    getAttributeNode: /* name */ String => Attr | Null = null,
    getAttributeNodeNS: (/* namespaceURI */ String, /* localName */ String) => Attr | Null = null,
    getBoundingClientRect: () => DOMRect = null,
    getClientRects: () => DOMRectList = null,
    getElementsByClassName: /* classNames */ String => HTMLCollectionOf[org.scalajs.dom.raw.Element] = null,
    getElementsByTagName: a => HTMLCollectionOf[HTMLAnchorElement] = null,
    getElementsByTagNameNS: (httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, /* localName */ String) => HTMLCollectionOf[HTMLElement] = null,
    getRootNode: () => Node = null,
    hasAttribute: /* qualifiedName */ String => Boolean = null,
    hasAttributeNS: (/* namespace */ String, /* localName */ String) => Boolean = null,
    hasAttributes: () => Boolean = null,
    hasChildNodes: () => Boolean = null,
    hasPointerCapture: /* pointerId */ Double => Boolean = null,
    height: Int | Double = null,
    indeterminate: js.UndefOr[Boolean] = js.undefined,
    innerHTML: String = null,
    innerText: String = null,
    inputMode: String = null,
    insertAdjacentElement: (/* position */ InsertPosition, /* insertedElement */ org.scalajs.dom.raw.Element) => org.scalajs.dom.raw.Element | Null = null,
    insertAdjacentHTML: (/* where */ InsertPosition, /* html */ String) => Unit = null,
    insertAdjacentText: (/* where */ InsertPosition, /* text */ String) => Unit = null,
    insertBefore: (/* newChild */ Node, /* refChild */ Node) => Node = null,
    isConnected: js.UndefOr[Boolean] = js.undefined,
    isContentEditable: js.UndefOr[Boolean] = js.undefined,
    isDefaultNamespace: /* namespace */ String => Boolean = null,
    isEqualNode: /* otherNode */ Node => Boolean = null,
    isSameNode: /* otherNode */ Node => Boolean = null,
    labels: NodeListOf[HTMLLabelElement with Node] = null,
    lastChild: ChildNode = null,
    lastElementChild: org.scalajs.dom.raw.Element = null,
    list: HTMLElement = null,
    localName: String = null,
    lookupNamespaceURI: /* prefix */ String => String | Null = null,
    lookupPrefix: /* namespace */ String => String | Null = null,
    matches: /* selectors */ String => Boolean = null,
    max: String = null,
    maxLength: Int | Double = null,
    min: String = null,
    minLength: Int | Double = null,
    msGetRegionContent: () => _ = null,
    namespaceURI: String = null,
    nextElementSibling: org.scalajs.dom.raw.Element = null,
    nextSibling: ChildNode = null,
    nodeName: String = null,
    nodeType: Int | Double = null,
    nodeValue: String = null,
    normalize: () => Unit = null,
    offsetHeight: Int | Double = null,
    offsetLeft: Int | Double = null,
    offsetParent: org.scalajs.dom.raw.Element = null,
    offsetTop: Int | Double = null,
    offsetWidth: Int | Double = null,
    onChange: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit = null,
    onClose: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit = null,
    onDayCreate: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit = null,
    onMonthChange: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit = null,
    onOpen: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit = null,
    onReady: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit = null,
    onValueUpdate: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit = null,
    onYearChange: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit = null,
    onabort: js.ThisFunction1[DateTimePickerProps, /* ev */ UIEvent, _] = null,
    onanimationcancel: js.ThisFunction1[DateTimePickerProps, /* ev */ AnimationEvent, _] = null,
    onanimationend: js.ThisFunction1[DateTimePickerProps, /* ev */ AnimationEvent, _] = null,
    onanimationiteration: js.ThisFunction1[DateTimePickerProps, /* ev */ AnimationEvent, _] = null,
    onanimationstart: js.ThisFunction1[DateTimePickerProps, /* ev */ AnimationEvent, _] = null,
    onauxclick: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _] = null,
    onblur: js.ThisFunction1[DateTimePickerProps, /* ev */ FocusEvent, _] = null,
    oncancel: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    oncanplay: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    oncanplaythrough: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onchange: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onclick: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _] = null,
    onclose: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    oncontextmenu: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _] = null,
    oncopy: js.ThisFunction1[DateTimePickerProps, /* ev */ ClipboardEvent, _] = null,
    oncuechange: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    oncut: js.ThisFunction1[DateTimePickerProps, /* ev */ ClipboardEvent, _] = null,
    ondblclick: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _] = null,
    ondrag: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _] = null,
    ondragend: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _] = null,
    ondragenter: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _] = null,
    ondragexit: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    ondragleave: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _] = null,
    ondragover: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _] = null,
    ondragstart: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _] = null,
    ondrop: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _] = null,
    ondurationchange: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onemptied: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onended: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onerror: (/* event */ Event_ | String, /* source */ js.UndefOr[String], /* lineno */ js.UndefOr[Double], /* colno */ js.UndefOr[Double], /* error */ js.UndefOr[js.Error]) => js.Any = null,
    onfocus: js.ThisFunction1[DateTimePickerProps, /* ev */ FocusEvent, _] = null,
    onfullscreenchange: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onfullscreenerror: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    ongotpointercapture: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _] = null,
    oninput: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    oninvalid: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onkeydown: js.ThisFunction1[DateTimePickerProps, /* ev */ KeyboardEvent, _] = null,
    onkeypress: js.ThisFunction1[DateTimePickerProps, /* ev */ KeyboardEvent, _] = null,
    onkeyup: js.ThisFunction1[DateTimePickerProps, /* ev */ KeyboardEvent, _] = null,
    onload: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onloadeddata: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onloadedmetadata: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onloadstart: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onlostpointercapture: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _] = null,
    onmousedown: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _] = null,
    onmouseenter: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _] = null,
    onmouseleave: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _] = null,
    onmousemove: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _] = null,
    onmouseout: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _] = null,
    onmouseover: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _] = null,
    onmouseup: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _] = null,
    onpaste: js.ThisFunction1[DateTimePickerProps, /* ev */ ClipboardEvent, _] = null,
    onpause: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onplay: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onplaying: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onpointercancel: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _] = null,
    onpointerdown: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _] = null,
    onpointerenter: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _] = null,
    onpointerleave: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _] = null,
    onpointermove: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _] = null,
    onpointerout: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _] = null,
    onpointerover: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _] = null,
    onpointerup: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _] = null,
    onprogress: js.ThisFunction1[DateTimePickerProps, /* ev */ ProgressEvent, _] = null,
    onratechange: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onreset: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onresize: js.ThisFunction1[DateTimePickerProps, /* ev */ UIEvent, _] = null,
    onscroll: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onsecuritypolicyviolation: js.ThisFunction1[DateTimePickerProps, /* ev */ SecurityPolicyViolationEvent, _] = null,
    onseeked: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onseeking: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onselect: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onselectionchange: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onselectstart: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onstalled: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onsubmit: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onsuspend: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    ontimeupdate: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    ontoggle: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    ontouchcancel: js.ThisFunction1[DateTimePickerProps, /* ev */ TouchEvent, _] = null,
    ontouchend: js.ThisFunction1[DateTimePickerProps, /* ev */ TouchEvent, _] = null,
    ontouchmove: js.ThisFunction1[DateTimePickerProps, /* ev */ TouchEvent, _] = null,
    ontouchstart: js.ThisFunction1[DateTimePickerProps, /* ev */ TouchEvent, _] = null,
    ontransitioncancel: js.ThisFunction1[DateTimePickerProps, /* ev */ TransitionEvent, _] = null,
    ontransitionend: js.ThisFunction1[DateTimePickerProps, /* ev */ TransitionEvent, _] = null,
    ontransitionrun: js.ThisFunction1[DateTimePickerProps, /* ev */ TransitionEvent, _] = null,
    ontransitionstart: js.ThisFunction1[DateTimePickerProps, /* ev */ TransitionEvent, _] = null,
    onvolumechange: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onwaiting: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onwheel: js.ThisFunction1[DateTimePickerProps, /* ev */ WheelEvent, _] = null,
    options: Options = null,
    outerHTML: String = null,
    ownerDocument: Document_ = null,
    parentElement: HTMLElement = null,
    parentNode: Node with ParentNode = null,
    prefix: String = null,
    prepend: /* repeated */ Node | String => Unit = null,
    previousElementSibling: org.scalajs.dom.raw.Element = null,
    previousSibling: ChildNode = null,
    querySelector: a => HTMLAnchorElement | Null = null,
    querySelectorAll: a => NodeListOf[HTMLAnchorElement with Node] = null,
    releasePointerCapture: /* pointerId */ Double => Unit = null,
    remove: () => Unit = null,
    removeAttribute: /* qualifiedName */ String => Unit = null,
    removeAttributeNS: (/* namespace */ String, /* localName */ String) => Unit = null,
    removeAttributeNode: /* attr */ Attr => Attr = null,
    removeChild: /* oldChild */ Node => Node = null,
    removeEventListener: (fullscreenchange, /* listener */ js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _]) => Unit = null,
    render: (/* props */ OmitDateTimePickerPropsop, /* ref */ js.Function1[/* node */ HTMLInputElement, Unit]) => ReactElement = null,
    replaceChild: (/* newChild */ Node, /* oldChild */ Node) => Node = null,
    replaceWith: /* repeated */ Node | String => Unit = null,
    reportValidity: () => Boolean = null,
    requestFullscreen: () => js.Promise[Unit] = null,
    requestPointerLock: () => Unit = null,
    scroll: () => Unit = null,
    scrollBy: () => Unit = null,
    scrollHeight: Int | Double = null,
    scrollIntoView: () => Unit = null,
    scrollLeft: Int | Double = null,
    scrollTo: () => Unit = null,
    scrollTop: Int | Double = null,
    scrollWidth: Int | Double = null,
    select: () => Unit = null,
    selectionDirection: forward | backward | none = null,
    selectionEnd: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (ATTRIBUTE_NODE != null) __obj.updateDynamic("ATTRIBUTE_NODE")(ATTRIBUTE_NODE.asInstanceOf[js.Any])
    if (CDATA_SECTION_NODE != null) __obj.updateDynamic("CDATA_SECTION_NODE")(CDATA_SECTION_NODE.asInstanceOf[js.Any])
    if (COMMENT_NODE != null) __obj.updateDynamic("COMMENT_NODE")(COMMENT_NODE.asInstanceOf[js.Any])
    if (DOCUMENT_FRAGMENT_NODE != null) __obj.updateDynamic("DOCUMENT_FRAGMENT_NODE")(DOCUMENT_FRAGMENT_NODE.asInstanceOf[js.Any])
    if (DOCUMENT_NODE != null) __obj.updateDynamic("DOCUMENT_NODE")(DOCUMENT_NODE.asInstanceOf[js.Any])
    if (DOCUMENT_POSITION_CONTAINED_BY != null) __obj.updateDynamic("DOCUMENT_POSITION_CONTAINED_BY")(DOCUMENT_POSITION_CONTAINED_BY.asInstanceOf[js.Any])
    if (DOCUMENT_POSITION_CONTAINS != null) __obj.updateDynamic("DOCUMENT_POSITION_CONTAINS")(DOCUMENT_POSITION_CONTAINS.asInstanceOf[js.Any])
    if (DOCUMENT_POSITION_DISCONNECTED != null) __obj.updateDynamic("DOCUMENT_POSITION_DISCONNECTED")(DOCUMENT_POSITION_DISCONNECTED.asInstanceOf[js.Any])
    if (DOCUMENT_POSITION_FOLLOWING != null) __obj.updateDynamic("DOCUMENT_POSITION_FOLLOWING")(DOCUMENT_POSITION_FOLLOWING.asInstanceOf[js.Any])
    if (DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC != null) __obj.updateDynamic("DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC")(DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC.asInstanceOf[js.Any])
    if (DOCUMENT_POSITION_PRECEDING != null) __obj.updateDynamic("DOCUMENT_POSITION_PRECEDING")(DOCUMENT_POSITION_PRECEDING.asInstanceOf[js.Any])
    if (DOCUMENT_TYPE_NODE != null) __obj.updateDynamic("DOCUMENT_TYPE_NODE")(DOCUMENT_TYPE_NODE.asInstanceOf[js.Any])
    if (ELEMENT_NODE != null) __obj.updateDynamic("ELEMENT_NODE")(ELEMENT_NODE.asInstanceOf[js.Any])
    if (ENTITY_NODE != null) __obj.updateDynamic("ENTITY_NODE")(ENTITY_NODE.asInstanceOf[js.Any])
    if (ENTITY_REFERENCE_NODE != null) __obj.updateDynamic("ENTITY_REFERENCE_NODE")(ENTITY_REFERENCE_NODE.asInstanceOf[js.Any])
    if (NOTATION_NODE != null) __obj.updateDynamic("NOTATION_NODE")(NOTATION_NODE.asInstanceOf[js.Any])
    if (PROCESSING_INSTRUCTION_NODE != null) __obj.updateDynamic("PROCESSING_INSTRUCTION_NODE")(PROCESSING_INSTRUCTION_NODE.asInstanceOf[js.Any])
    if (TEXT_NODE != null) __obj.updateDynamic("TEXT_NODE")(TEXT_NODE.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (accessKeyLabel != null) __obj.updateDynamic("accessKeyLabel")(accessKeyLabel.asInstanceOf[js.Any])
    if (addEventListener != null) __obj.updateDynamic("addEventListener")(js.Any.fromFunction2(addEventListener))
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction1(after))
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (animate != null) __obj.updateDynamic("animate")(js.Any.fromFunction1(animate))
    if (append != null) __obj.updateDynamic("append")(js.Any.fromFunction1(append))
    if (appendChild != null) __obj.updateDynamic("appendChild")(js.Any.fromFunction1(appendChild))
    if (assignedSlot != null) __obj.updateDynamic("assignedSlot")(assignedSlot.asInstanceOf[js.Any])
    if (attachShadow != null) __obj.updateDynamic("attachShadow")(js.Any.fromFunction1(attachShadow))
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (autocapitalize != null) __obj.updateDynamic("autocapitalize")(autocapitalize.asInstanceOf[js.Any])
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete.asInstanceOf[js.Any])
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus.asInstanceOf[js.Any])
    if (baseURI != null) __obj.updateDynamic("baseURI")(baseURI.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1(before))
    if (blur != null) __obj.updateDynamic("blur")(js.Any.fromFunction0(blur))
    if (checkValidity != null) __obj.updateDynamic("checkValidity")(js.Any.fromFunction0(checkValidity))
    if (childElementCount != null) __obj.updateDynamic("childElementCount")(childElementCount.asInstanceOf[js.Any])
    if (childNodes != null) __obj.updateDynamic("childNodes")(childNodes.asInstanceOf[js.Any])
    if (classList != null) __obj.updateDynamic("classList")(classList.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction0(click))
    if (clientHeight != null) __obj.updateDynamic("clientHeight")(clientHeight.asInstanceOf[js.Any])
    if (clientLeft != null) __obj.updateDynamic("clientLeft")(clientLeft.asInstanceOf[js.Any])
    if (clientTop != null) __obj.updateDynamic("clientTop")(clientTop.asInstanceOf[js.Any])
    if (clientWidth != null) __obj.updateDynamic("clientWidth")(clientWidth.asInstanceOf[js.Any])
    if (cloneNode != null) __obj.updateDynamic("cloneNode")(js.Any.fromFunction0(cloneNode))
    if (closest != null) __obj.updateDynamic("closest")(js.Any.fromFunction1(closest))
    if (compareDocumentPosition != null) __obj.updateDynamic("compareDocumentPosition")(js.Any.fromFunction1(compareDocumentPosition))
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1(contains))
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dirName != null) __obj.updateDynamic("dirName")(dirName.asInstanceOf[js.Any])
    if (dispatchEvent != null) __obj.updateDynamic("dispatchEvent")(js.Any.fromFunction1(dispatchEvent))
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (firstChild != null) __obj.updateDynamic("firstChild")(firstChild.asInstanceOf[js.Any])
    if (firstElementChild != null) __obj.updateDynamic("firstElementChild")(firstElementChild.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction0(focus))
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formAction != null) __obj.updateDynamic("formAction")(formAction.asInstanceOf[js.Any])
    if (formEnctype != null) __obj.updateDynamic("formEnctype")(formEnctype.asInstanceOf[js.Any])
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(formNoValidate)) __obj.updateDynamic("formNoValidate")(formNoValidate.asInstanceOf[js.Any])
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget.asInstanceOf[js.Any])
    if (getAnimations != null) __obj.updateDynamic("getAnimations")(js.Any.fromFunction0(getAnimations))
    if (getAttribute != null) __obj.updateDynamic("getAttribute")(js.Any.fromFunction1(getAttribute))
    if (getAttributeNS != null) __obj.updateDynamic("getAttributeNS")(js.Any.fromFunction2(getAttributeNS))
    if (getAttributeNames != null) __obj.updateDynamic("getAttributeNames")(js.Any.fromFunction0(getAttributeNames))
    if (getAttributeNode != null) __obj.updateDynamic("getAttributeNode")(js.Any.fromFunction1(getAttributeNode))
    if (getAttributeNodeNS != null) __obj.updateDynamic("getAttributeNodeNS")(js.Any.fromFunction2(getAttributeNodeNS))
    if (getBoundingClientRect != null) __obj.updateDynamic("getBoundingClientRect")(js.Any.fromFunction0(getBoundingClientRect))
    if (getClientRects != null) __obj.updateDynamic("getClientRects")(js.Any.fromFunction0(getClientRects))
    if (getElementsByClassName != null) __obj.updateDynamic("getElementsByClassName")(js.Any.fromFunction1(getElementsByClassName))
    if (getElementsByTagName != null) __obj.updateDynamic("getElementsByTagName")(js.Any.fromFunction1(getElementsByTagName))
    if (getElementsByTagNameNS != null) __obj.updateDynamic("getElementsByTagNameNS")(js.Any.fromFunction2(getElementsByTagNameNS))
    if (getRootNode != null) __obj.updateDynamic("getRootNode")(js.Any.fromFunction0(getRootNode))
    if (hasAttribute != null) __obj.updateDynamic("hasAttribute")(js.Any.fromFunction1(hasAttribute))
    if (hasAttributeNS != null) __obj.updateDynamic("hasAttributeNS")(js.Any.fromFunction2(hasAttributeNS))
    if (hasAttributes != null) __obj.updateDynamic("hasAttributes")(js.Any.fromFunction0(hasAttributes))
    if (hasChildNodes != null) __obj.updateDynamic("hasChildNodes")(js.Any.fromFunction0(hasChildNodes))
    if (hasPointerCapture != null) __obj.updateDynamic("hasPointerCapture")(js.Any.fromFunction1(hasPointerCapture))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate.asInstanceOf[js.Any])
    if (innerHTML != null) __obj.updateDynamic("innerHTML")(innerHTML.asInstanceOf[js.Any])
    if (innerText != null) __obj.updateDynamic("innerText")(innerText.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (insertAdjacentElement != null) __obj.updateDynamic("insertAdjacentElement")(js.Any.fromFunction2(insertAdjacentElement))
    if (insertAdjacentHTML != null) __obj.updateDynamic("insertAdjacentHTML")(js.Any.fromFunction2(insertAdjacentHTML))
    if (insertAdjacentText != null) __obj.updateDynamic("insertAdjacentText")(js.Any.fromFunction2(insertAdjacentText))
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(js.Any.fromFunction2(insertBefore))
    if (!js.isUndefined(isConnected)) __obj.updateDynamic("isConnected")(isConnected.asInstanceOf[js.Any])
    if (!js.isUndefined(isContentEditable)) __obj.updateDynamic("isContentEditable")(isContentEditable.asInstanceOf[js.Any])
    if (isDefaultNamespace != null) __obj.updateDynamic("isDefaultNamespace")(js.Any.fromFunction1(isDefaultNamespace))
    if (isEqualNode != null) __obj.updateDynamic("isEqualNode")(js.Any.fromFunction1(isEqualNode))
    if (isSameNode != null) __obj.updateDynamic("isSameNode")(js.Any.fromFunction1(isSameNode))
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (lastChild != null) __obj.updateDynamic("lastChild")(lastChild.asInstanceOf[js.Any])
    if (lastElementChild != null) __obj.updateDynamic("lastElementChild")(lastElementChild.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (localName != null) __obj.updateDynamic("localName")(localName.asInstanceOf[js.Any])
    if (lookupNamespaceURI != null) __obj.updateDynamic("lookupNamespaceURI")(js.Any.fromFunction1(lookupNamespaceURI))
    if (lookupPrefix != null) __obj.updateDynamic("lookupPrefix")(js.Any.fromFunction1(lookupPrefix))
    if (matches != null) __obj.updateDynamic("matches")(js.Any.fromFunction1(matches))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (msGetRegionContent != null) __obj.updateDynamic("msGetRegionContent")(js.Any.fromFunction0(msGetRegionContent))
    if (namespaceURI != null) __obj.updateDynamic("namespaceURI")(namespaceURI.asInstanceOf[js.Any])
    if (nextElementSibling != null) __obj.updateDynamic("nextElementSibling")(nextElementSibling.asInstanceOf[js.Any])
    if (nextSibling != null) __obj.updateDynamic("nextSibling")(nextSibling.asInstanceOf[js.Any])
    if (nodeName != null) __obj.updateDynamic("nodeName")(nodeName.asInstanceOf[js.Any])
    if (nodeType != null) __obj.updateDynamic("nodeType")(nodeType.asInstanceOf[js.Any])
    if (nodeValue != null) __obj.updateDynamic("nodeValue")(nodeValue.asInstanceOf[js.Any])
    if (normalize != null) __obj.updateDynamic("normalize")(js.Any.fromFunction0(normalize))
    if (offsetHeight != null) __obj.updateDynamic("offsetHeight")(offsetHeight.asInstanceOf[js.Any])
    if (offsetLeft != null) __obj.updateDynamic("offsetLeft")(offsetLeft.asInstanceOf[js.Any])
    if (offsetParent != null) __obj.updateDynamic("offsetParent")(offsetParent.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (offsetWidth != null) __obj.updateDynamic("offsetWidth")(offsetWidth.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction4(onChange))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction4(onClose))
    if (onDayCreate != null) __obj.updateDynamic("onDayCreate")(js.Any.fromFunction4(onDayCreate))
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(js.Any.fromFunction4(onMonthChange))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction4(onOpen))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction4(onReady))
    if (onValueUpdate != null) __obj.updateDynamic("onValueUpdate")(js.Any.fromFunction4(onValueUpdate))
    if (onYearChange != null) __obj.updateDynamic("onYearChange")(js.Any.fromFunction4(onYearChange))
    if (onabort != null) __obj.updateDynamic("onabort")(onabort.asInstanceOf[js.Any])
    if (onanimationcancel != null) __obj.updateDynamic("onanimationcancel")(onanimationcancel.asInstanceOf[js.Any])
    if (onanimationend != null) __obj.updateDynamic("onanimationend")(onanimationend.asInstanceOf[js.Any])
    if (onanimationiteration != null) __obj.updateDynamic("onanimationiteration")(onanimationiteration.asInstanceOf[js.Any])
    if (onanimationstart != null) __obj.updateDynamic("onanimationstart")(onanimationstart.asInstanceOf[js.Any])
    if (onauxclick != null) __obj.updateDynamic("onauxclick")(onauxclick.asInstanceOf[js.Any])
    if (onblur != null) __obj.updateDynamic("onblur")(onblur.asInstanceOf[js.Any])
    if (oncancel != null) __obj.updateDynamic("oncancel")(oncancel.asInstanceOf[js.Any])
    if (oncanplay != null) __obj.updateDynamic("oncanplay")(oncanplay.asInstanceOf[js.Any])
    if (oncanplaythrough != null) __obj.updateDynamic("oncanplaythrough")(oncanplaythrough.asInstanceOf[js.Any])
    if (onchange != null) __obj.updateDynamic("onchange")(onchange.asInstanceOf[js.Any])
    if (onclick != null) __obj.updateDynamic("onclick")(onclick.asInstanceOf[js.Any])
    if (onclose != null) __obj.updateDynamic("onclose")(onclose.asInstanceOf[js.Any])
    if (oncontextmenu != null) __obj.updateDynamic("oncontextmenu")(oncontextmenu.asInstanceOf[js.Any])
    if (oncopy != null) __obj.updateDynamic("oncopy")(oncopy.asInstanceOf[js.Any])
    if (oncuechange != null) __obj.updateDynamic("oncuechange")(oncuechange.asInstanceOf[js.Any])
    if (oncut != null) __obj.updateDynamic("oncut")(oncut.asInstanceOf[js.Any])
    if (ondblclick != null) __obj.updateDynamic("ondblclick")(ondblclick.asInstanceOf[js.Any])
    if (ondrag != null) __obj.updateDynamic("ondrag")(ondrag.asInstanceOf[js.Any])
    if (ondragend != null) __obj.updateDynamic("ondragend")(ondragend.asInstanceOf[js.Any])
    if (ondragenter != null) __obj.updateDynamic("ondragenter")(ondragenter.asInstanceOf[js.Any])
    if (ondragexit != null) __obj.updateDynamic("ondragexit")(ondragexit.asInstanceOf[js.Any])
    if (ondragleave != null) __obj.updateDynamic("ondragleave")(ondragleave.asInstanceOf[js.Any])
    if (ondragover != null) __obj.updateDynamic("ondragover")(ondragover.asInstanceOf[js.Any])
    if (ondragstart != null) __obj.updateDynamic("ondragstart")(ondragstart.asInstanceOf[js.Any])
    if (ondrop != null) __obj.updateDynamic("ondrop")(ondrop.asInstanceOf[js.Any])
    if (ondurationchange != null) __obj.updateDynamic("ondurationchange")(ondurationchange.asInstanceOf[js.Any])
    if (onemptied != null) __obj.updateDynamic("onemptied")(onemptied.asInstanceOf[js.Any])
    if (onended != null) __obj.updateDynamic("onended")(onended.asInstanceOf[js.Any])
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction5(onerror))
    if (onfocus != null) __obj.updateDynamic("onfocus")(onfocus.asInstanceOf[js.Any])
    if (onfullscreenchange != null) __obj.updateDynamic("onfullscreenchange")(onfullscreenchange.asInstanceOf[js.Any])
    if (onfullscreenerror != null) __obj.updateDynamic("onfullscreenerror")(onfullscreenerror.asInstanceOf[js.Any])
    if (ongotpointercapture != null) __obj.updateDynamic("ongotpointercapture")(ongotpointercapture.asInstanceOf[js.Any])
    if (oninput != null) __obj.updateDynamic("oninput")(oninput.asInstanceOf[js.Any])
    if (oninvalid != null) __obj.updateDynamic("oninvalid")(oninvalid.asInstanceOf[js.Any])
    if (onkeydown != null) __obj.updateDynamic("onkeydown")(onkeydown.asInstanceOf[js.Any])
    if (onkeypress != null) __obj.updateDynamic("onkeypress")(onkeypress.asInstanceOf[js.Any])
    if (onkeyup != null) __obj.updateDynamic("onkeyup")(onkeyup.asInstanceOf[js.Any])
    if (onload != null) __obj.updateDynamic("onload")(onload.asInstanceOf[js.Any])
    if (onloadeddata != null) __obj.updateDynamic("onloadeddata")(onloadeddata.asInstanceOf[js.Any])
    if (onloadedmetadata != null) __obj.updateDynamic("onloadedmetadata")(onloadedmetadata.asInstanceOf[js.Any])
    if (onloadstart != null) __obj.updateDynamic("onloadstart")(onloadstart.asInstanceOf[js.Any])
    if (onlostpointercapture != null) __obj.updateDynamic("onlostpointercapture")(onlostpointercapture.asInstanceOf[js.Any])
    if (onmousedown != null) __obj.updateDynamic("onmousedown")(onmousedown.asInstanceOf[js.Any])
    if (onmouseenter != null) __obj.updateDynamic("onmouseenter")(onmouseenter.asInstanceOf[js.Any])
    if (onmouseleave != null) __obj.updateDynamic("onmouseleave")(onmouseleave.asInstanceOf[js.Any])
    if (onmousemove != null) __obj.updateDynamic("onmousemove")(onmousemove.asInstanceOf[js.Any])
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(onmouseout.asInstanceOf[js.Any])
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(onmouseover.asInstanceOf[js.Any])
    if (onmouseup != null) __obj.updateDynamic("onmouseup")(onmouseup.asInstanceOf[js.Any])
    if (onpaste != null) __obj.updateDynamic("onpaste")(onpaste.asInstanceOf[js.Any])
    if (onpause != null) __obj.updateDynamic("onpause")(onpause.asInstanceOf[js.Any])
    if (onplay != null) __obj.updateDynamic("onplay")(onplay.asInstanceOf[js.Any])
    if (onplaying != null) __obj.updateDynamic("onplaying")(onplaying.asInstanceOf[js.Any])
    if (onpointercancel != null) __obj.updateDynamic("onpointercancel")(onpointercancel.asInstanceOf[js.Any])
    if (onpointerdown != null) __obj.updateDynamic("onpointerdown")(onpointerdown.asInstanceOf[js.Any])
    if (onpointerenter != null) __obj.updateDynamic("onpointerenter")(onpointerenter.asInstanceOf[js.Any])
    if (onpointerleave != null) __obj.updateDynamic("onpointerleave")(onpointerleave.asInstanceOf[js.Any])
    if (onpointermove != null) __obj.updateDynamic("onpointermove")(onpointermove.asInstanceOf[js.Any])
    if (onpointerout != null) __obj.updateDynamic("onpointerout")(onpointerout.asInstanceOf[js.Any])
    if (onpointerover != null) __obj.updateDynamic("onpointerover")(onpointerover.asInstanceOf[js.Any])
    if (onpointerup != null) __obj.updateDynamic("onpointerup")(onpointerup.asInstanceOf[js.Any])
    if (onprogress != null) __obj.updateDynamic("onprogress")(onprogress.asInstanceOf[js.Any])
    if (onratechange != null) __obj.updateDynamic("onratechange")(onratechange.asInstanceOf[js.Any])
    if (onreset != null) __obj.updateDynamic("onreset")(onreset.asInstanceOf[js.Any])
    if (onresize != null) __obj.updateDynamic("onresize")(onresize.asInstanceOf[js.Any])
    if (onscroll != null) __obj.updateDynamic("onscroll")(onscroll.asInstanceOf[js.Any])
    if (onsecuritypolicyviolation != null) __obj.updateDynamic("onsecuritypolicyviolation")(onsecuritypolicyviolation.asInstanceOf[js.Any])
    if (onseeked != null) __obj.updateDynamic("onseeked")(onseeked.asInstanceOf[js.Any])
    if (onseeking != null) __obj.updateDynamic("onseeking")(onseeking.asInstanceOf[js.Any])
    if (onselect != null) __obj.updateDynamic("onselect")(onselect.asInstanceOf[js.Any])
    if (onselectionchange != null) __obj.updateDynamic("onselectionchange")(onselectionchange.asInstanceOf[js.Any])
    if (onselectstart != null) __obj.updateDynamic("onselectstart")(onselectstart.asInstanceOf[js.Any])
    if (onstalled != null) __obj.updateDynamic("onstalled")(onstalled.asInstanceOf[js.Any])
    if (onsubmit != null) __obj.updateDynamic("onsubmit")(onsubmit.asInstanceOf[js.Any])
    if (onsuspend != null) __obj.updateDynamic("onsuspend")(onsuspend.asInstanceOf[js.Any])
    if (ontimeupdate != null) __obj.updateDynamic("ontimeupdate")(ontimeupdate.asInstanceOf[js.Any])
    if (ontoggle != null) __obj.updateDynamic("ontoggle")(ontoggle.asInstanceOf[js.Any])
    if (ontouchcancel != null) __obj.updateDynamic("ontouchcancel")(ontouchcancel.asInstanceOf[js.Any])
    if (ontouchend != null) __obj.updateDynamic("ontouchend")(ontouchend.asInstanceOf[js.Any])
    if (ontouchmove != null) __obj.updateDynamic("ontouchmove")(ontouchmove.asInstanceOf[js.Any])
    if (ontouchstart != null) __obj.updateDynamic("ontouchstart")(ontouchstart.asInstanceOf[js.Any])
    if (ontransitioncancel != null) __obj.updateDynamic("ontransitioncancel")(ontransitioncancel.asInstanceOf[js.Any])
    if (ontransitionend != null) __obj.updateDynamic("ontransitionend")(ontransitionend.asInstanceOf[js.Any])
    if (ontransitionrun != null) __obj.updateDynamic("ontransitionrun")(ontransitionrun.asInstanceOf[js.Any])
    if (ontransitionstart != null) __obj.updateDynamic("ontransitionstart")(ontransitionstart.asInstanceOf[js.Any])
    if (onvolumechange != null) __obj.updateDynamic("onvolumechange")(onvolumechange.asInstanceOf[js.Any])
    if (onwaiting != null) __obj.updateDynamic("onwaiting")(onwaiting.asInstanceOf[js.Any])
    if (onwheel != null) __obj.updateDynamic("onwheel")(onwheel.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (outerHTML != null) __obj.updateDynamic("outerHTML")(outerHTML.asInstanceOf[js.Any])
    if (ownerDocument != null) __obj.updateDynamic("ownerDocument")(ownerDocument.asInstanceOf[js.Any])
    if (parentElement != null) __obj.updateDynamic("parentElement")(parentElement.asInstanceOf[js.Any])
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prepend != null) __obj.updateDynamic("prepend")(js.Any.fromFunction1(prepend))
    if (previousElementSibling != null) __obj.updateDynamic("previousElementSibling")(previousElementSibling.asInstanceOf[js.Any])
    if (previousSibling != null) __obj.updateDynamic("previousSibling")(previousSibling.asInstanceOf[js.Any])
    if (querySelector != null) __obj.updateDynamic("querySelector")(js.Any.fromFunction1(querySelector))
    if (querySelectorAll != null) __obj.updateDynamic("querySelectorAll")(js.Any.fromFunction1(querySelectorAll))
    if (releasePointerCapture != null) __obj.updateDynamic("releasePointerCapture")(js.Any.fromFunction1(releasePointerCapture))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction0(remove))
    if (removeAttribute != null) __obj.updateDynamic("removeAttribute")(js.Any.fromFunction1(removeAttribute))
    if (removeAttributeNS != null) __obj.updateDynamic("removeAttributeNS")(js.Any.fromFunction2(removeAttributeNS))
    if (removeAttributeNode != null) __obj.updateDynamic("removeAttributeNode")(js.Any.fromFunction1(removeAttributeNode))
    if (removeChild != null) __obj.updateDynamic("removeChild")(js.Any.fromFunction1(removeChild))
    if (removeEventListener != null) __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2(removeEventListener))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2(render))
    if (replaceChild != null) __obj.updateDynamic("replaceChild")(js.Any.fromFunction2(replaceChild))
    if (replaceWith != null) __obj.updateDynamic("replaceWith")(js.Any.fromFunction1(replaceWith))
    if (reportValidity != null) __obj.updateDynamic("reportValidity")(js.Any.fromFunction0(reportValidity))
    if (requestFullscreen != null) __obj.updateDynamic("requestFullscreen")(js.Any.fromFunction0(requestFullscreen))
    if (requestPointerLock != null) __obj.updateDynamic("requestPointerLock")(js.Any.fromFunction0(requestPointerLock))
    if (scroll != null) __obj.updateDynamic("scroll")(js.Any.fromFunction0(scroll))
    if (scrollBy != null) __obj.updateDynamic("scrollBy")(js.Any.fromFunction0(scrollBy))
    if (scrollHeight != null) __obj.updateDynamic("scrollHeight")(scrollHeight.asInstanceOf[js.Any])
    if (scrollIntoView != null) __obj.updateDynamic("scrollIntoView")(js.Any.fromFunction0(scrollIntoView))
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(js.Any.fromFunction0(scrollTo))
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (scrollWidth != null) __obj.updateDynamic("scrollWidth")(scrollWidth.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction0(select))
    if (selectionDirection != null) __obj.updateDynamic("selectionDirection")(selectionDirection.asInstanceOf[js.Any])
    if (selectionEnd != null) __obj.updateDynamic("selectionEnd")(selectionEnd.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactFlatpickr.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DateTimePickerProps
}

