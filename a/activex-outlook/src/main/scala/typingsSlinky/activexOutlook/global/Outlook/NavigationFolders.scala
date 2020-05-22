package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.NavigationFolders")
@js.native
class NavigationFolders protected ()
  extends typingsSlinky.activexOutlook.Outlook.NavigationFolders {
  /* CompleteClass */
  override val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  @JSName("Outlook.NavigationFolders_typekey")
  override var OutlookDotNavigationFolders_typekey: typingsSlinky.activexOutlook.Outlook.NavigationFolders = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typingsSlinky.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def Add(Folder: typingsSlinky.activexOutlook.Outlook.Folder): typingsSlinky.activexOutlook.Outlook.NavigationFolder = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typingsSlinky.activexOutlook.Outlook.NavigationFolder = js.native
  /* CompleteClass */
  override def Remove(RemovableFolder: typingsSlinky.activexOutlook.Outlook.NavigationFolder): Unit = js.native
}

