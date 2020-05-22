package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlGroupType
import typingsSlinky.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.NavigationGroups")
@js.native
class NavigationGroups protected ()
  extends typingsSlinky.activexOutlook.Outlook.NavigationGroups {
  /* CompleteClass */
  override val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  @JSName("Outlook.NavigationGroups_typekey")
  override var OutlookDotNavigationGroups_typekey: typingsSlinky.activexOutlook.Outlook.NavigationGroups = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typingsSlinky.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def Create(GroupDisplayName: String): typingsSlinky.activexOutlook.Outlook.NavigationGroup = js.native
  /* CompleteClass */
  override def Delete(Group: typingsSlinky.activexOutlook.Outlook.NavigationGroup): Unit = js.native
  /* CompleteClass */
  override def GetDefaultNavigationGroup(DefaultFolderGroup: OlGroupType): typingsSlinky.activexOutlook.Outlook.NavigationGroup = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typingsSlinky.activexOutlook.Outlook.NavigationGroup = js.native
}

