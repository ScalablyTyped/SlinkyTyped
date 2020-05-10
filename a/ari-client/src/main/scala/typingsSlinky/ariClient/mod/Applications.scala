package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.AnonApplicationName
import typingsSlinky.ariClient.AnonEventSource
import typingsSlinky.ariClient.AnonFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Applications extends js.Object {
  def filter(params: AnonFilter): js.Promise[Application] = js.native
  def filter(
    params: AnonFilter,
    callback: js.Function2[/* err */ js.Error, /* application */ Application, Unit]
  ): Unit = js.native
  def get(params: AnonApplicationName): js.Promise[Application] = js.native
  def get(
    params: AnonApplicationName,
    callback: js.Function2[/* err */ js.Error, /* application */ Application, Unit]
  ): Unit = js.native
  def list(): js.Promise[js.Array[Application]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ js.Error, /* applications */ js.Array[Application], Unit]): Unit = js.native
  def subscribe(params: AnonEventSource): js.Promise[Application] = js.native
  def subscribe(
    params: AnonEventSource,
    callback: js.Function2[/* err */ js.Error, /* application */ Application, Unit]
  ): Unit = js.native
  def unsubscribe(params: AnonEventSource): js.Promise[Application] = js.native
  def unsubscribe(
    params: AnonEventSource,
    callback: js.Function2[/* err */ js.Error, /* application */ Application, Unit]
  ): Unit = js.native
}

