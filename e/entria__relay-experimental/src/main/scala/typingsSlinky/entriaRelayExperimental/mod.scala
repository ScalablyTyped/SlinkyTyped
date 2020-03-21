package typingsSlinky.entriaRelayExperimental

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.entriaRelayExperimental.relayEnvironmentProviderMod.Props
import typingsSlinky.entriaRelayExperimental.useFragmentMod.NonNullableArrayFragmentReturn
import typingsSlinky.entriaRelayExperimental.useFragmentMod.NonNullableFragmentReturn
import typingsSlinky.entriaRelayExperimental.useFragmentMod.NullableArrayFragmentReturn
import typingsSlinky.entriaRelayExperimental.useFragmentMod.NullableFragmentReturn
import typingsSlinky.entriaRelayExperimental.useLegacyPaginationFragmentMod.ReturnTypePaginationFragment
import typingsSlinky.entriaRelayExperimental.useRefetchableFragmentMod.ReturnTypeRefetchableFragment
import typingsSlinky.relayRuntime.mod.Observable
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import typingsSlinky.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@entria/relay-experimental", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def RelayEnvironmentProvider(props: Props): ReactElement = js.native
  @JSName("fetchQuery")
  def fetchQuery_variables[TQuery /* <: OperationType */](
    environment: Environment,
    query: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ] = js.native
  @JSName("fetchQuery")
  def fetchQuery_variables[TQuery /* <: OperationType */](
    environment: Environment,
    query: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: AnonNetworkCacheConfig
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ] = js.native
  def useFragment[TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NullableFragmentReturn[TKey] = js.native
  @JSName("useFragment")
  def useFragment_TKey_ArrayStringDictionaryWildcard_NonNullableArrayFragmentReturn[TKey /* <: js.Array[StringDictionary[_]] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NonNullableArrayFragmentReturn[TKey] = js.native
  @JSName("useFragment")
  def useFragment_TKey_StringDictionaryAny_NonNullableFragmentReturn[TKey /* <: StringDictionary[js.Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NonNullableFragmentReturn[TKey] = js.native
  @JSName("useFragment")
  def useFragment_TKey_UnionArrayStringDictionaryWildcardNull_NullableArrayFragmentReturn[TKey /* <: js.Array[StringDictionary[_]] | Null */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NullableArrayFragmentReturn[TKey] = js.native
  def useLegacyPaginationFragment[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypePaginationFragment[
    TQuery, 
    TKey, 
    typingsSlinky.entriaRelayExperimental.useLegacyPaginationFragmentMod.NonNullableFragmentReturn[TKey] with typingsSlinky.entriaRelayExperimental.useLegacyPaginationFragmentMod.NullableFragmentReturn[TKey]
  ] = js.native
  def usePaginationFragment[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypePaginationFragment[
    TQuery, 
    TKey, 
    typingsSlinky.entriaRelayExperimental.useLegacyPaginationFragmentMod.NonNullableFragmentReturn[TKey] with typingsSlinky.entriaRelayExperimental.useLegacyPaginationFragmentMod.NullableFragmentReturn[TKey]
  ] = js.native
  def useQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  def useQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: Null, options: AnonFetchKey): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  @JSName("useQuery")
  def useQuery_variables[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  @JSName("useQuery")
  def useQuery_variables[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: AnonFetchKey
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): ReturnTypeRefetchableFragment[TQuery, TKey] = js.native
  def useRelayEnvironment(): Environment = js.native
}

