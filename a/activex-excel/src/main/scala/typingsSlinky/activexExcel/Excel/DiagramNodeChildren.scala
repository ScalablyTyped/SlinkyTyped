package typingsSlinky.activexExcel.Excel

import typingsSlinky.activexOffice.Office.MsoDiagramNodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramNodeChildren extends js.Object {
  
  def apply(Index: js.Any): DiagramNode = js.native
  
  /**
    * @param Index [Index=-1]
    * @param nodeType [nodeType=1]
    */
  def AddNode(): DiagramNode = js.native
  def AddNode(Index: js.UndefOr[scala.Nothing], nodeType: MsoDiagramNodeType): DiagramNode = js.native
  def AddNode(Index: js.Any): DiagramNode = js.native
  def AddNode(Index: js.Any, nodeType: MsoDiagramNodeType): DiagramNode = js.native
  
  val Application: js.Any = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  val FirstChild: DiagramNode = js.native
  
  def Item(Index: js.Any): DiagramNode = js.native
  
  val LastChild: DiagramNode = js.native
  
  val Parent: js.Any = js.native
  
  def SelectAll(): Unit = js.native
}
