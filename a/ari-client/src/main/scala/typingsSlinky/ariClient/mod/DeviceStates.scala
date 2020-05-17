package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.anon.DeviceName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceStates extends js.Object {
  def delete(params: DeviceName): js.Promise[Unit] = js.native
  def delete(params: DeviceName, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def get(params: DeviceName): js.Promise[DeviceState] = js.native
  def get(
    params: DeviceName,
    callback: js.Function2[/* err */ js.Error, /* devicestate */ DeviceState, Unit]
  ): Unit = js.native
  def list(): js.Promise[js.Array[DeviceState]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ js.Error, /* devicestates */ js.Array[DeviceState], Unit]): Unit = js.native
  def update(params: typingsSlinky.ariClient.anon.DeviceState): js.Promise[Unit] = js.native
  def update(params: typingsSlinky.ariClient.anon.DeviceState, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

