package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlNavigationModuleType
import typingsSlinky.activexOutlook.Outlook.OlObjectClass
import typingsSlinky.activexOutlook.Outlook.OlSolutionScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.SolutionsModule")
@js.native
class SolutionsModule protected ()
  extends typingsSlinky.activexOutlook.Outlook.SolutionsModule {
  /* CompleteClass */
  override val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Name: String = js.native
  /* CompleteClass */
  override val NavigationModuleType: OlNavigationModuleType = js.native
  /* CompleteClass */
  @JSName("Outlook.SolutionsModule_typekey")
  override var OutlookDotSolutionsModule_typekey: typingsSlinky.activexOutlook.Outlook.SolutionsModule = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Position: Double = js.native
  /* CompleteClass */
  override val Session: typingsSlinky.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override var Visible: Boolean = js.native
  /* CompleteClass */
  override def AddSolution(Solution: typingsSlinky.activexOutlook.Outlook.Folder, Scope: OlSolutionScope): Unit = js.native
}

