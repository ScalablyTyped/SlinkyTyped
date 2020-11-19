package typingsSlinky.activexLibreoffice.com_.sun.star.xml.dom

import typingsSlinky.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XCharacterData extends XNode {
  
  /**
    * Return the character data of the node that implements this interface. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised when the node
    * is readonly. {@link DOMException} - DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a DOMString variable on the
    * implementation platform.
    */
  var Data: String = js.native
  
  /** The number of 16-bit units that are available through data and the substringData method below. */
  val Length: Double = js.native
  
  /**
    * Append the string to the end of the character data of the node. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised if this node is
    * readonly.
    */
  def appendData(arg: String): Unit = js.native
  
  /**
    * Remove a range of 16-bit units from the node. Throws: {@link DOMException} - INDEX_SIZE_ERR: Raised if the specified offset is negative or greater
    * than the number of 16-bit units in data, or if the specified count is negative. NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
    */
  def deleteData(offset: Double, count: Double): Unit = js.native
  
  /**
    * Return the character data of the node that implements this interface. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised when the node
    * is readonly. {@link DOMException} - DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a DOMString variable on the
    * implementation platform.
    */
  def getData(): String = js.native
  
  /** The number of 16-bit units that are available through data and the substringData method below. */
  def getLength(): Double = js.native
  
  /**
    * Insert a string at the specified 16-bit unit offset. Throws: {@link DOMException} - INDEX_SIZE_ERR: Raised if the specified offset is negative or
    * greater than the number of 16-bit units in data. NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
    */
  def insertData(offset: Double, arg: String): Unit = js.native
  
  /**
    * Replace the characters starting at the specified 16-bit unit offset with the specified string. Throws; {@link DOMException} - INDEX_SIZE_ERR: Raised
    * if the specified offset is negative or greater than the number of 16-bit units in data, or if the specified count is negative.
    * NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
    */
  def replaceData(offset: Double, count: Double, arg: String): Unit = js.native
  
  /**
    * Set the character data of the node that implements this interface. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised when the node is
    * readonly. {@link DOMException} - DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a DOMString variable on the
    * implementation platform.
    */
  def setData(data: String): Unit = js.native
  
  /**
    * Extracts a range of data from the node. Throws: {@link DOMException} - INDEX_SIZE_ERR: Raised if the specified offset is negative or greater than the
    * number of 16-bit units in data, or if the specified count is negative. DOMSTRING_SIZE_ERR: Raised if the specified range of text does not fit into a
    * DOMString.
    */
  def subStringData(offset: Double, count: Double): String = js.native
}
object XCharacterData {
  
  @scala.inline
  def apply(
    Attributes: XNamedNodeMap,
    ChildNodes: XNodeList,
    Data: String,
    FirstChild: XNode,
    LastChild: XNode,
    Length: Double,
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
    appendData: String => Unit,
    cloneNode: Boolean => XNode,
    deleteData: (Double, Double) => Unit,
    getAttributes: () => XNamedNodeMap,
    getChildNodes: () => XNodeList,
    getData: () => String,
    getFirstChild: () => XNode,
    getLastChild: () => XNode,
    getLength: () => Double,
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
    insertBefore: (XNode, XNode) => XNode,
    insertData: (Double, String) => Unit,
    isSupported: (String, String) => Boolean,
    normalize: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChild: XNode => XNode,
    replaceChild: (XNode, XNode) => XNode,
    replaceData: (Double, Double, String) => Unit,
    setData: String => Unit,
    setNodeValue: String => Unit,
    setPrefix: String => Unit,
    subStringData: (Double, Double) => String
  ): XCharacterData = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], ChildNodes = ChildNodes.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], FirstChild = FirstChild.asInstanceOf[js.Any], LastChild = LastChild.asInstanceOf[js.Any], Length = Length.asInstanceOf[js.Any], LocalName = LocalName.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], NextSibling = NextSibling.asInstanceOf[js.Any], NodeName = NodeName.asInstanceOf[js.Any], NodeType = NodeType.asInstanceOf[js.Any], NodeValue = NodeValue.asInstanceOf[js.Any], OwnerDocument = OwnerDocument.asInstanceOf[js.Any], ParentNode = ParentNode.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], PreviousSibling = PreviousSibling.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), appendChild = js.Any.fromFunction1(appendChild), appendData = js.Any.fromFunction1(appendData), cloneNode = js.Any.fromFunction1(cloneNode), deleteData = js.Any.fromFunction2(deleteData), getAttributes = js.Any.fromFunction0(getAttributes), getChildNodes = js.Any.fromFunction0(getChildNodes), getData = js.Any.fromFunction0(getData), getFirstChild = js.Any.fromFunction0(getFirstChild), getLastChild = js.Any.fromFunction0(getLastChild), getLength = js.Any.fromFunction0(getLength), getLocalName = js.Any.fromFunction0(getLocalName), getNamespaceURI = js.Any.fromFunction0(getNamespaceURI), getNextSibling = js.Any.fromFunction0(getNextSibling), getNodeName = js.Any.fromFunction0(getNodeName), getNodeType = js.Any.fromFunction0(getNodeType), getNodeValue = js.Any.fromFunction0(getNodeValue), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getPrefix = js.Any.fromFunction0(getPrefix), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), hasAttributes = js.Any.fromFunction0(hasAttributes), hasChildNodes = js.Any.fromFunction0(hasChildNodes), insertBefore = js.Any.fromFunction2(insertBefore), insertData = js.Any.fromFunction2(insertData), isSupported = js.Any.fromFunction2(isSupported), normalize = js.Any.fromFunction0(normalize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), replaceData = js.Any.fromFunction3(replaceData), setData = js.Any.fromFunction1(setData), setNodeValue = js.Any.fromFunction1(setNodeValue), setPrefix = js.Any.fromFunction1(setPrefix), subStringData = js.Any.fromFunction2(subStringData))
    __obj.asInstanceOf[XCharacterData]
  }
  
  @scala.inline
  implicit class XCharacterDataOps[Self <: XCharacterData] (val x: Self) extends AnyVal {
    
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
    def setData(value: String): Self = this.set("Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("Length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendData(value: String => Unit): Self = this.set("appendData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteData(value: (Double, Double) => Unit): Self = this.set("deleteData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetData(value: () => String): Self = this.set("getData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLength(value: () => Double): Self = this.set("getLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsertData(value: (Double, String) => Unit): Self = this.set("insertData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplaceData(value: (Double, Double, String) => Unit): Self = this.set("replaceData", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetData(value: String => Unit): Self = this.set("setData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubStringData(value: (Double, Double) => String): Self = this.set("subStringData", js.Any.fromFunction2(value))
  }
}
