package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.ViewFields")
@js.native
class ViewFields protected ()
  extends typingsSlinky.activexOutlook.Outlook.ViewFields {
  /* CompleteClass */
  override val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  @JSName("Outlook.ViewFields_typekey")
  override var OutlookDotViewFields_typekey: typingsSlinky.activexOutlook.Outlook.ViewFields = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typingsSlinky.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def Add(PropertyName: String): typingsSlinky.activexOutlook.Outlook.ViewField = js.native
  /* CompleteClass */
  override def Insert(PropertyName: String, Index: js.Any): typingsSlinky.activexOutlook.Outlook.ViewField = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typingsSlinky.activexOutlook.Outlook.ViewField = js.native
  /* CompleteClass */
  override def Remove(Index: js.Any): Unit = js.native
}

