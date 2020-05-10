package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.AnonOldMessages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mailbox extends Resource {
  /* Properties */
  var name: String = js.native
  var new_messages: Double = js.native
  var old_messages: Double = js.native
  def delete(): js.Promise[Unit] = js.native
  def delete(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def get(): js.Promise[Mailbox] = js.native
  def get(callback: js.Function2[/* err */ js.Error, /* mailbox */ this.type, Unit]): Unit = js.native
  def list(): js.Promise[js.Array[Mailbox]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ js.Error, /* mailboxs */ js.Array[this.type], Unit]): Unit = js.native
  def update(params: AnonOldMessages): js.Promise[Unit] = js.native
  def update(params: AnonOldMessages, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

