package typingsSlinky.activexInfopath.global.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.InfoPathEditorObject")
@js.native
class InfoPathEditorObject protected ()
  extends typingsSlinky.activexInfopath.InfoPath.InfoPathEditorObject {
  /* CompleteClass */
  override var DataConnectionBaseUrl: String = js.native
  /* CompleteClass */
  override var Host: js.Any = js.native
  /* CompleteClass */
  override var HostName: String = js.native
  /* CompleteClass */
  @JSName("InfoPath.InfoPathEditorObject_typekey")
  override var InfoPathDotInfoPathEditorObject_typekey: typingsSlinky.activexInfopath.InfoPath.InfoPathEditorObject = js.native
  /* CompleteClass */
  override val XDocument: typingsSlinky.activexInfopath.InfoPath._XDocument = js.native
  /* CompleteClass */
  override def CloseDocument(): Unit = js.native
  /* CompleteClass */
  override def FlushDocument(): Unit = js.native
  /* CompleteClass */
  override def Load(bstrURL: String): Unit = js.native
  /* CompleteClass */
  override def LoadFromStream(punkStream: js.Any): Unit = js.native
  /* CompleteClass */
  override def NewFromSolution(bstrSolutionURI: String): Unit = js.native
  /* CompleteClass */
  override def NewFromSolutionWithData(bstrURLXSN: String, punkStream: js.Any, dwBehavior: Double): Unit = js.native
  /* CompleteClass */
  override def SetInitEventHandler(handler: typingsSlinky.activexInfopath.InfoPath.IInitEventHandler): Unit = js.native
  /* CompleteClass */
  override def SetNotifyHostEventHandler(pHandler: typingsSlinky.activexInfopath.InfoPath.INotifyHostEventHandler): Unit = js.native
  /* CompleteClass */
  override def SetSubmitToHostEventHandler(pHandler: typingsSlinky.activexInfopath.InfoPath.ISubmitToHostEventHandler): Unit = js.native
}

