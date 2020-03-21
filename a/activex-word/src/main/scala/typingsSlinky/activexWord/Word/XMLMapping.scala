package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.XMLMapping")
@js.native
class XMLMapping protected () extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val CustomXMLNode: typingsSlinky.activexOffice.Office.CustomXMLNode = js.native
  val CustomXMLPart: typingsSlinky.activexOffice.Office.CustomXMLPart = js.native
  val IsMapped: Boolean = js.native
  val Parent: js.Any = js.native
  val PrefixMappings: String = js.native
  @JSName("Word.XMLMapping_typekey")
  var WordDotXMLMapping_typekey: XMLMapping = js.native
  val XPath: String = js.native
  def Delete(): Unit = js.native
  /**
    * @param string [PrefixMapping='']
    * @param Office.CustomXMLPart [Source=0]
    */
  def SetMapping(XPath: String): Boolean = js.native
  def SetMapping(XPath: String, PrefixMapping: String): Boolean = js.native
  def SetMapping(XPath: String, PrefixMapping: String, Source: typingsSlinky.activexOffice.Office.CustomXMLPart): Boolean = js.native
  def SetMappingByNode(Node: typingsSlinky.activexOffice.Office.CustomXMLNode): Boolean = js.native
}

