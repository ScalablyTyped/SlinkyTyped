package typingsSlinky.entriaRelayExperimental

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.entriaRelayExperimental.useRefetchableFragmentNodeMod.Options
import typingsSlinky.entriaRelayExperimental.useRefetchableFragmentNodeMod.RefetchFnDynamic
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@entria/relay-experimental/lib/useRefetchableFragment", JSImport.Namespace)
@js.native
object useRefetchableFragmentMod extends js.Object {
  
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): ReturnTypeRefetchableFragment[TQuery, TKey] = js.native
  
  type NonNullableFragmentReturn[TReturn] = ReturnType[NonNullableReturn[TReturn]]
  
  type NonNullableReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[TFragmentData], TFragmentData]
  
  type NullableFragmentReturn[TReturn] = ReturnType[NullableReturn[TReturn]]
  
  type NullableReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[TFragmentData | Null], TFragmentData | Null]
  
  type ReturnTypeRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */] = js.Tuple2[
    (// NOTE: This ReturnType ensures that the type of the returned data is either:
  //   - nullable if the provided ref type is nullable
  //   - non-nullable if the provided ref type is non-nullable
  NonNullableFragmentReturn[TKey]) with NullableFragmentReturn[TKey], 
    RefetchFnDynamic[TQuery, TKey, Options]
  ]
}
