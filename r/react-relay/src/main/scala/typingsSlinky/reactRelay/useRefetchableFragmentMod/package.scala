package typingsSlinky.reactRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object useRefetchableFragmentMod {
  type Call[Fn /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  type KeyReturnType[T /* <: typingsSlinky.reactRelay.useRefetchableFragmentMod.KeyType */] = js.Function1[
    /* arg */ T, 
    typingsSlinky.std.NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: T[' $data'] */ js.Any
    ]
  ]
  type ReturnType[TQuery /* <: typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType */, TKey, TFragmentData] = js.Tuple2[
    TFragmentData, 
    typingsSlinky.reactRelay.useRefetchableFragmentNodeMod.RefetchFnDynamic[TQuery, TKey, typingsSlinky.reactRelay.useRefetchableFragmentNodeMod.Options]
  ]
}
