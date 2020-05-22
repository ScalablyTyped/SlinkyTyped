package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlAttachmentBlockLevel
import typingsSlinky.activexOutlook.Outlook.OlAttachmentType
import typingsSlinky.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Attachment")
@js.native
class Attachment protected ()
  extends typingsSlinky.activexOutlook.Outlook.Attachment {
  /* CompleteClass */
  override val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val BlockLevel: OlAttachmentBlockLevel = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override var DisplayName: String = js.native
  /* CompleteClass */
  override val FileName: String = js.native
  /* CompleteClass */
  override val Index: Double = js.native
  /* CompleteClass */
  override val MAPIOBJECT: js.Any = js.native
  /* CompleteClass */
  @JSName("Outlook.Attachment_typekey")
  override var OutlookDotAttachment_typekey: typingsSlinky.activexOutlook.Outlook.Attachment = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val PathName: String = js.native
  /* CompleteClass */
  override var Position: Double = js.native
  /* CompleteClass */
  override val PropertyAccessor: typingsSlinky.activexOutlook.Outlook.PropertyAccessor = js.native
  /* CompleteClass */
  override val Session: typingsSlinky.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override val Size: Double = js.native
  /* CompleteClass */
  override val Type: OlAttachmentType = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def GetTemporaryFilePath(): String = js.native
  /* CompleteClass */
  override def SaveAsFile(Path: String): Unit = js.native
}

