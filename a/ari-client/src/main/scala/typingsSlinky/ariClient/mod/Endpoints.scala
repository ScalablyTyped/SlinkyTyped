package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.anon.Body
import typingsSlinky.ariClient.anon.From
import typingsSlinky.ariClient.anon.Tech
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoints extends js.Object {
  def get(): js.Promise[Endpoint] = js.native
  def get(callback: js.Function2[/* err */ js.Error, /* endpoint */ Endpoint, Unit]): Unit = js.native
  def get(params: typingsSlinky.ariClient.anon.Resource): js.Promise[Endpoint] = js.native
  def get(
    params: typingsSlinky.ariClient.anon.Resource,
    callback: js.Function2[/* err */ js.Error, /* endpoint */ Endpoint, Unit]
  ): Unit = js.native
  def list(): js.Promise[js.Array[Endpoint]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ js.Error, /* endpoints */ js.Array[Endpoint], Unit]): Unit = js.native
  def listByTech(): js.Promise[js.Array[Endpoint]] = js.native
  def listByTech(callback: js.Function2[/* err */ js.Error, /* endpoints */ js.Array[Endpoint], Unit]): Unit = js.native
  def listByTech(params: Tech): js.Promise[js.Array[Endpoint]] = js.native
  def listByTech(params: Tech, callback: js.Function2[/* err */ js.Error, /* endpoints */ js.Array[Endpoint], Unit]): Unit = js.native
  def sendMessage(params: Body): js.Promise[Unit] = js.native
  def sendMessage(params: Body, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def sendMessageToEndpoint(params: From): js.Promise[Unit] = js.native
  def sendMessageToEndpoint(params: From, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

