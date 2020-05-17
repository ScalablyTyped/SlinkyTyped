package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.anon.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Events extends js.Object {
  def eventWebsocket(params: App): js.Promise[Message] = js.native
  /* Methods */
  def eventWebsocket(params: App, callback: js.Function2[/* err */ js.Error, /* message */ Message, Unit]): Unit = js.native
  def userEvent(params: typingsSlinky.ariClient.anon.Application): js.Promise[Unit] = js.native
  def userEvent(params: typingsSlinky.ariClient.anon.Application, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

