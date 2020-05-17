package typingsSlinky.activexLibreoffice.com_.sun.star.xml.dom

import typingsSlinky.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XDocument extends XNode {
  /** The Document Type Declaration (see DocumentType) associated with this document. */
  val Doctype: XDocumentType = js.native
  /** This is a convenience attribute that allows direct access to the child node that is the root element of the document. */
  val DocumentElement: XElement = js.native
  /** The DOMImplementation object that handles this document. */
  val Implementation: XDOMImplementation = js.native
  /** Creates an Attr of the given name. Throws: {@link DOMException} - INVALID_CHARACTER_ERR: Raised if the specified name contains an illegal character. */
  def createAttribute(name: String): XAttr = js.native
  /**
    * Creates an attribute of the given qualified name and namespace URI. Throws: {@link DOMException} - INVALID_CHARACTER_ERR: Raised if the specified
    * qualified name contains an illegal character, per the XML 1.0 specification . NAMESPACE_ERR: Raised if the qualifiedName is malformed per the
    * Namespaces in XML specification, if the qualifiedName has a prefix and the namespaceURI is null, if the qualifiedName has a prefix that is "xml" and
    * the namespaceURI is different from " http://www.w3.org/XML/1998/namespace", or if the qualifiedName, or its prefix, is "xmlns" and the namespaceURI is
    * different from " http://www.w3.org/2000/xmlns/". NOT_SUPPORTED_ERR: Always thrown if the current document does not support the "XML" feature, since
    * namespaces were defined by XML.
    */
  def createAttributeNS(namespaceURI: String, qualifiedName: String): XAttr = js.native
  /**
    * Creates a CDATASection node whose value is the specified string. Throws: {@link DOMException} - NOT_SUPPORTED_ERR: Raised if this document is an HTML
    * document.
    */
  def createCDATASection(data: String): XCDATASection = js.native
  /** Creates a Comment node given the specified string. */
  def createComment(data: String): XComment = js.native
  /** Creates an empty DocumentFragment object. */
  def createDocumentFragment(): XDocumentFragment = js.native
  /**
    * Creates an element of the type specified. Throws: {@link DOMException} - INVALID_CHARACTER_ERR: Raised if the specified name contains an illegal
    * character.
    */
  def createElement(tagName: String): XElement = js.native
  /**
    * Creates an element of the given qualified name and namespace URI. Throws: {@link DOMException} - INVALID_CHARACTER_ERR: Raised if the specified
    * qualified name contains an illegal character, per the XML 1.0 specification . NAMESPACE_ERR: Raised if the qualifiedName is malformed per the
    * Namespaces in XML specification, if the qualifiedName has a prefix and the namespaceURI is null, or if the qualifiedName has a prefix that is "xml"
    * and the namespaceURI is different from " http://www.w3.org/XML/1998/namespace" . NOT_SUPPORTED_ERR: Always thrown if the current document does not
    * support the "XML" feature, since namespaces were defined by XML.
    */
  def createElementNS(namespaceURI: String, qualifiedName: String): XElement = js.native
  /**
    * Throws: {@link DOMException} - NOT_SUPPORTED_ERR: Raised if the type of node being imported is not supported. Creates an EntityReference object.
    * Throws: {@link DOMException} - INVALID_CHARACTER_ERR: Raised if the specified name contains an illegal character. NOT_SUPPORTED_ERR: Raised if this
    * document is an HTML document.
    */
  def createEntityReference(name: String): XEntityReference = js.native
  /**
    * Creates a ProcessingInstruction node given the specified name and data strings. Throws: {@link DOMException} - INVALID_CHARACTER_ERR: Raised if the
    * specified target contains an illegal character. NOT_SUPPORTED_ERR: Raised if this document is an HTML document.
    */
  def createProcessingInstruction(target: String, data: String): XProcessingInstruction = js.native
  /** Creates a Text node given the specified string. */
  def createTextNode(data: String): XText = js.native
  /** The Document Type Declaration (see DocumentType) associated with this document. */
  def getDoctype(): XDocumentType = js.native
  /** This is a convenience attribute that allows direct access to the child node that is the root element of the document. */
  def getDocumentElement(): XElement = js.native
  /** Returns the Element whose ID is given by elementId. */
  def getElementById(elementId: String): XElement = js.native
  /** Returns a NodeList of all the Elements with a given tag name in the order in which they are encountered in a preorder traversal of the Document tree. */
  def getElementsByTagName(tagname: String): XNodeList = js.native
  /**
    * Returns a NodeList of all the Elements with a given local name and namespace URI in the order in which they are encountered in a preorder traversal of
    * the Document tree.
    */
  def getElementsByTagNameNS(namespaceURI: String, localName: String): XNodeList = js.native
  /** The DOMImplementation object that handles this document. */
  def getImplementation(): XDOMImplementation = js.native
  /**
    * Imports a node from another document to this document. Throws: {@link DOMException} - NOT_SUPPORTED_ERR: Raised if the type of node being imported is
    * not supported.
    */
  def importNode(importedNode: XNode, deep: Boolean): XNode = js.native
}

