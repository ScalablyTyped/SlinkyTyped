package typingsSlinky.reactRelay

import typingsSlinky.reactRelay.anon.Data
import typingsSlinky.reactRelay.anon.DataUnknown
import typingsSlinky.reactRelay.useRefetchableFragmentNodeMod.Options
import typingsSlinky.reactRelay.useRefetchableFragmentNodeMod.RefetchFnDynamic
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import typingsSlinky.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/lib/relay-experimental/useRefetchableFragment", JSImport.Namespace)
@js.native
object useRefetchableFragmentMod extends js.Object {
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: Data */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): ReturnType[TQuery, TKey] = js.native
  type Call[Fn /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  type NonNullableReturnType[T /* <: DataUnknown */] = js.Function1[
    /* arg */ T, 
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: T[' $data'] */ js.Any
    ]
  ]
  type NullableReturnType[T /* <: Data */] = js.Function1[
    /* arg */ T, 
    (/* import warning: importer.ImportType#apply Failed type conversion: T[' $data'] */ js.Any) | Null
  ]
  type ReturnType[TQuery /* <: OperationType */, TKey /* <: Data */] = js.Tuple2[
    Call[NonNullableReturnType[TKey] with NullableReturnType[TKey]], 
    RefetchFnDynamic[TQuery, TKey, Options]
  ]
}

