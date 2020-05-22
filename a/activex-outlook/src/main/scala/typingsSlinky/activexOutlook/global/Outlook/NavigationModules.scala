package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlNavigationModuleType
import typingsSlinky.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.NavigationModules")
@js.native
class NavigationModules protected ()
  extends typingsSlinky.activexOutlook.Outlook.NavigationModules {
  /* CompleteClass */
  override val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  @JSName("Outlook.NavigationModules_typekey")
  override var OutlookDotNavigationModules_typekey: typingsSlinky.activexOutlook.Outlook.NavigationModules = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typingsSlinky.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def GetNavigationModule(ModuleType: OlNavigationModuleType): typingsSlinky.activexOutlook.Outlook.NavigationModule = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typingsSlinky.activexOutlook.Outlook.NavigationModule = js.native
}

