package typingsSlinky.relayRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object relayNetworkTypesMod {
  type ExecuteFunction = js.Function4[
    /* request */ typingsSlinky.relayRuntime.relayConcreteNodeMod.RequestParameters, 
    /* variables */ typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables, 
    /* cacheConfig */ typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig, 
    /* uploadables */ js.UndefOr[typingsSlinky.relayRuntime.relayNetworkTypesMod.UploadableMap | scala.Null], 
    typingsSlinky.relayRuntime.relayObservableMod.RelayObservable[typingsSlinky.relayRuntime.relayNetworkTypesMod.GraphQLResponse]
  ]
  type FetchFunction = js.Function4[
    /* request */ typingsSlinky.relayRuntime.relayConcreteNodeMod.RequestParameters, 
    /* variables */ typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables, 
    /* cacheConfig */ typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig, 
    /* uploadables */ js.UndefOr[typingsSlinky.relayRuntime.relayNetworkTypesMod.UploadableMap | scala.Null], 
    typingsSlinky.relayRuntime.relayObservableMod.ObservableFromValue[typingsSlinky.relayRuntime.relayNetworkTypesMod.GraphQLResponse]
  ]
  type LogRequestInfoFunction = js.Function1[/* arg */ js.Any, scala.Unit]
  type PayloadData = org.scalablytyped.runtime.StringDictionary[js.Any]
  type PayloadExtensions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type SubscribeFunction = js.Function4[
    /* request */ typingsSlinky.relayRuntime.relayConcreteNodeMod.RequestParameters, 
    /* variables */ typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables, 
    /* cacheConfig */ typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig, 
    /* observer */ js.UndefOr[
      typingsSlinky.relayRuntime.relayNetworkTypesMod.LegacyObserver[typingsSlinky.relayRuntime.relayNetworkTypesMod.GraphQLResponse]
    ], 
    typingsSlinky.relayRuntime.relayObservableMod.RelayObservable[typingsSlinky.relayRuntime.relayNetworkTypesMod.GraphQLResponse] | typingsSlinky.relayRuntime.relayRuntimeTypesMod.Disposable
  ]
  type Uploadable = org.scalajs.dom.raw.File | org.scalajs.dom.raw.Blob
  type UploadableMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.relayRuntime.relayNetworkTypesMod.Uploadable]
}
