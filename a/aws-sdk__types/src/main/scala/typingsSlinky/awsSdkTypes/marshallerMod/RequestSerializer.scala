package typingsSlinky.awsSdkTypes.marshallerMod

import typingsSlinky.awsSdkTypes.httpMod.HttpRequest
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestSerializer[StreamType] extends js.Object {
  /**
    * Converts the provided `input` into an HTTP request
    *
    * @param operation The operation to be executed via the returned HTTP
    *                  request.
    * @param input     The user input to serialize.
    */
  def serialize(operation: OperationModel, input: js.Any): HttpRequest[StreamType] = js.native
}

object RequestSerializer {
  @scala.inline
  def apply[StreamType](serialize: (OperationModel, js.Any) => HttpRequest[StreamType]): RequestSerializer[StreamType] = {
    val __obj = js.Dynamic.literal(serialize = js.Any.fromFunction2(serialize))
    __obj.asInstanceOf[RequestSerializer[StreamType]]
  }
  @scala.inline
  implicit class RequestSerializerOps[Self[streamtype] <: RequestSerializer[streamtype], StreamType] (val x: Self[StreamType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[StreamType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[StreamType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[StreamType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[StreamType] with Other]
    @scala.inline
    def withSerialize(value: (OperationModel, js.Any) => HttpRequest[StreamType]): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

