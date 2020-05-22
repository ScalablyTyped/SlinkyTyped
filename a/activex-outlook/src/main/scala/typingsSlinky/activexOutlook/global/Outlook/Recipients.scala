package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Recipients")
@js.native
class Recipients protected ()
  extends typingsSlinky.activexOutlook.Outlook.Recipients {
  /* CompleteClass */
  override val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  @JSName("Outlook.Recipients_typekey")
  override var OutlookDotRecipients_typekey: typingsSlinky.activexOutlook.Outlook.Recipients = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typingsSlinky.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def Add(Name: String): typingsSlinky.activexOutlook.Outlook.Recipient = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typingsSlinky.activexOutlook.Outlook.Recipient = js.native
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
  /* CompleteClass */
  override def ResolveAll(): Boolean = js.native
}

