package typingsSlinky.activexLibreoffice.com_.sun.star.xml.dom

import typingsSlinky.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XElement extends XNode {
  
  /** The name of the element. */
  val TagName: String = js.native
  
  /** Retrieves an attribute value by name. */
  def getAttribute(name: String): String = js.native
  
  /** Retrieves an attribute value by local name and namespace URI. */
  def getAttributeNS(namespaceURI: String, localName: String): String = js.native
  
  /** Retrieves an attribute node by name. */
  def getAttributeNode(name: String): XAttr = js.native
  
  /** Retrieves an Attr node by local name and namespace URI. */
  def getAttributeNodeNS(namespaceURI: String, localName: String): XAttr = js.native
  
  /**
    * Returns a NodeList of all descendant Elements with a given tag name, in the order in which they are encountered in a preorder traversal of this
    * Element tree.
    */
  def getElementsByTagName(name: String): XNodeList = js.native
  
  /**
    * Returns a NodeList of all the descendant Elements with a given local name and namespace URI in the order in which they are encountered in a preorder
    * traversal of this Element tree.
    */
  def getElementsByTagNameNS(namespaceURI: String, localName: String): XNodeList = js.native
  
  /** The name of the element. */
  def getTagName(): String = js.native
  
  /** Returns true when an attribute with a given name is specified on this element or has a default value, false otherwise. */
  def hasAttribute(name: String): Boolean = js.native
  
  /** Returns true when an attribute with a given local name and namespace URI is specified on this element or has a default value, false otherwise. */
  def hasAttributeNS(namespaceURI: String, localName: String): Boolean = js.native
  
  /** Removes an attribute by name. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. */
  def removeAttribute(name: String): Unit = js.native
  
  /** Removes an attribute by local name and namespace URI. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. */
  def removeAttributeNS(namespaceURI: String, localName: String): Unit = js.native
  
  /**
    * Removes the specified attribute node. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. NOT_FOUND_ERR:
    * Raised if oldAttr is not an attribute of the element.
    */
  def removeAttributeNode(oldAttr: XAttr): XAttr = js.native
  
  /**
    * Adds a new attribute. Throws: {@link DOMException} - INVALID_CHARACTER_ERR: Raised if the specified name contains an illegal character.
    * NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
    */
  def setAttribute(name: String, value: String): Unit = js.native
  
  /**
    * Adds a new attribute. Throws: {@link DOMException} - INVALID_CHARACTER_ERR: Raised if the specified qualified name contains an illegal character, per
    * the XML 1.0 specification . NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. NAMESPACE_ERR: Raised if the qualifiedName is malformed per
    * the Namespaces in XML specification, if the qualifiedName has a prefix and the namespaceURI is null, if the qualifiedName has a prefix that is "xml"
    * and the namespaceURI is different from " http://www.w3.org/XML/1998/namespace", or if the qualifiedName, or its prefix, is "xmlns" and the
    * namespaceURI is different from " http://www.w3.org/2000/xmlns/". NOT_SUPPORTED_ERR: Always thrown if the current document does not support the "XML"
    * feature, since namespaces were defined by XML.
    */
  def setAttributeNS(namespaceURI: String, qualifiedName: String, value: String): Unit = js.native
  
  /**
    * Adds a new attribute node. Throws: {@link DOMException} - WRONG_DOCUMENT_ERR: Raised if newAttr was created from a different document than the one
    * that created the element. NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. INUSE_ATTRIBUTE_ERR: Raised if newAttr is already an attribute
    * of another Element object. The DOM user must explicitly clone Attr nodes to re-use them in other elements.
    */
  def setAttributeNode(newAttr: XAttr): XAttr = js.native
  
  /**
    * Adds a new attribute. Throws: {@link DOMException} - WRONG_DOCUMENT_ERR: Raised if newAttr was created from a different document than the one that
    * created the element. NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. INUSE_ATTRIBUTE_ERR: Raised if newAttr is already an attribute of
    * another Element object. The DOM user must explicitly clone Attr nodes to re-use them in other elements. NOT_SUPPORTED_ERR: Always thrown if the
    * current document does not support the "XML" feature, since namespaces were defined by XML.
    */
  def setAttributeNodeNS(newAttr: XAttr): XAttr = js.native
}
object XElement {
  
