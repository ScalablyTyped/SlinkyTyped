package typingsSlinky.expressRedisCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ExpirationConfig = org.scalablytyped.runtime.StringDictionary[scala.Double]
  
  type ExpirationPolicy = js.Function2[
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* res */ typingsSlinky.express.mod.Response_[js.Any], 
    scala.Double
  ]
  
  type ExpireOption = scala.Double | typingsSlinky.expressRedisCache.mod.ExpirationConfig
}
