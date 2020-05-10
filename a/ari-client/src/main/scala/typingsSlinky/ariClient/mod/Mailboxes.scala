package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.AnonMailboxName
import typingsSlinky.ariClient.AnonNewMessages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mailboxes extends js.Object {
  def delete(params: AnonMailboxName): js.Promise[Unit] = js.native
  def delete(params: AnonMailboxName, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def get(params: AnonMailboxName): js.Promise[Mailbox] = js.native
  def get(params: AnonMailboxName, callback: js.Function2[/* err */ js.Error, /* mailbox */ Mailbox, Unit]): Unit = js.native
  def list(): js.Promise[js.Array[Mailbox]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ js.Error, /* mailboxs */ js.Array[Mailbox], Unit]): Unit = js.native
  def update(params: AnonNewMessages): js.Promise[Unit] = js.native
  def update(params: AnonNewMessages, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

