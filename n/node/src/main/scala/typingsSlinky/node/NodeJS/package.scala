package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NodeJS {
  type ArrayBufferView = typingsSlinky.node.NodeJS.TypedArray | js.typedarray.DataView
  type BeforeExitListener = js.Function1[/* code */ scala.Double, scala.Unit]
  type Dict[T] = org.scalablytyped.runtime.StringDictionary[js.UndefOr[T]]
  type DisconnectListener = js.Function0[scala.Unit]
  type ExitListener = js.Function1[/* code */ scala.Double, scala.Unit]
  type HRTime = js.Function1[
    /* time */ js.UndefOr[js.Tuple2[scala.Double, scala.Double]], 
    js.Tuple2[scala.Double, scala.Double]
  ]
  type MessageListener = js.Function2[/* message */ js.Any, /* sendHandle */ js.Any, scala.Unit]
  type MultipleResolveListener = js.Function3[
    /* type */ typingsSlinky.node.NodeJS.MultipleResolveType, 
    /* promise */ js.Promise[js.Any], 
    /* value */ js.Any, 
    scala.Unit
  ]
  type NewListenerListener = js.Function2[
    /* type */ java.lang.String | js.Symbol, 
    /* listener */ js.Function1[/* repeated */ js.Any, scala.Unit], 
    scala.Unit
  ]
  // Alias for compatibility
  type ProcessEnv = typingsSlinky.node.NodeJS.Dict[java.lang.String]
  type ReadOnlyDict[T] = org.scalablytyped.runtime.StringDictionary[js.UndefOr[T]]
  type RejectionHandledListener = js.Function1[/* promise */ js.Promise[js.Any], scala.Unit]
  type RemoveListenerListener = js.Function2[
    /* type */ java.lang.String | js.Symbol, 
    /* listener */ js.Function1[/* repeated */ js.Any, scala.Unit], 
    scala.Unit
  ]
  type SignalsListener = js.Function1[/* signal */ typingsSlinky.node.NodeJS.Signals, scala.Unit]
  type TypedArray = js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
  type UncaughtExceptionListener = js.Function1[/* error */ js.Error, scala.Unit]
  type UnhandledRejectionListener = js.Function2[
    /* reason */ js.UndefOr[js.Object | scala.Null], 
    /* promise */ js.Promise[js.Any], 
    scala.Unit
  ]
  type WarningListener = js.Function1[/* warning */ js.Error, scala.Unit]
}
