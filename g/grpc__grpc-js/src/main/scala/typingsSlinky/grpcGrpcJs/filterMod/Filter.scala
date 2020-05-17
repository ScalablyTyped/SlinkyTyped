package typingsSlinky.grpcGrpcJs.filterMod

import typingsSlinky.grpcGrpcJs.callStreamMod.StatusObject
import typingsSlinky.grpcGrpcJs.callStreamMod.WriteObject
import typingsSlinky.grpcGrpcJs.metadataMod.Metadata
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  def receiveMessage(message: js.Promise[Buffer]): js.Promise[Buffer] = js.native
  def receiveMetadata(metadata: js.Promise[Metadata]): js.Promise[Metadata] = js.native
  def receiveTrailers(status: js.Promise[StatusObject]): js.Promise[StatusObject] = js.native
  def sendMessage(message: js.Promise[WriteObject]): js.Promise[WriteObject] = js.native
  def sendMetadata(metadata: js.Promise[Metadata]): js.Promise[Metadata] = js.native
}

object Filter {
  @scala.inline
  def apply(
    receiveMessage: js.Promise[Buffer] => js.Promise[Buffer],
    receiveMetadata: js.Promise[Metadata] => js.Promise[Metadata],
    receiveTrailers: js.Promise[StatusObject] => js.Promise[StatusObject],
    sendMessage: js.Promise[WriteObject] => js.Promise[WriteObject],
    sendMetadata: js.Promise[Metadata] => js.Promise[Metadata]
  ): Filter = {
    val __obj = js.Dynamic.literal(receiveMessage = js.Any.fromFunction1(receiveMessage), receiveMetadata = js.Any.fromFunction1(receiveMetadata), receiveTrailers = js.Any.fromFunction1(receiveTrailers), sendMessage = js.Any.fromFunction1(sendMessage), sendMetadata = js.Any.fromFunction1(sendMetadata))
    __obj.asInstanceOf[Filter]
  }
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReceiveMessage(value: js.Promise[Buffer] => js.Promise[Buffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiveMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReceiveMetadata(value: js.Promise[Metadata] => js.Promise[Metadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiveMetadata")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReceiveTrailers(value: js.Promise[StatusObject] => js.Promise[StatusObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiveTrailers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSendMessage(value: js.Promise[WriteObject] => js.Promise[WriteObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSendMetadata(value: js.Promise[Metadata] => js.Promise[Metadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendMetadata")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

