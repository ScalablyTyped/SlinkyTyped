package typingsSlinky.activexOffice.global.Office

import typingsSlinky.activexOffice.Office.MsoDocInspectorStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.DocumentInspector")
@js.native
class DocumentInspector protected ()
  extends typingsSlinky.activexOffice.Office.DocumentInspector {
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Description: String = js.native
  /* CompleteClass */
  override val Name: String = js.native
  /* CompleteClass */
  @JSName("Office.DocumentInspector_typekey")
  override var OfficeDotDocumentInspector_typekey: typingsSlinky.activexOffice.Office.DocumentInspector = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override def Fix(Status: MsoDocInspectorStatus, Results: String): Unit = js.native
  /* CompleteClass */
  override def Inspect(Status: MsoDocInspectorStatus, Results: String): Unit = js.native
}

