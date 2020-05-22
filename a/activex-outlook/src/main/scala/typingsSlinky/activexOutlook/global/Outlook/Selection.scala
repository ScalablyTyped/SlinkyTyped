package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlObjectClass
import typingsSlinky.activexOutlook.Outlook.OlSelectionContents
import typingsSlinky.activexOutlook.Outlook.OlSelectionLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Selection")
@js.native
class Selection protected ()
  extends typingsSlinky.activexOutlook.Outlook.Selection {
  /* CompleteClass */
  override val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Location: OlSelectionLocation = js.native
  /* CompleteClass */
  @JSName("Outlook.Selection_typekey")
  override var OutlookDotSelection_typekey: typingsSlinky.activexOutlook.Outlook.Selection = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typingsSlinky.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def GetSelection(SelectionContents: OlSelectionContents): typingsSlinky.activexOutlook.Outlook.Selection = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): js.Any = js.native
}

