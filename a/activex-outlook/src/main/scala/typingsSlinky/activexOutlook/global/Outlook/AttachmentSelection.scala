package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlObjectClass
import typingsSlinky.activexOutlook.Outlook.OlSelectionContents
import typingsSlinky.activexOutlook.Outlook.OlSelectionLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.AttachmentSelection")
@js.native
class AttachmentSelection protected ()
  extends typingsSlinky.activexOutlook.Outlook.AttachmentSelection {
  /* CompleteClass */
  override val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Location: OlSelectionLocation = js.native
  /* CompleteClass */
  @JSName("Outlook.AttachmentSelection_typekey")
  override var OutlookDotAttachmentSelection_typekey: typingsSlinky.activexOutlook.Outlook.AttachmentSelection = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typingsSlinky.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def GetSelection(SelectionContents: OlSelectionContents): typingsSlinky.activexOutlook.Outlook.Selection = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typingsSlinky.activexOutlook.Outlook.Attachment = js.native
}

