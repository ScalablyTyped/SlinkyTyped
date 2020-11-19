package typingsSlinky.flowjs.mod

import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFlow extends js.Object {
  
  def addFile(file: File): Unit = js.native
  
  def assignBrowse(domNodes: js.Array[HTMLElement], isDirectory: Boolean, singleFile: Boolean, attributes: js.Object): Unit = js.native
  
  def assignDrop(domNodes: js.Array[HTMLElement]): Unit = js.native
  
  def cancel(): Unit = js.native
  
  var files: js.Array[IFlowFile] = js.native
  
  def getFromUniqueIdentifier(uniqueIdentifier: String): IFlowFile = js.native
  
  def getSize(): Double = js.native
  
  def isUploading(): Boolean = js.native
  
  def off(): Unit = js.native
  def off(event: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
  def off(event: String): Unit = js.native
  def off(event: String, callback: js.Function): Unit = js.native
  
  def on(event: String, callback: js.Function): Unit = js.native
  
  var opts: IFlowOptions = js.native
  
  def pause(): Unit = js.native
  
  def progress(): Double = js.native
  
  def removeFile(file: IFlowFile): Unit = js.native
  
  def resume(): Unit = js.native
  
  def sizeUploaded(): Double = js.native
  
  var support: Boolean = js.native
  
  var supportDirectory: Boolean = js.native
  
  def timeRemaining(): Double = js.native
  
  def unAssignDrop(domNodes: js.Array[HTMLElement]): Unit = js.native
  
  def upload(): Unit = js.native
}
