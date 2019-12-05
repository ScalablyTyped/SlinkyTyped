package typingsSlinky.relayDashRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libNetworkRelayNetworkTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import org.scalajs.dom.raw.Blob
  import org.scalajs.dom.raw.File
  import typingsSlinky.relayDashRuntime.libNetworkRelayObservableMod.ObservableFromValue
  import typingsSlinky.relayDashRuntime.libNetworkRelayObservableMod.RelayObservable
  import typingsSlinky.relayDashRuntime.libUtilRelayConcreteNodeMod.RequestParameters
  import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
  import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.Disposable
  import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables

  type ExecuteFunction = js.Function4[
    /* request */ RequestParameters, 
    /* variables */ Variables, 
    /* cacheConfig */ CacheConfig, 
    /* uploadables */ js.UndefOr[UploadableMap | Null], 
    RelayObservable[GraphQLResponse]
  ]
  type FetchFunction = js.Function4[
    /* request */ RequestParameters, 
    /* variables */ Variables, 
    /* cacheConfig */ CacheConfig, 
    /* uploadables */ js.UndefOr[UploadableMap | Null], 
    ObservableFromValue[GraphQLResponse]
  ]
  type LogRequestInfoFunction = js.Function1[/* arg */ js.Any, Unit]
  type PayloadData = StringDictionary[js.Any]
  type PayloadExtensions = StringDictionary[js.Any]
  type SubscribeFunction = js.Function4[
    /* request */ RequestParameters, 
    /* variables */ Variables, 
    /* cacheConfig */ CacheConfig, 
    /* observer */ js.UndefOr[LegacyObserver[GraphQLResponse]], 
    RelayObservable[GraphQLResponse] | Disposable
  ]
  type Uploadable = File | Blob
  type UploadableMap = StringDictionary[Uploadable]
}
