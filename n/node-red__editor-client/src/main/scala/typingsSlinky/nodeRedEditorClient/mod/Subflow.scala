package typingsSlinky.nodeRedEditorClient.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.nodeRedEditorClient.anon.Instances
import typingsSlinky.nodeRedEditorClient.anon.LinksArray
import typingsSlinky.nodeRedEditorClient.anon.SubflowInputs
import typingsSlinky.nodeRedEditorClient.anon.SubflowOutputs
import typingsSlinky.nodeRedEditorClient.anon.Subflows
import typingsSlinky.nodeRedEditorClient.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subflow extends js.Object {
  
  def buildEditForm(`type`: String, node: js.Object): Unit = js.native
  
  def buildPropertiesForm(node: js.Object): Unit = js.native
  
  def convertToSubflow(): Unit = js.native
  
  def createSubflow(): Unit = js.native
  
  def exportSubflowInstanceEnv(node: js.Object): js.Array[js.Object] = js.native
  
  def exportSubflowTemplateEnv(list: JQuery[HTMLElement]): js.Array[js.Object] | Null = js.native
  def exportSubflowTemplateEnv(list: JQuery[HTMLElement], all: Boolean): js.Array[js.Object] | Null = js.native
  
  def init(): Unit = js.native
  
  def refresh(): js.UndefOr[Instances] = js.native
  def refresh(markChange: Boolean): js.UndefOr[Instances] = js.native
  
  def removeInput(): SubflowInputs = js.native
  
  def removeOutput(): SubflowOutputs = js.native
  def removeOutput(removeSubflowOutputs: js.Array[js.Object]): SubflowOutputs = js.native
  
  def removeStatus(): LinksArray = js.native
  
  def removeSubflow(id: String): Subflows = js.native
}
