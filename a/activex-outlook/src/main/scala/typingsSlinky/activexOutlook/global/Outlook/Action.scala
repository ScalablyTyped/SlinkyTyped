package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlActionCopyLike
import typingsSlinky.activexOutlook.Outlook.OlActionReplyStyle
import typingsSlinky.activexOutlook.Outlook.OlActionResponseStyle
import typingsSlinky.activexOutlook.Outlook.OlActionShowOn
import typingsSlinky.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Action")
@js.native
class Action protected ()
  extends typingsSlinky.activexOutlook.Outlook.Action {
  /* CompleteClass */
  override val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override var CopyLike: OlActionCopyLike = js.native
  /* CompleteClass */
  override var Enabled: Boolean = js.native
  /* CompleteClass */
  override var MessageClass: String = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  @JSName("Outlook.Action_typekey")
  override var OutlookDotAction_typekey: typingsSlinky.activexOutlook.Outlook.Action = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Prefix: String = js.native
  /* CompleteClass */
  override var ReplyStyle: OlActionReplyStyle = js.native
  /* CompleteClass */
  override var ResponseStyle: OlActionResponseStyle = js.native
  /* CompleteClass */
  override val Session: typingsSlinky.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override var ShowOn: OlActionShowOn = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def Execute(): js.Any = js.native
}

