package typingsSlinky.inboxsdk.inboxsdkMod.Widgets

import typingsSlinky.inboxsdk.inboxsdkMod.Common.PreAutoCloseEvent
import typingsSlinky.inboxsdk.inboxsdkMod.Compose.ComposeView
import typingsSlinky.inboxsdk.inboxsdkStrings.closing
import typingsSlinky.inboxsdk.inboxsdkStrings.destroy
import typingsSlinky.inboxsdk.inboxsdkStrings.preautoclose
import typingsSlinky.inboxsdk.inboxsdkStrings.slideAnimationDone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerView extends js.Object {
  var destroyed: Boolean = js.native
  def associateComposeView(composeView: ComposeView, closeWithCompose: Boolean): Unit = js.native
  def close(): Unit = js.native
  def disassociateComposeView(): Unit = js.native
  @JSName("on")
  def on_closing(name: closing, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_preautoclose(name: preautoclose, cb: js.Function1[/* event */ PreAutoCloseEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_slideAnimationDone(name: slideAnimationDone, cb: js.Function0[Unit]): Unit = js.native
}

