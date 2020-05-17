package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.anon.DeviceStateString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceState extends Resource {
  /* Properties */
  var name: String = js.native
  var state: String = js.native
  def delete(): js.Promise[Unit] = js.native
  def delete(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def get(): js.Promise[DeviceState] = js.native
  def get(callback: js.Function2[/* err */ js.Error, /* devicestate */ this.type, Unit]): Unit = js.native
  def list(): js.Promise[js.Array[DeviceState]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ js.Error, /* devicestates */ js.Array[this.type], Unit]): Unit = js.native
  def update(params: DeviceStateString): js.Promise[Unit] = js.native
  def update(params: DeviceStateString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

