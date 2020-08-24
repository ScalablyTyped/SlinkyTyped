package typingsSlinky.cacheableRequest.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheableRequest
  extends Instantiable1[
      /* requestFn */ RequestFn, 
      js.Function2[
        /* opts */ String | URL_ | (RequestOptions with typingsSlinky.httpCacheSemantics.mod.Options), 
        /* cb */ js.UndefOr[
          js.Function1[/* response */ ServerResponse | typingsSlinky.responselike.mod.^ , Unit]
        ], 
        Emitter
      ]
    ]
     with Instantiable2[
      /* requestFn */ RequestFn, 
      (/* storageAdapter */ StorageAdapter) | (/* storageAdapter */ String), 
      js.Function2[
        (RequestOptions with typingsSlinky.httpCacheSemantics.mod.Options) | String | URL_, 
        js.UndefOr[js.Function1[ServerResponse | typingsSlinky.responselike.mod.^ , Unit]], 
        Emitter
      ]
    ] {
  var CacheError: Instantiable1[/* error */ js.Error, CacheErrorCls] = js.native
  var RequestError: Instantiable1[/* error */ js.Error, RequestErrorCls] = js.native
}

