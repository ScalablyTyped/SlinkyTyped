package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.AnonBody
import typingsSlinky.ariClient.AnonVariables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoint extends Resource {
  var channel_ids: String | js.Array[String] = js.native
  var resource: String = js.native
  var state: js.UndefOr[String] = js.native
  /* Properties */
  var technology: String = js.native
  def get(): js.Promise[Endpoint] = js.native
  def get(callback: js.Function2[/* err */ js.Error, /* endpoint */ this.type, Unit]): Unit = js.native
  def list(): js.Promise[js.Array[Endpoint]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ js.Error, /* endpoints */ js.Array[this.type], Unit]): Unit = js.native
  def listByTech(): js.Promise[js.Array[Endpoint]] = js.native
  def listByTech(callback: js.Function2[/* err */ js.Error, /* endpoints */ js.Array[this.type], Unit]): Unit = js.native
  def sendMessage(params: AnonBody): js.Promise[Unit] = js.native
  def sendMessage(params: AnonBody, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def sendMessageToEndpoint(params: AnonVariables): js.Promise[Unit] = js.native
  def sendMessageToEndpoint(params: AnonVariables, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

