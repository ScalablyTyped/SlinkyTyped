package typingsSlinky.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLNode extends StObject {
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Attributes: XMLNodes = js.native
  
  val BaseName: String = js.native
  
  val ChildNodeSuggestions: XMLChildNodeSuggestions = js.native
  
  val ChildNodes: XMLNodes = js.native
  
  def Copy(): Unit = js.native
  
  val Creator: Double = js.native
  
  def Cut(): Unit = js.native
  
  def Delete(): Unit = js.native
  
  val FirstChild: XMLNode = js.native
  
  val HasChildNodes: Boolean = js.native
  
  val LastChild: XMLNode = js.native
  
  val Level: WdXMLNodeLevel = js.native
  
  val NamespaceURI: String = js.native
  
  val NextSibling: XMLNode = js.native
  
  val NodeType: WdXMLNodeType = js.native
  
  var NodeValue: String = js.native
  
  val OwnerDocument: Document = js.native
  
  val Parent: js.Any = js.native
  
  val ParentNode: XMLNode = js.native
  
  var PlaceholderText: String = js.native
  
  val PreviousSibling: XMLNode = js.native
  
  val Range: typingsSlinky.activexWord.Word.Range = js.native
  
  def RemoveChild(ChildElement: XMLNode): Unit = js.native
  
  /**
    * @param string [PrefixMapping='']
    * @param boolean [FastSearchSkippingTextNodes=true]
    */
  def SelectNodes(XPath: String): XMLNodes = js.native
  def SelectNodes(XPath: String, PrefixMapping: js.UndefOr[scala.Nothing], FastSearchSkippingTextNodes: Boolean): XMLNodes = js.native
  def SelectNodes(XPath: String, PrefixMapping: String): XMLNodes = js.native
  def SelectNodes(XPath: String, PrefixMapping: String, FastSearchSkippingTextNodes: Boolean): XMLNodes = js.native
  
  /**
    * @param string [PrefixMapping='']
    * @param boolean [FastSearchSkippingTextNodes=true]
    */
  def SelectSingleNode(XPath: String): XMLNode = js.native
  def SelectSingleNode(XPath: String, PrefixMapping: js.UndefOr[scala.Nothing], FastSearchSkippingTextNodes: Boolean): XMLNode = js.native
  def SelectSingleNode(XPath: String, PrefixMapping: String): XMLNode = js.native
  def SelectSingleNode(XPath: String, PrefixMapping: String, FastSearchSkippingTextNodes: Boolean): XMLNode = js.native
  
  /** @param boolean [ClearedAutomatically=true] */
  def SetValidationError(Status: WdXMLValidationStatus, ErrorText: js.Any): Unit = js.native
  def SetValidationError(Status: WdXMLValidationStatus, ErrorText: js.Any, ClearedAutomatically: Boolean): Unit = js.native
  
  val SmartTag: typingsSlinky.activexWord.Word.SmartTag = js.native
  
  var Text: String = js.native
  
  def Validate(): Unit = js.native
  
  /** @param boolean [Advanced=false] */
  def ValidationErrorText(): String = js.native
  def ValidationErrorText(Advanced: Boolean): String = js.native
  
  val ValidationStatus: WdXMLValidationStatus = js.native
  
  @JSName("Word.XMLNode_typekey")
  var WordDotXMLNode_typekey: XMLNode = js.native
  
  val WordOpenXML: String = js.native
  
  /** @param boolean [DataOnly=false] */
  def XML(): String = js.native
  def XML(DataOnly: Boolean): String = js.native
}
