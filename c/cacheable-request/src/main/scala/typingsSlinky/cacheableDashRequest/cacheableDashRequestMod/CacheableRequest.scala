package typingsSlinky.cacheableDashRequest.cacheableDashRequestMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheableRequest
  extends Instantiable2[
      /* requestFn */ RequestFn, 
      (/* storageAdapter */ StorageAdapter) | (/* storageAdapter */ String), 
      js.Function2[
        (RequestOptions with typingsSlinky.httpDashCacheDashSemantics.httpDashCacheDashSemanticsMod.Options) | String | URL, 
        js.UndefOr[
          js.Function1[ServerResponse | typingsSlinky.responselike.responselikeMod.^ , Unit]
        ], 
        Emitter
      ]
    ]
     with Instantiable1[
      /* requestFn */ RequestFn, 
      js.Function2[
        (RequestOptions with typingsSlinky.httpDashCacheDashSemantics.httpDashCacheDashSemanticsMod.Options) | String | URL, 
        js.UndefOr[
          js.Function1[ServerResponse | typingsSlinky.responselike.responselikeMod.^ , Unit]
        ], 
        Emitter
      ]
    ] {
  var CacheError: Instantiable1[/* error */ js.Error, CacheErrorCls] = js.native
  var RequestError: Instantiable1[/* error */ js.Error, RequestErrorCls] = js.native
}

