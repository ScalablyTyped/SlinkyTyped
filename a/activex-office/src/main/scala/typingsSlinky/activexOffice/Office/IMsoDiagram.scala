package typingsSlinky.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMsoDiagram extends StObject {
  
  val Application: js.Any = js.native
  
  var AutoFormat: MsoTriState = js.native
  
  var AutoLayout: MsoTriState = js.native
  
  def Convert(Type: MsoDiagramType): Unit = js.native
  
  val Creator: Double = js.native
  
  def FitText(): Unit = js.native
  
  def Nodes(Index: js.Any): DiagramNode = js.native
  @JSName("Nodes")
  val Nodes_Original: DiagramNodes = js.native
  
  @JSName("Office.IMsoDiagram_typekey")
  var OfficeDotIMsoDiagram_typekey: IMsoDiagram = js.native
  
  val Parent: js.Any = js.native
  
  var Reverse: MsoTriState = js.native
  
  val Type: MsoDiagramType = js.native
}
