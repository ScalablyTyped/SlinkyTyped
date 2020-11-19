package typingsSlinky.activexLibreoffice.com_.sun.star.xml.dom

import typingsSlinky.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDoctype(value: XDocumentType): Self = this.set("Doctype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentElement(value: XElement): Self = this.set("DocumentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplementation(value: XDOMImplementation): Self = this.set("Implementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateAttribute(value: String => XAttr): Self = this.set("createAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateAttributeNS(value: (String, String) => XAttr): Self = this.set("createAttributeNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateCDATASection(value: String => XCDATASection): Self = this.set("createCDATASection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateComment(value: String => XComment): Self = this.set("createComment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateDocumentFragment(value: () => XDocumentFragment): Self = this.set("createDocumentFragment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateElement(value: String => XElement): Self = this.set("createElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateElementNS(value: (String, String) => XElement): Self = this.set("createElementNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateEntityReference(value: String => XEntityReference): Self = this.set("createEntityReference", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateProcessingInstruction(value: (String, String) => XProcessingInstruction): Self = this.set("createProcessingInstruction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateTextNode(value: String => XText): Self = this.set("createTextNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDoctype(value: () => XDocumentType): Self = this.set("getDoctype", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDocumentElement(value: () => XElement): Self = this.set("getDocumentElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElementById(value: String => XElement): Self = this.set("getElementById", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementsByTagName(value: String => XNodeList): Self = this.set("getElementsByTagName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementsByTagNameNS(value: (String, String) => XNodeList): Self = this.set("getElementsByTagNameNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetImplementation(value: () => XDOMImplementation): Self = this.set("getImplementation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImportNode(value: (XNode, Boolean) => XNode): Self = this.set("importNode", js.Any.fromFunction2(value))
  }
}
