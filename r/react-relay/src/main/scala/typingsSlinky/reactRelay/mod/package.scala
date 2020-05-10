package typingsSlinky.reactRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Container[Props] = slinky.core.ReactComponentClass[
    typingsSlinky.reactRelay.mod.ContainerProps[Props] with typingsSlinky.reactRelay.AnonComponentRef
  ]
  type ContainerProps[Props] = typingsSlinky.reactRelay.mod.MappedFragmentProps[
    typingsSlinky.std.Pick[
      Props, 
      typingsSlinky.std.Exclude[
        /* keyof Props */ java.lang.String, 
        typingsSlinky.reactRelay.reactRelayStrings.relay
      ]
    ]
  ]
  type FragmentOrRegularProp[T] = T | js.Array[typingsSlinky.relayRuntime.mod._FragmentRefs[js.Any]] | typingsSlinky.relayRuntime.mod._FragmentRefs[js.Any]
  type MappedFragmentProps[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: react-relay.react-relay.FragmentOrRegularProp<T[K]>}
    */ typingsSlinky.reactRelay.reactRelayStrings.MappedFragmentProps with org.scalablytyped.runtime.TopLevel[T]
  type ObserverOrCallback = typingsSlinky.relayRuntime.relayObservableMod.Observer[scala.Unit] | (js.Function1[/* error */ js.UndefOr[js.Error | scala.Null], scala.Unit])
  type ReactRelayLocalQueryRenderer[TOperation /* <: typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType */] = slinky.core.ReactComponentClass[typingsSlinky.reactRelay.mod.QueryRendererProps[TOperation]]
  type ReactRelayQueryRenderer[TOperation /* <: typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType */] = slinky.core.ReactComponentClass[
    typingsSlinky.reactRelay.AnonCacheConfig with typingsSlinky.reactRelay.mod.QueryRendererProps[TOperation]
  ]
}