object XDocument {
  @scala.inline
  def apply(
    Attributes: XNamedNodeMap,
    ChildNodes: XNodeList,
    Doctype: XDocumentType,
    DocumentElement: XElement,
    FirstChild: XNode,
    Implementation: XDOMImplementation,
    LastChild: XNode,
    LocalName: String,
    NamespaceURI: String,
    NextSibling: XNode,
    NodeName: String,
    NodeType: NodeType,
    NodeValue: String,
    OwnerDocument: XDocument,
    ParentNode: XNode,
    Prefix: String,
    PreviousSibling: XNode,
    acquire: () => Unit,
    appendChild: XNode => XNode,
    cloneNode: Boolean => XNode,
    createAttribute: String => XAttr,
    createAttributeNS: (String, String) => XAttr,
    createCDATASection: String => XCDATASection,
    createComment: String => XComment,
    createDocumentFragment: () => XDocumentFragment,
    createElement: String => XElement,
    createElementNS: (String, String) => XElement,
    createEntityReference: String => XEntityReference,
    createProcessingInstruction: (String, String) => XProcessingInstruction,
    createTextNode: String => XText,
    getAttributes: () => XNamedNodeMap,
    getChildNodes: () => XNodeList,
    getDoctype: () => XDocumentType,
    getDocumentElement: () => XElement,
    getElementById: String => XElement,
    getElementsByTagName: String => XNodeList,
    getElementsByTagNameNS: (String, String) => XNodeList,
    getFirstChild: () => XNode,
    getImplementation: () => XDOMImplementation,
    getLastChild: () => XNode,
    getLocalName: () => String,
    getNamespaceURI: () => String,
    getNextSibling: () => XNode,
    getNodeName: () => String,
    getNodeType: () => NodeType,
    getNodeValue: () => String,
    getOwnerDocument: () => XDocument,
    getParentNode: () => XNode,
    getPrefix: () => String,
    getPreviousSibling: () => XNode,
    hasAttributes: () => Boolean,
    hasChildNodes: () => Boolean,
    importNode: (XNode, Boolean) => XNode,
    insertBefore: (XNode, XNode) => XNode,
    isSupported: (String, String) => Boolean,
    normalize: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChild: XNode => XNode,
    replaceChild: (XNode, XNode) => XNode,
    setNodeValue: String => Unit,
    setPrefix: String => Unit
  ): XDocument = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], ChildNodes = ChildNodes.asInstanceOf[js.Any], Doctype = Doctype.asInstanceOf[js.Any], DocumentElement = DocumentElement.asInstanceOf[js.Any], FirstChild = FirstChild.asInstanceOf[js.Any], Implementation = Implementation.asInstanceOf[js.Any], LastChild = LastChild.asInstanceOf[js.Any], LocalName = LocalName.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], NextSibling = NextSibling.asInstanceOf[js.Any], NodeName = NodeName.asInstanceOf[js.Any], NodeType = NodeType.asInstanceOf[js.Any], NodeValue = NodeValue.asInstanceOf[js.Any], OwnerDocument = OwnerDocument.asInstanceOf[js.Any], ParentNode = ParentNode.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], PreviousSibling = PreviousSibling.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), appendChild = js.Any.fromFunction1(appendChild), cloneNode = js.Any.fromFunction1(cloneNode), createAttribute = js.Any.fromFunction1(createAttribute), createAttributeNS = js.Any.fromFunction2(createAttributeNS), createCDATASection = js.Any.fromFunction1(createCDATASection), createComment = js.Any.fromFunction1(createComment), createDocumentFragment = js.Any.fromFunction0(createDocumentFragment), createElement = js.Any.fromFunction1(createElement), createElementNS = js.Any.fromFunction2(createElementNS), createEntityReference = js.Any.fromFunction1(createEntityReference), createProcessingInstruction = js.Any.fromFunction2(createProcessingInstruction), createTextNode = js.Any.fromFunction1(createTextNode), getAttributes = js.Any.fromFunction0(getAttributes), getChildNodes = js.Any.fromFunction0(getChildNodes), getDoctype = js.Any.fromFunction0(getDoctype), getDocumentElement = js.Any.fromFunction0(getDocumentElement), getElementById = js.Any.fromFunction1(getElementById), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), getElementsByTagNameNS = js.Any.fromFunction2(getElementsByTagNameNS), getFirstChild = js.Any.fromFunction0(getFirstChild), getImplementation = js.Any.fromFunction0(getImplementation), getLastChild = js.Any.fromFunction0(getLastChild), getLocalName = js.Any.fromFunction0(getLocalName), getNamespaceURI = js.Any.fromFunction0(getNamespaceURI), getNextSibling = js.Any.fromFunction0(getNextSibling), getNodeName = js.Any.fromFunction0(getNodeName), getNodeType = js.Any.fromFunction0(getNodeType), getNodeValue = js.Any.fromFunction0(getNodeValue), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getPrefix = js.Any.fromFunction0(getPrefix), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), hasAttributes = js.Any.fromFunction0(hasAttributes), hasChildNodes = js.Any.fromFunction0(hasChildNodes), importNode = js.Any.fromFunction2(importNode), insertBefore = js.Any.fromFunction2(insertBefore), isSupported = js.Any.fromFunction2(isSupported), normalize = js.Any.fromFunction0(normalize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), setNodeValue = js.Any.fromFunction1(setNodeValue), setPrefix = js.Any.fromFunction1(setPrefix))
    __obj.asInstanceOf[XDocument]
  }
  @scala.inline
  implicit class XDocumentOps[Self <: XDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoctype(value: XDocumentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Doctype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentElement(value: XElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImplementation(value: XDOMImplementation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Implementation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateAttribute(value: String => XAttr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateAttributeNS(value: (String, String) => XAttr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createAttributeNS")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateCDATASection(value: String => XCDATASection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCDATASection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateComment(value: String => XComment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createComment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateDocumentFragment(value: () => XDocumentFragment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDocumentFragment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateElement(value: String => XElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateElementNS(value: (String, String) => XElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createElementNS")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateEntityReference(value: String => XEntityReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createEntityReference")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateProcessingInstruction(value: (String, String) => XProcessingInstruction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createProcessingInstruction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateTextNode(value: String => XText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTextNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDoctype(value: () => XDocumentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDoctype")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDocumentElement(value: () => XElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDocumentElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetElementById(value: String => XElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementById")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetElementsByTagName(value: String => XNodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementsByTagName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetElementsByTagNameNS(value: (String, String) => XNodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementsByTagNameNS")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetImplementation(value: () => XDOMImplementation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImplementation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withImportNode(value: (XNode, Boolean) => XNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importNode")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

