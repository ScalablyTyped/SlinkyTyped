package typingsSlinky.atAwsDashSdkTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildUnmarshallerMod {
  import typingsSlinky.atAwsDashSdkTypes.buildExceptionMod.ServiceException
  import typingsSlinky.atAwsDashSdkTypes.buildHttpMod.ResolvedHttpResponse
  import typingsSlinky.atAwsDashSdkTypes.buildProtocolMod.OperationModel

  type ServiceExceptionParser = js.Function3[
    /* operation */ OperationModel, 
    /* response */ ResolvedHttpResponse, 
    /* errorBodyParser */ BodyParser[String], 
    ServiceException[js.Any]
  ]
  type StreamCollector[StreamType] = js.Function1[/* stream */ StreamType, js.Promise[scala.scalajs.js.typedarray.Uint8Array]]
}
