package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OldHTMLDocument extends js.Object {
  
  def CreateEventObject(): IHTMLEventObj = js.native
  def CreateEventObject(pvarEventObject: js.Any): IHTMLEventObj = js.native
  
  def FireEvent(bstrEventName: String): Boolean = js.native
  def FireEvent(bstrEventName: String, pvarEventObject: js.Any): Boolean = js.native
  
  @JSName("MSHTML.OldHTMLDocument_typekey")
  var MSHTMLDotOldHTMLDocument_typekey: OldHTMLDocument = js.native
  
  val Script: js.Any = js.native
  
  val URLUnencoded: String = js.native
  
  val activeElement: IHTMLElement = js.native
  
  def addEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
  
  def adoptNode(pNodeSource: IHTMLDOMNode): IHTMLDOMNode3 = js.native
  
  var alinkColor: js.Any = js.native
  
  def all(): js.Any = js.native
  def all(name: js.UndefOr[scala.Nothing], index: js.Any): js.Any = js.native
  def all(name: js.Any): js.Any = js.native
  def all(name: js.Any, index: js.Any): js.Any = js.native
  @JSName("all")
  val all_Original: IHTMLElementCollection = js.native
  
  def anchors(): js.Any = js.native
  def anchors(name: js.UndefOr[scala.Nothing], index: js.Any): js.Any = js.native
  def anchors(name: js.Any): js.Any = js.native
  def anchors(name: js.Any, index: js.Any): js.Any = js.native
  @JSName("anchors")
  val anchors_Original: IHTMLElementCollection = js.native
  
  def appendChild(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def applets(): js.Any = js.native
  def applets(name: js.UndefOr[scala.Nothing], index: js.Any): js.Any = js.native
  def applets(name: js.Any): js.Any = js.native
  def applets(name: js.Any, index: js.Any): js.Any = js.native
  @JSName("applets")
  val applets_Original: IHTMLElementCollection = js.native
  
  def attachEvent(event: String, pdisp: js.Any): Boolean = js.native
  
  val attributes: js.Any = js.native
  
  var bgColor: js.Any = js.native
  
  val body: IHTMLElement = js.native
  
  val characterSet: String = js.native
  
  var charset: String = js.native
  
  val childNodes: js.Any = js.native
  
  def clear(): Unit = js.native
  
  def cloneNode(fDeep: Boolean): IHTMLDOMNode = js.native
  
  def close(): Unit = js.native
  
  def compareDocumentPosition(otherNode: IHTMLDOMNode): Double = js.native
  
  val compatMode: String = js.native
  
  def compatible(index: Double): IHTMLDocumentCompatibleInfo = js.native
  @JSName("compatible")
  val compatible_Original: IHTMLDocumentCompatibleInfoCollection = js.native
  
  val constructor: js.Any = js.native
  
  var cookie: String = js.native
  
  def createAttribute(bstrAttrName: String): IHTMLDOMAttribute = js.native
  
  def createAttributeNS(pvarNS: js.Any, bstrAttrName: String): IHTMLDOMAttribute = js.native
  
  def createCDATASection(text: String): IHTMLDOMNode = js.native
  
  def createComment(bstrData: String): IHTMLDOMNode = js.native
  
  def createDocumentFragment(): IHTMLDocument2 = js.native
  
  def createDocumentFromUrl(bstrURL: String, bstrOptions: String): IHTMLDocument2 = js.native
  
  def createElement(eTag: String): IHTMLElement = js.native
  
  def createElementNS(pvarNS: js.Any, bstrTag: String): IHTMLElement = js.native
  
  def createEvent(eventType: String): IDOMEvent = js.native
  
  def createNodeIterator(pRootNode: js.Any, ulWhatToShow: Double, pFilter: js.Any, fEntityReferenceExpansion: Boolean): IDOMNodeIterator = js.native
  
  def createProcessingInstruction(bstrTarget: String, bstrData: String): IDOMProcessingInstruction = js.native
  
  def createRange(): IHTMLDOMRange = js.native
  
  def createRenderStyle(v: String): IHTMLRenderStyle = js.native
  
  /**
    * @param bstrHref [bstrHref='']
    * @param lIndex [lIndex=-1]
    */
  def createStyleSheet(): IHTMLStyleSheet = js.native
  def createStyleSheet(bstrHref: js.UndefOr[scala.Nothing], lIndex: Double): IHTMLStyleSheet = js.native
  def createStyleSheet(bstrHref: String): IHTMLStyleSheet = js.native
  def createStyleSheet(bstrHref: String, lIndex: Double): IHTMLStyleSheet = js.native
  
  def createTextNode(text: String): IHTMLDOMNode = js.native
  
  def createTreeWalker(pRootNode: js.Any, ulWhatToShow: Double, pFilter: js.Any, fEntityReferenceExpansion: Boolean): IDOMTreeWalker = js.native
  
  var defaultCharset: String = js.native
  
  def defaultView(pvarIndex: js.Any): js.Any = js.native
  @JSName("defaultView")
  val defaultView_Original: IHTMLWindow2 = js.native
  
  var designMode: String = js.native
  
  def detachEvent(event: String, pdisp: js.Any): Unit = js.native
  
  var dir: String = js.native
  
  def dispatchEvent(evt: IDOMEvent): Boolean = js.native
  
  val doctype: IHTMLDOMNode = js.native
  
  val documentElement: IHTMLElement = js.native
  
  val documentMode: js.Any = js.native
  
  var domain: String = js.native
  
  def elementFromPoint(x: Double, y: Double): IHTMLElement = js.native
  
  def elementsFromPoint(x: Double, y: Double): IHTMLDOMChildrenCollection = js.native
  
  def elementsFromRect(left: Double, top: Double, width: Double, height: Double): IHTMLDOMChildrenCollection = js.native
  
  def embeds(): js.Any = js.native
  def embeds(name: js.UndefOr[scala.Nothing], index: js.Any): js.Any = js.native
  def embeds(name: js.Any): js.Any = js.native
  def embeds(name: js.Any, index: js.Any): js.Any = js.native
  @JSName("embeds")
  val embeds_Original: IHTMLElementCollection = js.native
  
  /** @param showUI [showUI=false] */
  def execCommand(cmdID: String): Boolean = js.native
  def execCommand(cmdID: String, showUI: js.UndefOr[scala.Nothing], value: js.Any): Boolean = js.native
  def execCommand(cmdID: String, showUI: Boolean): Boolean = js.native
  def execCommand(cmdID: String, showUI: Boolean, value: js.Any): Boolean = js.native
  
  def execCommandShowHelp(cmdID: String): Boolean = js.native
  
  var expando: Boolean = js.native
  
  var fgColor: js.Any = js.native
  
  val fileCreatedDate: String = js.native
  
  val fileModifiedDate: String = js.native
  
  val fileSize: String = js.native
  
  val fileUpdatedDate: String = js.native
  
  val firstChild: IHTMLDOMNode = js.native
  
  def focus(): Unit = js.native
  
  def forms(): js.Any = js.native
  def forms(name: js.UndefOr[scala.Nothing], index: js.Any): js.Any = js.native
  def forms(name: js.Any): js.Any = js.native
  def forms(name: js.Any, index: js.Any): js.Any = js.native
  @JSName("forms")
  val forms_Original: IHTMLElementCollection = js.native
  
  def frames(pvarIndex: js.Any): js.Any = js.native
  @JSName("frames")
  val frames_Original: FramesCollection = js.native
  
  def getElementById(v: String): IHTMLElement = js.native
  
  def getElementsByClassName(v: String): IHTMLElementCollection = js.native
  
  def getElementsByName(v: String): IHTMLElementCollection = js.native
  
  def getElementsByTagName(v: String): IHTMLElementCollection = js.native
  
  def getElementsByTagNameNS(pvarNS: js.Any, bstrLocalName: String): IHTMLElementCollection = js.native
  
  def getSelection(): IHTMLSelection = js.native
  
  def hasAttributes(): Boolean = js.native
  
  def hasChildNodes(): Boolean = js.native
  
  def hasFocus(): Boolean = js.native
  
  val head: IHTMLElement = js.native
  
  def ie8_getElementById(bstrId: String): IHTMLElement2 = js.native
  
  def ie9_all(): js.Any = js.native
  def ie9_all(name: js.UndefOr[scala.Nothing], index: js.Any): js.Any = js.native
  def ie9_all(name: js.Any): js.Any = js.native
  def ie9_all(name: js.Any, index: js.Any): js.Any = js.native
  @JSName("ie9_all")
  val ie9_all_Original: IHTMLElementCollection = js.native
  
  def ie9_appendChild(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  var ie9_body: IHTMLElement = js.native
  
  def ie9_createAttribute(bstrAttrName: String): IHTMLDOMAttribute = js.native
  
  def ie9_createElement(bstrTag: String): IHTMLElement = js.native
  
  def ie9_insertBefore(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def ie9_insertBefore(newChild: IHTMLDOMNode, refChild: js.Any): IHTMLDOMNode = js.native
  
  def ie9_parentWindow(pvarIndex: js.Any): js.Any = js.native
  @JSName("ie9_parentWindow")
  val ie9_parentWindow_Original: IHTMLWindow2 = js.native
  
  def ie9_removeChild(oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def ie9_replaceChild(newChild: IHTMLDOMNode, oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def images(): js.Any = js.native
  def images(name: js.UndefOr[scala.Nothing], index: js.Any): js.Any = js.native
  def images(name: js.Any): js.Any = js.native
  def images(name: js.Any, index: js.Any): js.Any = js.native
  @JSName("images")
  val images_Original: IHTMLElementCollection = js.native
  
  val implementation: IHTMLDOMImplementation = js.native
  
  def importNode(pNodeSource: IHTMLDOMNode, fDeep: Boolean): IHTMLDOMNode3 = js.native
  
  val inputEncoding: String = js.native
  
  def insertBefore(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def insertBefore(newChild: IHTMLDOMNode, refChild: js.Any): IHTMLDOMNode = js.native
  
  def isDefaultNamespace(pvarNamespace: js.Any): Boolean = js.native
  
  def isEqualNode(otherNode: IHTMLDOMNode3): Boolean = js.native
  
  def isSameNode(otherNode: IHTMLDOMNode3): Boolean = js.native
  
  def isSupported(feature: String, version: js.Any): Boolean = js.native
  
  val lastChild: IHTMLDOMNode = js.native
  
  val lastModified: String = js.native
  
  var linkColor: js.Any = js.native
  
  def links(): js.Any = js.native
  def links(name: js.UndefOr[scala.Nothing], index: js.Any): js.Any = js.native
  def links(name: js.Any): js.Any = js.native
  def links(name: js.Any, index: js.Any): js.Any = js.native
  @JSName("links")
  val links_Original: IHTMLElementCollection = js.native
  
  val localName: js.Any = js.native
  
  val location: IHTMLLocation = js.native
  
  def lookupNamespaceURI(pvarPrefix: js.Any): js.Any = js.native
  
  def lookupPrefix(pvarNamespaceURI: js.Any): js.Any = js.native
  
  var media: String = js.native
  
  val mimeType: String = js.native
  
  var msCapsLockWarningOff: Boolean = js.native
  
  val nameProp: String = js.native
  
  val namespaceURI: js.Any = js.native
  
  val namespaces: js.Any = js.native
  
  val nextSibling: IHTMLDOMNode = js.native
  
  val nodeName: String = js.native
  
  val nodeType: Double = js.native
  
  var nodeValue: js.Any = js.native
  
  def normalize(): Unit = js.native
  
  var onabort: js.Any = js.native
  
  var onactivate: js.Any = js.native
  
  var onafterupdate: js.Any = js.native
  
  var onbeforeactivate: js.Any = js.native
  
  var onbeforedeactivate: js.Any = js.native
  
  var onbeforeeditfocus: js.Any = js.native
  
  var onbeforeupdate: js.Any = js.native
  
  var onblur: js.Any = js.native
  
  var oncanplay: js.Any = js.native
  
  var oncanplaythrough: js.Any = js.native
  
  var oncellchange: js.Any = js.native
  
  var onchange: js.Any = js.native
  
  var onclick: js.Any = js.native
  
  var oncontextmenu: js.Any = js.native
  
  var oncontrolselect: js.Any = js.native
  
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
  
  var onfocus: js.Any = js.native
  
  var onfocusin: js.Any = js.native
  
  var onfocusout: js.Any = js.native
  
  var onhelp: js.Any = js.native
  
  var oninput: js.Any = js.native
  
  var onkeydown: js.Any = js.native
  
  var onkeypress: js.Any = js.native
  
  var onkeyup: js.Any = js.native
  
  var onload: js.Any = js.native
  
  var onloadeddata: js.Any = js.native
  
  var onloadedmetadata: js.Any = js.native
  
  var onloadstart: js.Any = js.native
  
  var onmousedown: js.Any = js.native
  
  var onmousemove: js.Any = js.native
  
  var onmouseout: js.Any = js.native
  
  var onmouseover: js.Any = js.native
  
  var onmouseup: js.Any = js.native
  
  var onmousewheel: js.Any = js.native
  
  var onmscontentzoom: js.Any = js.native
  
  var onmsgesturechange: js.Any = js.native
  
  var onmsgesturedoubletap: js.Any = js.native
  
  var onmsgestureend: js.Any = js.native
  
  var onmsgesturehold: js.Any = js.native
  
  var onmsgesturestart: js.Any = js.native
  
  var onmsgesturetap: js.Any = js.native
  
  var onmsinertiastart: js.Any = js.native
  
  var onmsmanipulationstatechanged: js.Any = js.native
  
  var onmspointercancel: js.Any = js.native
  
  var onmspointerdown: js.Any = js.native
  
  var onmspointerhover: js.Any = js.native
  
  var onmspointermove: js.Any = js.native
  
  var onmspointerout: js.Any = js.native
  
  var onmspointerover: js.Any = js.native
  
  var onmspointerup: js.Any = js.native
  
  var onmssitemodejumplistitemremoved: js.Any = js.native
  
  var onmsthumbnailclick: js.Any = js.native
  
  var onpause: js.Any = js.native
  
  var onplay: js.Any = js.native
  
  var onplaying: js.Any = js.native
  
  var onprogress: js.Any = js.native
  
  var onpropertychange: js.Any = js.native
  
  var onratechange: js.Any = js.native
  
  var onreadystatechange: js.Any = js.native
  
  var onreset: js.Any = js.native
  
  var onrowenter: js.Any = js.native
  
  var onrowexit: js.Any = js.native
  
  var onrowsdelete: js.Any = js.native
  
  var onrowsinserted: js.Any = js.native
  
  var onscroll: js.Any = js.native
  
  var onseeked: js.Any = js.native
  
  var onseeking: js.Any = js.native
  
  var onselect: js.Any = js.native
  
  var onselectionchange: js.Any = js.native
  
  var onselectstart: js.Any = js.native
  
  var onstalled: js.Any = js.native
  
  var onstop: js.Any = js.native
  
  var onstorage: js.Any = js.native
  
  var onstoragecommit: js.Any = js.native
  
  var onsubmit: js.Any = js.native
  
  var onsuspend: js.Any = js.native
  
  var ontimeupdate: js.Any = js.native
  
  var onvolumechange: js.Any = js.native
  
  var onwaiting: js.Any = js.native
  
  /** @param url [url='text/html'] */
  def open(): js.Any = js.native
  def open(
    url: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    features: js.UndefOr[scala.Nothing],
    replace: js.Any
  ): js.Any = js.native
  def open(url: js.UndefOr[scala.Nothing], name: js.UndefOr[scala.Nothing], features: js.Any): js.Any = js.native
  def open(url: js.UndefOr[scala.Nothing], name: js.UndefOr[scala.Nothing], features: js.Any, replace: js.Any): js.Any = js.native
  def open(url: js.UndefOr[scala.Nothing], name: js.Any): js.Any = js.native
  def open(url: js.UndefOr[scala.Nothing], name: js.Any, features: js.UndefOr[scala.Nothing], replace: js.Any): js.Any = js.native
  def open(url: js.UndefOr[scala.Nothing], name: js.Any, features: js.Any): js.Any = js.native
  def open(url: js.UndefOr[scala.Nothing], name: js.Any, features: js.Any, replace: js.Any): js.Any = js.native
  def open(url: String): js.Any = js.native
  def open(url: String, name: js.UndefOr[scala.Nothing], features: js.UndefOr[scala.Nothing], replace: js.Any): js.Any = js.native
  def open(url: String, name: js.UndefOr[scala.Nothing], features: js.Any): js.Any = js.native
  def open(url: String, name: js.UndefOr[scala.Nothing], features: js.Any, replace: js.Any): js.Any = js.native
  def open(url: String, name: js.Any): js.Any = js.native
  def open(url: String, name: js.Any, features: js.UndefOr[scala.Nothing], replace: js.Any): js.Any = js.native
  def open(url: String, name: js.Any, features: js.Any): js.Any = js.native
  def open(url: String, name: js.Any, features: js.Any, replace: js.Any): js.Any = js.native
  
  val ownerDocument: js.Any = js.native
  
  val parentNode: IHTMLDOMNode = js.native
  
  def parentWindow(pvarIndex: js.Any): js.Any = js.native
  @JSName("parentWindow")
  val parentWindow_Original: IHTMLWindow2 = js.native
  
  def plugins(): js.Any = js.native
  def plugins(name: js.UndefOr[scala.Nothing], index: js.Any): js.Any = js.native
  def plugins(name: js.Any): js.Any = js.native
  def plugins(name: js.Any, index: js.Any): js.Any = js.native
  @JSName("plugins")
  val plugins_Original: IHTMLElementCollection = js.native
  
  var prefix: js.Any = js.native
  
  val previousSibling: IHTMLDOMNode = js.native
  
  val protocol: String = js.native
  
  def queryCommandEnabled(cmdID: String): Boolean = js.native
  
  def queryCommandIndeterm(cmdID: String): Boolean = js.native
  
  def queryCommandState(cmdID: String): Boolean = js.native
  
  def queryCommandSupported(cmdID: String): Boolean = js.native
  
  def queryCommandText(cmdID: String): String = js.native
  
  def queryCommandValue(cmdID: String): js.Any = js.native
  
  def querySelector(v: String): IHTMLElement = js.native
  
  def querySelectorAll(v: String): IHTMLDOMChildrenCollection = js.native
  
  val readyState: String = js.native
  
  /** @param fForce [fForce=false] */
  def recalc(): Unit = js.native
  def recalc(fForce: Boolean): Unit = js.native
  
  val referrer: String = js.native
  
  def releaseCapture(): Unit = js.native
  
  def removeChild(oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def removeEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
  
  /** @param fDeep [fDeep=false] */
  def removeNode(): IHTMLDOMNode = js.native
  def removeNode(fDeep: Boolean): IHTMLDOMNode = js.native
  
  def replaceChild(newChild: IHTMLDOMNode, oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def replaceNode(replacement: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  val rootElement: ISVGSVGElement = js.native
  
  def scripts(): js.Any = js.native
  def scripts(name: js.UndefOr[scala.Nothing], index: js.Any): js.Any = js.native
  def scripts(name: js.Any): js.Any = js.native
  def scripts(name: js.Any, index: js.Any): js.Any = js.native
  @JSName("scripts")
  val scripts_Original: IHTMLElementCollection = js.native
  
  val security: String = js.native
  
  val selection: IHTMLSelectionObject = js.native
  
  def styleSheets(pvarIndex: js.Any): js.Any = js.native
  @JSName("styleSheets")
  val styleSheets_Original: IHTMLStyleSheetsCollection = js.native
  
  def swapNode(otherNode: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  var textContent: js.Any = js.native
  
  var title: String = js.native
  
  val uniqueID: String = js.native
  
  def updateSettings(): Unit = js.native
  
  var url: String = js.native
  
  var vlinkColor: js.Any = js.native
  
  def write(psarray: js.Any*): Unit = js.native
  
  def writeln(psarray: js.Any*): Unit = js.native
  
  val xmlEncoding: String = js.native
  
  var xmlStandalone: Boolean = js.native
  
  var xmlVersion: String = js.native
}
