package typingsSlinky.awsSdkTypes.unmarshallerMod

import typingsSlinky.awsSdkTypes.httpMod.HttpResponse
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseParser[StreamType] extends js.Object {
  /**
    * Converts the output of an operation into JavaScript types.
    *
    * @param operation The operation model describing the structure of the HTTP
    *                  response received
    * @param input     The HTTP response received from the service
    */
  def parse[OutputType /* <: MetadataBearer */](operation: OperationModel, input: HttpResponse[StreamType]): js.Promise[OutputType] = js.native
}

object ResponseParser {
  @scala.inline
  def apply[StreamType](parse: (OperationModel, HttpResponse[StreamType]) => js.Promise[js.Any]): ResponseParser[StreamType] = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction2(parse))
    __obj.asInstanceOf[ResponseParser[StreamType]]
  }
  @scala.inline
  implicit class ResponseParserOps[Self[streamtype] <: ResponseParser[streamtype], StreamType] (val x: Self[StreamType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[StreamType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[StreamType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[StreamType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[StreamType] with Other]
    @scala.inline
    def withParse(value: (OperationModel, HttpResponse[StreamType]) => js.Promise[js.Any]): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

