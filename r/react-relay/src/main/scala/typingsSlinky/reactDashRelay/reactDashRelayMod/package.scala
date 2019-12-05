package typingsSlinky.reactDashRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashRelayMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.reactDashRelay.Anon_CacheConfig
  import typingsSlinky.reactDashRelay.Anon_ComponentRef
  import typingsSlinky.reactDashRelay.reactDashRelayStrings.relay
  import typingsSlinky.relayDashRuntime.libNetworkRelayObservableMod.Observer
  import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
  import typingsSlinky.relayDashRuntime.relayDashRuntimeMod._FragmentRefs
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type Container[Props] = ReactComponentClass[ContainerProps[Props] with Anon_ComponentRef]
  type ContainerProps[Props] = MappedFragmentProps[Pick[Props, Exclude[String, relay]]]
  type FragmentOrRegularProp[T] = T | js.Array[_FragmentRefs[js.Any]] | _FragmentRefs[js.Any]
  type MappedFragmentProps[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: react-relay.react-relay.FragmentOrRegularProp<T[K]>}
    */ typingsSlinky.reactDashRelay.reactDashRelayStrings.MappedFragmentProps with T
  type ObserverOrCallback = Observer[Unit] | (js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit])
  type ReactRelayLocalQueryRenderer[TOperation /* <: OperationType */] = ReactComponentClass[QueryRendererProps[TOperation]]
  type ReactRelayQueryRenderer[TOperation /* <: OperationType */] = ReactComponentClass[Anon_CacheConfig with QueryRendererProps[TOperation]]
}
