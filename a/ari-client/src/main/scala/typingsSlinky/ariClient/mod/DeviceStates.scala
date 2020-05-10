package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.AnonDeviceName
import typingsSlinky.ariClient.AnonDeviceState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceStates extends js.Object {
  def delete(params: AnonDeviceName): js.Promise[Unit] = js.native
  def delete(params: AnonDeviceName, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def get(params: AnonDeviceName): js.Promise[DeviceState] = js.native
  def get(
    params: AnonDeviceName,
    callback: js.Function2[/* err */ js.Error, /* devicestate */ DeviceState, Unit]
  ): Unit = js.native
  def list(): js.Promise[js.Array[DeviceState]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ js.Error, /* devicestates */ js.Array[DeviceState], Unit]): Unit = js.native
  def update(params: AnonDeviceState): js.Promise[Unit] = js.native
  def update(params: AnonDeviceState, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

