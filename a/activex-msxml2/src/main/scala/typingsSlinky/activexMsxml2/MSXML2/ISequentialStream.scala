package typingsSlinky.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISequentialStream extends js.Object {
  @JSName("MSXML2.ISequentialStream_typekey")
  var MSXML2DotISequentialStream_typekey: ISequentialStream = js.native
  def RemoteRead(pv: Double, cb: Double, pcbRead: Double): Unit = js.native
  def RemoteWrite(pv: Double, cb: Double, pcbWritten: Double): Unit = js.native
}

object ISequentialStream {
  @scala.inline
  def apply(
    MSXML2DotISequentialStream_typekey: ISequentialStream,
    RemoteRead: (Double, Double, Double) => Unit,
    RemoteWrite: (Double, Double, Double) => Unit
  ): ISequentialStream = {
    val __obj = js.Dynamic.literal(RemoteRead = js.Any.fromFunction3(RemoteRead), RemoteWrite = js.Any.fromFunction3(RemoteWrite))
    __obj.updateDynamic("MSXML2.ISequentialStream_typekey")(MSXML2DotISequentialStream_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISequentialStream]
  }
  @scala.inline
  implicit class ISequentialStreamOps[Self <: ISequentialStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSXML2DotISequentialStream_typekey(value: ISequentialStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSXML2.ISequentialStream_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteRead(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoteRead")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRemoteWrite(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoteWrite")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

