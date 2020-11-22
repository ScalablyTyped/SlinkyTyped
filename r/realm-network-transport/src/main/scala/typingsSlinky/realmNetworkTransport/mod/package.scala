package typingsSlinky.realmNetworkTransport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AbortSignal = js.Any
  
  type ErrorCallback = js.Function1[/* err */ js.Error, scala.Unit]
  
  type Fetch = js.Function2[
    /* input */ typingsSlinky.realmNetworkTransport.mod.FetchRequestInfo, 
    /* init */ js.UndefOr[typingsSlinky.realmNetworkTransport.mod.FetchRequestInit], 
    js.Promise[typingsSlinky.realmNetworkTransport.mod.FetchResponse]
  ]
  
  type FetchBodyInit = js.Any
  
  type FetchHeadersInit = typingsSlinky.realmNetworkTransport.mod.FetchHeaders | js.Array[js.Array[java.lang.String]] | (typingsSlinky.std.Record[java.lang.String, java.lang.String])
  
  type FetchRequestInfo = typingsSlinky.realmNetworkTransport.mod.FetchRequest | java.lang.String
  
  type Headers = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type SuccessCallback = js.Function1[/* response */ typingsSlinky.realmNetworkTransport.mod.Response, scala.Unit]
}
