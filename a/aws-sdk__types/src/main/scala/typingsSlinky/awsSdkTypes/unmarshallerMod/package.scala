package typingsSlinky.awsSdkTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object unmarshallerMod {
  type ServiceExceptionParser = js.Function3[
    /* operation */ typingsSlinky.awsSdkTypes.protocolMod.OperationModel, 
    /* response */ typingsSlinky.awsSdkTypes.httpMod.ResolvedHttpResponse, 
    /* errorBodyParser */ typingsSlinky.awsSdkTypes.unmarshallerMod.BodyParser[java.lang.String], 
    typingsSlinky.awsSdkTypes.exceptionMod.ServiceException[js.Any]
  ]
  type StreamCollector[StreamType] = js.Function1[/* stream */ StreamType, js.Promise[scala.scalajs.js.typedarray.Uint8Array]]
}
