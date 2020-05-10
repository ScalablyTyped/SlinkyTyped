package typingsSlinky.chrome

import typingsSlinky.chrome.chrome.serial.ConnectionInfo
import typingsSlinky.chrome.chrome.serial.ConnectionOptions
import typingsSlinky.chrome.chrome.serial.DeviceInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofserial extends js.Object {
  val DataBits: AnonEIGHT = js.native
  val ParityBit: AnonEVEN = js.native
  val StopBits: AnonONE = js.native
  val onReceive: TypeofonReceive = js.native
  val onReceiveError: TypeofonReceiveError = js.native
  def clearBreak(connectionId: Double, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  def connect(
    path: String,
    options: ConnectionOptions,
    callback: js.Function1[/* connectionInfo */ ConnectionInfo, Unit]
  ): Unit = js.native
  def disconnect(connectionId: Double, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  def flush(connectionId: Double, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  def getConnections(callback: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit]): Unit = js.native
  def getControlSignals(connectionId: Double, callback: js.Function1[/* signals */ js.Object, Unit]): Unit = js.native
  def getDevices(callback: js.Function1[/* ports */ js.Array[DeviceInfo], Unit]): Unit = js.native
  def getInfo(callback: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit]): Unit = js.native
  def send(
    connectionId: Double,
    data: js.typedarray.ArrayBuffer,
    callback: js.Function1[/* sendInfo */ js.Object, Unit]
  ): Unit = js.native
  def setBreak(connectionId: Double, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  def setControlSignals(connectionId: Double, signals: js.Object, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  def setPaused(connectionId: Double, paused: Boolean, callback: js.Function0[Unit]): Unit = js.native
  def update(
    connectionId: Double,
    options: ConnectionOptions,
    callback: js.Function1[/* result */ Boolean, Unit]
  ): Unit = js.native
}

object Typeofserial {
  @scala.inline
  def apply(
    DataBits: AnonEIGHT,
    ParityBit: AnonEVEN,
    StopBits: AnonONE,
    clearBreak: (Double, js.Function1[/* result */ Boolean, Unit]) => Unit,
    connect: (String, ConnectionOptions, js.Function1[/* connectionInfo */ ConnectionInfo, Unit]) => Unit,
    disconnect: (Double, js.Function1[/* result */ Boolean, Unit]) => Unit,
    flush: (Double, js.Function1[/* result */ Boolean, Unit]) => Unit,
    getConnections: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit] => Unit,
    getControlSignals: (Double, js.Function1[/* signals */ js.Object, Unit]) => Unit,
    getDevices: js.Function1[/* ports */ js.Array[DeviceInfo], Unit] => Unit,
    getInfo: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit] => Unit,
    onReceive: TypeofonReceive,
    onReceiveError: TypeofonReceiveError,
    send: (Double, js.typedarray.ArrayBuffer, js.Function1[/* sendInfo */ js.Object, Unit]) => Unit,
    setBreak: (Double, js.Function1[/* result */ Boolean, Unit]) => Unit,
    setControlSignals: (Double, js.Object, js.Function1[/* result */ Boolean, Unit]) => Unit,
    setPaused: (Double, Boolean, js.Function0[Unit]) => Unit,
    update: (Double, ConnectionOptions, js.Function1[/* result */ Boolean, Unit]) => Unit
  ): Typeofserial = {
    val __obj = js.Dynamic.literal(DataBits = DataBits.asInstanceOf[js.Any], ParityBit = ParityBit.asInstanceOf[js.Any], StopBits = StopBits.asInstanceOf[js.Any], clearBreak = js.Any.fromFunction2(clearBreak), connect = js.Any.fromFunction3(connect), disconnect = js.Any.fromFunction2(disconnect), flush = js.Any.fromFunction2(flush), getConnections = js.Any.fromFunction1(getConnections), getControlSignals = js.Any.fromFunction2(getControlSignals), getDevices = js.Any.fromFunction1(getDevices), getInfo = js.Any.fromFunction1(getInfo), onReceive = onReceive.asInstanceOf[js.Any], onReceiveError = onReceiveError.asInstanceOf[js.Any], send = js.Any.fromFunction3(send), setBreak = js.Any.fromFunction2(setBreak), setControlSignals = js.Any.fromFunction3(setControlSignals), setPaused = js.Any.fromFunction3(setPaused), update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[Typeofserial]
  }
  @scala.inline
  implicit class TypeofserialOps[Self <: Typeofserial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataBits(value: AnonEIGHT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParityBit(value: AnonEVEN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParityBit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStopBits(value: AnonONE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StopBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearBreak(value: (Double, js.Function1[/* result */ Boolean, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearBreak")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withConnect(
      value: (String, ConnectionOptions, js.Function1[/* connectionInfo */ ConnectionInfo, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDisconnect(value: (Double, js.Function1[/* result */ Boolean, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFlush(value: (Double, js.Function1[/* result */ Boolean, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetConnections(value: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConnections")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetControlSignals(value: (Double, js.Function1[/* signals */ js.Object, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getControlSignals")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDevices(value: js.Function1[/* ports */ js.Array[DeviceInfo], Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDevices")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetInfo(value: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnReceive(value: TypeofonReceive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReceive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnReceiveError(value: TypeofonReceiveError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReceiveError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSend(value: (Double, js.typedarray.ArrayBuffer, js.Function1[/* sendInfo */ js.Object, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetBreak(value: (Double, js.Function1[/* result */ Boolean, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBreak")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetControlSignals(value: (Double, js.Object, js.Function1[/* result */ Boolean, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setControlSignals")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetPaused(value: (Double, Boolean, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPaused")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (Double, ConnectionOptions, js.Function1[/* result */ Boolean, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

