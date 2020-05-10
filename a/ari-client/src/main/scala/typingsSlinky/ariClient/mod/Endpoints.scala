package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.AnonBody
import typingsSlinky.ariClient.AnonFrom
import typingsSlinky.ariClient.AnonResource
import typingsSlinky.ariClient.AnonTech
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoints extends js.Object {
  def get(): js.Promise[Endpoint] = js.native
  def get(callback: js.Function2[/* err */ js.Error, /* endpoint */ Endpoint, Unit]): Unit = js.native
  def get(params: AnonResource): js.Promise[Endpoint] = js.native
  def get(params: AnonResource, callback: js.Function2[/* err */ js.Error, /* endpoint */ Endpoint, Unit]): Unit = js.native
  def list(): js.Promise[js.Array[Endpoint]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ js.Error, /* endpoints */ js.Array[Endpoint], Unit]): Unit = js.native
  def listByTech(): js.Promise[js.Array[Endpoint]] = js.native
  def listByTech(callback: js.Function2[/* err */ js.Error, /* endpoints */ js.Array[Endpoint], Unit]): Unit = js.native
  def listByTech(params: AnonTech): js.Promise[js.Array[Endpoint]] = js.native
  def listByTech(
    params: AnonTech,
    callback: js.Function2[/* err */ js.Error, /* endpoints */ js.Array[Endpoint], Unit]
  ): Unit = js.native
  def sendMessage(params: AnonBody): js.Promise[Unit] = js.native
  def sendMessage(params: AnonBody, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def sendMessageToEndpoint(params: AnonFrom): js.Promise[Unit] = js.native
  def sendMessageToEndpoint(params: AnonFrom, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

