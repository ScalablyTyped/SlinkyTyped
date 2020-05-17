package typingsSlinky.activexLibreoffice.com_.sun.star.xml.xpath

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.dom.XNode
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.dom.XNodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XXPathAPI extends XInterface {
  /**
    * Evaluate XPath Expression.
    * @param contextNode the context node (expression is relative to this node)
    * @param expr the XPath expression
    * @returns an object representing the result of the XPath evaluation
    * @see XXPathObject
    * @throws XPathException if the expression is malformed, or evaluation fails
    */
  def eval(contextNode: XNode, expr: String): XXPathObject = js.native
  /**
    * Evaluate XPath Expression.
    * @param contextNode the context node (expression is relative to this node)
    * @param expr the XPath expression
    * @param namespaceNode all namespaces declared on this node will be registered
    * @returns an object representing the result of the XPath evaluation
    * @see XXPathObject
    * @throws XPathException if the expression is malformed, or evaluation fails
    */
  def evalNS(contextNode: XNode, expr: String, namespaceNode: XNode): XXPathObject = js.native
  def registerExtension(serviceName: String): Unit = js.native
  def registerExtensionInstance(aExtension: XXPathExtension): Unit = js.native
  def registerNS(prefix: String, url: String): Unit = js.native
  /**
    * Evaluate an XPath expression to select a list of nodes.
    * @param contextNode the context node (expression is relative to this node)
    * @param expr the XPath expression
    * @returns result of the XPath evaluation: a list of nodes
    * @see XNodeList
    * @throws XPathException if the expression is malformed, or evaluation fails
    */
  def selectNodeList(contextNode: XNode, expr: String): XNodeList = js.native
  /**
    * Evaluate an XPath expression to select a list of nodes.
    * @param contextNode the context node (expression is relative to this node)
    * @param expr the XPath expression
    * @param namespaceNode all namespaces declared on this node will be registered
    * @returns result of the XPath evaluation: a list of nodes
    * @see XNodeList
    * @throws XPathException if the expression is malformed, or evaluation fails
    */
  def selectNodeListNS(contextNode: XNode, expr: String, namespaceNode: XNode): XNodeList = js.native
  /**
    * Evaluate an XPath expression to select a single node.
    * @param contextNode the context node (expression is relative to this node)
    * @param expr the XPath expression
    * @returns result of the XPath evaluation: a single node
    * @throws XPathException if the expression is malformed, or evaluation fails
    */
  def selectSingleNode(contextNode: XNode, expr: String): XNode = js.native
  /**
    * Evaluate an XPath expression to select a single node.
    * @param contextNode the context node (expression is relative to this node)
    * @param expr the XPath expression
    * @param namespaceNode all namespaces declared on this node will be registered
    * @returns result of the XPath evaluation: a single node
    * @throws XPathException if the expression is malformed, or evaluation fails
    */
  def selectSingleNodeNS(contextNode: XNode, expr: String, namespaceNode: XNode): XNode = js.native
  def unregisterNS(prefix: String, url: String): Unit = js.native
}

object XXPathAPI {
  @scala.inline
  def apply(
    acquire: () => Unit,
    eval: (XNode, String) => XXPathObject,
    evalNS: (XNode, String, XNode) => XXPathObject,
    queryInterface: `type` => js.Any,
    registerExtension: String => Unit,
    registerExtensionInstance: XXPathExtension => Unit,
    registerNS: (String, String) => Unit,
    release: () => Unit,
    selectNodeList: (XNode, String) => XNodeList,
    selectNodeListNS: (XNode, String, XNode) => XNodeList,
    selectSingleNode: (XNode, String) => XNode,
    selectSingleNodeNS: (XNode, String, XNode) => XNode,
    unregisterNS: (String, String) => Unit
  ): XXPathAPI = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), eval = js.Any.fromFunction2(eval), evalNS = js.Any.fromFunction3(evalNS), queryInterface = js.Any.fromFunction1(queryInterface), registerExtension = js.Any.fromFunction1(registerExtension), registerExtensionInstance = js.Any.fromFunction1(registerExtensionInstance), registerNS = js.Any.fromFunction2(registerNS), release = js.Any.fromFunction0(release), selectNodeList = js.Any.fromFunction2(selectNodeList), selectNodeListNS = js.Any.fromFunction3(selectNodeListNS), selectSingleNode = js.Any.fromFunction2(selectSingleNode), selectSingleNodeNS = js.Any.fromFunction3(selectSingleNodeNS), unregisterNS = js.Any.fromFunction2(unregisterNS))
    __obj.asInstanceOf[XXPathAPI]
  }
  @scala.inline
  implicit class XXPathAPIOps[Self <: XXPathAPI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEval(value: (XNode, String) => XXPathObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eval")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEvalNS(value: (XNode, String, XNode) => XXPathObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalNS")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRegisterExtension(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerExtension")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterExtensionInstance(value: XXPathExtension => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerExtensionInstance")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterNS(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerNS")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSelectNodeList(value: (XNode, String) => XNodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectNodeList")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSelectNodeListNS(value: (XNode, String, XNode) => XNodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectNodeListNS")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSelectSingleNode(value: (XNode, String) => XNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectSingleNode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSelectSingleNodeNS(value: (XNode, String, XNode) => XNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectSingleNodeNS")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUnregisterNS(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregisterNS")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

