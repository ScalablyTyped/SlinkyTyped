package typingsSlinky.activexLibreoffice.com_.sun.star.xml.dom

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The primary dom datatype
  *
  * The Node interface is the primary datatype for the entire Document Object Model. It represents a single node in the document tree. While all objects
  * implementing the Node interface expose methods for dealing with children, not all objects implementing the Node interface may have children. For
  * example, Text nodes may not have children, and adding children to such nodes results in a {@link DOMException} being raised.
  *
  * The attributes nodeName, nodeValue and attributes are included as a mechanism to get at node information without casting down to the specific derived
  * interface. In cases where there is no obvious mapping of these attributes for a specific nodeType (e.g., nodeValue for an Element or attributes for a
  * Comment ), this returns null. Note that the specialized interfaces may contain additional and more convenient mechanisms to get and set the relevant
  * information.
  *
  * The values of nodeName, nodeValue, and attributes vary according to the node type as follows: {{table here, see documentation}}
  * @see Document Object Model (DOM) Level 2 Core Specification
  * @since OOo 2.0
  */
@js.native
trait XNode extends XInterface {
  /** A NamedNodeMap containing the attributes of this node (if it is an Element) or null otherwise. */
  val Attributes: XNamedNodeMap = js.native
  /** A NodeList that contains all children of this node. */
  val ChildNodes: XNodeList = js.native
  /** The first child of this node. */
  val FirstChild: XNode = js.native
  /** The last child of this node. */
  val LastChild: XNode = js.native
  /** Returns the local part of the qualified name of this node. */
  val LocalName: String = js.native
  /** The namespace URI of this node, or null if it is unspecified. */
  val NamespaceURI: String = js.native
  /** The node immediately following this node. */
  val NextSibling: XNode = js.native
  /** The name of this node, depending on its type; see the table above. */
  val NodeName: String = js.native
  /** A code representing the type of the underlying object, as defined above. */
  val NodeType: typingsSlinky.activexLibreoffice.com_.sun.star.xml.dom.NodeType = js.native
  /**
    * The value of this node, depending on its type; see the table above.
    * @throws com::sun::star::xml::dom::DOMException  DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a DOMString variable on the i
    */
  var NodeValue: String = js.native
  /** The Document object associated with this node. */
  val OwnerDocument: XDocument = js.native
  /** The parent of this node. */
  val ParentNode: XNode = js.native
  /** The namespace prefix of this node, or null if it is unspecified. */
  var Prefix: String = js.native
  /** The node immediately preceding this node. */
  val PreviousSibling: XNode = js.native
  /**
    * Adds the node newChild to the end of the list of children of this node.
    * @param newChild the new child node
    * @throws com::sun::star::xml::dom::DOMException  HIERARCHY_REQUEST_ERR: Raised if this node is of a type that does not allow children of the type of the n
    */
  def appendChild(newChild: XNode): XNode = js.native
  /**
    * Returns a duplicate of this node, i.e., serves as a generic copy constructor for nodes.
    * @param deep `TRUE` : clone node together with any children ; `FALSE` : clone without children
    * @returns the cloned node
    */
  def cloneNode(deep: Boolean): XNode = js.native
  /** A NamedNodeMap containing the attributes of this node (if it is an Element) or null otherwise. */
  def getAttributes(): XNamedNodeMap = js.native
  /** A NodeList that contains all children of this node. */
  def getChildNodes(): XNodeList = js.native
  /** The first child of this node. */
  def getFirstChild(): XNode = js.native
  /** The last child of this node. */
  def getLastChild(): XNode = js.native
  /** Returns the local part of the qualified name of this node. */
  def getLocalName(): String = js.native
  /** The namespace URI of this node, or null if it is unspecified. */
  def getNamespaceURI(): String = js.native
  /** The node immediately following this node. */
  def getNextSibling(): XNode = js.native
  /** The name of this node, depending on its type; see the table above. */
  def getNodeName(): String = js.native
  /** A code representing the type of the underlying object, as defined above. */
  def getNodeType(): typingsSlinky.activexLibreoffice.com_.sun.star.xml.dom.NodeType = js.native
  /**
    * The value of this node, depending on its type; see the table above.
    * @throws com::sun::star::xml::dom::DOMException  DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a DOMString variable on the i
    */
  def getNodeValue(): String = js.native
  /** The Document object associated with this node. */
  def getOwnerDocument(): XDocument = js.native
  /** The parent of this node. */
  def getParentNode(): XNode = js.native
  /** The namespace prefix of this node, or null if it is unspecified. */
  def getPrefix(): String = js.native
  /** The node immediately preceding this node. */
  def getPreviousSibling(): XNode = js.native
  /** Returns whether this node (if it is an element) has any attributes. */
  def hasAttributes(): Boolean = js.native
  /** Returns whether this node has any children. */
  def hasChildNodes(): Boolean = js.native
  /**
    * Inserts the node newChild before the existing child node refChild.
    * @throws DOMException  HIERARCHY_REQUEST_ERR: Raised if this node is of a type that does not allow children of the type of the newChild node, or if the no
    */
  def insertBefore(newChild: XNode, refChild: XNode): XNode = js.native
  /** Tests whether the DOM implementation implements a specific feature and that feature is supported by this node. */
  def isSupported(feature: String, ver: String): Boolean = js.native
  /**
    * Puts all Text nodes in the full depth of the sub-tree underneath this Node, including attribute nodes, into a "normal" form where only structure
    * (e.g., elements, comments, processing instructions, CDATA sections, and entity references) separates Text nodes, i.e., there are neither adjacent Text
    * nodes nor empty Text nodes.
    */
  def normalize(): Unit = js.native
  /**
    * Removes the child node indicated by oldChild from the list of children, and returns it.
    * @throws DOMException  NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.  NOT_FOUND_ERR: Raised if oldChild is not a child of this node.
    */
  def removeChild(oldChild: XNode): XNode = js.native
  /**
    * Replaces the child node oldChild with newChild in the list of children, and returns the oldChild node.
    * @throws DOMException  HIERARCHY_REQUEST_ERR: Raised if this node is of a type that does not allow children of the type of the newChild node, or if the no
    */
  def replaceChild(newChild: XNode, oldChild: XNode): XNode = js.native
  /**
    * The value of this node, depending on its type; see the table above.
    * @throws DOMException  NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly.  DOMSTRING_SIZE_ERR: Raised when it would return more characters tha
    */
  def setNodeValue(nodeValue: String): Unit = js.native
  /**
    * The namespace prefix of this node, or null if it is unspecified.
    * @throws DOMException  INVALID_CHARACTER_ERR: Raised if the specified prefix contains an illegal character, per the XML 1.0 specification .  NO_MODIFICATI
    */
  def setPrefix(prefix: String): Unit = js.native
}

