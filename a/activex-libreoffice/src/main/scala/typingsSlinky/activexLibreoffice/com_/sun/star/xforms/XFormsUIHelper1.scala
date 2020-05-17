package typingsSlinky.activexLibreoffice.com_.sun.star.xforms

import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.dom.XDocument
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.dom.XNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provide several helper methods for the UI
  *
  * **This interfaces is for UI use only, and will likely be unsupported in future versions.**
  */
@js.native
trait XFormsUIHelper1 extends js.Object {
  def cloneBindingAsGhost(binding: XPropertySet): XPropertySet = js.native
  def createAttribute(xParent: XNode, sName: String): XNode = js.native
  def createElement(xParent: XNode, sName: String): XNode = js.native
  def getBindingForNode(xNode: XNode, bCreate: Boolean): XPropertySet = js.native
  def getBindingName(xBinding: XPropertySet, bDetail: Boolean): String = js.native
  def getDefaultBindingExpressionForNode(xNode: XNode): String = js.native
  def getDefaultServiceNameForNode(xNode: XNode): String = js.native
  def getNodeDisplayName(xNode: XNode, bDetail: Boolean): String = js.native
  def getNodeName(xNode: XNode): String = js.native
  def getResultForExpression(xBinding: XPropertySet, bIsBindingExpression: Boolean, sExpression: String): String = js.native
  def getSubmissionName(xSubm: XPropertySet, bDetail: Boolean): String = js.native
  def isValidPrefixName(sName: String): Boolean = js.native
  def isValidXMLName(sName: String): Boolean = js.native
  def newInstance(sName: String, sURL: String, bURLOnce: Boolean): XDocument = js.native
  def newModel(xModel: typingsSlinky.activexLibreoffice.com_.sun.star.frame.XModel, sName: String): XModel = js.native
  def removeBindingForNode(xNode: XNode): Unit = js.native
  def removeBindingIfUseless(xBinding: XPropertySet): Unit = js.native
  def removeInstance(sName: String): Unit = js.native
  def removeModel(xModel: typingsSlinky.activexLibreoffice.com_.sun.star.frame.XModel, sName: String): Unit = js.native
  def renameInstance(sFrom: String, sTo: String, sURL: String, bURLOnce: Boolean): Unit = js.native
  def renameModel(xModel: typingsSlinky.activexLibreoffice.com_.sun.star.frame.XModel, sFrom: String, sTo: String): Unit = js.native
  def renameNode(xNode: XNode, sName: String): XNode = js.native
  def setNodeValue(xNode: XNode, sValue: String): Unit = js.native
}

object XFormsUIHelper1 {
  @scala.inline
  def apply(
    cloneBindingAsGhost: XPropertySet => XPropertySet,
    createAttribute: (XNode, String) => XNode,
    createElement: (XNode, String) => XNode,
    getBindingForNode: (XNode, Boolean) => XPropertySet,
    getBindingName: (XPropertySet, Boolean) => String,
    getDefaultBindingExpressionForNode: XNode => String,
    getDefaultServiceNameForNode: XNode => String,
    getNodeDisplayName: (XNode, Boolean) => String,
    getNodeName: XNode => String,
    getResultForExpression: (XPropertySet, Boolean, String) => String,
    getSubmissionName: (XPropertySet, Boolean) => String,
    isValidPrefixName: String => Boolean,
    isValidXMLName: String => Boolean,
    newInstance: (String, String, Boolean) => XDocument,
    newModel: (typingsSlinky.activexLibreoffice.com_.sun.star.frame.XModel, String) => XModel,
    removeBindingForNode: XNode => Unit,
    removeBindingIfUseless: XPropertySet => Unit,
    removeInstance: String => Unit,
    removeModel: (typingsSlinky.activexLibreoffice.com_.sun.star.frame.XModel, String) => Unit,
    renameInstance: (String, String, String, Boolean) => Unit,
    renameModel: (typingsSlinky.activexLibreoffice.com_.sun.star.frame.XModel, String, String) => Unit,
    renameNode: (XNode, String) => XNode,
    setNodeValue: (XNode, String) => Unit
  ): XFormsUIHelper1 = {
    val __obj = js.Dynamic.literal(cloneBindingAsGhost = js.Any.fromFunction1(cloneBindingAsGhost), createAttribute = js.Any.fromFunction2(createAttribute), createElement = js.Any.fromFunction2(createElement), getBindingForNode = js.Any.fromFunction2(getBindingForNode), getBindingName = js.Any.fromFunction2(getBindingName), getDefaultBindingExpressionForNode = js.Any.fromFunction1(getDefaultBindingExpressionForNode), getDefaultServiceNameForNode = js.Any.fromFunction1(getDefaultServiceNameForNode), getNodeDisplayName = js.Any.fromFunction2(getNodeDisplayName), getNodeName = js.Any.fromFunction1(getNodeName), getResultForExpression = js.Any.fromFunction3(getResultForExpression), getSubmissionName = js.Any.fromFunction2(getSubmissionName), isValidPrefixName = js.Any.fromFunction1(isValidPrefixName), isValidXMLName = js.Any.fromFunction1(isValidXMLName), newInstance = js.Any.fromFunction3(newInstance), newModel = js.Any.fromFunction2(newModel), removeBindingForNode = js.Any.fromFunction1(removeBindingForNode), removeBindingIfUseless = js.Any.fromFunction1(removeBindingIfUseless), removeInstance = js.Any.fromFunction1(removeInstance), removeModel = js.Any.fromFunction2(removeModel), renameInstance = js.Any.fromFunction4(renameInstance), renameModel = js.Any.fromFunction3(renameModel), renameNode = js.Any.fromFunction2(renameNode), setNodeValue = js.Any.fromFunction2(setNodeValue))
    __obj.asInstanceOf[XFormsUIHelper1]
  }
  @scala.inline
  implicit class XFormsUIHelper1Ops[Self <: XFormsUIHelper1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloneBindingAsGhost(value: XPropertySet => XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneBindingAsGhost")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateAttribute(value: (XNode, String) => XNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createAttribute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateElement(value: (XNode, String) => XNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createElement")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetBindingForNode(value: (XNode, Boolean) => XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBindingForNode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetBindingName(value: (XPropertySet, Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBindingName")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDefaultBindingExpressionForNode(value: XNode => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultBindingExpressionForNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDefaultServiceNameForNode(value: XNode => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultServiceNameForNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNodeDisplayName(value: (XNode, Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeDisplayName")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetNodeName(value: XNode => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetResultForExpression(value: (XPropertySet, Boolean, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResultForExpression")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetSubmissionName(value: (XPropertySet, Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubmissionName")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsValidPrefixName(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValidPrefixName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsValidXMLName(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValidXMLName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNewInstance(value: (String, String, Boolean) => XDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInstance")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withNewModel(value: (typingsSlinky.activexLibreoffice.com_.sun.star.frame.XModel, String) => XModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newModel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveBindingForNode(value: XNode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeBindingForNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveBindingIfUseless(value: XPropertySet => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeBindingIfUseless")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveInstance(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeInstance")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveModel(value: (typingsSlinky.activexLibreoffice.com_.sun.star.frame.XModel, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeModel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRenameInstance(value: (String, String, String, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameInstance")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withRenameModel(value: (typingsSlinky.activexLibreoffice.com_.sun.star.frame.XModel, String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameModel")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRenameNode(value: (XNode, String) => XNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameNode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetNodeValue(value: (XNode, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNodeValue")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

