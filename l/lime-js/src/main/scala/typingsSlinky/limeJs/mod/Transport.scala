package typingsSlinky.limeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transport extends ITransportStateListener {
  var compression: String = js.native
  var encryption: String = js.native
  def close(): Unit = js.native
  def getSupportedCompression(): js.Array[String] = js.native
  def getSupportedEncryption(): js.Array[String] = js.native
  def onEnvelope(envelope: Envelope): js.Any = js.native
  def open(uri: String): Unit = js.native
  def send(envelope: Envelope): Unit = js.native
  def setCompression(compression: String): Unit = js.native
  def setEncryption(encryption: String): Unit = js.native
}

object Transport {
  @scala.inline
  def apply(
    close: () => Unit,
    compression: String,
    encryption: String,
    getSupportedCompression: () => js.Array[String],
    getSupportedEncryption: () => js.Array[String],
    onClose: () => Unit,
    onEnvelope: Envelope => js.Any,
    onError: String => Unit,
    onOpen: () => Unit,
    open: String => Unit,
    send: Envelope => Unit,
    setCompression: String => Unit,
    setEncryption: String => Unit
  ): Transport = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), compression = compression.asInstanceOf[js.Any], encryption = encryption.asInstanceOf[js.Any], getSupportedCompression = js.Any.fromFunction0(getSupportedCompression), getSupportedEncryption = js.Any.fromFunction0(getSupportedEncryption), onClose = js.Any.fromFunction0(onClose), onEnvelope = js.Any.fromFunction1(onEnvelope), onError = js.Any.fromFunction1(onError), onOpen = js.Any.fromFunction0(onOpen), open = js.Any.fromFunction1(open), send = js.Any.fromFunction1(send), setCompression = js.Any.fromFunction1(setCompression), setEncryption = js.Any.fromFunction1(setEncryption))
    __obj.asInstanceOf[Transport]
  }
  @scala.inline
  implicit class TransportOps[Self <: Transport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCompression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetSupportedCompression(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSupportedCompression")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSupportedEncryption(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSupportedEncryption")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnEnvelope(value: Envelope => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnvelope")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpen(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSend(value: Envelope => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetCompression(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCompression")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetEncryption(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEncryption")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

