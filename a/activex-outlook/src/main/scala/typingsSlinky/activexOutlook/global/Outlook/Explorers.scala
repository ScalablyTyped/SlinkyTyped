package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlFolderDisplayMode
import typingsSlinky.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Explorers")
@js.native
class Explorers protected ()
  extends typingsSlinky.activexOutlook.Outlook.Explorers {
  /* CompleteClass */
  override val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  @JSName("Outlook.Explorers_typekey")
  override var OutlookDotExplorers_typekey: typingsSlinky.activexOutlook.Outlook.Explorers = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typingsSlinky.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def Add(Folder: js.Any, DisplayMode: OlFolderDisplayMode): typingsSlinky.activexOutlook.Outlook.Explorer = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typingsSlinky.activexOutlook.Outlook.Explorer = js.native
}