  @scala.inline
  def apply(
    Attributes: XNamedNodeMap,
    ChildNodes: XNodeList,
    FirstChild: XNode,
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
    TagName: String,
    acquire: () => Unit,
    appendChild: XNode => XNode,
    cloneNode: Boolean => XNode,
    getAttribute: String => String,
    getAttributeNS: (String, String) => String,
    getAttributeNode: String => XAttr,
    getAttributeNodeNS: (String, String) => XAttr,
    getAttributes: () => XNamedNodeMap,
    getChildNodes: () => XNodeList,
    getElementsByTagName: String => XNodeList,
    getElementsByTagNameNS: (String, String) => XNodeList,
    getFirstChild: () => XNode,
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
    getTagName: () => String,
    hasAttribute: String => Boolean,
    hasAttributeNS: (String, String) => Boolean,
    hasAttributes: () => Boolean,
    hasChildNodes: () => Boolean,
    insertBefore: (XNode, XNode) => XNode,
    isSupported: (String, String) => Boolean,
    normalize: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeAttribute: String => Unit,
    removeAttributeNS: (String, String) => Unit,
    removeAttributeNode: XAttr => XAttr,
    removeChild: XNode => XNode,
    replaceChild: (XNode, XNode) => XNode,
    setAttribute: (String, String) => Unit,
    setAttributeNS: (String, String, String) => Unit,
    setAttributeNode: XAttr => XAttr,
    setAttributeNodeNS: XAttr => XAttr,
    setNodeValue: String => Unit,
    setPrefix: String => Unit
  ): XElement = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], ChildNodes = ChildNodes.asInstanceOf[js.Any], FirstChild = FirstChild.asInstanceOf[js.Any], LastChild = LastChild.asInstanceOf[js.Any], LocalName = LocalName.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], NextSibling = NextSibling.asInstanceOf[js.Any], NodeName = NodeName.asInstanceOf[js.Any], NodeType = NodeType.asInstanceOf[js.Any], NodeValue = NodeValue.asInstanceOf[js.Any], OwnerDocument = OwnerDocument.asInstanceOf[js.Any], ParentNode = ParentNode.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], PreviousSibling = PreviousSibling.asInstanceOf[js.Any], TagName = TagName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), appendChild = js.Any.fromFunction1(appendChild), cloneNode = js.Any.fromFunction1(cloneNode), getAttribute = js.Any.fromFunction1(getAttribute), getAttributeNS = js.Any.fromFunction2(getAttributeNS), getAttributeNode = js.Any.fromFunction1(getAttributeNode), getAttributeNodeNS = js.Any.fromFunction2(getAttributeNodeNS), getAttributes = js.Any.fromFunction0(getAttributes), getChildNodes = js.Any.fromFunction0(getChildNodes), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), getElementsByTagNameNS = js.Any.fromFunction2(getElementsByTagNameNS), getFirstChild = js.Any.fromFunction0(getFirstChild), getLastChild = js.Any.fromFunction0(getLastChild), getLocalName = js.Any.fromFunction0(getLocalName), getNamespaceURI = js.Any.fromFunction0(getNamespaceURI), getNextSibling = js.Any.fromFunction0(getNextSibling), getNodeName = js.Any.fromFunction0(getNodeName), getNodeType = js.Any.fromFunction0(getNodeType), getNodeValue = js.Any.fromFunction0(getNodeValue), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getPrefix = js.Any.fromFunction0(getPrefix), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getTagName = js.Any.fromFunction0(getTagName), hasAttribute = js.Any.fromFunction1(hasAttribute), hasAttributeNS = js.Any.fromFunction2(hasAttributeNS), hasAttributes = js.Any.fromFunction0(hasAttributes), hasChildNodes = js.Any.fromFunction0(hasChildNodes), insertBefore = js.Any.fromFunction2(insertBefore), isSupported = js.Any.fromFunction2(isSupported), normalize = js.Any.fromFunction0(normalize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAttribute = js.Any.fromFunction1(removeAttribute), removeAttributeNS = js.Any.fromFunction2(removeAttributeNS), removeAttributeNode = js.Any.fromFunction1(removeAttributeNode), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), setAttribute = js.Any.fromFunction2(setAttribute), setAttributeNS = js.Any.fromFunction3(setAttributeNS), setAttributeNode = js.Any.fromFunction1(setAttributeNode), setAttributeNodeNS = js.Any.fromFunction1(setAttributeNodeNS), setNodeValue = js.Any.fromFunction1(setNodeValue), setPrefix = js.Any.fromFunction1(setPrefix))
    __obj.asInstanceOf[XElement]
  }
  
  @scala.inline
  implicit class XElementOps[Self <: XElement] (val x: Self) extends AnyVal {
    
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
    def setTagName(value: String): Self = this.set("TagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAttribute(value: String => String): Self = this.set("getAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAttributeNS(value: (String, String) => String): Self = this.set("getAttributeNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetAttributeNode(value: String => XAttr): Self = this.set("getAttributeNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAttributeNodeNS(value: (String, String) => XAttr): Self = this.set("getAttributeNodeNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetElementsByTagName(value: String => XNodeList): Self = this.set("getElementsByTagName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementsByTagNameNS(value: (String, String) => XNodeList): Self = this.set("getElementsByTagNameNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetTagName(value: () => String): Self = this.set("getTagName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasAttribute(value: String => Boolean): Self = this.set("hasAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasAttributeNS(value: (String, String) => Boolean): Self = this.set("hasAttributeNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveAttribute(value: String => Unit): Self = this.set("removeAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAttributeNS(value: (String, String) => Unit): Self = this.set("removeAttributeNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveAttributeNode(value: XAttr => XAttr): Self = this.set("removeAttributeNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAttribute(value: (String, String) => Unit): Self = this.set("setAttribute", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetAttributeNS(value: (String, String, String) => Unit): Self = this.set("setAttributeNS", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetAttributeNode(value: XAttr => XAttr): Self = this.set("setAttributeNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAttributeNodeNS(value: XAttr => XAttr): Self = this.set("setAttributeNodeNS", js.Any.fromFunction1(value))
  }
}
