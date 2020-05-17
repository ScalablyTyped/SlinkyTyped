package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.anon.ApplicationName
import typingsSlinky.ariClient.anon.EventSource
import typingsSlinky.ariClient.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Applications extends js.Object {
  def filter(params: Filter): js.Promise[Application] = js.native
  def filter(params: Filter, callback: js.Function2[/* err */ js.Error, /* application */ Application, Unit]): Unit = js.native
  def get(params: ApplicationName): js.Promise[Application] = js.native
  def get(
    params: ApplicationName,
    callback: js.Function2[/* err */ js.Error, /* application */ Application, Unit]
  ): Unit = js.native
  def list(): js.Promise[js.Array[Application]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ js.Error, /* applications */ js.Array[Application], Unit]): Unit = js.native
  def subscribe(params: EventSource): js.Promise[Application] = js.native
  def subscribe(
    params: EventSource,
    callback: js.Function2[/* err */ js.Error, /* application */ Application, Unit]
  ): Unit = js.native
  def unsubscribe(params: EventSource): js.Promise[Application] = js.native
  def unsubscribe(
    params: EventSource,
    callback: js.Function2[/* err */ js.Error, /* application */ Application, Unit]
  ): Unit = js.native
}

