package typingsSlinky.activexInfopath.InfoPath

import typingsSlinky.activexAdodb.ADODB.Error
import typingsSlinky.activexAdodb.ADODB.Errors
import typingsSlinky.activexMsxml2.MSXML2.IXMLDOMDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _XDocument extends js.Object {
  
  val DOM: IXMLDOMDocument = js.native
  
  val DataObjects: DataObjectsCollection = js.native
  
  def Errors(Index: js.Any): Error = js.native
  @JSName("Errors")
  val Errors_Original: Errors = js.native
  
  val Extension: js.Any = js.native
  
  def GetDOM(bstrName: String): IXMLDOMDocument = js.native
  
  def GetDataVariable(lVariableNumber: Double): String = js.native
  
  def ImportFile(bstrFileURI: String): Unit = js.native
  
  @JSName("InfoPath._XDocument_typekey")
  var InfoPathDot_XDocument_typekey: _XDocument = js.native
  
  val IsDOMReadOnly: Boolean = js.native
  
  val IsDirty: Boolean = js.native
  
  val IsNew: Boolean = js.native
  
  val IsReadOnly: Boolean = js.native
  
  val IsSigned: Boolean = js.native
  
  var Language: String = js.native
  
  def PrintOut(): Unit = js.native
  
  def Query(): Unit = js.native
  
  val QueryAdapter: js.Any = js.native
  
  def Save(): Unit = js.native
  
  def SaveAs(bstrFileUrl: String): Unit = js.native
  
  def SetDataVariable(lVariableNumber: Double, bstrVariableValue: String): Unit = js.native
  
  val Solution: SolutionObject = js.native
  
  def Submit(): Unit = js.native
  
  val UI: typingsSlinky.activexInfopath.InfoPath.UI = js.native
  
  val URI: String = js.native
  
  val View: ViewObject = js.native
  
  val ViewInfos: ViewInfosCollection = js.native
}
