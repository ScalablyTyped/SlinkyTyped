package typingsSlinky.atEntriaRelayDashExperimental

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atEntriaRelayDashExperimental.libRelayEnvironmentProviderMod.Props
import typingsSlinky.atEntriaRelayDashExperimental.libUseFragmentMod.NonNullableArrayFragmentReturn
import typingsSlinky.atEntriaRelayDashExperimental.libUseFragmentMod.NonNullableFragmentReturn
import typingsSlinky.atEntriaRelayDashExperimental.libUseFragmentMod.NullableArrayFragmentReturn
import typingsSlinky.atEntriaRelayDashExperimental.libUseFragmentMod.NullableFragmentReturn
import typingsSlinky.atEntriaRelayDashExperimental.libUseLegacyPaginationFragmentMod.ReturnTypePaginationFragment
import typingsSlinky.atEntriaRelayDashExperimental.libUseRefetchableFragmentMod.ReturnTypeRefetchableFragment
import typingsSlinky.react.reactMod._Global_.JSX.Element
import typingsSlinky.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.Environment
import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
import typingsSlinky.relayDashRuntime.relayDashRuntimeMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@entria/relay-experimental", JSImport.Namespace)
@js.native
object atEntriaRelayDashExperimentalMod extends js.Object {
  def RelayEnvironmentProvider(props: Props): Element = js.native
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
    options: Anon_NetworkCacheConfig
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ] = js.native
  def useFragment(fragmentInput: GraphQLTaggedNode): NullableArrayFragmentReturn[Null] = js.native
  def useFragment(fragmentInput: GraphQLTaggedNode, fragmentRef: js.Array[StringDictionary[_]]): NullableArrayFragmentReturn[js.Array[StringDictionary[_]]] = js.native
  def useFragment[TKey /* <: StringDictionary[js.Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NonNullableFragmentReturn[TKey] = js.native
  @JSName("useFragment")
  def useFragment_TKey_ArrayStringDictionaryWildcard_NonNullableArrayFragmentReturn[TKey /* <: js.Array[StringDictionary[_]] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NonNullableArrayFragmentReturn[TKey] = js.native
  @JSName("useFragment")
  def useFragment_TKey_UnionStringDictionaryAnyNull_NullableFragmentReturn[TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NullableFragmentReturn[TKey] = js.native
  def useLegacyPaginationFragment[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypePaginationFragment[
    TQuery, 
    TKey, 
    typingsSlinky.atEntriaRelayDashExperimental.libUseLegacyPaginationFragmentMod.NonNullableFragmentReturn[TKey] with typingsSlinky.atEntriaRelayDashExperimental.libUseLegacyPaginationFragmentMod.NullableFragmentReturn[TKey]
  ] = js.native
  def usePaginationFragment[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypePaginationFragment[
    TQuery, 
    TKey, 
    typingsSlinky.atEntriaRelayDashExperimental.libUseLegacyPaginationFragmentMod.NonNullableFragmentReturn[TKey] with typingsSlinky.atEntriaRelayDashExperimental.libUseLegacyPaginationFragmentMod.NullableFragmentReturn[TKey]
  ] = js.native
  def useQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  def useQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: Null, options: Anon_FetchKey): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  @JSName("useQuery")
  def useQuery_variables[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  @JSName("useQuery")
  def useQuery_variables[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: Anon_FetchKey
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): ReturnTypeRefetchableFragment[TQuery, TKey] = js.native
  def useRelayEnvironment(): Environment = js.native
}

