package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NodeJS {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.node.Error

  type ArrayBufferView = TypedArray | scala.scalajs.js.typedarray.DataView
  type BeforeExitListener = js.Function1[/* code */ Double, Unit]
  type DisconnectListener = js.Function0[Unit]
  type ExitListener = js.Function1[/* code */ Double, Unit]
  type HRTime = js.Function1[/* time */ js.UndefOr[js.Tuple2[Double, Double]], js.Tuple2[Double, Double]]
  type MessageListener = js.Function2[/* message */ js.Any, /* sendHandle */ js.Any, Unit]
  type MultipleResolveListener = js.Function3[
    /* type */ MultipleResolveType, 
    /* promise */ js.Promise[js.Any], 
    /* value */ js.Any, 
    Unit
  ]
  type NewListenerListener = js.Function2[
    /* type */ java.lang.String | js.Symbol, 
    /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
    Unit
  ]
  // The value type here is a "poor man's `unknown`". When these types support TypeScript
  // 3.0+, we can replace this with `unknown`.
  type PoorMansUnknown = js.UndefOr[js.Object | Null]
  type ProcessEnv = StringDictionary[js.UndefOr[java.lang.String]]
  type RejectionHandledListener = js.Function1[/* promise */ js.Promise[js.Any], Unit]
  type RemoveListenerListener = js.Function2[
    /* type */ java.lang.String | js.Symbol, 
    /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
    Unit
  ]
  type SignalsListener = js.Function1[/* signal */ Signals, Unit]
  type TypedArray = scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Uint32Array | scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array
  type UncaughtExceptionListener = js.Function1[/* error */ Error, Unit]
  type UnhandledRejectionListener = js.Function2[/* reason */ js.UndefOr[js.Object | Null], /* promise */ js.Promise[js.Any], Unit]
  type WarningListener = js.Function1[/* warning */ Error, Unit]
}
