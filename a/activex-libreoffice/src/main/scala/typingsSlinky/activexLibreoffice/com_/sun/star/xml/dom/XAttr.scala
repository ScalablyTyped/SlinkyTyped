package typingsSlinky.activexLibreoffice.com_.sun.star.xml.dom

import typingsSlinky.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XAttr extends XNode {
  
  /** Returns the name of this attribute. */
  val Name: String = js.native
  
  /** The Element node this attribute is attached to or null if this attribute is not in use. */
  val OwnerElement: XElement = js.native
  
  /** If this attribute was explicitly given a value in the original document, this is true; otherwise, it is false. */
  val Specified: Boolean = js.native
  
  /** On retrieval, the value of the attribute is returned as a string. */
  var Value: String = js.native
  
  /** Returns the name of this attribute. */
  def getName(): String = js.native
  
  /** The Element node this attribute is attached to or null if this attribute is not in use. */
  def getOwnerElement(): XElement = js.native
  
  /** If this attribute was explicitly given a value in the original document, this is true; otherwise, it is false. */
  def getSpecified(): Boolean = js.native
  
  /** On retrieval, the value of the attribute is returned as a string. */
  def getValue(): String = js.native
  
  /** Sets the value of the attribute from a string. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly. */
  def setValue(value: String): Unit = js.native
}
object XAttr {
  
  @scala.inline
  def apply(
    Attributes: XNamedNodeMap,
    ChildNodes: XNodeList,
    FirstChild: XNode,
    LastChild: XNode,
    LocalName: String,
    Name: String,
    NamespaceURI: String,
    NextSibling: XNode,
    NodeName: String,
    NodeType: NodeType,
    NodeValue: String,
    OwnerDocument: XDocument,
    OwnerElement: XElement,
    ParentNode: XNode,
    Prefix: String,
    PreviousSibling: XNode,
    Specified: Boolean,
    Value: String,
    acquire: () => Unit,
    appendChild: XNode => XNode,
    cloneNode: Boolean => XNode,
    getAttributes: () => XNamedNodeMap,
    getChildNodes: () => XNodeList,
    getFirstChild: () => XNode,
    getLastChild: () => XNode,
    getLocalName: () => String,
    getName: () => String,
    getNamespaceURI: () => String,
    getNextSibling: () => XNode,
    getNodeName: () => String,
    getNodeType: () => NodeType,
    getNodeValue: () => String,
    getOwnerDocument: () => XDocument,
    getOwnerElement: () => XElement,
    getParentNode: () => XNode,
    getPrefix: () => String,
    getPreviousSibling: () => XNode,
    getSpecified: () => Boolean,
    getValue: () => String,
    hasAttributes: () => Boolean,
    hasChildNodes: () => Boolean,
    insertBefore: (XNode, XNode) => XNode,
    isSupported: (String, String) => Boolean,
    normalize: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChild: XNode => XNode,
    replaceChild: (XNode, XNode) => XNode,
    setNodeValue: String => Unit,
    setPrefix: String => Unit,
    setValue: String => Unit
  ): XAttr = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], ChildNodes = ChildNodes.asInstanceOf[js.Any], FirstChild = FirstChild.asInstanceOf[js.Any], LastChild = LastChild.asInstanceOf[js.Any], LocalName = LocalName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], NextSibling = NextSibling.asInstanceOf[js.Any], NodeName = NodeName.asInstanceOf[js.Any], NodeType = NodeType.asInstanceOf[js.Any], NodeValue = NodeValue.asInstanceOf[js.Any], OwnerDocument = OwnerDocument.asInstanceOf[js.Any], OwnerElement = OwnerElement.asInstanceOf[js.Any], ParentNode = ParentNode.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], PreviousSibling = PreviousSibling.asInstanceOf[js.Any], Specified = Specified.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), appendChild = js.Any.fromFunction1(appendChild), cloneNode = js.Any.fromFunction1(cloneNode), getAttributes = js.Any.fromFunction0(getAttributes), getChildNodes = js.Any.fromFunction0(getChildNodes), getFirstChild = js.Any.fromFunction0(getFirstChild), getLastChild = js.Any.fromFunction0(getLastChild), getLocalName = js.Any.fromFunction0(getLocalName), getName = js.Any.fromFunction0(getName), getNamespaceURI = js.Any.fromFunction0(getNamespaceURI), getNextSibling = js.Any.fromFunction0(getNextSibling), getNodeName = js.Any.fromFunction0(getNodeName), getNodeType = js.Any.fromFunction0(getNodeType), getNodeValue = js.Any.fromFunction0(getNodeValue), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getOwnerElement = js.Any.fromFunction0(getOwnerElement), getParentNode = js.Any.fromFunction0(getParentNode), getPrefix = js.Any.fromFunction0(getPrefix), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getSpecified = js.Any.fromFunction0(getSpecified), getValue = js.Any.fromFunction0(getValue), hasAttributes = js.Any.fromFunction0(hasAttributes), hasChildNodes = js.Any.fromFunction0(hasChildNodes), insertBefore = js.Any.fromFunction2(insertBefore), isSupported = js.Any.fromFunction2(isSupported), normalize = js.Any.fromFunction0(normalize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), setNodeValue = js.Any.fromFunction1(setNodeValue), setPrefix = js.Any.fromFunction1(setPrefix), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[XAttr]
  }
  
  @scala.inline
  implicit class XAttrOps[Self <: XAttr] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerElement(value: XElement): Self = this.set("OwnerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecified(value: Boolean): Self = this.set("Specified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOwnerElement(value: () => XElement): Self = this.set("getOwnerElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSpecified(value: () => Boolean): Self = this.set("getSpecified", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: () => String): Self = this.set("getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetValue(value: String => Unit): Self = this.set("setValue", js.Any.fromFunction1(value))
  }
}
