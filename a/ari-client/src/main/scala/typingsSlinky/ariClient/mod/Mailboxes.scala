package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.anon.MailboxName
import typingsSlinky.ariClient.anon.NewMessages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mailboxes extends js.Object {
  def delete(params: MailboxName): js.Promise[Unit] = js.native
  def delete(params: MailboxName, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def get(params: MailboxName): js.Promise[Mailbox] = js.native
  def get(params: MailboxName, callback: js.Function2[/* err */ js.Error, /* mailbox */ Mailbox, Unit]): Unit = js.native
  def list(): js.Promise[js.Array[Mailbox]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ js.Error, /* mailboxs */ js.Array[Mailbox], Unit]): Unit = js.native
  def update(params: NewMessages): js.Promise[Unit] = js.native
  def update(params: NewMessages, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

