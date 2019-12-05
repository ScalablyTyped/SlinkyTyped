package typingsSlinky.inboxsdk.inboxsdkMod.Compose

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.inboxsdk.Anon_Cancel
import typingsSlinky.inboxsdk.Anon_ClosedByInboxSDK
import typingsSlinky.inboxsdk.Anon_Contact
import typingsSlinky.inboxsdk.Anon_Fullscreen
import typingsSlinky.inboxsdk.Anon_GetMessageID
import typingsSlinky.inboxsdk.Anon_IsForward
import typingsSlinky.inboxsdk.inboxsdkMod.Common.Contact
import typingsSlinky.inboxsdk.inboxsdkStrings.bccContactAdded
import typingsSlinky.inboxsdk.inboxsdkStrings.bccContactRemoved
import typingsSlinky.inboxsdk.inboxsdkStrings.bodyChanged
import typingsSlinky.inboxsdk.inboxsdkStrings.ccContactAdded
import typingsSlinky.inboxsdk.inboxsdkStrings.ccContactRemoved
import typingsSlinky.inboxsdk.inboxsdkStrings.destroy
import typingsSlinky.inboxsdk.inboxsdkStrings.discard
import typingsSlinky.inboxsdk.inboxsdkStrings.fromContactChanged
import typingsSlinky.inboxsdk.inboxsdkStrings.fullscreenChanged
import typingsSlinky.inboxsdk.inboxsdkStrings.minimized
import typingsSlinky.inboxsdk.inboxsdkStrings.presending
import typingsSlinky.inboxsdk.inboxsdkStrings.recipientsChanged
import typingsSlinky.inboxsdk.inboxsdkStrings.responseTypeChanged
import typingsSlinky.inboxsdk.inboxsdkStrings.restored
import typingsSlinky.inboxsdk.inboxsdkStrings.sendCanceled
import typingsSlinky.inboxsdk.inboxsdkStrings.sending
import typingsSlinky.inboxsdk.inboxsdkStrings.sent
import typingsSlinky.inboxsdk.inboxsdkStrings.toContactAdded
import typingsSlinky.inboxsdk.inboxsdkStrings.toContactRemoved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComposeView extends js.Object {
  var destroyed: Boolean = js.native
  def addButton(buttonDescriptor: ComposeButtonDescriptor): Unit = js.native
  def addComposeNotice(composeNoticeDescriptor: ComposeNoticeDescriptor): Unit = js.native
  def addStatusBar(statusBarDescriptor: StatusBarDescriptor): StatusBarView = js.native
  def attachFiles(files: js.Array[Blob]): js.Promise[Unit] = js.native
  def attachInlineFiles(Files: js.Array[Blob]): js.Promise[Unit] = js.native
  def close(): Unit = js.native
  def getBccRecipients(): js.Array[Contact] = js.native
  def getBodyElement(): HTMLElement = js.native
  def getCcRecipients(): js.Array[Contact] = js.native
  def getCurrentDraftID(): js.Promise[String | Null] = js.native
  def getDraftID(): js.Promise[String] = js.native
  def getFromContact(): Contact = js.native
  def getFromContactChoices(): js.Array[Contact] = js.native
  def getHTMLContent(): String = js.native
  def getInitialMessageID(): String = js.native
  def getMetadataFormElement(): HTMLElement = js.native
  def getSelectedBodyHTML(): String = js.native
  def getSelectedBodyText(): String = js.native
  def getSubject(): String = js.native
  def getTextContent(): String = js.native
  def getThreadID(): String = js.native
  def getToRecipients(): js.Array[Contact] = js.native
  def insertHTMLIntoBodyAtCursor(html: String): HTMLElement = js.native
  def insertHTMLIntoBodyAtCursor(html: typingsSlinky.std.HTMLElement): HTMLElement = js.native
  def insertLinkChipIntoBodyAtCursor(text: String, url: String, iconUrl: String): HTMLElement = js.native
  def insertLinkIntoBodyAtCursor(text: String, url: String): HTMLElement = js.native
  def insertTextIntoBodyAtCursor(text: String): Unit = js.native
  def isForward(): Boolean = js.native
  def isFullscreen(): Boolean = js.native
  def isInlineReplyForm(): Boolean = js.native
  def isMinimized(): Boolean = js.native
  def isReply(): Boolean = js.native
  @JSName("on")
  def on_bccContactAdded(name: bccContactAdded, cb: js.Function1[/* event */ Anon_Contact, Unit]): Unit = js.native
  @JSName("on")
  def on_bccContactRemoved(name: bccContactRemoved, cb: js.Function1[/* event */ Anon_Contact, Unit]): Unit = js.native
  @JSName("on")
  def on_bodyChanged(name: bodyChanged, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_ccContactAdded(name: ccContactAdded, cb: js.Function1[/* event */ Anon_Contact, Unit]): Unit = js.native
  @JSName("on")
  def on_ccContactRemoved(name: ccContactRemoved, cb: js.Function1[/* event */ Anon_Contact, Unit]): Unit = js.native
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function1[/* event */ Anon_ClosedByInboxSDK, Unit]): Unit = js.native
  @JSName("on")
  def on_discard(name: discard, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_fromContactChanged(name: fromContactChanged, cb: js.Function1[/* event */ Anon_Contact, Unit]): Unit = js.native
  @JSName("on")
  def on_fullscreenChanged(name: fullscreenChanged, cb: js.Function1[/* event */ Anon_Fullscreen, Unit]): Unit = js.native
  @JSName("on")
  def on_minimized(name: minimized, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_presending(name: presending, cb: js.Function1[/* event */ Anon_Cancel, Unit]): Unit = js.native
  @JSName("on")
  def on_recipientsChanged(name: recipientsChanged, cb: js.Function1[/* event */ RecipientsChangedEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_responseTypeChanged(name: responseTypeChanged, cb: js.Function1[/* event */ Anon_IsForward, Unit]): Unit = js.native
  @JSName("on")
  def on_restored(name: restored, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_sendCanceled(name: sendCanceled, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_sending(name: sending, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_sent(name: sent, cb: js.Function1[/* event */ Anon_GetMessageID, Unit]): Unit = js.native
  @JSName("on")
  def on_toContactAdded(name: toContactAdded, cb: js.Function1[/* event */ Anon_Contact, Unit]): Unit = js.native
  @JSName("on")
  def on_toContactRemoved(name: toContactRemoved, cb: js.Function1[/* event */ Anon_Contact, Unit]): Unit = js.native
  def popOut(): js.Promise[ComposeView] = js.native
  def send(): Unit = js.native
  def send(options: SendOptions): Unit = js.native
  def setBccRecipients(emails: js.Array[String]): Unit = js.native
  def setBodyHTML(html: String): Unit = js.native
  def setBodyText(text: String): Unit = js.native
  def setCcRecipients(emails: js.Array[String]): Unit = js.native
  def setFromEmail(email: String): Unit = js.native
  def setFullscreen(minimized: Boolean): Unit = js.native
  def setMinimized(minimized: Boolean): Unit = js.native
  def setSubject(text: String): Unit = js.native
  def setTitleBarColor(color: String): js.Function0[Unit] = js.native
  def setToRecipients(emails: js.Array[String]): Unit = js.native
}