object XNode {
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
    acquire: () => Unit,
    appendChild: XNode => XNode,
    cloneNode: Boolean => XNode,
    getAttributes: () => XNamedNodeMap,
    getChildNodes: () => XNodeList,
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
    setPrefix: String => Unit
  ): XNode = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], ChildNodes = ChildNodes.asInstanceOf[js.Any], FirstChild = FirstChild.asInstanceOf[js.Any], LastChild = LastChild.asInstanceOf[js.Any], LocalName = LocalName.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], NextSibling = NextSibling.asInstanceOf[js.Any], NodeName = NodeName.asInstanceOf[js.Any], NodeType = NodeType.asInstanceOf[js.Any], NodeValue = NodeValue.asInstanceOf[js.Any], OwnerDocument = OwnerDocument.asInstanceOf[js.Any], ParentNode = ParentNode.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], PreviousSibling = PreviousSibling.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), appendChild = js.Any.fromFunction1(appendChild), cloneNode = js.Any.fromFunction1(cloneNode), getAttributes = js.Any.fromFunction0(getAttributes), getChildNodes = js.Any.fromFunction0(getChildNodes), getFirstChild = js.Any.fromFunction0(getFirstChild), getLastChild = js.Any.fromFunction0(getLastChild), getLocalName = js.Any.fromFunction0(getLocalName), getNamespaceURI = js.Any.fromFunction0(getNamespaceURI), getNextSibling = js.Any.fromFunction0(getNextSibling), getNodeName = js.Any.fromFunction0(getNodeName), getNodeType = js.Any.fromFunction0(getNodeType), getNodeValue = js.Any.fromFunction0(getNodeValue), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getPrefix = js.Any.fromFunction0(getPrefix), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), hasAttributes = js.Any.fromFunction0(hasAttributes), hasChildNodes = js.Any.fromFunction0(hasChildNodes), insertBefore = js.Any.fromFunction2(insertBefore), isSupported = js.Any.fromFunction2(isSupported), normalize = js.Any.fromFunction0(normalize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), setNodeValue = js.Any.fromFunction1(setNodeValue), setPrefix = js.Any.fromFunction1(setPrefix))
    __obj.asInstanceOf[XNode]
  }
  @scala.inline
  implicit class XNodeOps[Self <: XNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: XNamedNodeMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildNodes(value: XNodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChildNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstChild(value: XNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastChild(value: XNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespaceURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamespaceURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextSibling(value: XNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextSibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeType(value: NodeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerDocument(value: XDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentNode(value: XNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousSibling(value: XNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousSibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppendChild(value: XNode => XNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCloneNode(value: Boolean => XNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAttributes(value: () => XNamedNodeMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetChildNodes(value: () => XNodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildNodes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFirstChild(value: () => XNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFirstChild")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLastChild(value: () => XNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLastChild")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLocalName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocalName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNamespaceURI(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNamespaceURI")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNextSibling(value: () => XNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNextSibling")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNodeName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNodeType(value: () => NodeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNodeValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOwnerDocument(value: () => XDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOwnerDocument")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParentNode(value: () => XNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParentNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPrefix(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrefix")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPreviousSibling(value: () => XNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreviousSibling")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasAttributes(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttributes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasChildNodes(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChildNodes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInsertBefore(value: (XNode, XNode) => XNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsSupported(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSupported")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNormalize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveChild(value: XNode => XNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReplaceChild(value: (XNode, XNode) => XNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceChild")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetNodeValue(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNodeValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPrefix(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPrefix")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

