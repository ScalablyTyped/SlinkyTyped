package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlObjectClass
import typingsSlinky.activexOutlook.Outlook.OlViewSaveOption
import typingsSlinky.activexOutlook.Outlook.OlViewType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Views")
@js.native
class Views protected ()
  extends typingsSlinky.activexOutlook.Outlook.Views {
  /* CompleteClass */
  override val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  @JSName("Outlook.Views_typekey")
  override var OutlookDotViews_typekey: typingsSlinky.activexOutlook.Outlook.Views = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typingsSlinky.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def Add(Name: String, ViewType: OlViewType, SaveOption: OlViewSaveOption): typingsSlinky.activexOutlook.Outlook.View = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typingsSlinky.activexOutlook.Outlook.View = js.native
  /* CompleteClass */
  override def Remove(Index: js.Any): Unit = js.native
}

