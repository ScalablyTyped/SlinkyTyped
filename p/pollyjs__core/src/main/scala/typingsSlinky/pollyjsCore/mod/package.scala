package typingsSlinky.pollyjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ErrorEventListener = js.Function3[
    /* req */ typingsSlinky.pollyjsCore.mod.Request, 
    /* error */ js.Any, 
    /* event */ typingsSlinky.pollyjsCore.mod.ListenerEvent, 
    scala.Unit | js.Promise[scala.Unit]
  ]
  type ErrorRouteEvent = typingsSlinky.pollyjsCore.pollyjsCoreStrings.error
  type Headers = typingsSlinky.std.Record[java.lang.String, java.lang.String | js.Array[java.lang.String]]
  type InterceptHandler = js.Function3[
    /* req */ typingsSlinky.pollyjsCore.mod.Request, 
    /* res */ typingsSlinky.pollyjsCore.mod.Response, 
    /* interceptor */ typingsSlinky.pollyjsCore.mod.Interceptor, 
    scala.Unit | js.Promise[scala.Unit]
  ]
  type MatchBy[T, R] = js.Function2[/* input */ T, /* req */ typingsSlinky.pollyjsCore.mod.Request, R]
  type PollyEventListener = js.Function1[/* poll */ typingsSlinky.pollyjsCore.mod.Polly, scala.Unit]
  type RecordingEventListener = js.Function3[
    /* req */ typingsSlinky.pollyjsCore.mod.Request, 
    /* recording */ js.Any, 
    /* event */ typingsSlinky.pollyjsCore.mod.ListenerEvent, 
    scala.Unit | js.Promise[scala.Unit]
  ]
  type RequestEventListener = js.Function2[
    /* req */ typingsSlinky.pollyjsCore.mod.Request, 
    /* event */ typingsSlinky.pollyjsCore.mod.ListenerEvent, 
    scala.Unit | js.Promise[scala.Unit]
  ]
  type RequestRouteEvent = typingsSlinky.pollyjsCore.pollyjsCoreStrings.request
  type ResponseEventListener = js.Function3[
    /* req */ typingsSlinky.pollyjsCore.mod.Request, 
    /* res */ typingsSlinky.pollyjsCore.mod.Response, 
    /* event */ typingsSlinky.pollyjsCore.mod.ListenerEvent, 
    scala.Unit | js.Promise[scala.Unit]
  ]
}
