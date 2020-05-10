package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.AnonApp
import typingsSlinky.ariClient.AnonApplication
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Events extends js.Object {
  def eventWebsocket(params: AnonApp): js.Promise[Message] = js.native
  /* Methods */
  def eventWebsocket(params: AnonApp, callback: js.Function2[/* err */ js.Error, /* message */ Message, Unit]): Unit = js.native
  def userEvent(params: AnonApplication): js.Promise[Unit] = js.native
  def userEvent(params: AnonApplication, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

