package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlDefaultSelectNamesDisplayMode
import typingsSlinky.activexOutlook.Outlook.OlObjectClass
import typingsSlinky.activexOutlook.Outlook.OlRecipientSelectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.SelectNamesDialog")
@js.native
class SelectNamesDialog protected ()
  extends typingsSlinky.activexOutlook.Outlook.SelectNamesDialog {
  /* CompleteClass */
  override var AllowMultipleSelection: Boolean = js.native
  /* CompleteClass */
  override val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override var BccLabel: String = js.native
  /* CompleteClass */
  override var Caption: String = js.native
  /* CompleteClass */
  override var CcLabel: String = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override var ForceResolution: Boolean = js.native
  /* CompleteClass */
  override var InitialAddressList: typingsSlinky.activexOutlook.Outlook.AddressList = js.native
  /* CompleteClass */
  override var NumberOfRecipientSelectors: OlRecipientSelectors = js.native
  /* CompleteClass */
  @JSName("Outlook.SelectNamesDialog_typekey")
  override var OutlookDotSelectNamesDialog_typekey: typingsSlinky.activexOutlook.Outlook.SelectNamesDialog = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Recipients: typingsSlinky.activexOutlook.Outlook.Recipients = js.native
  /* CompleteClass */
  override val Session: typingsSlinky.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override var ShowOnlyInitialAddressList: Boolean = js.native
  /* CompleteClass */
  override var ToLabel: String = js.native
  /* CompleteClass */
  override def Display(): Boolean = js.native
  /* CompleteClass */
  override def SetDefaultDisplayMode(defaultMode: OlDefaultSelectNamesDisplayMode): Unit = js.native
}

