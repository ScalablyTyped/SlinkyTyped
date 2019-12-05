package typingsSlinky.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.XMLMapping")
@js.native
class XMLMapping protected () extends js.Object {
  val Application: typingsSlinky.activexDashWord.Word.Application = js.native
  val Creator: Double = js.native
  val CustomXMLNode: typingsSlinky.activexDashOffice.Office.CustomXMLNode = js.native
  val CustomXMLPart: typingsSlinky.activexDashOffice.Office.CustomXMLPart = js.native
  val IsMapped: Boolean = js.native
  val Parent: js.Any = js.native
  val PrefixMappings: String = js.native
  var `Word.XMLMapping_typekey`: XMLMapping = js.native
  val XPath: String = js.native
  def Delete(): Unit = js.native
  /**
    * @param string [PrefixMapping='']
    * @param Office.CustomXMLPart [Source=0]
    */
  def SetMapping(XPath: String): Boolean = js.native
  def SetMapping(XPath: String, PrefixMapping: String): Boolean = js.native
  def SetMapping(XPath: String, PrefixMapping: String, Source: typingsSlinky.activexDashOffice.Office.CustomXMLPart): Boolean = js.native
  def SetMappingByNode(Node: typingsSlinky.activexDashOffice.Office.CustomXMLNode): Boolean = js.native
}

