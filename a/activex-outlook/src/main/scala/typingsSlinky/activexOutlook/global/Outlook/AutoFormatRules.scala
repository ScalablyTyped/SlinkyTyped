package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.AutoFormatRules")
@js.native
class AutoFormatRules protected ()
  extends typingsSlinky.activexOutlook.Outlook.AutoFormatRules {
  /* CompleteClass */
  override val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  @JSName("Outlook.AutoFormatRules_typekey")
  override var OutlookDotAutoFormatRules_typekey: typingsSlinky.activexOutlook.Outlook.AutoFormatRules = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typingsSlinky.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def Add(Name: String): typingsSlinky.activexOutlook.Outlook.AutoFormatRule = js.native
  /* CompleteClass */
  override def Insert(Name: String, Index: js.Any): typingsSlinky.activexOutlook.Outlook.AutoFormatRule = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typingsSlinky.activexOutlook.Outlook.AutoFormatRule = js.native
  /* CompleteClass */
  override def Remove(Index: js.Any): Unit = js.native
  /* CompleteClass */
  override def RemoveAll(): Unit = js.native
  /* CompleteClass */
  override def Save(): Unit = js.native
}

